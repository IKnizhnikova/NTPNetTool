package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import algorithms.TPNet.State;
import algorithms.TPNet.Transition;

public class Graph {

    Map<State, Vertice> vertices = new HashMap<State, Vertice>();
    List<Edge> edges = new ArrayList<Edge>();

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
        //Vertice[] vertices=new Vertice[2];

        State st1;
        State st2;
        Transition t;
        double time;

        public Edge(State s1, State s2, Transition trans, double tim) {
            st1 = s1;
            st2 = s2;
            t = trans;
            time = tim;
        }
        
        public State from(){
        	return st1;
        }
        
        public State to(){
        	return st2;
        }
        
        public Transition getTrans(){
        	return t;
        }
        
        public double getTime(){
        	return time;
        }
        
       
    }

    public void AddVertice(State st) {
        vertices.put(st, new Vertice(st));
    }

    public void AddEdge(State s1, State s2, Transition trans, double time) {
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