package npnets.simulator.commands;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
 
public class ArcPTCreateCommand extends ArcCreateCommand {
  @Override public void execute() {
	((NPNSymbolArcPTSN)arc).setSource((NPNSymbolPlaceSN)source);
	((NPNSymbolArcPTSN)arc).setTarget((NPNSymbolTransitionSN)target);
    ((ArcPT)arc.getModel()).setSource((Place)source.getModel());
    ((ArcPT)arc.getModel()).setTarget((Transition)target.getModel());
    
    net.getModel().getArcs().add(arc.getModel());
    net.getArcs().add(arc);
    arc.setDiagram(net);
    arc.getModel().setNet(net.getModel());
  }
 
  @Override public void undo() {
	((Place)((NPNSymbolArcPTSN)arc).getSource().getModel()).getOutArcs().remove(arc.getModel());
	((ArcPT)arc.getModel()).setSource(null);
	((NPNSymbolArcPTSN)arc).getSource().getOutArcs().remove(arc);
	((NPNSymbolArcPTSN)arc).setSource(null);
    
    ((Transition)((NPNSymbolArcPTSN)arc).getTarget().getModel()).getInArcs().remove(arc.getModel());
	((ArcPT)arc.getModel()).setTarget(null);
	((NPNSymbolArcPTSN)arc).getTarget().getInArcs().remove(arc);
	((NPNSymbolArcPTSN)arc).setTarget(null);
    
	((NPNSymbolArcPTSN)arc).getModel().setNet(null);
	((NPNSymbolArcPTSN)arc).setDiagram(null);
  }
 
  public void setTarget(NPNSymbolTransitionSN target) {
	  this.target = target;
  }
   
  public void setSource(NPNSymbolPlaceSN source) {
    this.source = source;
  }
}
