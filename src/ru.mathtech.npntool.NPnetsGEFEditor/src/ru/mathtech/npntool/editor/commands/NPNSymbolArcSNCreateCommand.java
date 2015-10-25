package ru.mathtech.npntool.editor.commands;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public abstract class NPNSymbolArcSNCreateCommand extends Command {

	protected NPNDiagramNetSystem diagramNetSystem;
	protected NPNSymbolNodeSN symbolNodeSource;
	protected NPNSymbolNodeSN symbolNodeTarget = null;
	protected NPNSymbolArcSN newSymbolArcSN;
	
	protected HighLevelPetriNet hlpn;
	protected Arc newArc;

	public NPNSymbolArcSNCreateCommand(NPNDiagramNetSystem diagramNetSystem, NPNSymbolArcSN newSymbolArcSN,
			NPNSymbolNodeSN nodeSource) {
		super();
		
		this.diagramNetSystem = diagramNetSystem;
		this.symbolNodeSource = nodeSource;
		this.newSymbolArcSN = newSymbolArcSN;
		
		this.hlpn = diagramNetSystem.getModel();
	}

	@Override
	public boolean canExecute() {
		boolean res = (diagramNetSystem != null)
				&& (newSymbolArcSN != null)
				&& (symbolNodeSource != null)
				&& (symbolNodeTarget != null);
		return res;
	}

}
