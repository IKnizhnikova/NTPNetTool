package ru.mathtech.npntool.editor.commands;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolArcTPSNDeleteCommand extends Command {

	private NPNDiagramNetSystem diagramSN;
	private NPNSymbolArcTPSN symbArcTP;
	private NPNSymbolTransitionSN symbTransitionSource;
	private NPNSymbolPlaceSN symbPlaceTarget;

	private HighLevelPetriNet hlpnSN;
	private ArcTP ArcTP;
	private Transition transitionSource;
	private Place placeTarget;

	public NPNSymbolArcTPSNDeleteCommand(NPNSymbolArcTPSN symbolArcTPSN) {
		symbArcTP = symbolArcTPSN;

		diagramSN = symbArcTP.getDiagram();
		symbTransitionSource = symbArcTP.getSource();
		symbPlaceTarget = symbArcTP.getTarget();

		ArcTP = (ArcTP) symbArcTP.getModel();
		hlpnSN = ArcTP.getNet();
		transitionSource = ArcTP.getSource();
		placeTarget = ArcTP.getTarget();
	}

	@Override
	public boolean canExecute() {
		return symbArcTP != null;
	}

	@Override
	public void execute() {
		symbArcTP.setSource(null);
		symbArcTP.setTarget(null);
		symbArcTP.setDiagram(null);

		ArcTP.setSource(null);
		ArcTP.setTarget(null);
		ArcTP.setNet(null);
	}

	@Override
	public void undo() {
		ArcTP.setSource(transitionSource);
		ArcTP.setTarget(placeTarget);
		ArcTP.setNet(hlpnSN);

		symbArcTP.setSource(symbTransitionSource);
		symbArcTP.setTarget(symbPlaceTarget);
		symbArcTP.setDiagram(diagramSN);
	}
}
