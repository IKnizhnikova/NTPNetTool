package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight;

/**
 * Objects of this class are reachability graphs of Petri nets 
 */
public class ReachabilityGraph {

    /**
     * Arc-transition between two markings
     */
	public class Arc {
    	private Transition transition;
    	private int[] fromMarking;
    	private int[] toMarking;
    	
    	public Transition getTransition() {
    		return transition;
    	}
    	
    	public int[] getFromMarking() {
    		return fromMarking;
    	}
    	
    	public int[] getToMarking() {
    		return toMarking;
    	} 
    	
    	public Arc(Transition t, int[] from, int[] to) {
    		transition = t;
    		fromMarking = from;
    		toMarking = to;
    	}
    }
	
	// all markings in the graph
	List<int[]> markings = new ArrayList<>(); 
	
    // all arcs in the graph
    private List<Arc> arcs = new ArrayList<>();
    
    // vertices which may result in new markings
    private List<int[]> newMarkings = new ArrayList<>();
	
    // high level petri net
    private HighLevelPetriNet net;
    
	// represents omega
	public static final int OMEGA = -1;
	
    public ReachabilityGraph(NPnetMarked npnet, HighLevelPetriNet n, Marking initial) {
		
    	net = n;
    	int counter = 0;
    	
		// assert that initial marking belongs to net
		assert initial.getMap().get(0).getPlace().getNet().equals(net);
		
		// create root marking
		int[] root = makeMarking(initial);
		markings.add(root);
		newMarkings.add(root);
		
		// get list of transitions
		List<Transition> transitions = new ArrayList<>(); 
		for (Node node : net.getNodes()) {
			if (node instanceof Transition) {
				transitions.add((Transition)node);
			}
		}
		
		// while new vertices exists do
		while (!newMarkings.isEmpty()) {
			// select new marking
			int[] M = newMarkings.get(0);
			newMarkings.remove(0);
			
			// for each enabled transition
			for (int i = 0; i < transitions.size(); i++) {
			    Transition t = transitions.get(i);
				
			    if (isEnabled(t, M)) {
			    	// obtain the marking that results from firing
			    	int[] M1 = fire(t, M);
			    	
			    	boolean contains = false;
			    	for (int[] m : markings) {
			    		if (Arrays.equals(m, M1)) {
			    			contains = true;
			    			break;
			    		}
			    	}
			    	if (!contains) {
			    		markings.add(M1);
			    		newMarkings.add(M1);
			    	}
			    	
			    	Arc arc = new Arc(t, M, M1);
			    	arcs.add(arc);
			    	
			    	counter++;
			    	
			    	if (counter > 100) {
			    		System.out.println("The reachability graph has too many markings.");
			    		return;
			    	}
			    }
			}
		}
	}
	
	 
    /**
     * Checks whether given transition is enabled on given marking
     */
    private boolean isEnabled(Transition t, int[] M) {
        
    	// get all places
    	List<Place> places = new ArrayList<>();
    	for (Node node : net.getNodes()) {
    		if (node instanceof Place) {
    			places.add((Place)node);
    		}
    	}
    	
    	assert M.length == places.size();
    	
    	// get input places and corresponding arcs
    	List<Place> inputPlaces = new ArrayList<>();
    	List<ArcPT> inputArcs = t.getInArcs();
        for (ArcPT arc : inputArcs) {
        	inputPlaces.add(arc.getSource());
        }
    	
        // check for each input place
        for (int j = 0; j < inputPlaces.size(); j++) {
        	
        	int i = places.indexOf(inputPlaces.get(j));
        	
        	if (M[i] == OMEGA) {
        		continue;
        	}
        	
        	ArcPT arc = inputArcs.get(j);
        	
        	TokenVariadicExpression expr = arc.getInscription();
        		
        	// count input condition
        	int sum = 0;
        	for (Monom monom : expr.getMonoms()) {
        		sum += monom.getPower().intValue();
        	}
        	
        	if (M[i] < sum) {
        		return false;
        	}
        }
        
        // all input conditions are met
        return true;
    }
    
    
    /**
     * Returns marking that results from firing transition
     */
    private int[] fire(Transition t, int[] M) {
        
    	int[] result = M.clone();
    	
    	// get all places
    	List<Place> places = new ArrayList<>();
    	for (Node node : net.getNodes()) {
    		if (node instanceof Place) {
    			places.add((Place)node);
    		}
    	}
    	
    	assert M.length == places.size();
    	
    	// get input places and corresponding arcs
    	List<Place> inputPlaces = new ArrayList<>();
    	List<ArcPT> inputArcs = t.getInArcs();
        for (ArcPT arc : inputArcs) {
        	inputPlaces.add(arc.getSource());
        }
    	
     // get output places and corresponding arcs
    	List<Place> outputPlaces = new ArrayList<>();
    	List<ArcTP> outputArcs = t.getOutArcs();
        for (ArcTP arc : outputArcs) {
        	outputPlaces.add(arc.getTarget());
        }
        
        // subtract for each input place
        for (int j = 0; j < inputPlaces.size(); j++) {
        	
        	int i = places.indexOf(inputPlaces.get(j));
        	
        	if (result[i] == OMEGA) {
        		continue;
        	}
        	
        	ArcPT arc = inputArcs.get(j);
        	
        	TokenVariadicExpression expr = arc.getInscription();
        		
        	// count input condition
        	int sum = 0;
        	for (Monom monom : expr.getMonoms()) {
        		sum += monom.getPower().intValue();
        	}
        	
        	result[i] -= sum;
        }
        
        // add for each output place
        for (int j = 0; j < outputPlaces.size(); j++) {
        	
        	int i = places.indexOf(outputPlaces.get(j));
        	
        	if (result[i] == OMEGA) {
        		continue;
        	}
        	
        	ArcTP arc = outputArcs.get(j);
        	
        	TokenVariadicExpression expr = arc.getInscription();
        		
        	// count output condition
        	int sum = 0;
        	for (Monom monom : expr.getMonoms()) {
        		sum += monom.getPower().intValue();
        	}
        	
        	result[i] += sum;
        }
        
        return result;
    }
    
    
	/**
	 * Converts marking to integer array representation
	 */
	private int[] makeMarking(Marking m) {
		List<PlaceMarking> placeMarkings = m.getMap();
		
		int[] result = new int[placeMarkings.size()];
		
		for (int i = 0; i < result.length; i++) {
			int sum = 0;
			for (TokenWeight tokenWeight : placeMarkings.get(i).getMarking().getWeight()) {
				sum += tokenWeight.getWeight().intValue();
			}
			result[i] = sum;
		}
		
		return result;
	}
	
	
	/**
	 * Getter of arcs
	 */
	public List<Arc> getArcs() {
		return arcs;
	}
	
	
	/**
	 * Getter of net
	 */
	public HighLevelPetriNet getNet() {
		return net;
	}
	
}
