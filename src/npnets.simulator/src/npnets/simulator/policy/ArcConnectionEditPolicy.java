package npnets.simulator.policy;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;




import npnets.simulator.commands.ArcDeleteCommand;
import npnets.simulator.commands.ArcPTDeleteCommand;
import npnets.simulator.commands.ArcTPDeleteCommand;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;


public class ArcConnectionEditPolicy extends ConnectionEditPolicy {
	 @Override protected Command getDeleteCommand(GroupRequest request) {
		 ArcDeleteCommand arcDeleteCommand = getHost().getModel() instanceof NPNSymbolArcPTSN ? new ArcPTDeleteCommand() : new ArcTPDeleteCommand();
		 arcDeleteCommand.setArc((NPNSymbolArcSN) getHost().getModel());
		 return arcDeleteCommand;
	 }
}
