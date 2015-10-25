package npnets.simulator.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.swt.SWT;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;

public class PlaceFigure extends Figure
implements NodeFigure, HandleBounds {
	private Label labelName;
	private Ellipse ellipse;
	private ConnectionAnchor connectionAnchor = null;
	private NPNSymbolPlaceSN model;
	
	public void setModel(NPNSymbolPlaceSN model) {
		this.model = model;
	}

	public PlaceFigure(NPNSymbolPlaceSN model) {
		this.model=model;
		setLayoutManager(new XYLayout());
		labelName = new Label();
		labelName.setTextAlignment(PositionConstants.BOTTOM);

		String timeVar="";
		if((model.getModel().getFirstTimeConstraint()!=0 || model.getModel().getSecondTimeConstraint()!=-1) && (model.getModel().getFirstTimeConstraint()!=0 || model.getModel().getSecondTimeConstraint()!=-2))
		{
			if(model.getModel().getFirstTimeConstraint()!=0 && model.getModel().getSecondTimeConstraint()==-2)
				timeVar = "["+model.getModel().getFirstTimeConstraint()+"]";
			else
			{
			timeVar = "[" + model.getModel().getFirstTimeConstraint() + " ; ";
			if(model.getModel().getSecondTimeConstraint()!=-1)
				timeVar+=(model.getModel().getSecondTimeConstraint());
			else timeVar += "\u221E";
			timeVar+="]";
			}

		}
		labelName.setText(model.getModel().getName() + "\n    " + timeVar);
		add(labelName);
		ellipse = new Ellipse();
		ellipse.setFill(false);
		ellipse.setAntialias(SWT.ON);
		ellipse.setLayoutManager(new XYLayout());
		add(ellipse);
	}
	public void refresh(){
		String timeVar="";
		if((model.getModel().getFirstTimeConstraint()!=0 || model.getModel().getSecondTimeConstraint()!=-1) && (model.getModel().getFirstTimeConstraint()!=0 || model.getModel().getSecondTimeConstraint()!=-2) )
		{
			if(model.getModel().getFirstTimeConstraint()!=0 && model.getModel().getSecondTimeConstraint()==-2)
				timeVar = "["+model.getModel().getFirstTimeConstraint()+"]";
			else
			{
			timeVar = "[" + model.getModel().getFirstTimeConstraint() + " ; ";
			if(model.getModel().getSecondTimeConstraint()!=-1)
				timeVar+=(model.getModel().getSecondTimeConstraint());
			else timeVar += "\u221E";
			timeVar+="]";
			}
		}
		labelName.setText(model.getModel().getName() + "\n    " + timeVar);
		labelName.revalidate();
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle rect = getBounds().getCopy();
		
		Rectangle rectLabel = new Rectangle(0,0,rect.width,rect.height-5);
		//rectLabel.expand(new Insets(0,0,labelName.getTextBounds().height/2,0));
		setConstraint(labelName, rectLabel);
		
		setConstraint(ellipse, new Rectangle(0,0,rect.width,rect.height));
	}

	@Override
	public Label getLabelName() {
		return labelName;
	}


	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

	public IFigure getContentPane() {
		return ellipse;
	}

	@Override
	public Rectangle getHandleBounds() {
		return ellipse.getBounds().getCopy();
	}

	@Override
	public void setBounds(Rectangle rect) {
		// TODO Auto-generated method stub
		super.setBounds(rect);
	}

	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension d = new Dimension();
		Rectangle rectText = getLabelName().getTextBounds().getCopy();
		d.width = rectText.width;
		d.height = rectText.height;
		return d;
	}

	@Override
	public void setLabelText(String str) {
		labelName.setText(str);
		labelName.revalidate();
		
	}
}

