package ru.mathtech.npntool.editor.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import ru.mathtech.npntool.editor.commands.NPNSymbolArcPTSNDeleteCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolArcTPSNDeleteCommand;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;

public class NPNSymbolArcSNEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		Command res = null;
		Object model = getHost().getModel();
		if (model instanceof NPNSymbolArcPTSN) {
			res = new NPNSymbolArcPTSNDeleteCommand((NPNSymbolArcPTSN) model);
		} else if (model instanceof NPNSymbolArcTPSN) {
			res = new NPNSymbolArcTPSNDeleteCommand((NPNSymbolArcTPSN) model);
		}
		return res;
	}

}
