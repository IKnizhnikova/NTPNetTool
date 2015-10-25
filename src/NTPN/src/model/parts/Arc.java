package model.parts;

import java.util.ArrayList;



public class Arc {
	Place pl;
	Transition tr;
	//int placeNumber;
    //int transitionNumber;
    boolean placeToTransition;
    int weight = 1;
    char variable=0;//0 - just black tokens, else - element nets

    
    public Arc(Place p, Transition t, boolean placetotrans, char v) {
        pl=p;
        tr=t;
        placeToTransition = placetotrans;
        variable=v;
        //TODO: add links in main class constr

    }
    
    public Arc(Place p, Transition t, boolean placetotrans,char v, int w) {
        pl=p;
        tr=t;
        placeToTransition = placetotrans;
        weight=w;
        variable=v;
    }
    
    public Arc clone(Place p2, Transition t2) {
        return new Arc(p2, t2, placeToTransition,variable, weight);
    }
//    public Arc clone() {
//        return new Arc(pl, tr, placeToTransition, weight);
//    }
    
   /* public Arc clone() {
        return new Arc(placeNumber, transitionNumber, placeToTransition, weight);
    }

    public Arc(int pnum, int tnum, boolean placetotrans) {
        placeNumber = pnum;
        transitionNumber = tnum;
        placeToTransition = placetotrans;
        //TODO: add links in main class constr

    }

    public Arc(int pnum, int tnum, boolean placetotrans, int w) {
        placeNumber = pnum;
        transitionNumber = tnum;
        placeToTransition = placetotrans;
        weight = w;
        if (placetotrans) {
            // transitions.get(tnum).inArc.add(this);
        } else {
            //transitions.get(tnum).outArc.add(this);
        }
    }

    public Arc(Arc a) {
        placeNumber = a.placeNumber;
        transitionNumber = a.transitionNumber;
        placeToTransition = a.placeToTransition;
        weight = a.weight;
    }
*/
   

    @Override
    public boolean equals(Object o) {

    	if(o==this){
    		return true;
    	}
        if (o.getClass() != Arc.class) {
            return false;
        }
        Arc a = (Arc) o;
        if (!a.pl.equals(pl)
                || !a.tr.equals(tr)
                || a.placeToTransition != placeToTransition
                || a.weight != weight) {
            return false;
        }

        return true;
    }
    

    public ArrayList<ElNet> activateInArc(String vsync) throws Exception{
//    	if(variable==0){
//    		pl.getMarking().getMarks(weight);
//    		ArrayList<IToken> temp =new ArrayList<IToken>();
//    		temp.add(weight, new Token());//TODO check it
//    		return temp;
//    	}
    //	else    	{
    		return pl.getMarking().getMarks(weight, vsync);
    	//}
            
        
    }
    

    public void activate() throws Exception {
        if (placeToTransition) {
            pl.getMarking().getMarks(weight);
        } else {

            pl.getMarking().setMarks(weight);
        	
        }
    }
    
   /* public Place getPlace() {
        return pl;
    }
    */
    
    public pMarking getPlaceMarking() {//TODO change from int to all the marks returms number of marks now
        return pl.getMarking();
    }
    
    public int getPlaceNum(){
    	return pl.getNumber();
    	
    }
    
    public int getTransitionNum(){
    	return tr.getNumber();
    	
    }
    
    public int getVariable(){
    	return variable;
    }
    
    public boolean canAct(String vsync){//if place to trans 
    	//TODO check
    	if(variable==0){ 
    		if(weight <= pl.getMarking().regTokensNum()) {
    		return true; //regular tokens (no var on arc)
    		}
    	else return false;
    		}
    	else{
    		if(weight <= pl.getMarking().readyNets(vsync).size()) return true; //element nets. If vsync<0 - no vsync
        	else return false;}
    	
    	}
    

    

}
