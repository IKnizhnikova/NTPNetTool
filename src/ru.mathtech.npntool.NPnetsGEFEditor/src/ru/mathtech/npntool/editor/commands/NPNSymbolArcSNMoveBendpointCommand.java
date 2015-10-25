package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

public class NPNSymbolArcSNMoveBendpointCommand extends Command {
	private Point oldLocation;
	private Point newLocation;
	private int index;
	private NPNSymbolArcSN arc;
	
	public NPNSymbolArcSNMoveBendpointCommand(
			NPNSymbolArcSN arc, int index, Point newLocation) {
		this.arc = arc;
		this.index = index;
		this.oldLocation = arc.getBendpoints().get(index);
		this.newLocation = newLocation;
	}

	@Override
	public boolean canExecute() {
		return (arc != null) && (arc.getBendpoints().size()>index);
	}

	@Override
	public void execute() {
		arc.getBendpoints().set(index, newLocation);
	}

	@Override
	public void undo() {
		arc.getBendpoints().set(index, oldLocation);
	}

}
