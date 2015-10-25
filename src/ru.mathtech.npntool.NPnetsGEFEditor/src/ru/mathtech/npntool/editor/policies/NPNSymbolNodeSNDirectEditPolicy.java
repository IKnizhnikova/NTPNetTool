package ru.mathtech.npntool.editor.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import ru.mathtech.npntool.editor.commands.NPNSymbolNodeSNRenameCommand;
import ru.mathtech.npntool.editor.figures.NPNSymbolNodeSNFigure;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class NPNSymbolNodeSNDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		NPNSymbolNodeSNRenameCommand command = new NPNSymbolNodeSNRenameCommand();
		command.setModel((NPNSymbolNodeSN) getHost().getModel());
		command.setNameNew((String) request.getCellEditor().getValue());
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		((NPNSymbolNodeSNFigure) getHostFigure()).getLabelName().setText(value);
	}

}
