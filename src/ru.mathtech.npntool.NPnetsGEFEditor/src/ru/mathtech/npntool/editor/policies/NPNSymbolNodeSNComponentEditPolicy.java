package ru.mathtech.npntool.editor.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import ru.mathtech.npntool.editor.actions.NPNSymbolResizeToContentAction;
import ru.mathtech.npntool.editor.commands.NPNSymbolNodeSNChangeConstraintCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolNodeSNDeleteCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolTokenSNDeleteCommand;
import ru.mathtech.npntool.editor.figures.NPNSymbolNodeSNFigure;
import ru.mathtech.npntool.editor.parts.NPNSymbolNodeSNEditPart;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class NPNSymbolNodeSNComponentEditPolicy extends ComponentEditPolicy {
	
	private static final int INSETS = 20;

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
				NPNSymbolTokenSNDeleteCommand command = 
						new NPNSymbolTokenSNDeleteCommand(symbolToken);
				commandCompound.add(command);
			}
		}
			
		NPNSymbolNodeSNDeleteCommand commandDelete = 
			new NPNSymbolNodeSNDeleteCommand((NPNSymbolNodeSN) getHost().getModel());
		commandCompound.add(commandDelete);
			
		return commandCompound;
	}
	
	private NPNSymbolNodeSNChangeConstraintCommand createResizeToContentsCommand() {
		NPNSymbolNodeSNChangeConstraintCommand command;
		NPNSymbolNodeSNEditPart editpart = (NPNSymbolNodeSNEditPart) getHost();
		NPNSymbolNodeSN nodeSN = (NPNSymbolNodeSN) editpart.getModel();
		NPNSymbolNodeSNFigure figure = (NPNSymbolNodeSNFigure) editpart.getFigure();
		
		Dimension preferredSize = figure.getPreferredSize();
		preferredSize.expand(INSETS, INSETS);
		Rectangle newConstraints = nodeSN.getConstraints().getCopy();
		newConstraints.setWidth(preferredSize.width);
		newConstraints.setHeight(preferredSize.height);
		
		command = new NPNSymbolNodeSNChangeConstraintCommand(nodeSN);
		command.setNewConstraint(newConstraints);
		return command;
	}

	@Override
	public Command getCommand(Request request) {
		if (request.getType().equals(NPNSymbolResizeToContentAction.REQ_RESIZE_TO_CONTENTS)) {
			return createResizeToContentsCommand();
		}
		return super.getCommand(request);
	}
	
}
