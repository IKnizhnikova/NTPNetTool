package npnets.simulator.figure;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;

public class FigureTooltip extends FlowPage {
	
	private final Border borderTooltip = new MarginBorder(0, 2, 1, 0);
	private TextFlow message;
	
	public FigureTooltip() {
		setOpaque(true);
		setBorder(borderTooltip);
		message = new TextFlow();
		message.setText("");
		add(message);
	}

	@Override
	public Dimension getPreferredSize(int width, int h) {
		Dimension dim = super.getPreferredSize(-1, -1);
		if (dim.width > 150) {
			dim = super.getPreferredSize(150,-1);
		}
		return dim;
	}
	
	public void setMessage(String text) {
		message.setText(text);
		revalidate();
		repaint();
	}
}
