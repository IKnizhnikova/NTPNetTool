package npnets.simulator.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class TransitionFigure extends Figure implements NodeFigure {

	private Label labelName;
	private Label labelSync;
	private NPNSymbolTransitionSN model;
	private RectangleFigure rectangleFigure;
	private ConnectionAnchor connectionAnchor = null;
	
	public TransitionFigure(NPNSymbolTransitionSN model) {
		this.model=model;
		setLayoutManager(new XYLayout());
		rectangleFigure = new RectangleFigure();
		rectangleFigure.setFill(false);
		add(rectangleFigure);
		labelName = new Label();
		add(labelName);
		labelSync=new Label();
		labelSync.setTextAlignment(PositionConstants.BOTTOM);
		
		if(model.getModel() instanceof TransitionSynchronized && ((TransitionSynchronized)model.getModel()).getSynchronization()!=null)
		{
			labelSync.setText("S ("+((TransitionSynchronized)model.getModel()).getSynchronization().getName()+")");
		}
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
		labelName.setText(model.getModel().getName() +"\n   " + timeVar );
		add(labelSync);
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle rect = getBounds().getCopy();
		setConstraint(labelName, new Rectangle(0,0,rect.width,rect.height));
		setConstraint(rectangleFigure, new Rectangle(0,0,rect.width,rect.height));
		if(model.getModel() instanceof TransitionSynchronized && ((TransitionSynchronized)model.getModel()).getSynchronization()!=null)
		{
		Rectangle rectLabel = new Rectangle(0,0,rect.width,rect.height);
		setConstraint(labelSync, rectLabel);
		}
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

	@Override
	public void setLabelText(String str) {
		labelName.setText(str);
		labelName.revalidate();
		
	}
	
	public void refresh(){
		if(model.getModel() instanceof TransitionSynchronized && ((TransitionSynchronized)model.getModel()).getSynchronization()!=null)
		{
			labelSync.setText("S ("+((TransitionSynchronized)model.getModel()).getSynchronization().getName()+")");
		}
		else if(labelSync!=null && labelSync.getText()!="" ){
			labelSync.setText("");
		}
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
		labelName.setText(model.getModel().getName() + "\n   " + timeVar);
	}

}

