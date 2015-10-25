package npnets.simulator.factory;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
 
public class ArcTPFactory extends ArcFactory {
 
  @Override public Object getNewObject() {
	Object newObject = NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcTPSN();
	((NPNSymbolArcTPSN)newObject).setModel(HLPNFactory.eINSTANCE.createArcTP());
    return newObject;
  }
 
  @Override public Object getObjectType() {
    return NPNSymbolArcTPSN.class;
  }
 
}