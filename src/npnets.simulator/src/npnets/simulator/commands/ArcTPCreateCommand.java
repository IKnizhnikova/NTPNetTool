package npnets.simulator.commands;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
 
public class ArcTPCreateCommand extends ArcCreateCommand {
  @Override public void execute() {	
    ((NPNSymbolArcTPSN)arc).setSource((NPNSymbolTransitionSN)source);
    ((NPNSymbolArcTPSN)arc).setTarget((NPNSymbolPlaceSN)target);
    ((ArcTP)arc.getModel()).setSource((Transition)source.getModel());
    ((ArcTP)arc.getModel()).setTarget((Place)target.getModel());
    
    net.getModel().getArcs().add(arc.getModel());
    net.getArcs().add(arc);
    arc.setDiagram(net);
    arc.getModel().setNet(net.getModel());
  }
 
  @Override public void undo() {
    ((Transition)((NPNSymbolArcTPSN)arc).getSource().getModel()).getOutArcs().remove(arc.getModel());
	((ArcTP)arc.getModel()).setSource(null);
	((NPNSymbolArcTPSN)arc).getSource().getOutArcs().remove(arc);
	((NPNSymbolArcTPSN)arc).setSource(null);
    
    ((Place)((NPNSymbolArcTPSN)arc).getTarget().getModel()).getInArcs().remove(arc.getModel());
    ((ArcTP)arc.getModel()).setTarget(null);
    ((NPNSymbolArcTPSN)arc).getTarget().getInArcs().remove(arc);
    ((NPNSymbolArcTPSN)arc).setTarget(null);
    
    ((NPNSymbolArcTPSN)arc).getModel().setNet(null);
    ((NPNSymbolArcTPSN)arc).setDiagram(null);
  }
 
  public void setTarget(NPNSymbolPlaceSN target) {
	  this.target = target;
  }
   
  public void setSource(NPNSymbolTransitionSN source) {
    this.source = source;
  }
}