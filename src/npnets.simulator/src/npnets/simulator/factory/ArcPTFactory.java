package npnets.simulator.factory;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
 
public class ArcPTFactory extends ArcFactory {
 
  @Override public Object getNewObject() {
	Object newObject = NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcPTSN();
	((NPNSymbolArcPTSN)newObject).setModel(HLPNFactory.eINSTANCE.createArcPT());
    return newObject;
  }
 
  @Override public Object getObjectType() {
    return NPNSymbolArcPTSN.class;
  }
}
