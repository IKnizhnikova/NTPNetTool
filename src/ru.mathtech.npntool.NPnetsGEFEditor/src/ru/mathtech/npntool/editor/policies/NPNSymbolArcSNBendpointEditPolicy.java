package ru.mathtech.npntool.editor.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import ru.mathtech.npntool.editor.commands.NPNSymbolArcSNCreateBendpointCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolArcSNDeleteBendpointCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolArcSNMoveBendpointCommand;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

public class NPNSymbolArcSNBendpointEditPolicy extends BendpointEditPolicy {

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		NPNSymbolArcSNCreateBendpointCommand command =
				new NPNSymbolArcSNCreateBendpointCommand(
						(NPNSymbolArcSN) request.getSource().getModel(),
						request.getIndex(), request.getLocation());
		return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		NPNSymbolArcSNDeleteBendpointCommand command =
				new NPNSymbolArcSNDeleteBendpointCommand(
						(NPNSymbolArcSN) request.getSource().getModel(),
						request.getIndex());
		return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		NPNSymbolArcSNMoveBendpointCommand command =
				new NPNSymbolArcSNMoveBendpointCommand(
						(NPNSymbolArcSN) request.getSource().getModel(),
						request.getIndex(), request.getLocation());
		return command;
	}

}
