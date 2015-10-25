package npnets.simulator.policy;

import npnets.simulator.commands.RenameCommand;
import npnets.simulator.figure.NodeFigure;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class NodeDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		RenameCommand command = new RenameCommand();
		command.setModel((NPNSymbolNodeSN) getHost().getModel());
		command.setNameNew((String) request.getCellEditor().getValue());
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		((NodeFigure) getHostFigure()).getLabelName().setText(value);
	}

}