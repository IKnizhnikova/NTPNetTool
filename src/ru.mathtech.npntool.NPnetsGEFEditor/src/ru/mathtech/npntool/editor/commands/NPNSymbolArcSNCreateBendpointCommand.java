package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

public class NPNSymbolArcSNCreateBendpointCommand extends Command {
	
	private int index;
	private Point location;
	private NPNSymbolArcSN symbolArcSN;

	public NPNSymbolArcSNCreateBendpointCommand(
			NPNSymbolArcSN symbolArcSN, int index, Point location) {
		this.index = index;
		this.location = location;
		this.symbolArcSN = symbolArcSN;
	}

	@Override
	public void execute() {
		symbolArcSN.getBendpoints().add(index,location);
	}

	@Override
	public void undo() {
		symbolArcSN.getBendpoints().remove(index);
	}

}
