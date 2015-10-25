package npnets.simulator.factory;


import org.eclipse.gef.requests.CreationFactory;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
 
public class NetFactory implements CreationFactory {
 
  @Override public Object getNewObject() {
    return NPNDiagramsFactory.eINSTANCE.createNPNDiagramNetSystem();
  }
 
  @Override public Object getObjectType() {
    return NPNDiagramNetSystem.class;
  }
 
}