package model.parts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.parts.ElNet.State;

public class pMarking {
int regTokens;//number of regular tokens
ArrayList<ElNet> elNets;//elemenNets
//ArrayList<NetToken> elNets;

//public pMarking()
//{regTokens=0;
//elNets=new ArrayList<NetToken>();
//}
//
//public pMarking(int t)
//{regTokens=t;
//elNets=new ArrayList<NetToken>();
//}

public pMarking()
{regTokens=0;
elNets=new ArrayList<ElNet>();
}

public pMarking(int t)
{regTokens=t;
elNets=new ArrayList<ElNet>();
}

/*
public pMarking(int t,ArrayList<ElNet> eN)
{regTokens=t;
elNets=eN;
}
*/
@Override
public pMarking clone() {
    pMarking pmn = new pMarking();
    pmn.regTokens=this.regTokens;
    for(ElNet i:elNets){
    	pmn.addNet(i.clone());
    }
    //TODO add clone for nets
    return pmn;
}

public pMarking cloneWON() {
    pMarking pmn = new pMarking();
    pmn.regTokens=this.regTokens;
    for(ElNet i:elNets){
    	pmn.addNet(i.cloneWON());
    }
    //TODO add clone for nets
    return pmn;
}
@Override
public boolean equals(Object o){//TODO check it
	if (o.getClass() != pMarking.class) {
        return false;
    }
    pMarking pm = (pMarking) o;
    if (pm.regTokens != regTokens) {
        return false;
    }
    if (pm.elNets.size() != elNets.size()) {
        return false;
    }
    for(ElNet i:elNets){
    	if(!pm.elNets.contains(i)){
    		return false;
    	}
    }

    

    return true;
}

public String toString(){

	String s="";
	if(elNets.size()>0){
		for(ElNet en:(elNets)){
			s+=en.getName()+"[";
			for(Place pn:en.places.values()){
				s+=pn.getName()+":"+pn.mark.regTokens+";";
			}
			s+=" trs:";
			for(Transition tn:en.transitions.values()){
				s+=tn.getName()+":"+tn.getCurTime();
			}
			s+="]";
		}
	}
	else{
		return s+" "+regTokens;
	}
	//return s+" "+regTokens;
	return s;
}
//public String toString(){
//	return ""+regTokens;
//}
public void addNet(ElNet n){
	elNets.add(n);
}

public void removeNet(ElNet n){
	elNets.remove(n);
	//TODO check exceptions
}

public void addTokens(int n){
	regTokens+=n;
}

public void removeTokens(int n){
	if(regTokens>=n){
	regTokens-=n;
	}
	//TODO check exceptions
}

private ElNet findByName(String s){//TODO temp
	for(int i=0; i<elNets.size();i++){
		if(elNets.get(i).getName().equals(s))
			return elNets.get(i);
	}
	return null;//TODO TOFIX
}


public ArrayList<ElNet> getNets(){
	return elNets;
}

public ElNet getNet(String s){
	return findByName(s);
}


public ArrayList<ElNet> readyNets(String vsync){//returns number of el. nets with appropriate vsync transition in position
	ArrayList<ElNet> ans=new ArrayList<ElNet>();
	for(int i =0; i<elNets.size(); i++){
		if(elNets.get(i).containsEnabledVsync(vsync)) ans.add(elNets.get(i));
	}
	return ans;
}

public void getMarks(int amount) {//just get regular tokens, ignoring element nets 
    if (amount <= regTokens) {
    	regTokens -= amount;
        
    }
    //else throw new OutOfRangeException();
    //except
}

//public void getMarks(int amount, int vsync) {//get nets with appropriate ready transition, if vsync <=0 - than any nets, without any vsync 
//	ArrayList<ElNet> rNets=readyNets(vsync);
//	if (amount <= rNets.size()) {
//        
//        for(int i=0; i<amount;i++){
//        	elNets.remove(rNets.get(i));
//        }
//        //TODO check if transition's action starts earlier
//        
//        //TODO: add nested - id's
//        //for (int i = 0; i < outArc.size(); i++) {
//        //    transitions.get(outArc.get(i).transitionNumber).setInintialTtokens.size()ing();
//        //}
//    }
//    //else throw new OutOfRangeException();
//    //except
//}


public ArrayList<ElNet> getMarks(int amount, String vsync) throws Exception {//get nets with appropriate ready transition, if vsync <0 - than any nets, without any vsync 
	ArrayList<ElNet> rNets=readyNets(vsync);
	ArrayList<ElNet> ans=new ArrayList<ElNet>();
	if (amount <= rNets.size()) {
        
        for(int i=0; i<amount;i++){
        	for(Transition t:rNets.get(i).getEnabledTransitions()){
        		if(vsync!=null&&t.guardVar!=null&&t.guardVar.equals(vsync)){
        			t.activate();
        			break;
        		}
        	}
        	ans.add(rNets.get(i));
        	elNets.remove(rNets.get(i)); //TODO check links
        }
        
        //TODO check if transition's action starts earlier
        
        //TODO: add nested - id's
        //for (int i = 0; i < outArc.size(); i++) {
        //    transitions.get(outArc.get(i).transitionNumber).setInintialTtokens.size()ing();
        //}
    }
    //else throw new OutOfRangeException();
    //except
	return ans;
}


public void setMarks(int amount) throws Exception {
	if(amount>=0){
    regTokens += amount;
	}
	else {
        throw new Exception("Отрицательные фишки, сменить эксепшн");
    }
    //TODO - add IDs
   /* for (int i = 0; i < outArc.size(); i++) {
        if (transitions.get(outArc.get(i).transitionNumber).isEnabled()) {
            transitions.get(outArc.get(i).transitionNumber).setInintialTMarking();
        }
    }*/
}
public void setMarks(int amount, ElNet eNet) {
	elNets.add(eNet);
}


public int regTokensNum(){
	return regTokens;
}
}
