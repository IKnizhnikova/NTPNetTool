package npnets.simulator.commands;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class ArcTPDeleteCommand extends ArcDeleteCommand {

	private NPNSymbolArcTPSN arc;
	private ArcTP arcModel;
	private NPNDiagramNetSystem net;
	private HighLevelPetriNet netModel;
	private NPNSymbolTransitionSN source;
	private Transition sourceModel;
	private NPNSymbolPlaceSN target;
	private Place targetModel;
    
	@Override
	public void execute() {
		arc = (NPNSymbolArcTPSN) getArc();
		arcModel = (ArcTP) arc.getModel();
		net = arc.getDiagram();
		netModel = arcModel.getNet();
        source = arc.getSource();
        sourceModel = arcModel.getSource();
        target = arc.getTarget();
        targetModel = arcModel.getTarget();
        
        sourceModel.getOutArcs().remove(arcModel);
        source.getOutArcs().remove(arc);
        targetModel.getInArcs().remove(arcModel);
        target.getInArcs().remove(arc);
        
		arc.setSource(null);
		arcModel.setSource(null);
	    arc.setTarget(null);
	    arcModel.setTarget(null);
	    arc.setDiagram(null);
	    arcModel.setNet(null);
	    net.getArcs().remove(arc);
	    netModel.getArcs().remove(arc);
	}
	@Override
	public void undo() {
		arc.setSource(source);
		arcModel.setSource(sourceModel);
		source.getOutArcs().add(arc);
		sourceModel.getOutArcs().add(arcModel);
		arc.setTarget(target);
		arcModel.setTarget(targetModel);
		target.getInArcs().add(arc);
		targetModel.getInArcs().add(arcModel);
		arc.setDiagram(net);
		arcModel.setNet(netModel);
		net.getArcs().add(arc);
		netModel.getArcs().add(arcModel);
	}
}

