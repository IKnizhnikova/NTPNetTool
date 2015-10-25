package ru.mathtech.npntool.editor.commands;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolArcTPSNCreateCommand extends NPNSymbolArcSNCreateCommand {

	public NPNSymbolArcTPSNCreateCommand(NPNDiagramNetSystem diagramNetSystem,
			NPNSymbolArcTPSN newSymbolArcTPSN, NPNSymbolTransitionSN transitionSource) {
		super(diagramNetSystem, newSymbolArcTPSN, transitionSource);
	}

	public void setSymbolPlaceTarget(NPNSymbolPlaceSN symbolPlaceTarget) {
		this.symbolNodeTarget = symbolPlaceTarget;
	}

	public void execute() {
		super.execute();
		
		NPNSymbolArcTPSN newSymbolArcTP = (NPNSymbolArcTPSN) newSymbolArcSN;
		NPNSymbolTransitionSN symbolTransitionSource = (NPNSymbolTransitionSN) symbolNodeSource;
		NPNSymbolPlaceSN symbolPlaceTarget = (NPNSymbolPlaceSN) symbolNodeTarget;
		
		ArcTP newArcTP = HLPNFactory.eINSTANCE.createArcTP();
		newArc = newArcTP;
		newSymbolArcTP.setModel(newArc);

		// Connect created entities to the diagram and the model
		newSymbolArcTP.setDiagram(diagramNetSystem);
		newSymbolArcTP.setSource(symbolTransitionSource);
		newSymbolArcTP.setTarget(symbolPlaceTarget);

		newArcTP.setNet(hlpn);
		newArcTP.setSource( (Transition) symbolTransitionSource.getModel());
		newArcTP.setTarget( (Place) symbolPlaceTarget.getModel());
	}
	
	@Override
	public void redo() {
		NPNSymbolArcTPSN newSymbolArcTP = (NPNSymbolArcTPSN) newSymbolArcSN;
		ArcTP newArcTP = (ArcTP) newArc;
		NPNSymbolTransitionSN symbolTransitionSource = (NPNSymbolTransitionSN) symbolNodeSource;
		NPNSymbolPlaceSN symbolPlaceTarget = (NPNSymbolPlaceSN) symbolNodeTarget;

		newSymbolArcTP.setDiagram(diagramNetSystem);
		newSymbolArcTP.setSource(symbolTransitionSource);
		newSymbolArcTP.setTarget(symbolPlaceTarget);

		newArcTP.setNet(hlpn);
		newArcTP.setSource( (Transition) symbolTransitionSource.getModel());
		newArcTP.setTarget( (Place) symbolPlaceTarget.getModel());
	}

	@Override
	public void undo() {
		NPNSymbolArcTPSN newSymbolArcTP = (NPNSymbolArcTPSN) newSymbolArcSN;
		ArcTP newArcTP = (ArcTP) newArc;

		newArcTP.setSource(null);
		newArcTP.setTarget(null);
		newArcTP.setNet(null);

		newSymbolArcTP.setSource(null);
		newSymbolArcTP.setTarget(null);
		newSymbolArcTP.setDiagram(null);
	}

}
