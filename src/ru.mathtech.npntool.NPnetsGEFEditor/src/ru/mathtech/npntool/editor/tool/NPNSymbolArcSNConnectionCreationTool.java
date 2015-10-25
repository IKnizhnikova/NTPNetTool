package ru.mathtech.npntool.editor.tool;

import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.tools.ConnectionCreationTool;

import ru.mathtech.npntool.editor.requests.NPNSymbolArcSNCreateConnectionRequest;

public class NPNSymbolArcSNConnectionCreationTool extends
		ConnectionCreationTool {

	@Override
	protected Request createTargetRequest() {
		CreateRequest req = new NPNSymbolArcSNCreateConnectionRequest();
		req.setFactory(getFactory());
		return req;
	}
}
