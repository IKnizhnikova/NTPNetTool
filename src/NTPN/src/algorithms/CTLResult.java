package algorithms;

import model.parts.ElNet;
import model.parts.Transition;
import algorithms.CTLformula.CTLFormula;

public class CTLResult {
CTLFormula formula;
boolean result;
String trace="";
public CTLResult(CTLFormula f, boolean res){
	formula=f;
	result=res;
}

//public class ETREntry{
//	String
//}


public void addActivationToBeg(String trname, int time){//system net autonomous transition activated
	trace=("->"+trname+"("+time+")\n")+trace;
}
public void addActivationToBeg(String enInf,String trname, int time){//elnet autonomous transition activated
	trace=("->"+enInf+trname+"("+time+")\n")+trace;
}

public void addActivationToBeg(String strname,String[] eacts, int time){//elnet autonomous transition activated
	String res="";
	for(String s:eacts){
		res+=(s+";");
	}
	res=res.substring(0, res.length()-1);
	trace=("->"+strname+":{"+res+"}("+time+")\n")+trace;
	//trace+="->{["+pname+"."+elname+"]"+trname+"("+time+")}\n";
}

public void addActivation(String trname, int time){//system net autonomous transition activated
	trace+=("->"+trname+"("+time+")\n");
}
public void addActivation(String pname, String elname,String trname, int time){//elnet autonomous transition activated
	trace+=("->["+pname+"."+elname+"]"+trname+"("+time+")\n");
}

public void addActivation(String strname,String[] eacts, int time){//elnet autonomous transition activated
	String res="";
	for(String s:eacts){
		res+=(s+";");
	}
	res=res.substring(0, res.length()-1);
	trace+=("->"+strname+":{"+res+"}("+time+")\n");
	//trace+="->{["+pname+"."+elname+"]"+trname+"("+time+")}\n";
}

public String getTrace(){
	return trace;
}

public CTLFormula getCTLFormula(){
	return formula;
}

public boolean getResult(){
	return result;
}
}
