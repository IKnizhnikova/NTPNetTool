package ru.mathtech.npntool.editor.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

public class NPNSymbolTokenSNFigure extends Figure {
	private Ellipse ellipse;
	private ConnectionAnchor connectionAnchor = null;
	private Color color = ColorConstants.darkBlue;
	
	FigureTooltip figureTooltip;
	
	public NPNSymbolTokenSNFigure() {
		setLayoutManager(new XYLayout());
		ellipse = new Ellipse();
		ellipse.setBackgroundColor(color);
		ellipse.setAntialias(SWT.ON);
		add(ellipse);
		
		ellipse.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseHover(MouseEvent me) {
			}
			
			@Override
			public void mouseExited(MouseEvent me) {
				ellipse.setBackgroundColor(color);
				ellipse.invalidate();
			}
			
			@Override
			public void mouseEntered(MouseEvent me) {
				ellipse.setBackgroundColor(ColorConstants.red);
				ellipse.invalidate();
			}
			
			@Override
			public void mouseDragged(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}
		});
		
		figureTooltip = new FigureTooltip();
		figureTooltip.setMessage("Token");
		setToolTip(figureTooltip);
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle rect = getBounds().getCopy();
		setConstraint(ellipse, new Rectangle(0,0,rect.width,rect.height));
	}

	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}
	
	public void setTooltipText(String text) {
		figureTooltip.setMessage(text);
	}
}
