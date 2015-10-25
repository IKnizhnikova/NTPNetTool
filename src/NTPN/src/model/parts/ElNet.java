package model.parts;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.parts.Arc;
import model.parts.Place;
import model.parts.Transition;
import algorithms.Graph;
import model.NTPNet;

public class ElNet implements IToken{	
		//simple Time Petri Net
	public boolean isNet(){
		return true;
	}
	
	
	    protected Map<Integer, Place> places = new HashMap<Integer, Place>();
	    protected Map<Integer, Transition> transitions = new HashMap<Integer, Transition>();
	    protected List<Arc> arcs = new ArrayList<Arc>();
	    protected State currentState = new State();
	    protected State initialState = new State();
	    String name="System Net";
	    
	    @Override
	    public ElNet clone(){
	    	ElNet nn=new ElNet();
	    	nn.setName(name);
	    	nn.currentState=currentState.clone();
	    	nn.initialState=initialState.clone();
	        	//HashMap<Integer, Place> pl2=new HashMap<Integer, Place>();
	        	Iterator it =places.keySet().iterator();
	        	while (it.hasNext()) {
	        		Integer ind=(Integer) it.next();
		           nn.places.put(ind, places.get(ind).clone());
	        	}
	        	
	        	//HashMap<Integer, Transition> tr2=new HashMap<Integer, Transition>();
	        	it =transitions.keySet().iterator();
	        	while (it.hasNext()) {
	        		Integer ind=(Integer) it.next();
		           nn.transitions.put(ind, transitions.get(ind).clone());
	        	}
	        	
	        	//List<Arc> ar2 = new ArrayList<Arc>();
	        	for (int i = 0; i < arcs.size(); i++) {
	        		nn.AddArc(arcs.get(i).getPlaceNum(), arcs.get(i).getTransitionNum(), arcs.get(i).placeToTransition, arcs.get(i).variable, 
	        				arcs.get(i).weight);
	               // ar2.add(arcs.get(i).clone());
	            }

	            return nn;
	        
	    	
	    }
	    
	    
	 
	    public ElNet cloneWON(){
	    	ElNet nn=new ElNet();
	    	nn.setName(name);
	    	nn.currentState=currentState.clone();
	    	nn.initialState=initialState.clone();
	        	//HashMap<Integer, Place> pl2=new HashMap<Integer, Place>();
	        	Iterator it =places.keySet().iterator();
	        	while (it.hasNext()) {
	        		Integer ind=(Integer) it.next();
		           nn.places.put(ind, places.get(ind));
	        	}
	        	
	        	//HashMap<Integer, Transition> tr2=new HashMap<Integer, Transition>();
	        	it =transitions.keySet().iterator();
	        	while (it.hasNext()) {
	        		Integer ind=(Integer) it.next();
		           nn.transitions.put(ind, transitions.get(ind));
	        	}
	        	
	        	//List<Arc> ar2 = new ArrayList<Arc>();
	        	for (int i = 0; i < arcs.size(); i++) {
	        		nn.AddArc(arcs.get(i).getPlaceNum(), arcs.get(i).getTransitionNum(), arcs.get(i).placeToTransition, arcs.get(i).variable, 
	        				arcs.get(i).weight);
	               // ar2.add(arcs.get(i).clone());
	            }

	            return nn;
	        
	    	
	    }
	    
	    @Override
	    public boolean equals(Object o){
	    	if (o.getClass() != ElNet.class) {
	            return false;
	        }
	    	ElNet nn=(ElNet)o;
	    	if(!nn.name.equals(name)||!nn.currentState.equals(currentState)||!nn.initialState.equals(initialState)
	    			||places.size()!=nn.places.size()||transitions.size()!=nn.transitions.size()
	    			||arcs.size()!=nn.arcs.size()){
	    		return false;
	    	}
	    	for(Place p1:places.values()){
	    		if(!nn.places.values().contains(p1))
	    			return false;
	    	}
	    	for(Transition t1:transitions.values()){
	    		if(!nn.transitions.values().contains(t1))
	    			return false;
	    	}
	    	for(Arc a1:arcs){
	    		if(!nn.arcs.contains(a1))
	    			return false;
	    	}
	    	//structure is equal and marking too        

	        return true;
	    }
	    
	    
	    public String toString(){
	        String s="";
	        Iterator it=transitions.values().iterator();
	        while(it.hasNext()){
	            Transition t=(Transition)it.next();
	            s+="\nTransition "+t.getNumber()+" inner arcs:";
	            for(int i=0; i<t.getInArc().size();i++){
	                s+=t.getInArc().get(i).getPlaceNum()+", ";
	            }
	            s+="\nTransition "+t.getNumber()+" outer arcs:";
	            for(int i=0; i<t.getOutArc().size();i++){
	                s+=t.getOutArc().get(i).getPlaceNum()+", ";
	            }
	        }
	        return s;
	    }
	    
	   
	    public void setName(String n){
	    	name=n;
	    }

	    //definition ends here
	    public void AddPlace() {
	        //places.add(new Place());
	        Place p = new Place(places.size());
	        
	        places.put(places.size(), p);
	    }
	    public void AddPlace(String s) {
	        //places.add(new Place());
	        Place p = new Place(places.size());
	        p.setName(s);
	        places.put(p.number, p);
	        
	    }

	    public void AddPlace(Place pl) {
	        places.put(pl.getNumber(), pl);
	    }

	 
	    public void AddTransition(int eft, int lft) {
	        //transitions.add(new Transition(eft, lft));
	    	Transition t;
	    	if(lft>=0){
	        t = new Transition(eft, lft,transitions.size());
	    	}
	    	else{
	    		//changed!
	    		t = new Transition(eft, false,transitions.size());
	    	}
	        transitions.put(transitions.size(), t);
	    }
	    
	    public void AddTransition(int eft, int lft, String n) {
	        //transitions.add(new Transition(eft, lft));
	    	Transition t;
	    	if(lft>=0){
	        t = new Transition(eft, lft,transitions.size());
	    	}
	    	else{
	    		//changed!
	    		t = new Transition(eft, false,transitions.size());
	    	}
	    	t.setName(n);
	        transitions.put(transitions.size(), t);
	    }

	    public void AddTransition(int eft, boolean lft) {
	        //transitions.add(new Transition(eft, lft));
	        Transition t = new Transition(eft, lft,transitions.size());
	        transitions.put(transitions.size(), t);
	    }

	    public void AddTransition(Transition t) {
	        transitions.put(transitions.size(), t);
	    }

	     
	    public void AddArc(int pnum, int tnum, boolean placetotrans, char variable) {
	        arcs.add(new Arc(places.get(pnum), transitions.get(tnum), placetotrans, variable));
	        transitions.get(tnum).addArc(arcs.get(arcs.size()-1));
	        
	    }

	    public void AddArc(int pnum, int tnum, boolean placetotrans, char variable, int w) {
	        arcs.add(new Arc(places.get(pnum), transitions.get(tnum), placetotrans, variable, w));
	        transitions.get(tnum).addArc(arcs.get(arcs.size()-1));
	    }

	    public void setPMarking(pMarking[] marks) throws Exception {
	        //массив, содержащий инт-числа, значение каждого элемента - количество 
	        //фишек в place, чей номер равен индексу числа в массиве
	    	//TODO replace marking for nested
	        if (marks.length == places.size()) {
	            for (int i = 0; i < marks.length; i++) {
	                places.get(i).setMarking(marks[i]);
	                
	            }
	        } else {
	            throw new Exception("Не то число фишек, сменить эксепшн");
	        }
	    }
	    
	    /*
	     public void setPMarking(int[] marks) throws Exception {
	        //массив, содержащий инт-числа, значение каждого элемента - количество 
	        //фишек в place, чей номер равен индексу числа в массиве
	    	//TODO replace marking foe nested
	        if (marks.length == places.size()) {
	            for (int i = 0; i < marks.length; i++) {
	                if (marks[i] >= 0) {
	                    places.get(i).setMarking(marks[i]);
	                } else {
	                    throw new Exception("Отрицательные фишки, сменить эксепшн");
	                }
	            }
	        } else {
	            throw new Exception("Не то число фишек, сменить эксепшн");
	        }
	    }
	     */
	    
	    /*
	    public void setPMarking(BigInteger[] marks) throws Exception {
	        //массив, содержащий инт-числа, значение каждого элемента - количество 
	        //фишек в place, чей номер равен индексу числа в массиве
	        if (marks.length == places.size()) {
	            for (int i = 0; i < marks.length; i++) {
	                if (marks[i].intValue() >= 0) {
	                    places.get(i).setMarking(marks[i].intValue());
	                } else {
	                    throw new Exception("Отрицательные фишки, сменить эксепшн");
	                }
	            }
	        } else {
	            throw new Exception("Не то число фишек, сменить эксепшн");
	        }
	    }
	    */

	    public void setInitialTMarking() {//CHECK!
	        Iterator i = transitions.values().iterator();
	        while (i.hasNext()) {
	            ((Transition) i.next()).setInintialTMarking();
	        }
	    }

	    public void getInintialState() {
	        Iterator i = places.keySet().iterator();
	        while (i.hasNext()) {
	            int temp = (int) i.next();
	            initialState.getpMark().put(temp, places.get(temp).getMarking());
	        }
	        i = transitions.keySet().iterator();
	        while (i.hasNext()) {
	            int temp = (int) i.next();
	            initialState.tMark.put(temp, transitions.get(temp).getCurTime());
	        }
	    }
	    public State getIS(){
	    	return initialState;
	    }

	    protected ArrayList<Transition> getAllTrans(){
	    	ArrayList<Transition> list = new ArrayList<Transition>();
	    	list.addAll(transitions.values());
	        for(Place pt:places.values()){
	        	if(pt.getMarking().getNets().size()>0){
	        		for(ElNet en:pt.getMarking().getNets()){
	        			list.addAll(en.getTransitions().values());
	    	        
	        		}
	        	}
	        }
	        return list;
	    }
	    protected ArrayList<Transition> getAllUnSTrans(){//not syncronized with each other
	    	ArrayList<Transition> list = new ArrayList<Transition>();
	    	for(Transition t:transitions.values()){
	    		if(t.isEnabled()){
	    			list.add(t);
	    		}
	    	}
	    	//list.addAll(transitions.values());
	        for(Place pt:places.values()){
	        	if(pt.getMarking().getNets().size()>0){
	        		for(ElNet en:pt.getMarking().getNets()){
	        			for(Transition tr:en.transitions.values()){
	        				if(tr.guardVar==null&&tr.isEnabled()){
	        					list.add(tr);
	        				}
	        			}	    	        
	        		}
	        	}
	        }
	        return list;
	    }
	    
	    public void elapseTime(int time) throws Exception {
	        Iterator it = getEnabledTransitions().iterator();
	        while (it.hasNext()) {
	            Transition t = (Transition) it.next();
	            t.elapseTime(time);
	        }
	    }
//	    public void elapseTime(int time) throws Exception {
//	        Iterator it = getEnabledTransitions().iterator();
//	        while (it.hasNext()) {
//	            Transition t = (Transition) it.next();
//	            t.elapseTime(time);
//	        }
//	    }

	    public void updateState() {
	    	//update system net
	        currentState = new State();
	        Iterator it = places.values().iterator();
	        while (it.hasNext()) {
	            Place pl = (Place) it.next();
	            currentState.getpMark().put(pl.getNumber(), pl.getMarking());
	        }
	        it = transitions.values().iterator();
	        while (it.hasNext()) {
	            Transition t = (Transition) it.next();
	            if(t.isEnabled()){
	            	if(t.getCurTime()<0){
	            		t.setCurTime(0);
	            	}
	            currentState.tMark.put(t.getNumber(), t.getCurTime());
	            }
	            else{
		            currentState.tMark.put(t.getNumber(), -1);
		            t.setCurTime(-1);
	            }
	        }
	        
	        //update all elnets
	        for(Place pt:places.values()){
	        	if(pt.getMarking().elNets.size()>0){
	        		for(ElNet en:pt.getMarking().elNets){
	        			en.updateState();
//	        			en.currentState = new State();
//	        			it = en.places.values().iterator();
//	        	        while (it.hasNext()) {
//	        	            Place pl = (Place) it.next();
//	        	            en.currentState.getpMark().put(pl.getNumber(), pl.getMarking());
//	        	        }
//	        	        it = en.transitions.values().iterator();
//	        	        while (it.hasNext()) {
//	        	            Transition t = (Transition) it.next();
//	        	            en.currentState.tMark.put(t.getNumber(), t.getCurTime());
//	        	        }
	        		}
	        	}
	        }
	    }

	    public void letInitialState() {
	        initialState = new State();
	        Iterator it = places.values().iterator();
	        while (it.hasNext()) {
	            Place pl = (Place) it.next();
	            initialState.getpMark().put(pl.getNumber(), pl.getMarking());
	        }
	        it = transitions.values().iterator();
	        while (it.hasNext()) {
	            Transition t = (Transition) it.next();
	            initialState.tMark.put(t.getNumber(), t.getCurTime());
	        }
	    }

	    public void setState(State st) {
	        Iterator it = st.getpMark().keySet().iterator();
	        while (it.hasNext()) {
	            Integer t = (Integer) it.next();
	            places.get(t).setMarking(st.getpMark().get(t));
	        }

	        it = st.tMark.keySet().iterator();
	        while (it.hasNext()) {
	            Integer t = (Integer) it.next();
	            transitions.get(t).setCurTime(st.tMark.get(t));
	        }
	        currentState = st;
	    }

	    
	    public List<Transition> getEnabledTransitions() { //TODO - vsync!
	        List<Transition> list = new ArrayList<Transition>();
	        Iterator it = transitions.values().iterator();
	        while (it.hasNext()) {
	            Transition t = (Transition) it.next();
	            if (t.isEnabled()) {
	                list.add(t);
	            }
	        }
	        for(Place pt:places.values()){
	        	if(pt.getMarking().elNets.size()>0){
	        		for(ElNet en:pt.getMarking().elNets){
	        		it = en.transitions.values().iterator();
	    	        while (it.hasNext()) {
	    	            Transition t = (Transition) it.next();
	    	            if (t.isEnabled()) {
	    	                list.add(t);
	    	            }
	    	        }
	        		}
	        	}
	        }
	        return list;
	    }
	    
	    public Map<Integer,Transition> getTransitions() { 
	        return transitions;
	    }
	    
//	    public List<Transition> getEnabledTransitions() { //TODO - vsync!
//	        List<Transition> list = new ArrayList<Transition>();
//	        Iterator it = transitions.values().iterator();
//	        while (it.hasNext()) {
//	            Transition t = (Transition) it.next();
//	            if (t.isEnabled()) {
//	                list.add(t);
//	            }
//	        }
//	        return list;
//	    }

	    public List<Transition> getFiniteTransitions(Collection<Transition> coll) {
	        List<Transition> list = new ArrayList<Transition>();
	        Iterator it = coll.iterator();
	        while (it.hasNext()) {
	            Transition t = (Transition) it.next();
	            if (t.getLft().isFinite()) {
	                list.add(t);
	            }
	        }
	        return list;
	    }
	    
	    
	    public Map<Integer, Place> getPlaces(){
	    	return places;
	    }
	    
	    public Place getPlaceByName(String s){
	    	for(Place p:places.values()){
	    		if(p.getName().equals(s)){
	    			return p;
	    		}
	    	}
	    	return null;
	    }
	    
	    public Transition getTransitionByName(String s){
	    	for(Transition t:transitions.values()){
	    		if(t.getName().equals(s)){
	    			return t;
	    		}
	    	}
	    	return null;
	    }
	    //utility methods end here
	    
	    
	    public class State {

	        //private HashMap<Integer, Integer> pMark = new HashMap<Integer, Integer>();
	    	private HashMap<Integer, pMarking> pMark = new HashMap<Integer, pMarking>();//TODO check first/second
	        HashMap<Integer, Integer> tMark = new HashMap<Integer, Integer>();

	        HashMap<Integer, pMarking> clonePMark(){
	        	HashMap<Integer, pMarking> pMark2=new HashMap<Integer, pMarking>();
	        	Iterator it =pMark.keySet().iterator();
	        	while (it.hasNext()) {
	        		Integer ind=(Integer) it.next();
		           pMark2.put(ind, pMark.get(ind).clone());
	        	}
	        	return pMark2;
	        }
	        
	        HashMap<Integer, pMarking> clonePMarkWON(){//without elnets
	        	HashMap<Integer, pMarking> pMark2=new HashMap<Integer, pMarking>();
	        	Iterator it =pMark.keySet().iterator();
	        	while (it.hasNext()) {
	        		Integer ind=(Integer) it.next();
		           pMark2.put(ind, pMark.get(ind).cloneWON());
	        	}
	        	return pMark2;
	        }
	        
	        public State clone() {
	            State ns = new State();
	            ///ns.setpMark((HashMap<Integer, pMarking>) pMark.clone());
	            ns.setpMark((HashMap<Integer, pMarking>) clonePMark());
	            ns.tMark = (HashMap<Integer, Integer>) tMark.clone();
	            return ns;
	        }
	        
	        public State cloneWON() {//clone state, but save elnets
	            State ns = new State();
	            ///ns.setpMark((HashMap<Integer, pMarking>) pMark.clone());
	            ns.setpMark((HashMap<Integer, pMarking>) clonePMarkWON());
	            ns.tMark = (HashMap<Integer, Integer>) tMark.clone();
	            return ns;
	        }

	        @Override
	        public boolean equals(Object o) {

	        	if(o==this){
	        		return true;
	        	}
	            if (o.getClass() != State.class) {
	                return false;
	            }
	            State s = (State) o;
	            if (s.getpMark().size() != getpMark().size()||s.tMark.size()!=s.tMark.size()) {
	                return false;
	            }
	            for(int i:getpMark().keySet()){
	            	//boolean fl=false;
	            	if(!getpMark().get(i).equals(s.getpMark().get(i))){
	            		return false;	
	            	}
//	            	if(!s.getpMark().values().contains(i)){//||!s.getpMark().get(i).equals(getpMark().get(i))){
//	            		return false;
//	            	}
	            }
//	            for(Integer i:getpMark().keySet()){
//	            	if(!s.getpMark().keySet().contains(i)||!s.getpMark().get(i).equals(getpMark().get(i))){
//	            		return false;
//	            	}
//	            }
	            for(Integer i:tMark.keySet()){
	            	if(!tMark.get(i).equals(s.tMark.get(i))){
	            		return false;	
	            	}
//	            	if(!s.tMark.keySet().contains(i)||!s.tMark.get(i).equals(tMark.get(i))){
//	            		return false;
//	            	}
	            }
	            

	            return true;
	            //CHECK equals for map
	        }
	    
	    
	    
	    int[] simNum = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61};

	    class GCDEntry {

	        //int divider;
	        int trNum;
	        boolean eft;
	        int extent;

	        public GCDEntry(int tr, boolean e, int ext) {
	            trNum = tr;
	            eft = e;
	            extent = ext;
	        }

	        public void addExt() {
	            extent++;
	        }

	        public boolean hasTrNum(int tr) {
	            return (trNum == tr);
	        }

	    }

	    class GCDList {

	        ArrayList<GCDEntry> list = new ArrayList<>();

	        public int indexOf(int tnum, boolean ef) {
	            for (int i = 0; i < list.size(); i++) {
	                if (list.get(i).hasTrNum(tnum)) {
	                    if (list.get(i).eft && ef) {
	                        return i;
	                    } else {
	                        return ++i; //check!!
	                    }
	                }
	            }
	            return -1;
	        }
	    }

	    class MyOwnInt {

	        int num;

	        public MyOwnInt(int a) {
	            num = a;
	        }

	        public void increment() {
	            num++;
	        }

	        public int intValue() {
	            return num;
	        }

	    }

	    public HashMap<Integer, MyOwnInt> recursiveGCD(int num, HashMap<Integer, MyOwnInt> list) {
	//делимое, делитель-степень
	        if (num == 1||num==0) {
	            return list;
	        }
	        for (int i = 0; i < simNum.length; i++) {
	            if (num % simNum[i] == 0) {
	                if (list.containsKey(simNum[i])) {
	                    list.get(simNum[i]).increment();
	                } else {
	                    list.put(simNum[i], new MyOwnInt(1));
	                }
	                return recursiveGCD(num /= simNum[i], list);
	            }
	        }
	        return list;
	    }

	    public int Min(ArrayList<Integer> list) {
	        int m = list.get(0);
	        for (int i = 1; i < list.size(); i++) {
	            if (m > list.get(i)) {
	                m = list.get(i);
	            }
	        }
	        return m;
	    }

	    public int GCD() {
	        //HashMap<Integer, HashMap<Integer, Integer>> simList
	        //HashMap<Integer, GCDList> simList
	        HashMap<Integer, ArrayList<Integer>> simList
	                = new HashMap<>();//число, №перехода, степень
	        int countednum=0;
	        Iterator it = transitions.values().iterator();
	        while (it.hasNext()) {
	            Transition tr = ((Transition) it.next());
	            HashMap<Integer, MyOwnInt> tMap
	                    = recursiveGCD(tr.getEft(), new HashMap<Integer, MyOwnInt>());
	            Iterator inIt = tMap.keySet().iterator();
	            while (inIt.hasNext()) {
	                int a = (int) inIt.next();
	                if (!simList.containsKey(a)) {
	                    simList.put(a, new ArrayList<Integer>());
	                }
	                simList.get(a).add(tMap.get(a).intValue());
	            }
	            if (tr.getLft().isFinite()) {
	                countednum++;
	                tMap = recursiveGCD(tr.getLft().getTime(), new HashMap<Integer, MyOwnInt>());
	                inIt = tMap.keySet().iterator();
	                while (inIt.hasNext()) {
	                    int a = (int) inIt.next();
	                    if (!simList.containsKey(a)) {
	                        simList.put(a, new ArrayList<Integer>());
	                    }
	                    simList.get(a).add(tMap.get(a).intValue());
	                }
	            }
	            if(tr.getEft()>0){
	                countednum++;
	            }
	        }//пройдены все переходы
	        it = simList.keySet().iterator();
	        int res = 1;
	        //int s = getFiniteTransitions(transitions.values()).size();
	        while (it.hasNext()) {
	            int a = (int) it.next();
	            //if (simList.get(a).size() == transitions.values().size() + s) {
	//ефт от всех переходов+лфт от конечных
	            if (simList.get(a).size() == countednum) {
	                int m = Min(simList.get(a));
	                for (int i = 0; i < m; i++) {
	                    res *= a;
	                }
	            }
	        }
	        return res;

	    }

	    public void divide(int gcd) {
	        Iterator it = transitions.values().iterator();
	        while (it.hasNext()) {
	            Transition t = (Transition) it.next();
	            t.setEft(t.getEft() / gcd);
	            if (t.getLft().isFinite()) {
	                t.getLft().setFiniteTime(t.getLft().getTime() / gcd);
	            }
	        }
	    }

	   
	    
	    public String toString(){
        	String s="p-marking: \n";
        	for(Integer a: getpMark().keySet()){
        		if(getpMark().get(a).elNets.size()>0){
        			s+=places.get(a).getName()+": ";
        			for(ElNet en:(getpMark().get(a).elNets)){
            			s+=en.getName()+"[";
        				for(Place pn:en.places.values()){
        					s+=pn.mark.regTokens+";";
        				}
    					s+="]";
        			}
        		}
        		else{
        		s+=places.get(a).getName()+": "+getpMark().get(a)+"; ";
        		}
        	}
        	s+="\nt-marking: \n";
        	for(Integer a: tMark.keySet()){
        		s+=transitions.get(a).getName()+": "+tMark.get(a)+"; ";
        	}
        	return s;
        }
	    
//	        public String toString(){
//	        	String s="p-marking: \n";
//	        	for(Integer a: getpMark().keySet()){
//	        		s+=a+": "+getpMark().get(a)+"; ";
//	        	}
//	        	s+="\nt-marking: \n";
//	        	for(Integer a: tMark.keySet()){
//	        		s+=a+": "+tMark.get(a)+"; ";
//	        	}
//	        	return s;
//	        }
	        
	    
	    public String toDot(){
        	String s="\"p:";
        	for(Integer a: getpMark().keySet()){
        		s+=places.get(a).getName()+": "+getpMark().get(a)+"; ";
        	}
        	s+=" t: ";
        	for(Integer a: tMark.keySet()){
        		s+=transitions.get(a).getName()+": "+tMark.get(a)+"; ";
        	}
        	s+="\"";
        	return s;
        }
	    
//	        public String toDot(){
//	        	String s="\"p:";
//	        	for(Integer a: getpMark().keySet()){
//	        		s+=a+": "+getpMark().get(a)+"; ";
//	        	}
//	        	s+=" t: ";
//	        	for(Integer a: tMark.keySet()){
//	        		s+=a+": "+tMark.get(a)+"; ";
//	        	}
//	        	s+="\"";
//	        	return s;
//	        }

			public HashMap<Integer, pMarking> getpMark() {
				return pMark;
			}

			public void setpMark(HashMap<Integer, pMarking> pMark) {
				this.pMark = pMark;
			}
	    }


	   

	    public int getLFTMin(Collection<Transition> coll) {
	        int min;
	        Iterator it = coll.iterator();
	        Transition t = (Transition) it.next();
	        min = t.getLft().getTime() - t.getCurTime();
	        while (it.hasNext()) {
	            t = (Transition) it.next();
	            int tmp = t.getLft().getTime() - t.getCurTime();
	            if (tmp < min) {
	                min = tmp;
	            }
	        }
	        return min;
	    }

	    public int getEFTMax(Collection<Transition> coll) {
	        int max;
	        Iterator it = coll.iterator();
	        Transition t = (Transition) it.next();
	        max = t.getEft() - t.getCurTime();
	        while (it.hasNext()) {
	            t = (Transition) it.next();
	            int tmp = t.getEft() - t.getCurTime();
	            if (tmp > max) {
	                max = tmp;
	            }
	        }

	        return max;
	    }
/*
	    public Graph getREIS() throws Exception {//algorythm
	        Graph reis = new Graph();
	        List<State> R = new ArrayList<State>();
	        letInitialState();
	        updateState();
	        R.add(initialState);
	        while (R.size() > 0) {
	            //State z = R.get(0).clone();
	            //TODO check clone needed
	        	State z = R.get(0);
	            R.remove(0);
	            reis.AddVertice(z);
	            setState(z);
	            List<Transition> enTrans = getEnabledTransitions();
	            if (!enTrans.isEmpty()) {
	                List<Transition> finTrans = getFiniteTransitions(enTrans);
	                int k;
	                if (!finTrans.isEmpty()) {
	                    k = getLFTMin(finTrans);
	                } else {
	                    k = getEFTMax(enTrans);
	                }
	                State znew = null;

	                for (int time = 0; time <= k; time++) {
	                    Iterator it = transitions.values().iterator();
	                    while (it.hasNext()) {
	                        Transition t = (Transition) it.next();
	                        if (t.isReady(time)) {
	                            elapseTime(time);
	                            transitions.get(t.getNumber()).activate();
	                            //znew = currentState.clone();
	                            znew = currentState;
	                            updateState();
	                            reis.AddEdge(znew, currentState, t, time);//clone t?
	                            Iterator iter = reis.getVertices().keySet().iterator();
	                            boolean fl = true;
	                            while (iter.hasNext()) {
	                                if (((State) iter.next()).equals(currentState)) {
	                                    fl = false;
	                                    break;
	                                }

	                            }

	                            //если последний?
	                            if (fl && !R.contains(currentState)) {
	                                //R.add(currentState.clone()); //clone?
	                            	R.add(currentState);
	                            	System.out.println(reis.getVertices().size()+"added");
	                            }
	                            setState(znew);
	                            // setState(initialState);
	                        }
	                    }
	                }
	                // if(znew!=null){
	                //setState(znew);
	                // }
	            }
	          

	        }
	        setState(initialState);

	        return reis;
	    }
	    */
//	    public String toDot(Graph g){
//	    	String s="<graph>\ndigraph G{\n";
//	    	
//	    	for(Graph.Edge ed: g.getEdges()){
//	    		s+=ed.getSt1().toDot()+"->"+ed.getSt2().toDot()+"[label=\"t"+ed.getT().getNumber()+"\"]\n";    		
//	    	}    	    	
//	    	s+="}\n</graph>";
//	    	return s;
//	    }
	    
	    
	    public String toDot(Graph g){
	    	String s="\ndigraph G{\n";
	    	
	    	for(Graph.Edge ed: g.getEdges()){
	    		s+=ed.getSt1().toDot()+"->"+ed.getSt2().toDot()+"[label=\""+ed.getT().getName()+":"+ed.getTime()+"\"]\n";    		
	    	}    	    	
	    	s+="}\n";
	    	return s;
	    }
//	    public String toDot(Graph g){
//	    	String s="<graph>\ndigraph G{\n";
//	    	
//	    	for(Graph.Edge ed: g.getEdges()){
//	    		s+=ed.getSt1().toDot()+"->"+ed.getSt2().toDot()+"[label=\""+ed.getT().getName()+":"+ed.getTime()+"\"]\n";    		
//	    	}    	    	
//	    	s+="}\n</graph>";
//	    	return s;
//	    }
	    
	    
	    public boolean containsEnabledVsync(String vsync){
	    	List<Transition> tempList=getEnabledTransitions();
	    	if(vsync==null){//no vs, just check, that net doesnt contain any
	    		for(Transition tmp:tempList){//TODO really no need for disabled check?
	    			if(tmp.guardVar!=null){
	    				return false;//this net wants sync on trans
	    			}
	    		}
	    		return true;
	    	}
	    	
	    	for(int i=0; i<tempList.size();i++){
	    		if(tempList.get(i).guardVar!=null&&tempList.get(i).guardVar.equals(vsync)) return true;//TODO check equals 
	    	}
	    	return false;
	    }
	   
	    public String getName(){
	    	return name;
	    }
	

}
