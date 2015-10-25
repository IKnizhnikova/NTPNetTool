package npnets.simulator.commands;

import org.eclipse.gef.commands.Command;


//import npn.model.highlevelnet.Node;
//import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class NodeRenameCommand extends Command {
 
private String oldName, newName;
private NPNSymbolNodeSN model;

@Override public void execute() {
  oldName = model.getModel().getName();
  model.getModel().setName(newName);
}

@Override public void undo() {
  model.getModel().setName(oldName);
}
 
public void setNewName(String newName) {
  this.newName = newName;
}
 
public void setModel(NPNSymbolNodeSN model) {
  this.model = model;
}
}
