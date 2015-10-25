package algorithms;

import java.util.ArrayList;

import algorithms.Kripke.Vertice;
import algorithms.TPNet.State;
import algorithms.CTLformula.AtomicPredicate;
import algorithms.CTLformula.CTLFormula;

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
	
	public boolean check(CTLFormula ctl) throws Exception{
		applySAT(ctl, ctl.getDepth(), true);
//		int d=ctl.getDepth();
//		CTLFormula current;//TODO recurs
//		for(int i=1; i<=ctl.getDepth();i++){
//			current=ctl;
//			while(current.getDepth()>i){
//				current=current.getFirst();
//			}
//			if(current.getDepth()==i){
//				sat(current);
//			}
//		}
		
//		for(State s: kstruct.vertices.keySet()){
//			if(kstruct.vertices.get(s).containsP(ctl.getSymbolic())){
//				return true;
//			}
//			return false;
//		}
		//TODO
		for(State s: kstruct.vertices.keySet()){
			if(kstruct.vertices.get(s).containsP(ctl.getSymbolic())){
				return true;
			}
		}
		return false;
	}
	
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
