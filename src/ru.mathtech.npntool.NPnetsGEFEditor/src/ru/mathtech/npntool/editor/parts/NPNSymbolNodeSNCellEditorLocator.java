package ru.mathtech.npntool.editor.parts;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

public class NPNSymbolNodeSNCellEditorLocator implements CellEditorLocator {
	
	private Label labelName;
	
	

	public NPNSymbolNodeSNCellEditorLocator(Label label) {
		labelName = label;
	}

	@Override
	public void relocate(CellEditor celleditor) {
		Text text = (Text) celleditor.getControl();
		text.getStyle();
		Point pref = text.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
		Rectangle rect = labelName.getTextBounds().getCopy();
		labelName.translateToAbsolute(rect);
		text.setBounds(rect.x-1,rect.y-1, pref.x+12, pref.y+2);
	}

}
