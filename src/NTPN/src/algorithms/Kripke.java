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
import model.parts.ElNet;
import model.parts.ElNet.State;
import model.parts.Place;
import model.parts.pMarking;
import algorithms.CTLformula.AtomicPredicate;
import algorithms.CTLformula.CTLFormula;

public class Kripke extends Graph{
	Map<State, Vertice> kvertices = new HashMap<State, Vertice>();
    //List<Edge> edges = new ArrayList<Edge>();
    

public Kripke(Graph g){
	
	for(State s: g.getVertices().keySet()){
		//kvertices.put(g.vertices.get(s).st, new Vertice(g.vertices.get(s).st));
			kvertices.put(s, new Vertice(s));
			
			
	}	
	initialState=g.initialState;


	edges.addAll(g.getEdges());
	for(State s:kvertices.keySet()){
		
	for(Edge e:g.getEdges()){
		if(e.getSt1().equals(s)){
			kvertices.get(s).vert.addEdge(e);
		}
	}
	}
		//for(Edge e:g.edges){
			//kvertices.put(g.vertices.get(s).st, new Vertice(g.vertices.get(s).st));
			
//			if(!kvertices.keySet().contains(e.st1)){
//				kvertices.put(e.st1, new Vertice(e.st1));
//			}
//			if(!kvertices.keySet().contains(e.st2)){
//				kvertices.put(e.st2, new Vertice(e.st2));
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
	  for(State s: kvertices.keySet()){
		  if(s.equals(t)){
			  return s;
		  }
	  }
	  throw new Exception("no such state"); 
}

  public void satEX(CTLFormula f) throws Exception{
	  for(Edge e: edges){
		  //check for translation
//		  if(kvertices.get(e.st2).containsP(f.getSymbolic())){
//			  kvertices.get(e.st1).setPredicate("EX("+f.getSymbolic()+")");
//		  }
		  if(kvertices.get(findVSt(e.getSt2())).containsP(f.getSymbolic())){
			  kvertices.get(findVSt(e.getSt1())).setPredicate("EX("+f.getSymbolic()+")");
		  }
	  }
  }
  
  public void satAF(CTLFormula f) throws Exception{
	  int old=0;
	  for(State s: kvertices.keySet()){
		  if(kvertices.get(s).containsP(f.getSymbolic())){
			  kvertices.get(s).setPredicate("AF("+f.getSymbolic()+")");
			  old++;
		  }
	  }
	  boolean fl=false;
	  for(Vertice vt:kvertices.values()){
		  if(vt.containsP("AF("+f.getSymbolic()+")")) {
			  fl=true;
			  break;
		  }
	  }
	  if(!fl){
		  return;
	  }
	  int newSt=old;
	  do{
		  //old=newSt;//TODO check
		  old=0;
		  for(State s: kvertices.keySet()){
			 // boolean fl=true;
			  fl=true;
			  //for(Edge e: kvertices.get(s).edges){
			  for(Edge e: kvertices.get(s).getEdges()){
				  Vertice v=kvertices.get(findVSt(e.getSt2()));
				  State s2=e.getSt2();
				  boolean b=kvertices.get(findVSt(e.getSt2())).containsP("AF("+f.getSymbolic()+")");
				  if(!e.getSt2().equals(s)){
					  if(!kvertices.get(findVSt(e.getSt2())).containsP("AF("+f.getSymbolic()+")")){
				  	  fl=false;
					  break;
 				  }
			  }
				  if(fl&&!kvertices.get(s).containsP("AF("+f.getSymbolic()+")")){
					  kvertices.get(s).setPredicate("AF("+f.getSymbolic()+")");
					  old++;
				  }
			  }
			  
//			  if(fl&&!kvertices.get(s).containsP("AF("+f.getSymbolic()+")")){
//				  kvertices.get(s).setPredicate("AF("+f.getSymbolic()+")");	
//				  System.out.println(kvertices.get(s).hashCode()+" set to AF "+f.getSymbolic());
//				  newSt++;
//			  }				  
		  }
	  }while(old>0);
	 // }while(newSt>old);
  }
  
 
  
  public void satEU(CTLFormula f){
	  //Set<State> w=new HashSet<State>();
	  int old=0;
	  for(State s: kvertices.keySet()){
		  if(kvertices.get(s).containsP(f.getSecond().getSymbolic())){
			  //TODO care about symbolics
			  kvertices.get(s).setPredicate(f.getSymbolic());
			  old++;
		  }
//		  if(kvertices.get(s).containsP(f.getFirst().getSymbolic())){
//			  //TODO care about symbolics
//			  w.add(s);
//		  }
	  }
	  int newSt=old;
	  do{
		  //old=newSt;//TODO check
		  newSt=0;
			  for(Edge e: edges){
				  Vertice v1=kvertices.get(e.getSt1());
				  Vertice v2=kvertices.get(e.getSt2());
				  for(State s:kvertices.keySet()){
					  if(s.equals(e.getSt1())){
						  v1=kvertices.get(s);
					  }
					  if(s.equals(e.getSt2())){
						  v2=kvertices.get(s);
					  }
				  }
				  
				  if(v1.containsP(f.getFirst().getSymbolic())&&
							 v2.containsP(f.getSymbolic())){
						  if(!v1.containsP(f.getSymbolic())){
							  v1.setPredicate(f.getSymbolic());
						 //if(!kvertices.get(e.getSt1()).setPredicate(f.getSymbolic())){
							 newSt++;
						 }
					  }
//				  if(kvertices.get(e.getSt1()).containsP(f.getFirst().getSymbolic())&&
//						 kvertices.get(e.getSt2()).containsP(f.getSymbolic())){
//					  if(!kvertices.get(e.getSt1()).containsP(f.getSymbolic())){
//						  kvertices.get(e.getSt1()).setPredicate(f.getSymbolic());
//					 //if(!kvertices.get(e.getSt1()).setPredicate(f.getSymbolic())){
//						 newSt++;
//					 }
//				  }
				  
			  }		    
			  }while(newSt>0);		  
	  //}while(newSt>old);
	  
	  
  }
  
  
  public void satOR(CTLFormula first, CTLFormula second){
	  for(State s: kvertices.keySet()){
		  if(kvertices.get(s).containsP(first.getSymbolic())||
				  kvertices.get(s).containsP(second.getSymbolic())){
			  kvertices.get(s).setPredicate("("+first.getSymbolic()+")|("+second.getSymbolic()+")");
		  }
	  }
  }
  
  public void satAND(CTLFormula first, CTLFormula second){
	  for(State s: kvertices.keySet()){
		  if(kvertices.get(s).containsP(first.getSymbolic())&&
				  kvertices.get(s).containsP(second.getSymbolic())){
			  kvertices.get(s).setPredicate("("+first.getSymbolic()+")&("+second.getSymbolic()+")");
		  }
	  }
  }

  public void satNOT(CTLFormula f){
	  //TODO check
	  for(State s: kvertices.keySet()){
		  if(!kvertices.get(s).containsP(f.getSymbolic())){
			  kvertices.get(s).setPredicate("!("+f.getSymbolic()+")");
		  }
	  }
  }

  
  public void setAP(AtomicPredicate ap){
	  if(ap.getSymbolic().equals("1")){
		  for(State s: kvertices.keySet()){
			 	  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
		  return;
	  }
	  for(State s: kvertices.keySet()){
		  
		  switch(ap.getOperator()){
		  case LEQ:{
			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()>=ap.getNumber()){
				  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case LARGER:{
			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()>ap.getNumber()){
				  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case EQUAL:{
			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()==ap.getNumber()){
				  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case NEQ:{
			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()!=ap.getNumber()){
				  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case SEQ:{
			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()<=ap.getNumber()){
				  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case SMALLER:{
			  //pMarking pm=s.getpMark().get(ap.getPlace());
			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()<ap.getNumber()){
				  kvertices.get(s).predicates.add(ap.getSymbolic());
			  }
			  break;
		  }
		  case HAS:{
			  if(s.getpMark().get(ap.getPlaceNumber()).getNets().size()>0){
				  for(ElNet en:s.getpMark().get(ap.getPlaceNumber()).getNets()){
					  for(Place pl:en.getPlaces().values()){
						  if(pl.equals(ap.getHAP().getPlace())){
							  if(compAP(ap.getHAP())){
								  kvertices.get(s).predicates.add(ap.getSymbolic());
								  break;
							  }
								 
							  
						  }
					  }
				  }
					 // &&.s.getpMark().get(ap.getPlaceNumber()).getNets().contains(arg0)){
				  
			  }
			  break;
		  }
		  }//end switch
		  		}	//end for
  
  }//end metod
  
  public boolean compAP(AtomicPredicate ap){
	  switch(ap.getOperator()){
	  case LEQ:{
		  if(ap.getPlace().getMarking().regTokensNum()>=ap.getNumber()){
			  return true;
		  }
		  break;
	  }
	  case LARGER:{
		  if(ap.getPlace().getMarking().regTokensNum()>ap.getNumber()){
			  return true;
		  }
		  break;
	  }
	  case EQUAL:{
		  if(ap.getPlace().getMarking().regTokensNum()==ap.getNumber()){
			  return true;
		  }
		  break;
	  }
	  case NEQ:{
		  if(ap.getPlace().getMarking().regTokensNum()!=ap.getNumber()){
			  return true;
		  }
		  break;
	  }
	  case SEQ:{//TODO WHY?!
		  if(ap.getPlace().getMarking().regTokensNum()<=ap.getNumber()){
			  return true;
		  }
		  break;
	  }
	  case SMALLER:{
		  if(ap.getPlace().getMarking().regTokensNum()<ap.getNumber()){
			  return true;
		  }
		  break;
	  }
  }
	  return false;
  }
//  public void setAP(AtomicPredicate ap){
//	  if(ap.getSymbolic().equals("1")){
//		  for(State s: kvertices.keySet()){
//			 	  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//		  return;
//	  }
//	  for(State s: kvertices.keySet()){
//		  
//		  switch(ap.getOperator()){
//		  case LEQ:{
//			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()>=ap.getNumber()){
//				  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//			  break;
//		  }
//		  case LARGER:{
//			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()>ap.getNumber()){
//				  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//			  break;
//		  }
//		  case EQUAL:{
//			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()==ap.getNumber()){
//				  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//			  break;
//		  }
//		  case NEQ:{
//			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()!=ap.getNumber()){
//				  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//			  break;
//		  }
//		  case SEQ:{//TODO WHY?!
//			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()<=ap.getNumber()){
//				  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//			  break;
//		  }
//		  case SMALLER:{
//			  if(s.getpMark().get(ap.getPlaceNumber()).regTokensNum()<ap.getNumber()){
//				  kvertices.get(s).predicates.add(ap.getSymbolic());
//			  }
//			  break;
//		  }
//		  }//end switch
//		  		}	//end for
//  
//  }//end metod
  
  
  
  
}
