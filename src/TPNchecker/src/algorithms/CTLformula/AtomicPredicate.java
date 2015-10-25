package algorithms.CTLformula;

import algorithms.TPNet;



public class AtomicPredicate implements IformulaElement {
String symbolic;
String type="predicate";
//boolean value;
//TPNet.Place p;
int p;//place number
int number;
CompOperators op;
public AtomicPredicate(String s){//TODO check if unused
	symbolic=s;
}

public AtomicPredicate(String s, TPNet.Place pl, CompOperators o, int n){
	symbolic=s;
	//p=pl;
	p=pl.getNumber();
	op=o;
	number=n;
}
public AtomicPredicate(boolean not, AtomicPredicate a){//remember about "reverse of bool"
	if(not){
		symbolic="!"+a.getSymbolic();
		op=a.getOperator().not();
	}
	else{
		symbolic=a.getSymbolic();
		op=a.getOperator();
	}
	//p=a.getPlace();
	p=a.getPlaceNumber();
	number=a.getNumber();
}
	
	@Override
	public String getSymbolic() {
		// TODO Auto-generated method stub
		return symbolic;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	public int getPlaceNumber(){
		return p;
	}
	
	public CompOperators getOperator(){
		return op;
	}
	
	public int getNumber(){
		return number;
	}
	
//	TPNet.Place getPlace(){
//		return p;
//	}
	
//	public boolean getValue(){
//		return value;
//	}

}
