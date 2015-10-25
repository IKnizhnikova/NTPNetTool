package ru.mathtech.npntool.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

import ru.mathtech.npntool.editor.actions.NPNSymbolResizeToContentAction;

public class NPNSNGraphicalEditorContextMenuProvider extends
		ContextMenuProvider {
	
	private ActionRegistry actionRegistry;

	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	public void setActionRegistry(ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}

	public NPNSNGraphicalEditorContextMenuProvider(
			EditPartViewer viewer, final ActionRegistry actionRegistry) {
		super(viewer);
		setActionRegistry(actionRegistry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
		IAction action = null;
		
		action = actionRegistry.getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = actionRegistry.getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = actionRegistry.getAction(
				NPNSymbolResizeToContentAction.ID_RESIZE_TO_CONTENTS);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
	}
}
