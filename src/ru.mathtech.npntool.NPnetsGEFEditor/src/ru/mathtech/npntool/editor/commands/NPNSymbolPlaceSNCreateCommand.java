package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;

import ru.mathtech.npntool.editor.NPNGraphicalEditorConstants;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;

public class NPNSymbolPlaceSNCreateCommand extends NPNSymbolNodeSNCreateCommand {

	public NPNSymbolPlaceSNCreateCommand(NPNDiagramNetSystem diagramParent,
			NPNSymbolPlaceSN newSymbolPlace, Point location) {
		super(diagramParent, newSymbolPlace, location);
	}

	@Override
	public void execute() {
		NPNSymbolPlaceSN symbolPlace = (NPNSymbolPlaceSN) newSymbolNode;
		Place newPlace = HLPNFactory.eINSTANCE.createPlace();
		newNode = newPlace;
		symbolPlace.setModel(newPlace);

		newNode.setName(NPNGraphicalEditorConstants.nameNodeDefault);
		newSymbolNode.setConstraints(newConstraints);

		hlpnSN = diagramNetSystem.getModel();

		// Connect created entities to the diagram and the net
		newSymbolNode.setDiagram(diagramNetSystem);
		newNode.setNet(hlpnSN);
	}

}
