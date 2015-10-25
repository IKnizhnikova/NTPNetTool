package npnets.simulator.factory;


import org.eclipse.gef.requests.CreationFactory;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;
 
public class ArcFactory implements CreationFactory {
 
	NPNSymbolNodeSN nodeSource = null;
	
	@Override
	public Object getNewObject() {
		NPNSymbolArcSN res = null;
		if (nodeSource instanceof NPNSymbolPlaceSN) {
			res = NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcPTSN();
		} else if (nodeSource instanceof NPNSymbolTransitionSN) {
			res = NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcTPSN();
		}
		return res;
	}

	public void setSource(NPNSymbolNodeSN nodeSource) {
		this.nodeSource = nodeSource;
	}
	
	@Override
	public Object getObjectType() {
		if (nodeSource instanceof NPNSymbolPlaceSN) {
			return NPNSymbolArcPTSN.class; 
		} else if (nodeSource instanceof NPNSymbolTransitionSN) {
			return NPNSymbolArcTPSN.class;
		}
		return null;
	}
 
}
