package algorithms;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

/**
 * Contains marking, firing transition, and previous vertex in the tree
 */
public class Vertex {
	private int[] marking;
	private Vertex previous;
	private Transition transition;
		
	public Vertex(int[] m, Vertex p, Transition t) {
		marking = m;
		previous = p;
		transition = t;
	}
		
	public int[] getMarking() {
		return marking;
	}
		
	public Vertex getPrevious() {
		return previous;
	}
		
	public Transition getTransition() {
		return transition;
	}
}