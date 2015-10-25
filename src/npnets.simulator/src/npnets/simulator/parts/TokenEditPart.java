package npnets.simulator.parts;

import npnets.simulator.figure.TokenFigure;
import npnets.simulator.policy.TokenComponentEditPolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class TokenEditPart extends AbstractGraphicalEditPart {

	public class NPNSymbolTokenSNAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();
		}

		@Override
		public Notifier getTarget() {
			return (NPNSymbolTokenSN)getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			boolean res =
					type.equals(NPNSymbolTokenSN.class);
			return res;	
		}
	}
	
	NPNSymbolTokenSNAdapter adapter;
	
	public TokenEditPart() {
		super();
		adapter = new NPNSymbolTokenSNAdapter();
	}

	@Override
	protected IFigure createFigure() {
		TokenFigure figure=new TokenFigure((NPNSymbolTokenSN)getModel());
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new TokenComponentEditPolicy());
	}
	
	@Override
	protected void refreshVisuals() {
		TokenFigure figure = (TokenFigure)getFigure();
		NPNSymbolTokenSN model = (NPNSymbolTokenSN) getModel();
		NodeEditPart parent = (NodeEditPart)getParent();
		
		parent.setLayoutConstraint(this, figure, model.getConstraints());		
		super.refreshVisuals();

		figure.invalidate();
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((NPNSymbolTokenSN) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((NPNSymbolTokenSN) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	
	
}
