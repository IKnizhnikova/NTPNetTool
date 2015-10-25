package ru.mathtech.npntool.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		if (model instanceof NPNDiagramNetSystem) {
			part =  new NPNDiagramNetSystemEditPart();
		} else if (model instanceof NPNSymbolPlaceSN) {
			part = new NPNSymbolPlaceSNEditPart();
		} else if (model instanceof NPNSymbolTransitionSN) {
			part = new NPNSymbolTransitionSNEditPart();
		} else if (model instanceof NPNSymbolArcTPSN) {
			part = new NPNSymbolArcTPSNEditPart();
		} else if (model instanceof NPNSymbolArcPTSN) {
			part = new NPNSymbolArcPTSNEditPart();
		} else if (model instanceof NPNSymbolTokenSN) {
			part = new NPNSymbolTokenSNEditPart();
		}
		
		if (part != null) {
			part.setModel(model);
		}
		
		return part;
	}

}
