package ru.mathtech.npntool.editor.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import ru.mathtech.npntool.editor.commands.NPNSymbolTokenSNDeleteCommand;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class NPNSymbolTokenSNComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		NPNSymbolTokenSN token = (NPNSymbolTokenSN) getHost().getModel();
		NPNSymbolTokenSNDeleteCommand command = new NPNSymbolTokenSNDeleteCommand(token);
		return command;
	}

}
