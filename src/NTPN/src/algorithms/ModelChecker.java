package algorithms;

import java.util.ArrayList;
import java.util.Map;

import algorithms.Graph.Edge;
import algorithms.Kripke.Vertice;
import model.parts.ElNet.State;
import algorithms.CTLformula.AtomicPredicate;
import algorithms.CTLformula.CTLFormula;
import algorithms.CTLformula.Operators;

public class ModelChecker {
	
	Kripke kstruct;
	
	public ModelChecker(Graph g){
		kstruct=new Kripke(g);
		
	}

	public void applySAT(CTLFormula ctl, int n, boolean lower) throws Exception{//lower if depth unde wasn.t checked
		if(lower && n>1){
			applySAT(ctl,n-1, true);
		}
		if(ctl.getDepth()>n){
			applySAT(ctl.getFirst(),n, false);
			if(ctl.hasSecond()){
				applySAT(ctl.getSecond(),n, false);
			}
		}
		else{//==n
			sat(ctl);
		}
				
	}
	
	public void getTrace(){
		
	}
	
	private State findState(State s){
for(State ts:kstruct.kvertices.keySet()){
			if(s.equals(ts)){
				return ts;
			}
		}
return null;
	}
	void checkTrace(CTLResult cr, State state){//ТОЛЬКО ДЛЯ AF!!!
		//if(kstruct.vertices.get(state).getEdges().size())
		boolean flnew=false;//there are no new states reachable from this one
		//boolean flhas=false;//во всех следующих позициях подформула выполняется 
		//Vertice v=kstruct.kvertices.get(state);
		
		for(Edge e:kstruct.kvertices.get(findState(state)).getEdges()){
			//flhas=false;//во всех следующих позициях подформула выполняется 
			if(!e.getSt2().equals(e.getSt1())){
				flnew=true;//there are new states reachable from this one
				if( !kstruct.kvertices.get(findState(e.getSt2())).containsP(cr.getCTLFormula().getFirst().getSymbolic())){
					//flhas=true;//не во всех следующих позициях подформула выполняется
				checkTrace(cr, e.getSt2());
				if(e.getTrans().getEnInf()==null){//system net transition
				cr.addActivationToBeg(e.getTrans().getName(), e.getTime());
				}
				else{
					cr.addActivationToBeg(e.getTrans().getEnInf(), e.getTrans().getName(), e.getTime());
				}
				//TODO vsynced transitions are needed?
				break;
				}
			}
		 }
		if(!flnew){//no new states, trace is found, start adding
			return;
		}
	}
	void setTrace(CTLResult cr, State initialState){
		if(!cr.getCTLFormula().getOperator().equals(Operators.AF)){
			//Если верхний оператор EX или EU и формула ложна - нет пути, где они были бы истинны, нечего выводить
			//TODO - проверить для логических
			
			checkTrace(cr, initialState);
			
//			for(Edge e:kstruct.vertices.get(initialState).getEdges()){
//				if(!e.getSt2().equals(e.getSt1())
//						&& !kstruct.vertices.get(e.getSt2()).containsP(cr.getCTLFormula().getFirst().getSymbolic())){
//					
//				}
//			}
			//for(Vertice v:kstruct.)
			
		}
	}
	
	public CTLResult check(CTLFormula ctl, State is) throws Exception{
		applySAT(ctl, ctl.getDepth(), true);
		CTLResult cr;

		//TODO
		if(kstruct.kvertices.get(kstruct.initialState).containsP(ctl.getSymbolic())){
			
			cr=new CTLResult(ctl,true);
		}
		else{//trace is needed
			cr=new CTLResult(ctl,false);
			setTrace(cr, kstruct.initialState);
		}

		return cr;
	}
	
//	public boolean check(CTLFormula ctl, State is) throws Exception{
//		applySAT(ctl, ctl.getDepth(), true);
//
//		//TODO
//		if(kstruct.vertices.get(kstruct.initialState).containsP(ctl.getSymbolic())){
//			
//			return true;
//		}
//
//		return false;
//	}
	
	private void sat(CTLFormula f) throws Exception{
		if(f.getDepth()==1){
			kstruct.setAP(f.getAP());
			return;
		}
		switch(f.getOperator()){
		case NOT:{//TODO formula
            //kstruct.setAP(new AtomicPredicate(true,f.getFirst().getAP()));
			kstruct.satNOT(f.getFirst());
			break;
		}
		case OR:{
//			kstruct.setAP(f.getFirst().getAP());
//			kstruct.setAP(f.getSecond().getAP());
			//TODO
//			sat(f.getFirst());
//			sat(f.getSecond());
			kstruct.satOR(f.getFirst(),f.getSecond());
			break;
		}
		case AND:{
			kstruct.satAND(f.getFirst(),f.getSecond());
			break;
		}
		case EX:{
			kstruct.satEX(f.getFirst());
			break;
		}
		case AF:{
			kstruct.satAF(f.getFirst());
			break;
		}
		case E:{
			kstruct.satEU(f);
			//TODO Check if E
			//TODO check formulas			
			break;
		}
		}
	}
	


}
