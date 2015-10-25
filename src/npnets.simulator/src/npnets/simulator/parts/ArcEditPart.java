package npnets.simulator.parts;


import java.util.List;

import npnets.simulator.figure.ArcFigure;
import npnets.simulator.figure.PlaceFigure;
import npnets.simulator.policy.ArcConnectionEditPolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;



public class ArcEditPart extends AbstractConnectionEditPart {
 
  public ArcEditPart() {
    super();
  }
  
	@Override public void performRequest(Request req) {
	    if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
	    	performDirectEditing();
	    }
	}
	   
	private void performDirectEditing() {
	    Label label = ((ArcFigure)getFigure()).getNameLabel();
	    NodeDirectEditManager manager = new NodeDirectEditManager(this, TextCellEditor.class, new NodeCellEditorLocator(label), label);
	    refreshVisuals();
	    manager.show();
	}
	public void setName(ArcFigure figure, NPNSymbolArcSN model) {
		figure.getNameLabel().setText(model.getModel().getName());
	}
	
	  @Override protected void createEditPolicies() {
	    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new ArcConnectionEditPolicy());
	  }
	 
	  @Override protected IFigure createFigure() {
	    Arc arc=((NPNSymbolArcSN)getModel()).getModel();
	    ArcFigure af = new ArcFigure(arc);
	    if (arc.getName() != null)
	    {
	    	List<Monom> monoms=null;
	    	String res="";
	    	if(arc instanceof ArcPT)
	    	{
	    		monoms=((ArcPT)arc).getInscription().getMonoms();
	    	}
	    	if(arc instanceof ArcTP){
	    		monoms=((ArcTP)arc).getInscription().getMonoms();
	    	}
	    	for(Monom monom:monoms){
	    		res+=(monom.getPower().intValue()>1?monom.getPower().toString():"")+monom.getVariable().getName()+", ";
	    	}
	    	if(res.contains(","))
	    		af.setLabelText(res.substring(0,res.lastIndexOf(',')));
	    }
	    return af;
	  }
	  
		@Override
		protected void refreshVisuals() {
			super.refreshVisuals();
			refreshChildren();
			ArcFigure figure = (ArcFigure)getFigure();
			figure.refresh();
			figure.invalidate();
		}
 
}
