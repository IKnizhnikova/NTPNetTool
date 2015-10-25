package ru.mathtech.npntool.editor.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.ui.actions.SetActivePaletteToolAction;

import ru.mathtech.npntool.editor.figures.NPNSymbolPlaceSNFigure;
import ru.mathtech.npntool.editor.policies.NPNSymbolNodeSNXYLayoutPolicy;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;

public class NPNSymbolPlaceSNEditPart extends NPNSymbolNodeSNEditPart {

	@Override
	protected IFigure createFigure() {
		return new NPNSymbolPlaceSNFigure();
	}
	
	@Override
	public IFigure getContentPane() {
		NPNSymbolPlaceSNFigure figure = (NPNSymbolPlaceSNFigure) getFigure();
		return figure.getContentPane();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new NPNSymbolNodeSNXYLayoutPolicy());
		super.createEditPolicies();
	}
	
	@Override
	protected List getModelChildren() {
		NPNSymbolPlaceSN model = (NPNSymbolPlaceSN) getModel();
		return Collections.unmodifiableList(model.getTokens());
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		NPNSymbolPlaceSNFigure figure = (NPNSymbolPlaceSNFigure)getFigure();
		figure.getLabelName().setText(getSymbolPlaceSN().getModel().getName());
		//figure.invalidate();
	}
	
	private NPNSymbolPlaceSN getSymbolPlaceSN() {
		return (NPNSymbolPlaceSN) getModel();
	}

}
