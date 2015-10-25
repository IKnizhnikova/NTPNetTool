package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.parts.ElNet.State;
import model.parts.Transition;

public class Graph {

    private Map<State, Vertice> vertices = new HashMap<State, Vertice>();
    List<Edge> edges = new ArrayList<Edge>();
    State initialState;

    class Vertice {

        List<Edge> edges = new ArrayList<Edge>();
        State st;//что содержит

        public Vertice(State s) {
        	//TODO CHECK rg
            //st = s.clone();
        	st = s; 
        }
        public Vertice(State s, boolean t) {
            st = s;
        }
        
        public void addEdge(Edge e){
        	edges.add(e);
        }
        
    }

    public class Edge {
        //Vertice[] kvertices=new Vertice[2];

        private State st1;
        private State st2;
        private Transition t;
//        double time;
        int time;
        
        public Edge(State s1, State s2, Transition trans, int tim) {
            setSt1(s1);
            setSt2(s2);
            setT(trans);
            time = tim;
        }
        
        
        
        public State from(){
        	return getSt1();
        }
        
        public State to(){
        	return getSt2();
        }
        
        public Transition getTrans(){
        	return getT();
        }
        
        public int getTime(){
        	return time;
        }

		public State getSt1() {
			return st1;
		}

		public void setSt1(State st1) {
			this.st1 = st1;
		}

		public State getSt2() {
			return st2;
		}
		
		

		public void setSt2(State st2) {
			this.st2 = st2;
		}

		public Transition getT() {
			return t;
		}

		public void setT(Transition t) {
			this.t = t;
		}
        
       
    }

    public void AddVertice(State st) {
    	if(vertices.size()==0){//firsy vertice becomes initial
    		initialState=st;
    	}
        vertices.put(st, new Vertice(st));
    }

    public void AddEdge(State s1, State s2, Transition trans, int time) {
        //Edge e = new Edge(s1, s2, trans, time);
    	//TODO CHECK rg
//        edges.add(new Edge(s1.clone(), s2.clone(), trans, time));
    	edges.add(new Edge(s1, s2, trans, time));
    }
    
    public List<Edge> getEdges(){
    	return edges;
    }
    
    public Map<State,Vertice> getVertices(){
    	return vertices;
    }
    
    
}// class Graph definition ends here