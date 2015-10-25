package ru.mathtech.npntool.editor.figures;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

public interface NPNSymbolNodeSNFigure extends IFigure {
	public Label getLabelName();
	public ConnectionAnchor getConnectionAnchor();
}
