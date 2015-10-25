package npnets.simulator.figure;

import java.util.List;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

public class ArcFigure extends PolylineConnection {
	protected Label label;
	Arc model;

	public ArcFigure(Arc model) {
		this.model = model;
		setTargetDecoration(new PolygonDecoration());
		MidpointLocator labelLocator = new MidpointLocator(this, 0);
		label = new Label();
		label.setOpaque(true);
		add(label, labelLocator);
	}

	public void setLabelText(String labelText) {
		String timeVar = "";
		if (model instanceof ArcTP && (((ArcTP) model).getFirstTimeConstraint()!=0 || ((ArcTP) model).getSecondTimeConstraint()!=-1) && (((ArcTP) model).getFirstTimeConstraint()!=0 || ((ArcTP) model).getSecondTimeConstraint()!=-2) ) {
			timeVar = ", ";
			ArcTP arc = (ArcTP) model;
			if (arc.getFirstTimeConstraint() != 0 && arc.getSecondTimeConstraint() == -2)
				timeVar = "[" + arc.getFirstTimeConstraint() + "]";
			else {
				timeVar = "[" + arc.getFirstTimeConstraint() + " ; ";
				if (arc.getSecondTimeConstraint() != -1)
					timeVar += (arc.getSecondTimeConstraint());
				else
					timeVar += "\u221E";
				timeVar += "]";
			}
		}
		label.setText(labelText + "" + timeVar);
	}

	public Label getNameLabel() {
		return label;
	}

	public void refresh() {
		String timeVar = "";
		if (model instanceof ArcTP && (((ArcTP) model).getFirstTimeConstraint()!=0 || ((ArcTP) model).getSecondTimeConstraint()!=-1) && (((ArcTP) model).getFirstTimeConstraint()!=0 || ((ArcTP) model).getSecondTimeConstraint()!=-2) ) {
			ArcTP arc = (ArcTP) model;
			timeVar = ", ";
			if (arc.getFirstTimeConstraint() != 0 && arc.getSecondTimeConstraint() == -2)
				timeVar = "[" + arc.getFirstTimeConstraint() + "]";
			else {
				timeVar = "[" + arc.getFirstTimeConstraint() + " ; ";
				if (arc.getSecondTimeConstraint() != -1)
					timeVar += (arc.getSecondTimeConstraint());
				else
					timeVar += "\u221E";
				timeVar += "]";
			}
		}
		String labelText = "";
		if (model.getName() != null) {
			List<Monom> monoms = null;
			String res = "";
			if (model instanceof ArcPT) {
				monoms = ((ArcPT) model).getInscription().getMonoms();
			}
			if (model instanceof ArcTP) {
				monoms = ((ArcTP) model).getInscription().getMonoms();
			}
			for (Monom monom : monoms) {
				res += (monom.getPower().intValue() > 1 ? monom.getPower().toString() : "") + monom.getVariable().getName() + ", ";
			}
			if (res.contains(","))
				labelText = res.substring(0, res.lastIndexOf(','));
		}
		label.setText(labelText + "" + timeVar);
	}
}
