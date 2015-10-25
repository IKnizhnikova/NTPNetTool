package npnets.simulator.parts;

import java.util.Collections;
import java.util.List;

import npnets.simulator.figure.PlaceFigure;
import npnets.simulator.policy.NPNSymbolNodeSNXYLayoutPolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.IWorkbenchPartConstants;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
 

public class PlaceEditPart extends NodeEditPart {
	@Override protected List<NPNSymbolArcPTSN> getModelSourceConnections() {
		NPNSymbolPlaceSN model = (NPNSymbolPlaceSN)getModel();
	    return model.getOutArcs();
	}
		 
    @Override protected List<NPNSymbolArcTPSN> getModelTargetConnections() {
    	NPNSymbolPlaceSN model = (NPNSymbolPlaceSN)getModel();
	    return model.getInArcs();
    }
	@Override
	protected List getModelChildren() {
		NPNSymbolPlaceSN model = (NPNSymbolPlaceSN) getModel();
		return Collections.unmodifiableList(model.getTokens());
	}
    
	protected Dimension getSize(){
		return new Dimension(50, 50);
	}
	
	@Override
	protected IFigure createFigure() {
	    return new PlaceFigure(getSymbolPlaceSN());
	}
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new NPNSymbolNodeSNXYLayoutPolicy());
		super.createEditPolicies();
	}
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshChildren();
		PlaceFigure figure = (PlaceFigure)getFigure();
		figure.refresh();
		figure.invalidate();
	}
	private NPNSymbolPlaceSN getSymbolPlaceSN() {
		return (NPNSymbolPlaceSN) getModel();
	}
	@Override
	public IFigure getContentPane() {
		PlaceFigure figure = (PlaceFigure) getFigure();
		return figure.getContentPane();
	}
}