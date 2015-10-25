package ru.mathtech.npntool.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import ru.mathtech.npntool.editor.figures.NPNSymbolNodeSNFigure;
import ru.mathtech.npntool.editor.policies.NPNSymbolNodeGraphicalNodeEditPolicy;
import ru.mathtech.npntool.editor.policies.NPNSymbolNodeSNComponentEditPolicy;
import ru.mathtech.npntool.editor.policies.NPNSymbolNodeSNDirectEditPolicy;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public abstract class NPNSymbolNodeSNEditPart extends AbstractGraphicalEditPart implements NodeEditPart {
	
	public class NPNSymbolNodeSNAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
			refreshChildren();
			refreshSourceConnections();
			refreshTargetConnections();
		}

		@Override
		public Notifier getTarget() {
			return (NPNSymbolNodeSN)getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			boolean res =
					type.equals(NPNSymbolNodeSN.class) ||
					type.equals(NPNSymbolPlaceSN.class) ||
					type.equals(NPNSymbolTransitionSN.class);
			return res;	
			//return NPNSymbolNodeSN.class.isAssignableFrom((Class<?>) type);
		}
	}

	protected NPNSymbolNodeSNAdapter adapter;

	public NPNSymbolNodeSNEditPart() {
		super();
		adapter = new NPNSymbolNodeSNAdapter();
	}
	

	@Override
	public Object getAdapter(Class key) {
		if (key == SnapToHelper.class) {
			List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
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
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new NPNSymbolNodeSNDirectEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new NPNSymbolNodeGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new NPNSymbolNodeSNComponentEditPolicy());

		installEditPolicy("Snap feedback", new SnapFeedbackPolicy());
	}

	@Override
	protected List getModelSourceConnections() {
		Object model = getModel();
		if (model instanceof NPNSymbolPlaceSN) {
			NPNSymbolPlaceSN symbolPlace = (NPNSymbolPlaceSN)model;
			return symbolPlace.getOutArcs(); 
		} else if (model instanceof NPNSymbolTransitionSN) {
			NPNSymbolTransitionSN symbolTransition = (NPNSymbolTransitionSN)model;
			return symbolTransition.getOutArcs();
		}
		return super.getModelSourceConnections();
	}

	@Override
	protected List getModelTargetConnections() {
		Object model = getModel();
		if (model instanceof NPNSymbolPlaceSN) {
			NPNSymbolPlaceSN symbolPlace = (NPNSymbolPlaceSN)model;
			return symbolPlace.getInArcs(); 
		} else if (model instanceof NPNSymbolTransitionSN) {
			NPNSymbolTransitionSN symbolTransition = (NPNSymbolTransitionSN)model;
			return symbolTransition.getInArcs();
		}
		return super.getModelTargetConnections();
	}

	@Override
	protected void refreshVisuals() {
		NPNSymbolNodeSNFigure figure = (NPNSymbolNodeSNFigure)getFigure();
		NPNSymbolNodeSN model = (NPNSymbolNodeSN) getModel();
		NPNDiagramNetSystemEditPart parent = (NPNDiagramNetSystemEditPart)getParent();
		
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return ((NPNSymbolNodeSNFigure)getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return ((NPNSymbolNodeSNFigure)getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((NPNSymbolNodeSNFigure)getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((NPNSymbolNodeSNFigure)getFigure()).getConnectionAnchor();
	}
	
	@Override
	public void activate() {
		if (!isActive()) {
			((NPNSymbolNodeSN)getModel()).eAdapters().add(adapter);
			((NPNSymbolNodeSN)getModel()).getModel().eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((NPNSymbolNodeSN)getModel()).eAdapters().remove(adapter);
			((NPNSymbolNodeSN)getModel()).getModel().eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			performDirectEditing();
		}
	}

	private void performDirectEditing() {
		Label label = ((NPNSymbolNodeSNFigure)getFigure()).getLabelName();
		NPNSymbolNodeSNDirectEditManager manager = 
				new NPNSymbolNodeSNDirectEditManager(this, TextCellEditor.class,
						new NPNSymbolNodeSNCellEditorLocator(label), label);
		manager.show();
	}

}
