package ru.mathtech.npntool.editor.parts;

import org.eclipse.draw2d.IFigure;

import ru.mathtech.npntool.editor.figures.NPNSymbolTransitionSNFigure;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolTransitionSNEditPart extends NPNSymbolNodeSNEditPart {

	@Override
	protected IFigure createFigure() {
		return new NPNSymbolTransitionSNFigure();
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		NPNSymbolTransitionSNFigure figure = (NPNSymbolTransitionSNFigure)getFigure();
		figure.getLabelName().setText(getSymbolTransitionSN().getModel().getName());
		figure.invalidate();
	}
	
	private NPNSymbolTransitionSN getSymbolTransitionSN() {
		return (NPNSymbolTransitionSN) getModel();
	}

}
