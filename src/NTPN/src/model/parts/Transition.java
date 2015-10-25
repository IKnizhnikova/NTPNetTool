package model.parts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.IntegerTime;

public class Transition {
	
	private IntegerTime lft = new IntegerTime();
    int number;
    private int eft;
    private String name;
    String enInf=null;//если переход в элементной сети - здесь будут имя позиции и этой сети
    private int currentTime = -1; //if negative - transition is inactive

    private ArrayList<Arc> inArc = new ArrayList<Arc>();
    private ArrayList<Arc> outArc = new ArrayList<Arc>();
    
    private int mark;
    
    String guardVar=null;//which variable to be checked TODO check this and mark
    //int gPlaceNum; //which place of the var to be checked
    //int comp; //1 - <, 2<=, 3=,4>=,5>
    //int compN;//number to compare with
    
    public Transition clone() {
        Transition t2;
        if (lft.isFinite()) {
            t2 = new Transition(eft, lft.getTime(), number);
        } else {
            t2 = new Transition(eft, false,number);
        }
        t2.name=name;
        t2.currentTime=currentTime;
        t2.guardVar=guardVar;
        t2.mark=mark;
        t2.enInf=enInf;
//        t2.outArc = new ArrayList<Arc>();
//        for (int i = 0; i < outArc.size(); i++) {
//            t2.outArc.add(outArc.get(i).clone());
//        }
//        t2.inArc = new ArrayList<Arc>();
//        for (int i = 0; i < inArc.size(); i++) {
//            t2.inArc.add(inArc.get(i).clone());
//        }
        return t2;
    }
    
    public boolean equals(Object o){
    	if(o==this){
    		return true;
    	}
    	if (o.getClass() != Transition.class) {
            return false;
        }
    	Transition tn=(Transition)o;
    	if(tn.number!=number||tn.eft!=eft||!tn.lft.equals(lft)||tn.currentTime!=currentTime
    			||tn.mark!=mark||tn.guardVar!=guardVar){
    		return false;
    	}
    	//arcs are not checked now TODO
    	//TODO and check if en position shoud be compared too
    	return true;
    } 

    /*
     public Transition clone(List<Arc> ar) {
        Transition t;
        if (lft.isFinite()) {
            t = new Transition(eft, lft.getTime());
        } else {
            t = new Transition(eft, false);
        }
        t.number = number;
        t.currentTime = currentTime;
        t.outArc = new ArrayList<Arc>();
        for (int i = 0; i < outArc.size(); i++) {
            t.outArc.add(ar.get(arcs.indexOf(outArc.get(i))));
        }
        t.inArc = new ArrayList<Arc>();
        for (int i = 0; i < inArc.size(); i++) {
            t.inArc.add(ar.get(arcs.indexOf(inArc.get(i))));
        }
        return t;
    }
    */

    public Transition(int et, int lt, int num) {
        if (et > lt) {
            //throw new Exception("eft < lft. Change it and i'll change this exc");
            System.err.print("eft < lft");
        }
        number = num;
        setEft(et);
        getLft().setFiniteTime(lt);
    }

    public Transition(int et, boolean lt, int num) {
        number = num;
        setEft(et);
        getLft().setInfiniteTime();
    }

    public Transition(int et, IntegerTime lt, int num) {
        number = num;
        setEft(et);
        setLft(lt.clone());

    }
    
    public int getNumber(){
    	return number;
    }
    
    public void setEnInf(String s){
    	enInf=s;
    }
    
    public String getEnInf(){
    	return enInf;
    }

//    public boolean isEnabled() {
//        for (int i = 0; i < getInArc().size(); i++) {
//            if (getInArc().get(i).weight > getInArc().get(i).getPlaceMarking()) {
//                return false;
//            }
//        }
//        return true;
//    }
    
    public boolean isEnabled() {
        for (int i = 0; i < getInArc().size(); i++) {
            if (!getInArc().get(i).canAct(guardVar)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isReady() {
        if (isEnabled()) {
            if (getCurTime() >= getEft() && (!getLft().isFinite()
                    || getCurTime() <= getLft().getTime())) { //переопределить сравнение
                return true;
            }
        }
        return false;
    }

    public boolean isReady(int time) {
        if (isEnabled()) {
            if (getCurTime() + time >= getEft() && (!getLft().isFinite()
                    || getCurTime() + time <= getLft().getTime())) { //переопределить сравнение
                return true;
            }
        }
        return false;
    }
    
    
    
    public void elapseTime(int time) throws Exception {
    	if (!getLft().isFinite()&&getCurTime()+ time>=getEft()) {//here comes modified state change
    			setCurTime(getEft());
    		}
    	else{
        if (getCurTime() + time <= getLft().getTime()) {
            setCurTime(getCurTime() + time);
        } else {
            throw new Exception(
                    "Error while activating t"+name+ 
                            " time can not elapse without activating transition" 
                            + name);
        }
    	}
    }
//    public void elapseTime(int time) throws Exception {
//        if (!getLft().isFinite() || getCurTime() + time <= getLft().getTime()) {
//            setCurTime(getCurTime() + time);
//        } else {
//            throw new Exception(
//                    "Error while activating t"+name+ 
//                            " time can not elapse without activating transition" 
//                            + name);
//        }
//    }
    
    /*public Token getMovingToken(){
    	
    }
    */
    
    public void activate() throws Exception {
     	 if (isReady()) {
     		
             for (int i = 0; i < getInArc().size(); i++) {
                if(getInArc().get(i).getVariable()!=0){//move elNets
                	ArrayList<ElNet> tNets=getInArc().get(i).activateInArc(guardVar);
                	for(int k=0; k<outArc.size();k++)
                	{
                		if(outArc.get(k).getVariable()==inArc.get(i).getVariable()){
                			for(int f=0; f<outArc.get(k).weight;f++){
                				outArc.get(k).getPlaceMarking().addNet(tNets.get(0));
                				tNets.remove(0);//TODO check the remove and also needs checking input вес-количество
                			}
                		}
                	}
                }
                else{//move regular tokens
            	 getInArc().get(i).activate();
                }
             }
             for (int i = 0; i < getOutArc().size(); i++) {
            	 if(getOutArc().get(i).getVariable()==0){//move regular tokens 	 
                 getOutArc().get(i).activate();
            	 }
             }
             currentTime=0;
         } else {
             throw new Exception("can not be activated");
         }
        
     }
    
    /*
     public void activate() throws Exception {
     	 if (isReady()) {
             for (int i = 0; i < getInArc().size(); i++) {
                 getInArc().get(i).activate();
             }
             for (int i = 0; i < getOutArc().size(); i++) {
                 getOutArc().get(i).activate();
             }
         } else {
             throw new Exception("can not be activated");
         }
        
     }
     */
    
    public void setInintialTMarking() {
        if (isEnabled()) {
            setCurTime(0);
        } else {
            setCurTime(-1);
        }
    }

	public int getCurTime() {
		return currentTime;
	}

	public void setCurTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public IntegerTime getLft() {
		return lft;
	}

	public void setLft(IntegerTime lft) {
		this.lft = lft;
	}

	public int getEft() {
		return eft;
	}

	public void setEft(int eft) {
		this.eft = eft;
	}

	public ArrayList<Arc> getInArc() {
		return inArc;
	}

	public void setInArc(ArrayList<Arc> inArc) {
		this.inArc = inArc;
	}

	public ArrayList<Arc> getOutArc() {
		return outArc;
	}

	public void setOutArc(ArrayList<Arc> outArc) {
		this.outArc = outArc;
	}
    
    public void setMark(int m){
    	mark=m;
    }
    public void setVSync(String vs){
    	guardVar=vs;
    }
    public boolean compMark(int m){//сравнивает пометки на переходе для вертикальной синхронизации
    	return (mark==m);
    }
    
    public void setName(String n){
    	name=n;
    }
    
    public String getName(){
    	return name;
    }
    
    public void addArc(Arc a){
    	if(a.placeToTransition) inArc.add(a);
    	else outArc.add(a);
    }
    
/*
    public Transition takePartially(Place[] pl, Arc in) {
        Transition t = new Transition(eft, lft, number);
        t.inArc.add(in.clone());
        for (int i = 0; i < outArc.size(); i++) {
            if (places.get(outArc.get(i).placeNumber).isPartOf(pl)) {
                t.outArc.add(outArc.get(i));
            }
        }
        return t;
    }
   */
}
