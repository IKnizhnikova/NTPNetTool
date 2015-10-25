package npnets.simulator.commands;

import java.util.ArrayList;
import java.util.List;

import npnets.simulator.simulate.Simulator;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class TransitionAddSynchronizationCommand extends Command {
	  private Transition transition;
	  private TransitionSynchronized tr;
	  private NPNSymbolTransitionSN symbol;
	  private List<Synchronization> pool;
	  private ListDialog sd;
	  private static int counter=1;
	  @Override public void execute() {
		  
		  sd = new ListDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		  sd.setContentProvider(new ArrayContentProvider());
		  sd.setLabelProvider(new LabelProvider());
		  sd.setInput(getSyncPicker());
	      sd.setTitle("Choose the synchronization");
	      Synchronization r=null;
		  if (sd.open() == Window.OK) {
			  if(sd.getResult()==null)
				  return;
			  if(sd.getResult()[0].equals("New Synchronization"))
			  {
				  r=NPNetsFactory.eINSTANCE.createSynchronization();
				  r.setName("s"+counter++);
				  Simulator.net.getNet().getSynchronizations().add(r);
			  }
			  else{
			  
			  r = searchSync(sd.getResult()[0].toString());
			  }
			  tr = reset(transition);
			  tr.setSynchronization(r);
			  r.getInvolved().add(tr);
			  transition = tr;
			  Simulator.changed=true;
		  }
	  }
	 
	  private Synchronization searchSync(String str) {
		  for(Synchronization sync: Simulator.net.getNet().getSynchronizations())
		  {
		  	 if (str.contains(sync.getUuid().substring(20)))
		  		 return sync;
		  }
			return null;
		}

		private void resolveArcs(Transition tr) {
		for(int i=0;i<transition.getInArcs().size();i++){
			transition.getInArcs().get(i).setTarget(tr);
		}
		for(int i=0;i<transition.getOutArcs().size();i++){
			transition.getOutArcs().get(i).setSource(tr);
		}
		
	}

	private Object getSyncPicker() {
		  List<Object> res=new ArrayList<Object>();
		  for(Synchronization sync: Simulator.net.getNet().getSynchronizations())
		  {
		  	 res.add(sync.getName()+" ("+sync.getUuid().substring(20)+")");
		  }
		  res.add("New Synchronization");
		  return res;
	}

	@Override public void undo() {
		  transition.setNet(tr.getNet());
		  symbol.setModel(transition);
		  tr.getSynchronization().getInvolved().remove(tr);
		  tr.setSynchronization(null);
		  counter--;
		  tr.setNet(null);
	  }
	  
	  protected TransitionSynchronized reset(Transition input) {
		  TransitionSynchronized ts = NPNetsFactory.eINSTANCE.createTransitionSynchronized();
		  ts.setUuid(input.getUuid());
		  ts.setName(input.getName());
		  ts.setComment(input.getComment());
		  ts.setNet(input.getNet());
		  ts.setFirstTimeConstraint(input.getFirstTimeConstraint());
		  ts.setSecondTimeConstraint(input.getSecondTimeConstraint());
		  resolveArcs(ts);
		  symbol.setModel(ts);
		  transition.getNet().getNodes().remove(transition);
		  transition.setNet(null);
		  return ts;
	  }
	  
	  public void setTransition(NPNSymbolTransitionSN transition) {
		  symbol = transition;
		  this.transition = (Transition)transition.getModel();
		  pool = Simulator.net.getNet().getSynchronizations();
	  }
}

