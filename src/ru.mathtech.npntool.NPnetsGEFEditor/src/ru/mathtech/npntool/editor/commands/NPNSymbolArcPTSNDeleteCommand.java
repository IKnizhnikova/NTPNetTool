package ru.mathtech.npntool.editor.commands;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolArcPTSNDeleteCommand extends Command {

	private NPNDiagramNetSystem diagramSN;
	private NPNSymbolArcPTSN symbArcPT;
	private NPNSymbolPlaceSN symbPlaceSource;
	private NPNSymbolTransitionSN symbTransitionTarget;
	
	private HighLevelPetriNet hlpnSN;
	private ArcPT arcPT;
	private Place placeSource;
	private Transition transitionTarget;
	
	public NPNSymbolArcPTSNDeleteCommand(NPNSymbolArcPTSN symbolArcPTSN) {
		symbArcPT = symbolArcPTSN;

		diagramSN = symbArcPT.getDiagram();
		symbPlaceSource = symbArcPT.getSource();
		symbTransitionTarget = symbArcPT.getTarget();
		
		arcPT = (ArcPT) symbArcPT.getModel();
		hlpnSN = arcPT.getNet();
		placeSource = arcPT.getSource();
		transitionTarget = arcPT.getTarget();

	}

	@Override
	public boolean canExecute() {
		return symbArcPT != null;
	}

	@Override
	public void execute() {
		symbArcPT.setSource(null);
		symbArcPT.setTarget(null);
		symbArcPT.setDiagram(null);

		arcPT.setSource(null);
		arcPT.setTarget(null);
		arcPT.setNet(null);
	}

	@Override
	public void undo() {
		arcPT.setSource(placeSource);
		arcPT.setTarget(transitionTarget);
		arcPT.setNet(hlpnSN);

		symbArcPT.setSource(symbPlaceSource);
		symbArcPT.setTarget(symbTransitionTarget);
		symbArcPT.setDiagram(diagramSN);
	}
}
