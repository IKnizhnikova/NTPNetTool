package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.editor.NPNGraphicalEditorConstants;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public abstract class NPNSymbolNodeSNCreateCommand extends Command {

	protected NPNDiagramNetSystem diagramNetSystem;
	protected NPNSymbolNodeSN newSymbolNode;
	protected Rectangle newConstraints;

	protected HighLevelPetriNet hlpnSN = null;
	protected Node newNode = null;
	
	

	public NPNSymbolNodeSNCreateCommand(NPNDiagramNetSystem diagramParent, NPNSymbolNodeSN newSymbolNode, Point location) {
		super();
		this.diagramNetSystem = diagramParent;
		this.newSymbolNode = newSymbolNode;
		this.newConstraints = new Rectangle(location, NPNGraphicalEditorConstants.dimensionNodeSizeDefault);
	}

	@Override
	public void redo() {
		newSymbolNode.setDiagram(diagramNetSystem);
		newNode.setNet(hlpnSN);
	}

	@Override
	public void undo() {
		newSymbolNode.setDiagram(null);
		newNode.setNet(null);
	}

}
