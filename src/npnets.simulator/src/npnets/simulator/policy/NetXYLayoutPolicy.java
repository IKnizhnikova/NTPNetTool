package npnets.simulator.policy;


import npnets.simulator.commands.NodeChangeCoordinatesCommand;
import npnets.simulator.commands.NodeCreateCommand;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
 


import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;


public class NetXYLayoutPolicy extends XYLayoutEditPolicy {

	@Override protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
	    NodeChangeCoordinatesCommand command = new NodeChangeCoordinatesCommand();
	    command.setModel((NPNSymbolNodeSN) child.getModel());
	    command.setNewCoordinates(((Rectangle)constraint).getLocation());
	    return command;
	}
	 
	@Override protected Command getCreateCommand(CreateRequest request) {
	    Command retVal = null;
	    if(request.getNewObjectType().equals(NPNSymbolPlaceSN.class) || request.getNewObjectType().equals(NPNSymbolTransitionSN.class)) {
	      NodeCreateCommand command = new NodeCreateCommand();
	      command.setLocation(request.getLocation());
	      command.setParent((NPNDiagramNetSystem)(getHost().getModel()));
	      command.setNode((NPNSymbolNodeSN)(request.getNewObject()));
	      retVal = command;
	    } 
	    return retVal;
	}
}

