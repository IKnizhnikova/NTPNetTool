package npnets.simulator.commands;

import org.eclipse.gef.commands.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.mathtech.npntool.npnets.npndiagrams.*;
//import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
//import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
//import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
 
public class NodeDeleteCommand extends Command {
 
  private NPNSymbolNodeSN node;
  private NPNDiagramNetSystem net;
  private List<NPNSymbolArcSN> arcs;
  private Map<NPNSymbolArcSN, NPNSymbolNodeSN> arcSources;
  private Map<NPNSymbolArcSN, NPNSymbolNodeSN> arcTargets;
 
  private void detachLinks() {
	    arcs = new ArrayList<NPNSymbolArcSN>();
	    arcSources = new HashMap<NPNSymbolArcSN, NPNSymbolNodeSN>();
	    arcTargets = new HashMap<NPNSymbolArcSN, NPNSymbolNodeSN>();
	    if (node instanceof NPNSymbolPlaceSN) {
	    	arcs.addAll(((NPNSymbolPlaceSN)node).getInArcs());
	    	arcs.addAll(((NPNSymbolPlaceSN)node).getOutArcs());
	    } else if (node instanceof NPNSymbolTransitionSN) {
	    	arcs.addAll(((NPNSymbolTransitionSN)node).getInArcs());
	    	arcs.addAll(((NPNSymbolTransitionSN)node).getOutArcs());
	    }
	    for (NPNSymbolArcSN arc : arcs) {
	      if (arc instanceof NPNSymbolArcPTSN) {
		    arcSources.put(arc, ((NPNSymbolArcPTSN)arc).getSource());
		    arcTargets.put(arc, ((NPNSymbolArcPTSN)arc).getTarget());
		    ((NPNSymbolArcPTSN)arc).setSource(null);
		    ((NPNSymbolArcPTSN)arc).setTarget(null);
	      } else if (arc instanceof NPNSymbolArcTPSN) {
	    	arcSources.put(arc, ((NPNSymbolArcTPSN)arc).getSource());
		    arcTargets.put(arc, ((NPNSymbolArcTPSN)arc).getTarget());
		    ((NPNSymbolArcTPSN)arc).setSource(null);
		    ((NPNSymbolArcTPSN)arc).setTarget(null);  
	      }
	      arc.setDiagram(null);
	    }
	  }
	 
	  private void reattachLinks() {
	    for (NPNSymbolArcSN arc : arcs) {
	      if (arc instanceof NPNSymbolArcPTSN) {
		    ((NPNSymbolArcPTSN)arc).setSource((NPNSymbolPlaceSN)arcSources.get(arc));
		    ((NPNSymbolArcPTSN)arc).setTarget((NPNSymbolTransitionSN)arcSources.get(arc));
	      } else if (arc instanceof NPNSymbolArcTPSN) {
		    ((NPNSymbolArcTPSN)arc).setSource((NPNSymbolTransitionSN)arcSources.get(arc));
		    ((NPNSymbolArcTPSN)arc).setTarget((NPNSymbolPlaceSN)arcSources.get(arc));  
	      }
	      arc.setDiagram(net);
	    }
	  }
  
  @Override
  public void execute() {
	  detachLinks();
	  node.setDiagram(null);
	  node.getModel().setNet(null);
  }
 
  @Override
  public void undo() {
	reattachLinks();
    node.setDiagram(net);
  }
 
  public void setNode(NPNSymbolNodeSN node) {
    this.node = node;
    this.net = node.getDiagram();
  }
}
