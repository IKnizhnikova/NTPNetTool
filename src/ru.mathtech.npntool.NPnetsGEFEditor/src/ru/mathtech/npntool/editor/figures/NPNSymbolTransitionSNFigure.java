package ru.mathtech.npntool.editor.figures;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public class NPNSymbolTransitionSNFigure extends Figure implements NPNSymbolNodeSNFigure {

	private Label labelName;
	private RectangleFigure rectangleFigure;
	private ConnectionAnchor connectionAnchor = null;
	
	public NPNSymbolTransitionSNFigure() {
		setLayoutManager(new XYLayout());
		rectangleFigure = new RectangleFigure();
		rectangleFigure.setFill(false);
		add(rectangleFigure);
		labelName = new Label();
		add(labelName);
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle rect = getBounds().getCopy();
		setConstraint(labelName, new Rectangle(0,0,rect.width,rect.height));
		setConstraint(rectangleFigure, new Rectangle(0,0,rect.width,rect.height));
	}

	@Override
	public Label getLabelName() {
		return labelName;
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension d = new Dimension();
		Rectangle rectText = getLabelName().getTextBounds().getCopy();
		d.width = rectText.width;
		d.height = rectText.height;
		return d;
	}

}
