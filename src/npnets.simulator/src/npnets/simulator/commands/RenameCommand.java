package npnets.simulator.commands;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class RenameCommand extends Command {
	
	private String nameOld,nameNew;
	private NPNSymbolNodeSN model;

	@Override
	public void execute() {
		nameOld = model.getModel().getName();
		model.getModel().setName(nameNew);
	}

	@Override
	public void redo() {
		model.getModel().setName(nameNew);
	}

	@Override
	public void undo() {
		model.getModel().setName(nameOld);
	}
	
	public void setNameNew(String nameNew) {
		this.nameNew = nameNew;
	}
	
	public void setModel(NPNSymbolNodeSN model) {
		this.model = model;
	}

}

