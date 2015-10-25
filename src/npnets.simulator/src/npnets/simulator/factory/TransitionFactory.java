package npnets.simulator.factory;

import org.eclipse.gef.requests.CreationFactory;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
 
public class TransitionFactory implements CreationFactory {
 
  @Override public Object getNewObject() {
	Object newObject = NPNDiagramsFactory.eINSTANCE.createNPNSymbolTransitionSN();
	((NPNSymbolTransitionSN)newObject).setModel(HLPNFactory.eINSTANCE.createTransition());
    return newObject;  }
 
  @Override public Object getObjectType() {
    return NPNSymbolTransitionSN.class;
  }
}