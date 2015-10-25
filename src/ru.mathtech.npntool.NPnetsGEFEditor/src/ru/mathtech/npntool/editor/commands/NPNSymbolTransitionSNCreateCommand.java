package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;

import ru.mathtech.npntool.editor.NPNGraphicalEditorConstants;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolTransitionSNCreateCommand extends
		NPNSymbolNodeSNCreateCommand {

	public NPNSymbolTransitionSNCreateCommand(
			NPNDiagramNetSystem diagramParent, NPNSymbolTransitionSN newSymbolTransition,
			Point location) {
		super(diagramParent, newSymbolTransition, location);
	}

	@Override
	public void execute() {
		NPNSymbolTransitionSN symbolTransitionSN = (NPNSymbolTransitionSN) newSymbolNode;
		Transition newTransition = HLPNFactory.eINSTANCE.createTransition();
		newNode = newTransition;
		symbolTransitionSN.setModel(newTransition);

		newNode.setName(NPNGraphicalEditorConstants.nameNodeDefault);
		newSymbolNode.setConstraints(newConstraints);

		hlpnSN = diagramNetSystem.getModel();

		//Connect created entities to the diagram and the net
		newSymbolNode.setDiagram(diagramNetSystem);
		newNode.setNet(hlpnSN);
	}

}
