package npnets.simulator.parts;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
 
public class NodeDirectEditManager extends DirectEditManager {
 
	Label labelName;

	public NodeDirectEditManager(GraphicalEditPart source,
			Class editorType, CellEditorLocator locator, Label label) {
		super(source,editorType,locator);
		labelName = label;
	}

	@Override
	protected void initCellEditor() {
		getCellEditor().setValue(labelName.getText());
	}
}
