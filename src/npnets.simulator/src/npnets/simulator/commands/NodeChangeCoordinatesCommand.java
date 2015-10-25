package npnets.simulator.commands;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class NodeChangeCoordinatesCommand extends Command {
 
  private Point oldCoordinates;
  private Point newCoordinates;
  private NPNSymbolNodeSN model;
   
  @Override public void execute() {
    if(oldCoordinates == null) {
      oldCoordinates = model.getConstraints().getLocation();
    }
    //model.getConstraints().setLocation(newCoordinates);
    model.setConstraints(new Rectangle(newCoordinates, model.getConstraints().getSize()));
  }
 
  @Override public void undo() {
    //model.getConstraints().setLocation(oldCoordinates);
    model.setConstraints(new Rectangle(oldCoordinates, model.getConstraints().getSize()));
  }
 
  public void setModel(NPNSymbolNodeSN model) {
    this.model = model;
  }
   
  public void setNewCoordinates(Point newCoordinates) {
    this.newCoordinates = newCoordinates;
  }
}