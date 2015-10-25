package algorithms;

import java.util.ArrayList;
import java.util.List;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * Class contains method for finding P-Invariants using Farkas algorithm
 */
public class Farkas {

	private HighLevelPetriNet net;
	private int[][] C; // incidence matrix
	
	public Farkas(HighLevelPetriNet n) {
 		net = n;
		
		// get places and transitions
		List<Place> places = new ArrayList<>();
		List<Transition> transitions = new ArrayList<>();
		
		for (Node node : net.getNodes()) {
		    if (node instanceof Place) {
		    	places.add((Place)node);
		    } else {
		    	transitions.add((Transition)node);	
		    }
		}
		
		// get incidence matrix C
		C = new int[places.size()][transitions.size()];
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				Place p = places.get(i);
				Transition t = transitions.get(j);
				
				ArcPT arcPT = null;
				ArcTP arcTP = null;
				
				for (Arc a : net.getArcs()) {
					if (a instanceof ArcPT && ((ArcPT)a).getSource().equals(p) &&
							((ArcPT)a).getTarget().equals(t)) {
						arcPT = (ArcPT)a;
						continue;
					}
					
					if (a instanceof ArcTP && ((ArcTP)a).getSource().equals(t) &&
							((ArcTP)a).getTarget().equals(p)) {
						arcTP = (ArcTP)a;
					}
				}
				
				int tokens = 0;
				if (arcPT != null) {
				    tokens -= tokensOnArc(arcPT);
				}
				if (arcTP != null) {
					tokens += tokensOnArc(arcTP);
				}
				
				C[i][j] = tokens;
			}
		}
		
		
	}
	
	
	/**
	 * Calculates number of tokens on given arc
	 */
	private int tokensOnArc(Arc arc) {
		ArcPT arcPT = null;
		ArcTP arcTP = null;
		
		TokenVariadicExpression expr;
		
		if (arc instanceof ArcPT) {
			arcPT = (ArcPT)arc;
			expr = arcPT.getInscription();
		} else{
			arcTP = (ArcTP)arc;
			expr = arcTP.getInscription();
		}
		
		int sum = 0; 
		for (Monom monom : expr.getMonoms()) {
		    sum += monom.getPower().intValue();	 
		}
		
		return sum;
	}
	
	
	/**
	 * Returns array of all P-invariants
	 */
	public int[][] getPInvariants() {
		
		int n = C.length;
		int m = C[0].length;
		
		// get D
		int[][] D = new int[n][m+n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m+n; j++) {
				if (j < m) {
					D[i][j] = C[i][j];
				} else {
					D[i][j] = i == j-m ? 1 : 0;
				}
			}
		}
		
		
		// start algorithm
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < D.length-1; k++) {
				for (int l = k+1; l < D.length; l++) {
					int[] d1 = D[k];
					int[] d2 = D[l];
					
					// if have opposite signs
					if (d1[i] * d2[i] < 0) {
						int[] d = new int[m+n];
						
						for (int j = 0; j < m+n; j++) {
							d[j] = Math.abs(d2[i]) * d1[j] + Math.abs(d1[i]) * d2[j];
						}
						
						int[] dd = new int[m+n];
						
						int g = gcd(d); 
						for (int j = 0; j < m+n; j++) {
							dd[j] = d[j] / g;
						}
						
						int[][] temp = new int[D.length+1][m+n];
						for (int j = 0; j < D.length; j++) {
							temp[j] = D[j];
						}
						temp[D.length] = dd;
						
						D = temp;
					}
				}
			}
					
			int r = 0;
			for (int j = 0; j < D.length; j++){
				if (D[j][i] == 0){
					r++;
				}
			}
					
			int[][] temp = new int[r][m+n];
			
			int q = 0;
			for (int j = 0; j < D.length; j++){
				if (D[j][i] == 0){
					temp[q++] = D[j];
				}
			}
					
			D = temp;
		}
	
		int[][] temp = new int[D.length][n];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				temp[i][j] = D[i][j+m];
			}
		}
		
		D = temp;
		
		return D;
	}
	
	
	/**
	 * Calculates the greatest common denominator of integer array
	 */
	private int gcd(int[] ar) {
	    int result = gcd2(ar[0], ar[1]);
	    
	    for (int i = 2; i < ar.length; i++) {
	    	result = gcd2(result, ar[i]);
	    }
	    
	    return result;
	}
	
	
	/**
	 * Calculates the greatest common denominator of two numbers
	 */
	private int gcd2(int a, int b) {
	    a = Math.abs(a);
	    b = Math.abs(b);
		
		if (b == 0) {
	    	return a;
	    }
		
		return gcd2(b, a % b);
	}
}









