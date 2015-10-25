package npnets.simulator.policy;

import npnets.simulator.commands.TokenChangeConstraintCommand;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class NPNSymbolNodeSNXYLayoutPolicy extends XYLayoutEditPolicy {
	
	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		TokenChangeConstraintCommand command =
				new TokenChangeConstraintCommand(
						(NPNSymbolTokenSN) child.getModel());
		command.setNewConstraint((Rectangle) constraint);
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command res = null;
		return res;
	}

	@Override
	protected Command getMoveChildrenCommand(Request request) {
		return getChangeConstraintCommand((ChangeBoundsRequest) request);
	}

	@Override
	protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
		/*
		for (Object editPart : request.getEditParts()) {
			if (editPart instanceof )
		}*/
		return getChangeConstraintCommand(request);
	}
	
}
