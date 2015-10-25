package ru.mathtech.npntool.editor.actions;

import java.util.List;

import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import ru.mathtech.npntool.editor.parts.NPNSymbolNodeSNEditPart;

public class NPNSymbolResizeToContentAction extends SelectionAction {
	
	public static final String ID_RESIZE_TO_CONTENTS = "ResizeToContents";
	public static final String REQ_RESIZE_TO_CONTENTS = "ResizeToContents";
	
	private final Request request;

	public NPNSymbolResizeToContentAction(IWorkbenchPart part) {
		super(part);
		setId(ID_RESIZE_TO_CONTENTS);
		setText("Resize to contents");
		request = new Request(REQ_RESIZE_TO_CONTENTS);
	}

	@Override
	protected boolean calculateEnabled() {
		if (getSelectedObjects().isEmpty()) {
			return false;
		}
		for (Object objSelected : getSelectedObjects()) {
			if (!(objSelected instanceof NPNSymbolNodeSNEditPart)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void run() {
		List<NPNSymbolNodeSNEditPart> editparts = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		for (NPNSymbolNodeSNEditPart editpartNode : editparts) {
			compoundCommand.add(editpartNode.getCommand(request));
		}
		execute(compoundCommand);
	}

}
