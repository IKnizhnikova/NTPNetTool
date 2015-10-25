package ru.mathtech.npntool.editor;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import ru.mathtech.npntool.editor.factories.NPNSymbolArcSNFactory;
import ru.mathtech.npntool.editor.factories.NPNSymbolPlaceSNFactory;
import ru.mathtech.npntool.editor.factories.NPNSymbolTransitionSNFactory;
import ru.mathtech.npntool.editor.tool.NPNSymbolArcSNConnectionCreationTool;
import ru.mathtech.npntool.editor.tool.NPNSymbolNodeSNCreationAndDirectEditTool;

public class NPNGraphicalEditorPalette extends PaletteRoot {
	
	PaletteGroup group;

	public NPNGraphicalEditorPalette() {
		addGroup();
		addSelectionTool();
		addPlaceTool();
		addTransitionTool();
		addArcTool();
	}

	private void addGroup() {
		group = new PaletteGroup("NP-nets system net controls");
		add(group);
	}
	
	private void addSelectionTool() {
		SelectionToolEntry entry = new SelectionToolEntry();
		group.add(entry);
		setDefaultEntry(entry);
	}
	
	private void addPlaceTool() {
		CreationToolEntry entry = new CombinedTemplateCreationEntry ("Place", "Create a new place", new NPNSymbolPlaceSNFactory(), null, null);
		entry.setToolClass(NPNSymbolNodeSNCreationAndDirectEditTool.class);
		group.add(entry);
	}

	private void addTransitionTool() {
		CreationToolEntry entry = new CombinedTemplateCreationEntry ("Transition", "Create a new transition", new NPNSymbolTransitionSNFactory(), null, null);
		entry.setToolClass(NPNSymbolNodeSNCreationAndDirectEditTool.class);
		group.add(entry);
	}

	private void addArcTool() {
		ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry("Arc", "Create a new arc", new NPNSymbolArcSNFactory(), null, null);
		entry.setToolClass(NPNSymbolArcSNConnectionCreationTool.class);
		group.add(entry);
	}
}
