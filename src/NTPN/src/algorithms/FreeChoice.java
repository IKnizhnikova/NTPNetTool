package algorithms;

import java.util.ArrayList;
import java.util.List;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.*;

/**
 * Class contains methods for free-choice analysis
 */
public class FreeChoice {

	/**
	 * Returns transitions which make given net not free-choice
	 */
	public static List<Transition> notFreeChoiceT(HighLevelPetriNet net) {
		List<Transition> result = new ArrayList<>();
		
		List<Arc> arcs = net.getArcs();
		
		for (Arc arc : arcs) {
			if (arc instanceof ArcPT) {
				Place place = ((ArcPT) arc).getSource();
				Transition transition = ((ArcPT) arc).getTarget();
				
				if (place.getOutArcs().size() > 1 && transition.getInArcs().size() > 1 &&
						!result.contains(transition)) {
					
					result.add(transition);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Returns pairs of transitions which make given net not extended free-choice
	 */
	public static List<Pair<Transition>> notExtFreeChoiceT(HighLevelPetriNet net) {
		List<Pair<Transition>> result = new ArrayList<>();
		
		List<Node> nodes = net.getNodes();
		
		for (Node node1 : nodes) {
			for (Node node2 : nodes) {
				if (!(node1 instanceof Transition) ||
						!(node2 instanceof Transition) ||
						node1 == node2) {
					continue;
				}
				
				Transition t = (Transition)node1;
				Transition u = (Transition)node2;
				
				List<Place> preT = new ArrayList<>();
				List<Place> preU = new ArrayList<>();
				
				for (ArcPT arcPT : t.getInArcs()) {
					preT.add(arcPT.getSource());
				}
				
				for (ArcPT arcPT : u.getInArcs()) {
					preU.add(arcPT.getSource());
				}
				
				if (preT.containsAll(preU) &&
						preU.containsAll(preT)) {
					continue;
				}
				
				for (Place p : preT) {
					if (preU.contains(p)) {
					    Pair<Transition> pair = new Pair<>(t, u);
						
					    if (!result.contains(pair)) {
					        result.add(pair);
					    }
					    
						break;	
					}
				}
			}
		}
		
		return result;
	}
		
}
