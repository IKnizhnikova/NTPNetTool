package ru.mathtech.npntool.editor.factories;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

import ru.mathtech.npntool.editor.NPNGraphicalEditorConstants;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;

public class NPNSymbolPlaceSNFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		NPNSymbolPlaceSN symbolPlaceSN =
				NPNDiagramsFactory.eINSTANCE.createNPNSymbolPlaceSN();
		symbolPlaceSN.setConstraints(new Rectangle(0,0,
				NPNGraphicalEditorConstants.dimensionNodeSizeDefault.width(),
				NPNGraphicalEditorConstants.dimensionNodeSizeDefault.height()
				));
		return symbolPlaceSN;
	}

	@Override
	public Object getObjectType() {
		return NPNSymbolPlaceSN.class;
	}

}
