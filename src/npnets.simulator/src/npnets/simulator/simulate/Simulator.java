package npnets.simulator.simulate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import npnets.simulator.commands.PlaceAddTokenCommand;
import npnets.simulator.editors.NPNBindVariablesView;
import npnets.simulator.exceptions.DeadlineViolationException;
import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.exceptions.NoOutputBindingAvaliableException;
import npnets.simulator.exceptions.WrongModelException;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.internal.dialogs.ShowViewDialog;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;

public class Simulator {
	public static NPnetMarked net;
	private List<Binding> bindings = new ArrayList<Binding>();
	private List<OutputBinding> outputBindings = new ArrayList<OutputBinding>();
	public BindingManager bindingManager;
	private HashMap<Transition, TimeBound> TTimeMap = new HashMap<Transition, TimeBound>();
	private HashMap<ArcTP, TimeBound> ATimeMap = new HashMap<ArcTP, TimeBound>();
	int stepCounter;
	public static boolean multiEntry=false;
	public static boolean userDriven = false;
	public static Map<Variable, TokenType> variableMap;
	public static MarkingAdapterState markingHistory;
	public static boolean changed;
	public static boolean userBindings;
	private static List<Token> output;
	public MarkingAdapter marking;
	private Map<Transition,List<Token>> performingTransitions=new HashMap<Transition,List<Token>>(); 

	public MarkingAdapter getMarking() {
		if (marking == null)
			try {
				marking = new SystemMarkingAdapter(net);
				//markingHistory.addState(marking);
				//markingHistory.setCurrentState(marking);
			} catch (WrongModelException e) {
				new Report().appendLineToReport("Wrong model! You probably forgot to add marking to your net.", true);
				e.printStackTrace();
			}
		return marking;
	}
	public Simulator(){
			fillTimeMaps(net.getNet().getNetSystem().getNodes());
		  TokenTimeList ttl= fillTimeTokenMap(net.getNet().getNetSystem().getNodes());
			for (TokenTypeElementNet tten:net.getNet().getTypeElementNet()){
				fillTimeMaps(tten.getNet().getNodes());
			  ttl.addAll(fillTimeTokenMap(tten.getNet().getNodes()));
			  ((DefaultBindingManager)getBindingManager()).setTTimeMap(ttl);
			}
	}
	private TokenTimeList fillTimeTokenMap(List<Node> list) {
		TokenTimeList TTimeMap=new TokenTimeList();
		for (Node node:list)
		{
			if(node instanceof Place)
			{
				Place pl=(Place)node;
				List<Token> tl=getMarking().getMarkingMap().get(pl);
				if(tl!=null){
				for(Token token:tl)
				{
					TTimeMap.add(new TokenTime(token, new TimeBound(pl.getFirstTimeConstraint(), pl.getSecondTimeConstraint())));
				}
				}
			}
		}
		return TTimeMap;
	}
	private void fillTimeMaps(List<Node> list)
	{
		for (Node node:list)
		{
			if(node instanceof Transition)
			{
				Transition tr= (Transition) node;
				TTimeMap.put(tr, new TimeBound(tr.getFirstTimeConstraint(),tr.getSecondTimeConstraint()));
				for(ArcTP arc:tr.getOutArcs())
				{
					ATimeMap.put(arc, new TimeBound(arc.getFirstTimeConstraint(), arc.getSecondTimeConstraint()));
				}
			}
		}
	}
	
	public void setMarking(MarkingAdapter marking) {
		this.marking = marking;
	}

	public static Map<Variable, TokenType> getVariableMap() {
		if (variableMap.size() == 0) {
			fillVariableMapDefault();
		}
		return variableMap;
	}

	public Transition bindVariables(Transition trans) throws NoBindingAvaliableException {
		if (trans == null) {
			Transition node=null;
			List<Transition> nodes;
			try {
				nodes = getEnabledTransitions(true);
			} catch (DeadlineViolationException e1) {
				throw new NoBindingAvaliableException(e1.message);
			}
			int counter = 0;
			boolean noBinding = false;
			do {
				noBinding = false;
				node = nodes.get(randomizer(nodes.size()));

					Report report = new Report();
					Transition transition = (Transition) node;
					if (transition.getNet() != net.getNet().getNetSystem() && transition instanceof TransitionSynchronized
							&& ((TransitionSynchronized) transition).getSynchronization() != null)
						continue;
					counter++;
					for (ArcPT arc : transition.getInArcs()) {
						try {
							bindings.addAll(getBindingManager().obtainBindings(arc, getMarking(), report,true));
						} catch (NoBindingAvaliableException e) {
							// System.out.println("no binding at transition "+
							// transition.getName());
							noBinding = true;
							bindings.clear();
							report.clearReport();

						}
					}
					break;
			} while (counter < 100000);
			try {
				getEnabledTransitions(false);
			} catch (DeadlineViolationException e) {
				throw new NoBindingAvaliableException(e.message);
			}
			return node;
		} else {
			Report report = new Report();
			for (ArcPT arc : trans.getInArcs()) {
				try {
					bindings.addAll(getBindingManager().obtainBindings(arc, getMarking(), report,true));
				} catch (NoBindingAvaliableException e) {
					// System.out.println("no binding at transition "+
					// transition.getName());
					bindings.clear();
					report.clearReport();
				}
			}
			try {
				getEnabledTransitions(false);
			} catch (DeadlineViolationException e) {
				throw new NoBindingAvaliableException(e.message);
			}
			return trans;
		}
	}

	private List<Transition> getEnabledTransitions(boolean onlyCheck) throws DeadlineViolationException {
		List<Node> nodes = new ArrayList<Node>();
		nodes.addAll(net.getNet().getNetSystem().getNodes());
		for (TokenTypeElementNet tten : net.getNet().getTypeElementNet()) {
			nodes.addAll(tten.getNet().getNodes());
		}
		List<Transition> candidates = new ArrayList<Transition>();
		boolean noBinding = false;
		for (Node node : nodes) {
			noBinding = false;
			if (node instanceof Transition) {
				Report report = new Report();
				Transition transition = (Transition) node;
				if (transition.getNet() != net.getNet().getNetSystem() && transition instanceof TransitionSynchronized
						&& ((TransitionSynchronized) transition).getSynchronization() != null)
				{
					if(TTimeMap.get(transition).getUpper()==-3)
					{
						throw new DeadlineViolationException(transition);
					}
					continue;
				}
				for (ArcPT arc : transition.getInArcs()) {
					try {
						getBindingManager().obtainBindings(arc, getMarking(), report,onlyCheck);
					} catch (NoBindingAvaliableException e) {
						if(e.deadline)
							throw new DeadlineViolationException(arc.getSource());
						noBinding = true;
						report.clearReport();
						TTimeMap.get(transition).setLower(transition.getFirstTimeConstraint());
						TTimeMap.get(transition).setUpper(transition.getSecondTimeConstraint());
					}
				}
				if (!noBinding) {
					report.putToLog();
					if(TTimeMap.get(transition).getLower()==0 || TTimeMap.get(transition).getUpper()==-2)
						candidates.add(transition);
					else 
					{
						TTimeMap.get(transition).setLower(TTimeMap.get(transition).getLower()-1);
					if(TTimeMap.get(transition).getUpper()>0)
						TTimeMap.get(transition).setUpper(TTimeMap.get(transition).getUpper()-1);
					else if(TTimeMap.get(transition).getUpper()==0)
						TTimeMap.get(transition).setUpper(-3);
					}
				}
			}
		}
		if(!multiEntry){
			for(int i=0;i<candidates.size();i++){
				if(performingTransitions.containsKey(candidates))
				{
					candidates.remove(i);
					i--;
				}
					
			}
		}
		if(checkForDeadline(candidates))
		{
			for(int i=0;i<candidates.size();i++){
				if(TTimeMap.get(candidates.get(i)).getUpper()!=0)
				{
					if(TTimeMap.get(candidates.get(i)).getUpper()!=-1 && TTimeMap.get(candidates.get(i)).getUpper()!=-2)
						TTimeMap.get(candidates.get(i)).setUpper(TTimeMap.get(candidates.get(i)).getUpper()-1);
					candidates.remove(i);
					i--;
				}
			}
		}
		return candidates;
	}
	public MarkingAdapter makeTransitions() throws NoBindingAvaliableException {
		((DefaultBindingManager)getBindingManager()).getTTimeMap().unlockAll();
		bindings.clear();
		outputBindings.clear();
		Transition trans = null;
		if (!userDriven)
		{
			trans = bindVariables(null);
		}
		else {
			try{
			trans = chooseTransition(false);
			}
			catch (DeadlineViolationException e)
			{
				throw new NoBindingAvaliableException(e.message);
			}
			if(trans==null)
			{
				throw new NoBindingAvaliableException("No Transitions choosed");
			}
			if (!userBindings)
				trans = bindVariables(trans);
			else if (IDialogConstants.CANCEL_ID == chooseBindings(trans, false))
				return null;

		}
		Report report = new Report();
		if (trans instanceof TransitionSynchronized && ((TransitionSynchronized) trans).getSynchronization() != null) {
			TransitionSynchronized transS = (TransitionSynchronized) trans;
			for (Binding binding : bindings) {
				if (binding.getToken().getType() instanceof TokenTypeElementNet) {
					TokenNetAdapter token = (TokenNetAdapter) binding.getToken();
					for (Node node : ((TokenTypeElementNet) token.getType()).getNet().getNodes()) {
						if (transS.getSynchronization().getInvolved().contains(node)) {
							if (checkTransition((Transition) node, token.getValue())) {
								performingTransitions.put((Transition) node, new ArrayList<Token>());
								List<Binding> syncBindings = new ArrayList<Binding>();
								for (ArcPT arc : ((Transition) node).getInArcs()) {
									syncBindings.addAll(getBindingManager().obtainBindingsFromSync(arc, token.getValue(), report,false));
								}
								for (Binding bind : syncBindings) {
									bind.move(marking, performingTransitions, token.getValue().getMarking());
								}
								Map <Transition, List<Token>> currentTransitions= new HashMap<Transition, List<Token>>();
								for (Map.Entry<Transition, List<Token>> me : performingTransitions.entrySet()) {
									if((TTimeMap.get(me.getKey()).getLower()==0 && TTimeMap.get(me.getKey()).getUpper()==-2) || TTimeMap.get(me.getKey()).getUpper()!=-2 )
									{
										currentTransitions.put(me.getKey(),me.getValue());
									}
									else{
										TTimeMap.get(me.getKey()).setLower(TTimeMap.get(me.getKey()).getLower()-1);
									}
								}
								for (Map.Entry<Transition, List<Token>> me : currentTransitions.entrySet()) {
									performingTransitions.remove(me.getKey());
									for (ArcTP arc : me.getKey().getOutArcs()) {
										try {
											if(!currentTransitions.isEmpty())
												outputBindings.addAll(bindingManager.obtainOutputBindings(arc, getMarking(), currentTransitions, report,false));
											} catch (NoOutputBindingAvaliableException e) {
											System.out.println("Can't perform move from transition: \"" + me.getKey().getName() + "\"");
											report.clearReport();
										}
									}
							}
								for (OutputBinding obinding : outputBindings) {
									for (Map.Entry<Transition, List<Token>> me : currentTransitions.entrySet()){
										HashMap<Transition, List<Token>> temp=new HashMap<Transition, List<Token>>();
										temp.put(me.getKey(), me.getValue());
										if(net.getNet().getNetSystem().getNodes().contains(me.getKey()))
										{
										obinding.move(marking, temp);
										}
										else{
											obinding.move(marking, temp, ((DefaultBindingManager)bindingManager).getElementNet().getMarking());
										}
									}
								}
								outputBindings.clear();
							}
						}
					}
				}
			}
		}
		performingTransitions.put(trans, new ArrayList<Token>());
		Map <Transition, List<Token>> currentTransitions= new HashMap<Transition, List<Token>>();
		for (Map.Entry<Transition, List<Token>> me : performingTransitions.entrySet()) {
			if((TTimeMap.get(me.getKey()).getLower()==0 && TTimeMap.get(me.getKey()).getUpper()==-2) || TTimeMap.get(me.getKey()).getUpper()!=-2 )
			{
				currentTransitions.put(me.getKey(),me.getValue());
			}
			else{
				TTimeMap.get(me.getKey()).setLower(TTimeMap.get(me.getKey()).getLower()-1);
			}
		}
		for (Binding bind : bindings) {
			if(net.getNet().getNetSystem().getNodes().contains(trans))
				bind.move(marking, currentTransitions);
			else{
				bind.move(marking, currentTransitions, ((DefaultBindingManager)bindingManager).getElementNet().getMarking());
			}
		}
			for (Map.Entry<Transition, List<Token>> me : currentTransitions.entrySet()) {
				performingTransitions.remove(me.getKey());
				for (ArcTP arc : me.getKey().getOutArcs()) {
					try {
						if(!currentTransitions.isEmpty())
							outputBindings.addAll(bindingManager.obtainOutputBindings(arc, getMarking(), currentTransitions, report, false));
					} catch (NoOutputBindingAvaliableException e) {
						System.out.println("Can't perform move from transition: \"" + me.getKey().getName() + "\"");
						report.clearReport();
					}
				}
			}
		report.putToLog();
		for (OutputBinding binding : outputBindings) {
			if(net.getNet().getNetSystem().getNodes().contains(trans))
				binding.move(marking, currentTransitions);
			else{
				binding.move(marking, currentTransitions, ((DefaultBindingManager)bindingManager).getElementNet().getMarking());
			}
		}
		marking.clearDiagram();
		marking.createDiagramMap(marking.markingMap);
		if (PlaceAddTokenCommand.marking != null && PlaceAddTokenCommand.marking != Simulator.net.getMarking())
			marking.createDiagramMap(marking.elementMarkingMap.get(PlaceAddTokenCommand.marking));
		for (Entry<Transition, List<Token>> tr : currentTransitions.entrySet()) {
			report.appendLineToReport("transition successfully performed on transition \"" + tr.getKey().getName() + "\"", true);
			TTimeMap.get(tr.getKey()).setLower(tr.getKey().getFirstTimeConstraint());
			TTimeMap.get(tr.getKey()).setUpper(tr.getKey().getSecondTimeConstraint());
		}
		return marking;
	}

	private int chooseBindings(Transition trans, boolean isOutput) {
		NPNBindVariablesView bindDialog = new NPNBindVariablesView(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		bindDialog.setTrans(trans);
		bindDialog.setOutput(isOutput);
		bindDialog.setSimulator(this);
		bindDialog.setMarkingAdapter(marking);
		bindDialog.setTTimeMap(((DefaultBindingManager)getBindingManager()).getTTimeMap());
		int ret = bindDialog.open();
		if (!isOutput)
			setBindings(bindDialog.getBindings());
		else
			setOutputBindings(bindDialog.getOutputBindings());
		return ret;

	}

	private Transition chooseTransition(boolean noUI) throws DeadlineViolationException, NoBindingAvaliableException {
		List<Node> nodes = new ArrayList<Node>();
		nodes.addAll(net.getNet().getNetSystem().getNodes());
		for (TokenTypeElementNet tten : net.getNet().getTypeElementNet()) {
			nodes.addAll(tten.getNet().getNodes());
		}
		List<Transition> candidates = new ArrayList<Transition>();
		boolean noBinding = false;
		for (Node node : nodes) {
			noBinding = false;
			if (node instanceof Transition) {
				Report report = new Report();
				Transition transition = (Transition) node;
				if (transition.getNet() != net.getNet().getNetSystem() && transition instanceof TransitionSynchronized
						&& ((TransitionSynchronized) transition).getSynchronization() != null)
				{
					if(TTimeMap.get(transition).getUpper()==-3)
					{
						throw new DeadlineViolationException(transition);
					}
					continue;
				}
				for (ArcPT arc : transition.getInArcs()) {
					try {
						getBindingManager().obtainBindings(arc, getMarking(), report,true);
					} catch (NoBindingAvaliableException e) {
						if(e.deadline)
							throw new DeadlineViolationException(arc.getSource());
						noBinding = true;
						TTimeMap.get(transition).setLower(transition.getFirstTimeConstraint());
						TTimeMap.get(transition).setUpper(transition.getSecondTimeConstraint());
						report.clearReport();
						break;

					}
				}
				if((TTimeMap.get(transition).getLower()==0 || TTimeMap.get(transition).getUpper()==-2) &&!noBinding && transition instanceof TransitionSynchronized && ((TransitionSynchronized) transition).getSynchronization()!=null)
				{
					TransitionSynchronized ts= (TransitionSynchronized)transition;
					for(TransitionSynchronized tss:ts.getSynchronization().getInvolved())
					{
						if(tss!=transition){
						
						for (ArcPT arc : tss.getInArcs()) {
							try {
								getBindingManager().obtainBindings(arc, getMarking(), report,true);
							} catch (NoBindingAvaliableException e) {
								if(e.deadline)
									throw new DeadlineViolationException(arc.getSource());
								noBinding = true;
								TTimeMap.get(transition).setLower(transition.getFirstTimeConstraint());
								TTimeMap.get(transition).setUpper(transition.getSecondTimeConstraint());
								TTimeMap.get(tss).setLower(transition.getFirstTimeConstraint());
								TTimeMap.get(tss).setUpper(transition.getSecondTimeConstraint());
								report.clearReport();
								break;
							}
							if(!noBinding)
							{
							if(TTimeMap.get(tss).getLower()>0){
								TTimeMap.get(tss).setLower(TTimeMap.get(tss).getLower()-1);
								noBinding=true;
							}
							if(TTimeMap.get(tss).getUpper()>0)
								TTimeMap.get(tss).setUpper(TTimeMap.get(tss).getUpper()-1);
							else if(TTimeMap.get(tss).getUpper()==0)
								TTimeMap.get(tss).setUpper(-3);
							}
							if(TTimeMap.get(tss).getLower()>0 && TTimeMap.get(tss).getUpper()!=-2)
							{
								noBinding=true;
							}
							}
						}
							
					}
				}
				if (!noBinding) {
					report.putToLog();
					if(TTimeMap.get(transition).getLower()==0 || TTimeMap.get(transition).getUpper()==-2)
						candidates.add(transition);
				}
			}
		}
		if(!multiEntry){
			for(int i=0;i<candidates.size();i++){
				if(performingTransitions.containsKey(candidates))
				{
					candidates.remove(i);
					i--;
				}
					
			}
		}
		if(candidates.size()==0){
			throw new NoBindingAvaliableException();
		}
		if(checkForDeadline(candidates))
		{
			for(int i=0;i<candidates.size();i++){
				if(TTimeMap.get(candidates.get(i)).getUpper()!=0)
				{
					if(TTimeMap.get(candidates.get(i)).getUpper()!=-1 && TTimeMap.get(candidates.get(i)).getUpper()!=-2)
						//TTimeMap.get(candidates.get(i)).setUpper(TTimeMap.get(candidates.get(i)).getUpper()-1);
					candidates.remove(i);
					i--;
				}
			}
		}
		ListDialog sd = new ListDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		sd.setContentProvider(new ArrayContentProvider());
		sd.setLabelProvider(new LabelProvider());
		sd.setInput(createTransitionPicker(candidates));
		sd.setTitle("Choose transition");
		if (sd.open() == Window.OK) {
			if (sd.getResult() == null)
				return null;
			if (sd.getResult()[0].equals("Random Transition")) {
				return null;
			}
			Transition tr = searchTransByName(sd.getResult()[0].toString(), candidates);
			for (Transition tran:candidates)
			{
				if(tran!=tr){
				if(TTimeMap.get(tran).getUpper()>0)
					TTimeMap.get(tran).setUpper(TTimeMap.get(tran).getUpper()-1);
				else if(TTimeMap.get(tran).getUpper()==0)
					TTimeMap.get(tran).setUpper(-3);
				}
				if(tran instanceof TransitionSynchronized){
					TransitionSynchronized tranS=(TransitionSynchronized) tran;
					for(TransitionSynchronized trans:tranS.getSynchronization().getInvolved())
						if(trans!=tranS)
						{
							//if(TTimeMap.get(trans).getUpper()>0)
								//TTimeMap.get(trans).setUpper(TTimeMap.get(trans).getUpper()-1);
							//else if(TTimeMap.get(trans).getUpper()==0)
								//TTimeMap.get(trans).setUpper(-3);
						}
				}
			}
			/*if(tr instanceof TransitionSynchronized){
				TransitionSynchronized tranS=(TransitionSynchronized) tr;
				for(TransitionSynchronized trans:tranS.getSynchronization().getInvolved())
					if(trans!=tranS)
					{
						if(TTimeMap.get(trans).getUpper()>0)
							TTimeMap.get(trans).setUpper(TTimeMap.get(trans).getUpper()-1);
						if(TTimeMap.get(trans).getUpper()==0)
							TTimeMap.get(trans).setUpper(-3);
					}
			}*/
			return tr;
		}
		return null;

	}

	private boolean checkForDeadline(List<Transition> candidates) throws DeadlineViolationException {
		for(Transition tr:candidates)
		{
			if(TTimeMap.get(tr).getUpper()==-3)
				throw new DeadlineViolationException(tr);
		}
		for(Transition tr:candidates)
		{
			if(TTimeMap.get(tr).getUpper()==0)
				return true;
		}
		return false;
	}
	private Transition searchTransByName(String string, List<Transition> candidates) {
		for (Transition trans : candidates) {
			if (string.contains(trans.getName())) {
				return trans;
			}
		}
		return null;
	}

	private Object createTransitionPicker(List<Transition> candidates) {
		List<Object> res = new ArrayList<Object>();
		for (Transition trans : candidates) {
			String upper="";
			switch (TTimeMap.get(trans).getUpper()){
			case -3:
				upper="-1";
				break;
			case -1:
				upper="\u221E";
				break;
			default:
				upper+=TTimeMap.get(trans).getUpper();
				break;
			}
			res.add(trans.getName() + " -- " + trans.getNet().getName() + "-- [" + TTimeMap.get(trans).getLower() + (upper.equals("-2")?"":";"+upper)+"]");
		}
		res.add("Random Transition");
		return res;
	}

	public List<Binding> getBindings() {
		return bindings;
	}

	private static void fillVariableMapDefault() {
		List<Variable> varList = net.getNet().getNetSystem().getVariables();
		if (varList.size() > 0) {
			variableMap.put(varList.get(0), net.getNet().getTypeAtomic());
			new Report().appendLineToReport("Type Atomic mapped on variable " + varList.get(0).getName(), true);
		}
		for (int i = 1; i < varList.size(); i++) {
			variableMap.put(varList.get(i), net.getNet().getTypeElementNet().get(i - 1));
			new Report().appendLineToReport("Type \"" + net.getNet().getTypeElementNet().get(i - 1).getName() + "\" mapped on variable " + varList.get(i).getName(),
					true);
		}
	}

	public BindingManager getBindingManager() {
		if (bindingManager == null)
			bindingManager = new DefaultBindingManager();
		return bindingManager;
	}

	public void setBindingManager(BindingManager bindingManager) {
		this.bindingManager = bindingManager;
	}

	private int randomizer(int upperbound) {
		return new Random().nextInt(upperbound);
	}

	public static boolean checkChanged() {
		if (changed) {
			changed = false;
			return true;
		} else
			return false;
	}

	public boolean checkTransition(Transition trans, ElementNetMarked mark) {
		Report report = new Report();
		for (ArcPT arc : trans.getInArcs()) {
			try {
				getBindingManager().obtainBindingsFromSync(arc, mark, report,true);
			} catch (NoBindingAvaliableException e) {
				report.clearReport();
				// System.out.println("no binding at transition "+
				// transition.getName());
				return false;
			}
			report.clearReport();
		}
		return true;
	}

	public static List<Token> getOutputTokens() {
		return output;
	}

	public List<OutputBinding> getOutputBindings() {
		return outputBindings;
	}

	public void setOutputBindings(List<OutputBinding> outputBindings) {
		this.outputBindings = outputBindings;
	}

	public void setBindings(List<Binding> bindings) {
		this.bindings = bindings;
	}
}