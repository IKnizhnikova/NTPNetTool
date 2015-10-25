package algorithms.CTLformula;

import model.NTPNet;
import model.parts.Place;



public class AtomicPredicate implements IformulaElement {
String symbolic;
String type="predicate";
//boolean value;
//TPNet.Place p;
//int p;//place number
Place place;
String netName;
int number;
CompOperators op;
AtomicPredicate ap;//for nested only
public AtomicPredicate(String s){//TODO check if unused
	symbolic=s;
}


public AtomicPredicate(String s, Place pl, CompOperators o, int n, String nN){
	symbolic=s;
	//p=pl;
	place=pl;
	op=o;
	number=n;
	netName=nN;
}

public AtomicPredicate(String s, Place pl, AtomicPredicate a,String nN){
	symbolic=s;
	//p=pl;
	place=pl;
	op=CompOperators.HAS;
	ap=a;
	netName=nN;
	//number=n;
}

//public AtomicPredicate(String s, Place pl, CompOperators o, int n){
//	symbolic=s;
//	//p=pl;
//	p=pl.getNumber();
//	op=o;
//	number=n;
//}
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
	place=a.getPlace();
	number=a.getNumber();
}
	

public AtomicPredicate getHAP(){
	return ap;
}


public String getNetName(){
	return netName;
}
	@Override
	public String getSymbolic() {
		// TODO Auto-generated method stub
		return symbolic;
	}
	public Place getPlace(){
		return place;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	public int getPlaceNumber(){
		return place.getNumber();
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
