package npnets.simulator.parts;

import java.util.List;

import npnets.simulator.figure.TransitionFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class TransitionEditPart extends NodeEditPart {
	
	@Override protected List<NPNSymbolArcTPSN> getModelSourceConnections() {
		NPNSymbolTransitionSN model = (NPNSymbolTransitionSN)getModel();
	    return model.getOutArcs();
	}
		 
    @Override protected List<NPNSymbolArcPTSN> getModelTargetConnections() {
    	NPNSymbolTransitionSN model = (NPNSymbolTransitionSN)getModel();
	    return model.getInArcs();
    }
    
	@Override
	protected IFigure createFigure() {
		return new TransitionFigure(getSymbolTransitionSN());
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		TransitionFigure figure = (TransitionFigure)getFigure();
		figure.refresh();
		figure.invalidate();
	}
	
	private NPNSymbolTransitionSN getSymbolTransitionSN() {
		return (NPNSymbolTransitionSN) getModel();
	}

	@Override
	protected Dimension getSize() {
		return new Dimension(10, 50);
	}
}

