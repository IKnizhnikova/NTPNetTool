package npnets.simulator.parts;

import java.util.ArrayList;
import java.util.List;

import npnets.simulator.policy.NetXYLayoutPolicy;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.swt.SWT;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;


public class NetEditPart extends AbstractGraphicalEditPart {
	public class AdapterNPNDiagramNetSystemEditPart implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshChildren();
		}

		@Override
		public Notifier getTarget() {
			return (NPNDiagramNetSystem)getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(NPNDiagramNetSystem.class);
		}
	}

	private AdapterNPNDiagramNetSystemEditPart adapter;


	@Override
	public Object getAdapter(Class key) {
		List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
		if (key == SnapToHelper.class) {
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
				helpers.add(new SnapToGeometry(this));
			}
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
				helpers.add(new SnapToGrid(this));
			}
			if (helpers.isEmpty()) {
				return null;			
			} else {
				return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
			}
		}
		return super.getAdapter(key);
	}
	
	@Override
	protected void refreshVisuals() {
		ConnectionLayer layerConn = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
		if ( (getViewer().getControl().getStyle() & SWT.MIRRORED) == 0) {
			layerConn.setAntialias(SWT.ON);
		}
		super.refreshVisuals();
	}

	public NetEditPart() {
		super();
		adapter = new AdapterNPNDiagramNetSystemEditPart();
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new NetXYLayoutPolicy());
		installEditPolicy("Snap feedback", new SnapFeedbackPolicy());
	}
	
	@Override
	protected List<EObject> getModelChildren() {
		List<EObject> res = new ArrayList<EObject>();
		NPNDiagramNetSystem diagramSN = (NPNDiagramNetSystem) getModel();
		res.addAll(diagramSN.getNodes());
		return res;
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((NPNDiagramNetSystem)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((NPNDiagramNetSystem)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
}