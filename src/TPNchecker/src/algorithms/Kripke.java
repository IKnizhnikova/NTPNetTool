package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import algorithms.Graph;
import algorithms.Graph.Edge;
import algorithms.Graph.Vertice;
import algorithms.TPNet.State;
import algorithms.CTLformula.AtomicPredicate;
import algorithms.CTLformula.CTLFormula;

public class Kripke extends Graph{
	Map<State, Vertice> vertices = new HashMap<State, Vertice>();
    List<Edge> edges = new ArrayList<Edge>();
    

public Kripke(Graph g){
	
	for(State s: g.vertices.keySet()){
		//vertices.put(g.vertices.get(s).st, new Vertice(g.vertices.get(s).st));
			vertices.put(s, new Vertice(s));
			
	}	


	edges.addAll(g.edges);
	for(State s:vertices.keySet()){
		
	for(Edge e:g.edges){
		if(e.st1.equals(s)){
			vertices.get(s).vert.addEdge(e);
		}
	}
	}
		//for(Edge e:g.edges){
			//vertices.put(g.vertices.get(s).st, new Vertice(g.vertices.get(s).st));
			
//			if(!vertices.keySet().contains(e.st1)){
//				vertices.put(e.st1, new Vertice(e.st1));
//			}
//			if(!vertices.keySet().contains(e.st2)){
//				vertices.put(e.st2, new Vertice(e.st2));
//			}
				
		//}
		
}
//  class Vertice extends Graph.Vertice{
//	  public Vertice(State s) {
//		super(s);
//		
//		
//	}
//	Set<String> predicates=new HashSet<String>();
//	public boolean containsP(String s){
//		if(predicates.contains(s)){
//			return true;
//		}
//		return false;
//	}
//	
//	public boolean setPredicate(String s){
//		if(predicates.contains(s)){
//			return true;//already has
//		}
//		predicates.add(s);
//		return false;//added
//	}
//	  
//  }


class Vertice{
	  public Vertice(State s) {
 		vert=new Graph.Vertice(s, true);
		
		
	}
	  Graph.Vertice vert;
	Set<String> predicates=new HashSet<String>();
	public boolean containsP(String s){
		if(predicates.contains(s)){
			return true;
		}
		return false;
	}
	
	public boolean setPredicate(String s){
		if(predicates.contains(s)){
			return true;//already has
		}
		predicates.add(s);
		return false;//added
	}
	
	public List<Edge> getEdges(){
		return vert.edges;
	}

}

private State findVSt(State t) throws Exception{
	  for(State s: vertices.keySet()){
		  if(s.equals(t)){
			  return s;
		  }
	  }
	  throw new Exception("no such state"); 
}

  public void satEX(CTLFormula f) throws Exception{
	  for(Edge e: edges){
		  //check for translation
//		  if(vertices.get(e.st2).containsP(f.getSymbolic())){
//			  vertices.get(e.st1).setPredicate("EX("+f.getSymbolic()+")");
//		  }
		  if(vertices.get(findVSt(e.st2)).containsP(f.getSymbolic())){
			  vertices.get(findVSt(e.st1)).setPredicate("EX("+f.getSymbolic()+")");
		  }
	  }
  }
  
  public void satAF(CTLFormula f) throws Exception{
	  int old=0;
	  for(State s: vertices.keySet()){
		  if(vertices.get(s).containsP(f.getSymbolic())){
			  vertices.get(s).setPredicate("AF("+f.getSymbolic()+")");
			  old++;
		  }
	  }
	  int newSt=old;
	  do{
		  old=newSt;//TODO check
		  for(State s: vertices.keySet()){
			  boolean fl=true;
			  //for(Edge e: vertices.get(s).edges){
			  for(Edge e: vertices.get(s).getEdges()){
				  Vertice v=vertices.get(findVSt(e.st2));
				  State s2=e.st2;
				  boolean b=vertices.get(findVSt(e.st2)).containsP("AF("+f.getSymbolic()+")");
				  if(!e.st2.equals(s)){
					  if(!vertices.get(findVSt(e.st2)).containsP("AF("+f.getSymbolic()+")")){
				  	  fl=false;
					  break;
 				  }
			  }

			  }
			  
			  if(fl&&!vertices.get(s).containsP("AF("+f.getSymbolic()+")")){
				  vertices.get(s).setPredicate("AF("+f.getSymbolic()+")");	
				  System.out.println(vertices.get(s).hashCode()+" set to AF "+f.getSymbolic());
				  newSt++;
			  }				  
		  }
	  }while(newSt>old);
  }
  
 
  
  public void satEU(CTLFormula f){
	  Set<State> w=new HashSet<State>();
	  int old=0;
	  for(State s: vertices.keySet()){
		  if(vertices.get(s).containsP(f.getSecond().getSymbolic())){
			  //TODO care about symbolics
			  vertices.get(s).setPredicate(f.getSymbolic());
			  old++;
		  }
//		  if(vertices.get(s).containsP(f.getFirst().getSymbolic())){
//			  //TODO care about symbolics
//			  w.add(s);
//		  }
	  }
	  int newSt=old;
	  do{
		  old=newSt;//TODO check
		  
			  for(Edge e: edges){
				  Vertice v1=vertices.get(e.st1);
				  Vertice v2=vertices.get(e.st2);
				  if(vertices.get(e.st1).containsP(f.getFirst().getSymbolic())&&
						 vertices.get(e.st2).containsP(f.getSymbolic())){
					 if(!vertices.get(e.st1).setPredicate(f.getSymbolic())){
						 newSt++;
					 }
				  }
				  
			  }		  		  
	  }while(newSt>old);
	  
	  
  }
  
  
  public void satOR(CTLFormula first, CTLFormula second){
	  for(State s: vertices.keySet()){
		  if(vertices.get(s).containsP(first.getSymbolic())||
				  vertices.get(s).containsP(second.getSymbolic())){
			  vertices.get(s).setPredicate("("+first.getSymbolic()+")|("+second.getSymbolic()+")");
		  }
	  }
  }
  
  public void satAND(CTLFormula first, CTLFormula second){
	  for(State s: vertices.keySet()){
		  if(vertices.get(s).containsP(first.getSymbolic())&&
				  vertices.get(s).containsP(second.getSymbolic())){
			  vertices.get(s).setPredicate("("+first.getSymbolic()+")&("+second.getSymbolic()+")");
		  }
	  }
  }

  public void satNOT(CTLFormula f){
	  //TODO check
	  for(State s: vertices.keySet()){
		  if(!vertices.get(s).containsP(f.getSymbolic())){
			  vertices.get(s).setPredicate("!("+f.getSymbolic()+")");
		  }
	  }
  }

  
  public void setAP(AtomicPredicate ap){
	  if(ap.getSymbolic().equals("1")){
		  for(State s: vertices.keySet()){
			 	  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
		  return;
	  }
	  for(State s: vertices.keySet()){
		  switch(ap.getOperator()){
		  case LEQ:{
			  if(s.pMark.get(ap.getPlaceNumber())>=ap.getNumber()){
				  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case LARGER:{
			  if(s.pMark.get(ap.getPlaceNumber())>ap.getNumber()){
				  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case EQUAL:{
			  if(s.pMark.get(ap.getPlaceNumber())==ap.getNumber()){
				  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case NEQ:{
			  if(s.pMark.get(ap.getPlaceNumber())!=ap.getNumber()){
				  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case SEQ:{//TODO WHY?!
			  if(s.pMark.get(ap.getPlaceNumber())<=ap.getNumber()){
				  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case SMALLER:{
			  if(s.pMark.get(ap.getPlaceNumber())<ap.getNumber()){
				  vertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  }//end switch
		}	//end for
  
  }//end metod
  
  
  
  
}
