package npnets.simulator.factory;

import ru.mathtech.npntool.npnets.npndiagrams.*;
import npnets.simulator.parts.ArcEditPart;
import npnets.simulator.parts.NetEditPart;
import npnets.simulator.parts.PlaceEditPart;
import npnets.simulator.parts.TokenEditPart;
import npnets.simulator.parts.TransitionEditPart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
 
public class NPNEditPartFactory implements EditPartFactory {
  @Override
  public EditPart createEditPart(EditPart context, Object model) {
    EditPart part = null;
    
    /*if(model instanceof Project) {
    	// TODO: another way
    	List<Net> nets = ((Project) model).getNets();
    	if (nets.isEmpty()) nets.add((Net) new NetFactory.getNewObject() );
    	model = nets.get(0);
        part = new NetEditPart();
        
    } else*/ if(model instanceof NPNDiagramNetSystem) {
        part = new NetEditPart();
    } else if(model instanceof NPNSymbolTransitionSN) {
        part = new TransitionEditPart();
    } else if(model instanceof NPNSymbolPlaceSN) {
        part = new PlaceEditPart();
    } else if(model instanceof NPNSymbolArcSN) {
        part = new ArcEditPart();
    } else if(model instanceof NPNSymbolTokenSN){
    	part=new TokenEditPart();
    }
    if(part != null) {
      part.setModel(model);
    }
     
    return part;
  }
}
