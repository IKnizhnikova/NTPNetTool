package model.parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import algorithms.TPNet.Arc;
//import algorithms.TPNet.Place;

public class Place {
	//int mark = 0; //количество фишек
	//List<ElNet> tokens=new ArrayList<ElNet>();//check it TODO
	//int tokenNum; //number of ordinary tokens
	pMarking mark=new pMarking();
    int number;
   // List<Arc> outArc = new ArrayList<Arc>();
    String name;
    //List<Transition> transitions=new ArrayList<Transition>();
    

    public Place(int num) {
        number = num;
    }
    
    public Place clone(){
    	Place p2=new Place(number);
    	p2.setName(name);
//    	List<Arc> ar2 = new ArrayList<Arc>();
//    	for (int i = 0; i < outArc.size(); i++) {
//            ar2.add(outArc.get(i).clone());
//        }
    	p2.setMarking(mark.clone());
    	return p2;
    }

    public boolean equals(Object o){

    	if(o==this){
    		return true;
    	}
    	if (o.getClass() != Place.class) {
            return false;
        }
    	Place pn=(Place)o;
    	if(!pn.name.equals(name)||pn.number!=number||!pn.mark.equals(mark)){
    		return false;
    	}
    	return true;
    }
    
    public boolean enEquals(Object o){//TODO check

    	if(o==this){
    		return true;
    	}
    	if (o.getClass() != Place.class) {
            return false;
        }
    	Place pn=(Place)o;
    	if(!pn.name.equals(name)||pn.number!=number){
    		return false;
    	}
    	return true;
    }
    
 /*   public Place clone(List<Arc> arc) {
        //return new Place(this, arc); 
        Place p = new Place();
        p.mark = mark;
        p.number = number;
        p.outArc = new ArrayList<Arc>();
        for (int i = 0; i < outArc.size(); i++) {
            p.outArc.add(arc.get(arcs.indexOf(outArc.get(i))));
        }
        return p;
    }
*/
   /* 
    int simpleTokensNum(){//returns number of simple black tokens in position
    	int ans=0;
    	for(int i =0; i<tokens.size(); i++){
    		if(!tokens.get(i).isNet()) ans++;
    	}
    	return ans;
    }
    */
    
//    ArrayList<ElNet> readyNets(int vsync){//returns number of el. nets with appropriate vsync transition in position
//    	ArrayList<ElNet> ans=new ArrayList<ElNet>();
//    	for(int i =0; i<tokens.size(); i++){
//    		if(tokens.get(i).containsEnableVsync(vsync)) ans.add(tokens.get(i));
//    	}
//    	return ans;
//    }

//    public void getMarks(int amount) {//just get regular tokens, ignoring element nets 
//        if (amount <= tokenNum) {
//            tokenNum -= amount;
//            //TODO: add nested - id's
//            //for (int i = 0; i < outArc.size(); i++) {
//            //    transitions.get(outArc.get(i).transitionNumber).setInintialTtokens.size()ing();
//            //}
//        }
//        //else throw new OutOfRangeException();
//        //except
//    }
    
    
//    public void getMarks(int amount, int vsync) {//get nets with appropriate ready transition, if vsync <=0 - than any nets, without any vsync 
//    	ArrayList<ElNet> rNets=readyNets(vsync);
//    	if (amount <= rNets.size()) {
//            
//            for(int i=0; i<amount;i++){
//            	tokens.remove(rNets.get(i));
//            }
//            //TODO check if transition's action starts earlier
//            
//            //TODO: add nested - id's
//            //for (int i = 0; i < outArc.size(); i++) {
//            //    transitions.get(outArc.get(i).transitionNumber).setInintialTtokens.size()ing();
//            //}
//        }
//        //else throw new OutOfRangeException();
//        //except
//    }

//    public void setMarks(int amount) {
//        tokenNum += amount;
//        //TODO - add IDs
//       /* for (int i = 0; i < outArc.size(); i++) {
//            if (transitions.get(outArc.get(i).transitionNumber).isEnabled()) {
//                transitions.get(outArc.get(i).transitionNumber).setInintialTMarking();
//            }
//        }*/
//    }
//    public void setMarks(int amount, ElNet eNet) {
//    	tokens.add(eNet);
//    }

    public boolean isPartOf(Place[] pl) {
        for (int i = 0; i < pl.length; i++) {
            if (this.equals(pl[i])) {
                return true;
            }
        }
        return false;
    }
    
    public int getNumber(){
    	return number;
    }
    
    
    public pMarking getMarking(){
    	return mark;
    }
    
    public void setMarking(pMarking m){
    	mark=m;//check links
    }

    public void setName(String n){
    	name=n;
    }

	public String getName() {
		return name;
	}
    
}
