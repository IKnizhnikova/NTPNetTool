package ru.mathtech.npntool.editor.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolNodeSNDeleteCommand extends Command {
	
	NPNDiagramNetSystem diagram;
	NPNSymbolNodeSN symbNode;

	Node node;
	HighLevelPetriNet hlpn;

	List<NPNSymbolArcPTSNDeleteCommand> arcPTSNDeleteCommands;
	List<NPNSymbolArcTPSNDeleteCommand> arcTPSNDeleteCommands;
	
	public NPNSymbolNodeSNDeleteCommand(NPNSymbolNodeSN symbNode) {
		this.symbNode = symbNode;
		diagram = symbNode.getDiagram();
		
		node = symbNode.getModel();
		hlpn = node.getNet();
		
		arcTPSNDeleteCommands = new ArrayList<>();
		arcPTSNDeleteCommands = new ArrayList<>();
		
		if (symbNode instanceof NPNSymbolPlaceSN) {
			NPNSymbolPlaceSN symbPlace = (NPNSymbolPlaceSN) symbNode;
			for (NPNSymbolArcTPSN symbArcTP : symbPlace.getInArcs()) {
				NPNSymbolArcTPSNDeleteCommand command =
						new NPNSymbolArcTPSNDeleteCommand(symbArcTP);
				arcTPSNDeleteCommands.add(command);
			}
			for (NPNSymbolArcPTSN symbArcPT : symbPlace.getOutArcs()) {
				NPNSymbolArcPTSNDeleteCommand command =
						new NPNSymbolArcPTSNDeleteCommand(symbArcPT);
				arcPTSNDeleteCommands.add(command);
			}
		} else if (symbNode instanceof NPNSymbolTransitionSN) {
			NPNSymbolTransitionSN symbTransition = (NPNSymbolTransitionSN) symbNode;
			
			for (NPNSymbolArcPTSN symbArcPT : symbTransition.getInArcs()) {
				NPNSymbolArcPTSNDeleteCommand command =
						new NPNSymbolArcPTSNDeleteCommand(symbArcPT);
				arcPTSNDeleteCommands.add(command);
			}
			for (NPNSymbolArcTPSN symbArcTP : symbTransition.getOutArcs()) {
				NPNSymbolArcTPSNDeleteCommand command =
						new NPNSymbolArcTPSNDeleteCommand(symbArcTP);
				arcTPSNDeleteCommands.add(command);
			}
		}
	}
	
	
	@Override
	public boolean canExecute() {
		return symbNode != null;
	}

	@Override
	public void execute() {
		// The order of deleting is important!
		for (NPNSymbolArcPTSNDeleteCommand command : arcPTSNDeleteCommands) {
			command.execute();
		}
		for (NPNSymbolArcTPSNDeleteCommand command : arcTPSNDeleteCommands) {
			command.execute();
		}

		symbNode.setDiagram(null);
		node.setNet(null);
	}

	@Override
	public void undo() {
		// The order of undeleting is important!
		node.setNet(hlpn);
		symbNode.setDiagram(diagram);

		for (NPNSymbolArcPTSNDeleteCommand command : arcPTSNDeleteCommands) {
			command.undo();
		}
		for (NPNSymbolArcTPSNDeleteCommand command : arcTPSNDeleteCommands) {
			command.undo();
		}
	}
	
}
