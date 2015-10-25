package ru.mathtech.npntool.editor.tool;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.swt.widgets.Display;

public class NPNSymbolNodeSNCreationAndDirectEditTool extends CreationTool {

	@Override
	protected void performCreation(int button) {
		super.performCreation(button);
		
		EditPartViewer viewer = getCurrentViewer();
		final Object model = getCreateRequest().getNewObject();
		if (model == null || viewer == null) {
			return;
		}
		final Object editpart = getCurrentViewer().getEditPartRegistry().get(model);
		if (editpart instanceof EditPart) {
			Display.getCurrent().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					EditPart part = (EditPart)editpart;
					Request req = new DirectEditRequest();
					part.performRequest(req);
				}
			}
			);
		}
	}

	
	
}
