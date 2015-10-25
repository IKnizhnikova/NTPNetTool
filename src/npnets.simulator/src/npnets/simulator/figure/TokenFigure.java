package npnets.simulator.figure;

import npnets.simulator.actions.OpenElementNetEditorAction;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class TokenFigure extends Figure {
	private Ellipse ellipse;
	private ConnectionAnchor connectionAnchor = null;
	private Color color = ColorConstants.darkBlue;
	NPNSymbolTokenSN model;
	FigureTooltip figureTooltip;
	
	public TokenFigure(NPNSymbolTokenSN smodel) {
		this.model=smodel;
		setLayoutManager(new XYLayout());
		ellipse = new Ellipse();
		if(model.getModel().getType() instanceof TokenTypeElementNet)
			ellipse.setBackgroundColor(color);
		else ellipse.setBackgroundColor(ColorConstants.black);
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
			if(model.getModel().getType() instanceof TokenTypeElementNet)
			{
				ellipse.setBackgroundColor(color);
				ellipse.invalidate();
			}
			}
			
			@Override
			public void mouseEntered(MouseEvent me) {
				if(model.getModel().getType() instanceof TokenTypeElementNet){
				ellipse.setBackgroundColor(ColorConstants.red);
				ellipse.invalidate();
				}
			}
			
			@Override
			public void mouseDragged(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}
		});
		ellipse.addMouseListener(new MouseListener(){

			@Override
			public void mousePressed(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent me) {

			}

			@Override
			public void mouseDoubleClicked(MouseEvent me) {
				if(model.getModel().getType() instanceof TokenTypeElementNet){
					new OpenElementNetEditorAction((TokenTypeElementNet)model.getModel().getType(),null);
					}
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
	public void setModel(NPNSymbolTokenSN model){
		this.model=model;
		if(model.getModel().getType() instanceof TokenTypeElementNet)
			ellipse.setBackgroundColor(color);
		else ellipse.setBackgroundColor(ColorConstants.black);
	}
}
