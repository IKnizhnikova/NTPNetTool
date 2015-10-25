package ru.mathtech.npntool.editor.commands;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolArcPTSNCreateCommand extends NPNSymbolArcSNCreateCommand {

	public NPNSymbolArcPTSNCreateCommand(NPNDiagramNetSystem diagramNetSystem,
			NPNSymbolArcPTSN newSymbolArcPTSN, NPNSymbolPlaceSN nodeSource) {
		super(diagramNetSystem, newSymbolArcPTSN, nodeSource);
	}

	public void setSymbolTransitionTarget(NPNSymbolTransitionSN symbolTransitionTarget) {
		this.symbolNodeTarget = symbolTransitionTarget;
	}
	
	@Override
	public void execute() {
		super.execute();
		
		NPNSymbolArcPTSN newSymbolArcPT = (NPNSymbolArcPTSN) newSymbolArcSN;
		NPNSymbolPlaceSN symbolPlaceSource = (NPNSymbolPlaceSN) symbolNodeSource;
		NPNSymbolTransitionSN symbolTransitionTarget = (NPNSymbolTransitionSN) symbolNodeTarget;
		
		ArcPT newArcPT = HLPNFactory.eINSTANCE.createArcPT();
		newArc = newArcPT;
		newSymbolArcPT.setModel(newArc);

		// Connect created entities to the diagram and the model
		
		newArcPT.setNet(hlpn);
		newArcPT.setSource((Place) symbolPlaceSource.getModel());
		newArcPT.setTarget((Transition) symbolTransitionTarget.getModel());

		newSymbolArcPT.setSource(symbolPlaceSource);
		newSymbolArcPT.setTarget(symbolTransitionTarget);
		newSymbolArcPT.setDiagram(diagramNetSystem);
	}
	
	@Override
	public void redo() {
		NPNSymbolArcPTSN newSymbolArcPT = (NPNSymbolArcPTSN) newSymbolArcSN;
		ArcPT newArcPT = (ArcPT) newArc;
		NPNSymbolPlaceSN symbolPlaceSource = (NPNSymbolPlaceSN) symbolNodeSource;
		NPNSymbolTransitionSN symbolTransitionTarget = (NPNSymbolTransitionSN) symbolNodeTarget;

		newSymbolArcPT.setDiagram(diagramNetSystem);
		newSymbolArcPT.setSource(symbolPlaceSource);
		newSymbolArcPT.setTarget(symbolTransitionTarget);
		
		newArcPT.setNet(hlpn);
		newArcPT.setSource((Place) symbolPlaceSource.getModel());
		newArcPT.setTarget((Transition) symbolTransitionTarget.getModel());
	}

	@Override
	public void undo() {
		NPNSymbolArcPTSN newSymbolArcPT = (NPNSymbolArcPTSN) newSymbolArcSN;
		ArcPT newArcPT = (ArcPT) newArc;

		newSymbolArcPT.setDiagram(null);
		newSymbolArcPT.setSource(null);
		newSymbolArcPT.setTarget(null);
		
		newArcPT.setNet(null);
		newArcPT.setSource(null);
		newArcPT.setTarget(null);
	}

}
