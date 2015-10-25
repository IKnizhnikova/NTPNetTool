package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

public class NPNSymbolArcSNDeleteBendpointCommand extends Command {
	
	private NPNSymbolArcSN arc;
	private int index;
	private Point location;
	
	public NPNSymbolArcSNDeleteBendpointCommand(
			NPNSymbolArcSN arc, int index) {
		this.arc = arc;
		this.index = index;
		this.location = arc.getBendpoints().get(index);
	}
	
	@Override
	public boolean canExecute() {
		return (arc != null) && (arc.getBendpoints().size()>index);
	}
	
	@Override
	public void execute() {
		arc.getBendpoints().remove(index);
	}
	
	@Override
	public void undo() {
		arc.getBendpoints().add(index, location);
	}

}
