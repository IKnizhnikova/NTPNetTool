package npnets.simulator.commands;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
 
public class NodeCreateCommand extends Command {
 
  private static final Dimension defaultDimension = new Dimension(50, 50);
  private NPNSymbolNodeSN newNode;
  private Point coordinates;
  private NPNDiagramNetSystem net;
 
  @Override public void execute() {
    if(coordinates != null) 
      newNode.setConstraints(new Rectangle(coordinates, defaultDimension));
    newNode.setDiagram(net);
    net.getModel().getNodes().add(newNode.getModel());
    newNode.getModel().setNet(net.getModel());
    net.getNodes().add(newNode);
  }
 
  @Override public void undo() {
	  newNode.setDiagram(null);
  }
 
  public void setLocation(Point location) {
	coordinates = location;
  }
 
  public void setParent(NPNDiagramNetSystem net) {
	    this.net = net;
	}
  
  public void setNode(NPNSymbolNodeSN newNode) {
	    this.newNode = newNode;
	}
}
