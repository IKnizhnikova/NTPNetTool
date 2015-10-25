package ru.mathtech.npntool.editor.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import ru.mathtech.npntool.editor.figures.NPNSymbolNodeSNFigure;
import ru.mathtech.npntool.editor.figures.NPNSymbolTokenSNFigure;
import ru.mathtech.npntool.editor.policies.NPNSymbolTokenSNComponentEditPolicy;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolTokenSNEditPart extends AbstractGraphicalEditPart {

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
	
	public NPNSymbolTokenSNEditPart() {
		super();
		adapter = new NPNSymbolTokenSNAdapter();
	}

	@Override
	protected IFigure createFigure() {
		return new NPNSymbolTokenSNFigure();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new NPNSymbolTokenSNComponentEditPolicy());
	}
	
	@Override
	protected void refreshVisuals() {
		NPNSymbolTokenSNFigure figure = (NPNSymbolTokenSNFigure)getFigure();
		NPNSymbolTokenSN model = (NPNSymbolTokenSN) getModel();
		NPNSymbolNodeSNEditPart parent = (NPNSymbolNodeSNEditPart)getParent();
		
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
