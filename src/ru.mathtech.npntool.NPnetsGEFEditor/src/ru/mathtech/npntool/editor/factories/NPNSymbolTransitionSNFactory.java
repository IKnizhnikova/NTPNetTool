package ru.mathtech.npntool.editor.factories;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import ru.mathtech.npntool.editor.NPNGraphicalEditorConstants;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolTransitionSNFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		NPNSymbolTransitionSN symbolTransitionSN =
				NPNDiagramsFactory.eINSTANCE.createNPNSymbolTransitionSN();
		symbolTransitionSN.setConstraints(new Rectangle(0,0,
				NPNGraphicalEditorConstants.dimensionNodeSizeDefault.width(),
				NPNGraphicalEditorConstants.dimensionNodeSizeDefault.height()
				));
		return symbolTransitionSN;
	}

	@Override
	public Object getObjectType() {
		return NPNSymbolTransitionSN.class;
	}

}
