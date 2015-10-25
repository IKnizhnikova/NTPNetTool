package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class NPNSymbolNodeSNChangeConstraintCommand extends Command {
	
	private Rectangle oldConstraint;
	private Rectangle newConstraint;

	private NPNSymbolNodeSN symbolNode;
	
	
	
	public NPNSymbolNodeSNChangeConstraintCommand(NPNSymbolNodeSN symbolNode) {
		this.symbolNode = symbolNode;
	}

	@Override
	public void execute() {
		if (oldConstraint == null) {
			oldConstraint = symbolNode.getConstraints();
		}
		symbolNode.setConstraints(newConstraint);
	}

	@Override
	public void undo() {
		symbolNode.setConstraints(oldConstraint);
	}
	
	public void setNewConstraint(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}
	
}
