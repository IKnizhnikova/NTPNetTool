package npnets.simulator.policy;

import npnets.simulator.commands.TokenDeleteCommand;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class TokenComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		NPNSymbolTokenSN token = (NPNSymbolTokenSN) getHost().getModel();
		TokenDeleteCommand command = new TokenDeleteCommand(token);
		return command;
	}

}
