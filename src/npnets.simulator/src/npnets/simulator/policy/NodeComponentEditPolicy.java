package npnets.simulator.policy;

import npnets.simulator.actions.PlaceAddTokenAction;
import npnets.simulator.actions.SetTimeConstraintsAction;
import npnets.simulator.actions.TransitionAddSynchronizationAction;
import npnets.simulator.commands.NodeDeleteCommand;
import npnets.simulator.commands.PlaceAddTokenCommand;
import npnets.simulator.commands.SetTimeConstraintsCommand;
import npnets.simulator.commands.TokenDeleteCommand;
import npnets.simulator.commands.TransitionAddSynchronizationCommand;
import npnets.simulator.simulate.Simulator;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;













import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.npndiagrams.*;


public class NodeComponentEditPolicy extends ComponentEditPolicy {
	

	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		NPNSymbolNodeSN node = (NPNSymbolNodeSN) getHost().getModel();
		CompoundCommand commandCompound = createRecursiveDeleteNodeCommand(node);
		return commandCompound;
	}

	private CompoundCommand createRecursiveDeleteNodeCommand(
			NPNSymbolNodeSN node) {
		
		CompoundCommand commandCompound = new CompoundCommand();
		
		
		if (node instanceof NPNSymbolPlaceSN) {
			for (NPNSymbolTokenSN symbolToken : ((NPNSymbolPlaceSN) node).getTokens()) {
				TokenDeleteCommand command = 
						new TokenDeleteCommand(symbolToken);
				commandCompound.add(command);
			}
		}
			
		NodeDeleteCommand nodeDeleteCommand = new NodeDeleteCommand();
		nodeDeleteCommand.setNode((NPNSymbolNodeSN) getHost().getModel());
		commandCompound.add(nodeDeleteCommand);
			
		return commandCompound;
	}
	
    
    private PlaceAddTokenCommand createAddTokenCommand() {
    	PlaceAddTokenCommand command = new PlaceAddTokenCommand();
        command.setPlace((NPNSymbolPlaceSN) getHost().getModel());
        command.setElementNet(!Simulator.net.getDiagramNetSystem().getUuid().equals(((NPNSymbolPlaceSN) getHost().getModel()).getDiagram().getUuid()));
        return command;
    }
    
    
    private TransitionAddSynchronizationCommand createAddSymchronizationCommand() {
    	TransitionAddSynchronizationCommand command = new TransitionAddSynchronizationCommand();
        command.setTransition((NPNSymbolTransitionSN) getHost().getModel());
        return command;
    } 
    
    private SetTimeConstraintsCommand createTimeConstraintsCommand() {
    	SetTimeConstraintsCommand command = new SetTimeConstraintsCommand();
        command.setModel(getHost().getModel());
        return command;
    }   
    
    @Override
    public Command getCommand(Request request) {
    	if(request.getType().equals(PlaceAddTokenAction.REQ_ADD_TOKEN)) {
            return createAddTokenCommand();
        } else if(request.getType().equals(TransitionAddSynchronizationAction.REQ_ADD_SYNC)) {
        	return createAddSymchronizationCommand();
        }
        else if (request.getType().equals(SetTimeConstraintsAction.REQ_SET_TIME))
        	return  createTimeConstraintsCommand();
        return super.getCommand(request);
    }
}
