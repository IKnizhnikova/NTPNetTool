package ru.mathtech.npntool.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import ru.mathtech.npntool.editor.policies.NPNSymbolArcSNBendpointEditPolicy;
import ru.mathtech.npntool.editor.policies.NPNSymbolArcSNEditPolicy;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

public abstract class NPNSymbolArcSNEditPart extends AbstractConnectionEditPart {
	
	public class NPNSymbolArcSNAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
		}

		@Override
		public Notifier getTarget() {
			return (NPNSymbolArcSN) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(NPNSymbolArcSN.class);
		}
		
	}
	
	NPNSymbolArcSNAdapter adapter;

	public NPNSymbolArcSNEditPart() {
		super();
		adapter = new NPNSymbolArcSNAdapter();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE,
				new NPNSymbolArcSNEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
				new NPNSymbolArcSNBendpointEditPolicy());
	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection res = new PolylineConnection();
		res.setConnectionRouter(new BendpointConnectionRouter());
		decorateConnection(res);
		return res;
	}

	private void decorateConnection(PolylineConnection connection) {
		connection.setTargetDecoration(new PolylineDecoration());
	}

	@Override
	protected void refreshVisuals() {
		Connection connection = getConnectionFigure();
		List<Point> modelConstraints =
				((NPNSymbolArcSN) getModel()).getBendpoints();
		List<AbsoluteBendpoint> figureConstraints = 
				new ArrayList<AbsoluteBendpoint>();
		for (Point point : modelConstraints) {
			figureConstraints.add(new AbsoluteBendpoint(point));
		}
		connection.setRoutingConstraint(figureConstraints);
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((NPNSymbolArcSN)getModel()).eAdapters().add(adapter);
			((NPNSymbolArcSN)getModel()).getModel().eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((NPNSymbolArcSN)getModel()).eAdapters().remove(adapter);
			((NPNSymbolArcSN)getModel()).getModel().eAdapters().remove(adapter);
		}
		super.deactivate();
	}

}
