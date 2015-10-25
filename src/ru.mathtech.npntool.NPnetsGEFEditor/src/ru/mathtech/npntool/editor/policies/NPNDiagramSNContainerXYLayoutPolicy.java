package ru.mathtech.npntool.editor.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import ru.mathtech.npntool.editor.commands.NPNSymbolNodeSNChangeConstraintCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolPlaceSNCreateCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolTransitionSNCreateCommand;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNDiagramSNContainerXYLayoutPolicy extends XYLayoutEditPolicy {
	
	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		if (child.getModel() instanceof NPNSymbolNodeSN) {
			NPNSymbolNodeSNChangeConstraintCommand command =
					new NPNSymbolNodeSNChangeConstraintCommand((NPNSymbolNodeSN) child.getModel());
			command.setNewConstraint((Rectangle)constraint);
			return command;
		}
		return null;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command res = null;
		if (request.getNewObjectType().equals(NPNSymbolPlaceSN.class)) {
			res = new NPNSymbolPlaceSNCreateCommand(
					(NPNDiagramNetSystem) getHost().getModel(),
					(NPNSymbolPlaceSN) request.getNewObject(),
					request.getLocation()
					);
		} else if (request.getNewObjectType().equals(NPNSymbolTransitionSN.class)) {
			res = new NPNSymbolTransitionSNCreateCommand(
					(NPNDiagramNetSystem) getHost().getModel(),
					(NPNSymbolTransitionSN) request.getNewObject(),
					request.getLocation()
					);
		}
		return res;
	}
}
