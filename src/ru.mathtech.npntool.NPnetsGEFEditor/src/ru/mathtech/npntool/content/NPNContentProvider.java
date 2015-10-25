package ru.mathtech.npntool.content;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;

public class NPNContentProvider {
	public static void fillModel(NPnetMarked npnetMarked) {
		NPNetsFactory npNetsFactory = NPNetsPackage.eINSTANCE.getNPNetsFactory();
		NPnet npnet = npNetsFactory.createNPnet();
		npnetMarked.setNet(npnet);
		npnet.setName("Untitled NPN");
		//npnet.setId(UUID.randomUUID().toString());
		
		HLPNFactory hlpnFactory = HLPNPackage.eINSTANCE.getHLPNFactory();
		HighLevelPetriNet hlpn = hlpnFactory.createHighLevelPetriNet();
		npnet.setNetSystem(hlpn);
		//hlpn.setId(UUID.randomUUID().toString());
		hlpn.setName("Untitled SN");
		
		NPNDiagramsFactory factoryNPNDiagrams =
				NPNDiagramsPackage.eINSTANCE.getNPNDiagramsFactory();
		NPNDiagramNetSystem npnDiagramSN =
				factoryNPNDiagrams.createNPNDiagramNetSystem();
		npnetMarked.setDiagramNetSystem(npnDiagramSN);
		npnDiagramSN.setModel(hlpn);
	}
}
