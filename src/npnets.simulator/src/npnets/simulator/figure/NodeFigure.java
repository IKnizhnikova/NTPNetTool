package npnets.simulator.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

public interface NodeFigure extends IFigure {
	public Label getLabelName();
	public ConnectionAnchor getConnectionAnchor();
	public void setLabelText(String str);
}
