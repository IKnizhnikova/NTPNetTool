package npnets.simulator.factory;

import org.eclipse.gef.requests.CreationFactory;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
 
public class PlaceFactory implements CreationFactory {
 
  @Override public Object getNewObject() {
	Object newObject = NPNDiagramsFactory.eINSTANCE.createNPNSymbolPlaceSN();
	((NPNSymbolPlaceSN)newObject).setModel(HLPNFactory.eINSTANCE.createPlace());
    return newObject;
  }
 
  @Override public Object getObjectType() {
    return NPNSymbolPlaceSN.class;
  }
 
}
