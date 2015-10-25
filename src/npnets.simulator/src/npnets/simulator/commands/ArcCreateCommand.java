package npnets.simulator.commands;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
 
public class ArcCreateCommand extends Command {
   
  protected NPNSymbolNodeSN target;
  protected NPNSymbolNodeSN source;
  protected NPNSymbolArcSN arc;
  protected NPNDiagramNetSystem net;
 
  @Override
  public boolean canExecute() {
    return source != null && target != null && arc != null;
  }
   
  public void setArc(NPNSymbolArcSN arc) {
    this.arc = arc;
  }
   
  public void setNet(NPNDiagramNetSystem net) {
    this.net = net;
  }
  
  public NPNSymbolNodeSN getSource() {
	  return this.source;
  }
  
  public NPNSymbolNodeSN getTarget() {
	  return this.target;
  }
}
