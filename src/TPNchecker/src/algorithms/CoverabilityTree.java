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
 * Objects of this class are coverability trees of Petri nets 
 */
public class CoverabilityTree {
	
	// all vertices in the tree
	List<Vertex> vertices = new ArrayList<>(); 
	
    // leaves in the tree
    private List<Vertex> leaves = new ArrayList<>();
	
    // high level petri net
    private HighLevelPetriNet net;
    
	// represents omega
	public static final int OMEGA = -1;
	
    public CoverabilityTree(NPnetMarked npnet, HighLevelPetriNet n, Marking initial) {
		
    	net = n;
    	
		// assert that initial marking belongs to net
		assert initial.getMap().get(0).getPlace().getNet().equals(net);
		
		// create root vertex
		Vertex root = new Vertex(makeMarking(initial), null, null);
		
		// list of "new" vertices
		List<Vertex> newVertices = new ArrayList<>();
		
		vertices.add(root);
		newVertices.add(root);
		leaves.add(root);
		
		// get list of transitions
		List<Transition> transitions = new ArrayList<>(); 
		for (Node node : net.getNodes()) {
			if (node instanceof Transition) {
				transitions.add((Transition)node);
			}
		}
		
		// while new vertices exists do
		while (!newVertices.isEmpty()) {
			// select new marking
			Vertex v = newVertices.get(0);
			newVertices.remove(0);
			
			if (isOnThePathEquals(v)) {
				vertices.remove(v);
				leaves.remove(v);
				continue;
			}
			
			int[] M = v.getMarking();
			
			boolean isLeaf = true;
			
			// for each enabled transition
			for (int i = 0; i < transitions.size(); i++) {
			    Transition t = transitions.get(i);
				
			    if (isEnabled(t, M)) {
			    	// obtain the marking that results from firing
			    	int[] M1 = fire(t, M);
			    	
			    	Vertex v1 = new Vertex(M1, v, t);
			    	Vertex v2 = vertexOnThePathLess(v1);
			    	
			    	if (v2 != null) {
			    		addOmegas(v1.getMarking(), v2.getMarking());
			    	}
			    	
			    	vertices.add(v1);
			    	newVertices.add(v1);
			    	leaves.add(v1);
			    	
			    	isLeaf = false;
			    }
			}
			
			if (!isLeaf) {
				leaves.remove(v);
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
     * Compares two markings. If M1>M2 returns 1, if M1=M2 returns 0, else returns -1
     */
    private int compareMarkings(int[] M1, int[] M2) {
        
    	assert M1.length == M2.length;
    	
    	if (Arrays.equals(M1, M2)) {
    		return 0;
    	}
    	
    	// check for every place
    	for (int i = 0; i < M1.length; i++) {
    	    if (M1[i] == OMEGA) {
    	    	continue;
    	    }
    		
    		if (M2[i] == OMEGA || M1[i] < M2[i]) {
    	    	return -1;
    	    }
    	}
    	
    	return 1;
    }
    
    
    /**
     * Checks whether vertex with given marking had already been on the path from root
     */
    private boolean isOnThePathEquals(Vertex v) {
    	Vertex current = v;
    	
    	while (current.getPrevious() != null) {	
    		current = current.getPrevious();
    		
    		if (compareMarkings(current.getMarking(), v.getMarking()) == 0) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    
    /**
     * Returns vertex if there exists a marking on the path from root such that less than given
     * if not, returns null
     */
    private Vertex vertexOnThePathLess(Vertex v) {
    	Vertex current = v;
    	
    	while (current.getPrevious() != null) {	
    		current = current.getPrevious();
    		
    		int c = compareMarkings(v.getMarking(), current.getMarking()); 
    		
    		if (c == 1) {
    			return current;
    		}
    	}
    	
    	return null; 		
    }
    
    
    /**
     * Replace place markings with omegas where M1(p) > M2(p)
     */
    private void addOmegas(int[] M1, int[] M2) {
    	
    	assert M1.length == M2.length;
    	
    	// for every place do
    	for (int i = 0; i < M1.length; i++) {
    		if (M1[i] > M2[i]) {
    			M1[i] = OMEGA;
    		}
    	}
    	
    }
    
    /**
	 * Getter of net
	 */
	public HighLevelPetriNet getNet() {
		return net;
	}
	
	
	/**
	 * Getter of leaves
	 */
	public List<Vertex> getLeaves() {
		return leaves;
	}
}
