package algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Соланж
 */
public class TPNet {
    //определить сравнение для массивов-маркировок

    //List<Place> places=new ArrayList<Place>();
    Map<Integer, Place> places = new HashMap<Integer, Place>();
    //Really needed?
    //List<Transition> transitions=new ArrayList<Transition>();
    Map<Integer, Transition> transitions = new HashMap<Integer, Transition>();
    List<Arc> arcs = new ArrayList<Arc>();
    State currentState = new State();
    State initialState = new State();


    
    @Override
    public TPNet clone() {
        TPNet nNet = new TPNet();
        for (int i = 0; i < arcs.size(); i++) {
            Arc a = arcs.get(i).clone();
            nNet.arcs.add(a);
        }
        Iterator it = places.values().iterator();
        while (it.hasNext()) {
            nNet.AddPlace(((Place) it.next()).clone(nNet.arcs));
        }
        it = transitions.values().iterator();
        while (it.hasNext()) {
            nNet.AddTransition(((Transition) it.next()).clone(nNet.arcs));
        }

        //NO STATE STILL!!
        return nNet;
    }

    public String toString(){
        String s="";
        Iterator it=transitions.values().iterator();
        while(it.hasNext()){
            Transition t=(Transition)it.next();
            s+="\nTransition "+t.number+" inner arcs:";
            for(int i=0; i<t.inArc.size();i++){
                s+=t.inArc.get(i).placeNumber+", ";
            }
            s+="\nTransition "+t.number+" outer arcs:";
            for(int i=0; i<t.outArc.size();i++){
                s+=t.outArc.get(i).placeNumber+", ";
            }
        }
        return s;
    }
    
    public class Place {

        int mark = 0; //фишки
        int number;
        List<Arc> outArc = new ArrayList<Arc>();
        //List<Transition> transitions=new ArrayList<Transition>();

        public Place() {
            number = places.size();
        }

        public Place clone(List<Arc> arc) {
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

        public void getMarks(int amount) {
            if (amount <= mark) {
                mark -= amount;
                for (int i = 0; i < outArc.size(); i++) {
                    transitions.get(outArc.get(i).transitionNumber).setInintialTMarking();
                }
            }
            //except
        }

        public void setMarks(int amount) {
            mark += amount;
            for (int i = 0; i < outArc.size(); i++) {
                if (transitions.get(outArc.get(i).transitionNumber).isEnabled()) {
                    transitions.get(outArc.get(i).transitionNumber).setInintialTMarking();
                }
            }
        }

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

    }

    class IntegerTime {

        public IntegerTime clone() {
            IntegerTime t = new IntegerTime();
            t.finite = finite;
            t.lft = lft;
            return t;
        }

        boolean finite = true;
        int lft = 0;

        public void setFiniteTime(int t) {
            lft = t;
            finite = true;
        }

        public void setInfiniteTime() {
            lft = 0;
            finite = false;
        }

        public boolean isFinite() {
            return finite;
        }

        public int getTime() {
            return lft; //be aware!
        }

        public String getStringTime() {
            if (finite) {
                return "" + lft;
            }
            return "Infinite";
        }
    }

    public class Transition {

        IntegerTime lft = new IntegerTime();
        int number;
        int eft;
        //double lft; //TODO!
        int currentTime = -1; //if negative - transition is inactive
        ArrayList<Arc> inArc = new ArrayList<Arc>();
        ArrayList<Arc> outArc = new ArrayList<Arc>();

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

        public Transition(int et, int lt) {
            if (et > lt) {
                //throw new Exception("eft < lft. Change it and i'll change this exc");
                System.err.print("eft < lft");
            }
            number = transitions.size();
            eft = et;
            lft.setFiniteTime(lt);
        }

        public Transition(int et, boolean lt) {
            number = transitions.size();
            eft = et;
            lft.setInfiniteTime();
        }

        public Transition(int et, IntegerTime lt, int num) {
            number = num;
            eft = et;
            lft = lt.clone();

        }
        
        public int getNumber(){
        	return number;
        }

        public boolean isEnabled() {
            for (int i = 0; i < inArc.size(); i++) {
                if (inArc.get(i).weight > inArc.get(i).getPlace().mark) {
                    return false;
                }
            }
            return true;
        }

        public boolean isReady() {
            if (isEnabled()) {
                if (currentTime >= eft && (!lft.isFinite()
                        || currentTime <= lft.getTime())) { //переопределить сравнение
                    return true;
                }
            }
            return false;
        }

        public boolean isReady(int time) {
            if (isEnabled()) {
                if (currentTime + time >= eft && (!lft.isFinite()
                        || currentTime + time <= lft.getTime())) { //переопределить сравнение
                    return true;
                }
            }
            return false;
        }

        public void elapseTime(int time) throws Exception {
            if (!lft.isFinite() || currentTime + time <= lft.getTime()) {
                currentTime += time;
            } else {
                throw new Exception(
                        "Error while activating t"+number+ 
                                " time can not elapse without activating transition" 
                                + number);
            }
        }

        public void activate() throws Exception {
            if (isReady()) {
                for (int i = 0; i < inArc.size(); i++) {
                    inArc.get(i).activate();
                }
                for (int i = 0; i < outArc.size(); i++) {
                    outArc.get(i).activate();
                }
            } else {
                throw new Exception("can not be activated");
            }
        }
        /*
         public int getPreArcsSumm() {
         int summ = 0;
         for (int i = 0; i < inArc.size(); i++) {
         summ += inArc.get(i).weight;
         }
         return summ;
         }

         public int getPrePlacesSumm() {
         int summ = 0;
         for (int i = 0; i < inArc.size(); i++) {
         summ += places.get(inArc.get(i).placeNumber).mark;
         }
         return summ;
         }
         */

        public void setInintialTMarking() {
            //if (getPreArcsSumm() <= getPrePlacesSumm()) {
            if (isEnabled()) {
                currentTime = 0;
            } else {
                currentTime = -1;
            }
        }

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
    }

    // May not be needed, but according to rhe formal definition should be
    class Arc {

        int placeNumber;
        int transitionNumber;
        boolean placeToTransition;
        int weight = 1;

        public Arc clone() {
            return new Arc(placeNumber, transitionNumber, placeToTransition, weight);
        }

        public Arc(int pnum, int tnum, boolean placetotrans) {
            placeNumber = pnum;
            transitionNumber = tnum;
            placeToTransition = placetotrans;
            //be aware!!!
            if (placetotrans) {
                transitions.get(tnum).inArc.add(this);
                places.get(pnum).outArc.add(this);
            } else {
                transitions.get(tnum).outArc.add(this);
            }
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

        public Place getPlace() {
            return places.get(placeNumber);
        }

        public void activate() {
            if (placeToTransition) {
                places.get(placeNumber).getMarks(weight);
            } else {
                places.get(placeNumber).setMarks(weight);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (o.getClass() != Arc.class) {
                return false;
            }
            Arc a = (Arc) o;
            if (a.placeNumber != placeNumber
                    || a.transitionNumber != transitionNumber
                    || a.placeToTransition != placeToTransition
                    || a.weight != weight) {
                return false;
            }

            return true;
        }
    }

    //definition ends here
    public void AddPlace() {
        //places.add(new Place());
        Place p = new Place();
        places.put(p.number, p);
    }

    public void AddPlace(Place pl) {
        places.put(pl.number, pl);
    }

    public void AddPlace(Place pl, Place[] selected, Map<Integer, Place> parentPlaces,
             Map<Integer, Transition> ptransitions) {
        Place p = new Place();
        //(Place p1, Place p2, List<Arc> arc) {//1-target, 2-source

        p.mark = pl.mark;
        p.number = pl.number;
        p.outArc = new ArrayList<Arc>();
        for (int i = 0; i < pl.outArc.size(); i++) {
            Transition t=ptransitions.get(pl.outArc.get(i).transitionNumber);
            for(int j=0; j<t.outArc.size(); j++){
            //if (parentPlaces.get(pl.outArc.get(i).placeNumber).isPartOf(selected)) {
              if (parentPlaces.get(t.outArc.get(j).placeNumber).isPartOf(selected) 
                      && !p.outArc.contains(pl.outArc.get(i))) {
                p.outArc.add(new Arc(pl.outArc.get(i)));
            }
        }
        }
        places.put(p.number, p);
    }

    public void AddTransition(int eft, int lft) {
        //transitions.add(new Transition(eft, lft));
    	Transition t;
    	if(lft>=0){
        t = new Transition(eft, lft);
    	}
    	else{
    		//changed!
    		t = new Transition(eft, false);
    	}
        transitions.put(t.number, t);
    }

    public void AddTransition(int eft, boolean lft) {
        //transitions.add(new Transition(eft, lft));
        Transition t = new Transition(eft, lft);
        transitions.put(t.number, t);
    }

    public void AddTransition(Transition t) {
        transitions.put(t.number, t);
    }

    public void AddTransitionToPart(Transition t) {
        //transitions.put(t.number, t);
        Transition res = new Transition(t.eft, t.lft, t.number);
        //(Place p1, Place p2, List<Arc> arc) {//1-target, 2-source     
        for (int i = 0; i < t.outArc.size(); i++) {
            res.outArc.add(new Arc(t.outArc.get(i)));
        }
        for (int i = 0; i < t.inArc.size(); i++) {
            res.inArc.add(arcs.get(arcs.indexOf(t.inArc.get(i))));
        }//CHECK IT! (Exceptions?)
        transitions.put(res.number, res);
        arcs.addAll(res.outArc);
        //places.put(p.number, p);
    }

    public void AddArc(int pnum, int tnum, boolean placetotrans) {
        arcs.add(new Arc(pnum, tnum, placetotrans));
    }

    public void AddArc(int pnum, int tnum, boolean placetotrans, int w) {
        arcs.add(new Arc(pnum, tnum, placetotrans, w));
    }

    public void setPMarking(int[] marks) throws Exception {
        //массив, содержащий инт-числа, значение каждого элемента - количество 
        //фишек в place, чей номер равен индексу числа в массиве
        if (marks.length == places.size()) {
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] >= 0) {
                    places.get(i).mark = marks[i];
                } else {
                    throw new Exception("Отрицательные фишки, сменить эксепшн");
                }
            }
        } else {
            throw new Exception("Не то число фишек, сменить эксепшн");
        }
    }
    
    public void setPMarking(BigInteger[] marks) throws Exception {
        //массив, содержащий инт-числа, значение каждого элемента - количество 
        //фишек в place, чей номер равен индексу числа в массиве
        if (marks.length == places.size()) {
            for (int i = 0; i < marks.length; i++) {
                if (marks[i].intValue() >= 0) {
                    places.get(i).mark = marks[i].intValue();
                } else {
                    throw new Exception("Отрицательные фишки, сменить эксепшн");
                }
            }
        } else {
            throw new Exception("Не то число фишек, сменить эксепшн");
        }
    }

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
            initialState.pMark.put(temp, places.get(temp).mark);
        }
        i = transitions.keySet().iterator();
        while (i.hasNext()) {
            int temp = (int) i.next();
            initialState.tMark.put(temp, transitions.get(temp).currentTime);
        }
    }

    public void elapseTime(int time) throws Exception {
        Iterator it = getEnabledTransitions().iterator();
        while (it.hasNext()) {
            Transition t = (Transition) it.next();
            t.elapseTime(time);
        }
    }

    public void updateState() {
        currentState = new State();
        Iterator it = places.values().iterator();
        while (it.hasNext()) {
            Place pl = (Place) it.next();
            currentState.pMark.put(pl.number, pl.mark);
        }
        it = transitions.values().iterator();
        while (it.hasNext()) {
            Transition t = (Transition) it.next();
            currentState.tMark.put(t.number, t.currentTime);
        }
    }

    public void letInitialState() {
        initialState = new State();
        Iterator it = places.values().iterator();
        while (it.hasNext()) {
            Place pl = (Place) it.next();
            initialState.pMark.put(pl.number, pl.mark);
        }
        it = transitions.values().iterator();
        while (it.hasNext()) {
            Transition t = (Transition) it.next();
            initialState.tMark.put(t.number, t.currentTime);
        }
    }

    public void setState(State st) {
        Iterator it = st.pMark.keySet().iterator();
        while (it.hasNext()) {
            Integer t = (Integer) it.next();
            places.get(t).mark = st.pMark.get(t);
        }

        it = st.tMark.keySet().iterator();
        while (it.hasNext()) {
            Integer t = (Integer) it.next();
            transitions.get(t).currentTime = st.tMark.get(t);
        }
        currentState = st;
    }

    //utility methods end here
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
                    = recursiveGCD(tr.eft, new HashMap<Integer, MyOwnInt>());
            Iterator inIt = tMap.keySet().iterator();
            while (inIt.hasNext()) {
                int a = (int) inIt.next();
                if (!simList.containsKey(a)) {
                    simList.put(a, new ArrayList<Integer>());
                }
                simList.get(a).add(tMap.get(a).intValue());
            }
            if (tr.lft.isFinite()) {
                countednum++;
                tMap = recursiveGCD(tr.lft.getTime(), new HashMap<Integer, MyOwnInt>());
                inIt = tMap.keySet().iterator();
                while (inIt.hasNext()) {
                    int a = (int) inIt.next();
                    if (!simList.containsKey(a)) {
                        simList.put(a, new ArrayList<Integer>());
                    }
                    simList.get(a).add(tMap.get(a).intValue());
                }
            }
            if(tr.eft>0){
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
            t.eft /= gcd;
            if (t.lft.finite) {
                t.lft.setFiniteTime(t.lft.getTime() / gcd);
            }
        }
    }

    public TPNet takeNetPart(Place[] pl) {
        TPNet Net = new TPNet();
        for (int i = 0; i < pl.length; i++) {
            //Net.AddPlace(pl[i].clone(arcs));
            Net.AddPlace(pl[i], pl, places, transitions);

        }
        Iterator it = Net.places.values().iterator();
        while (it.hasNext()) {
            Place p = (Place) it.next();
            for (int i = 0; i < p.outArc.size(); i++) {
                Arc a = p.outArc.get(i);
                for(int j=0; j<transitions.get(a.transitionNumber).outArc.size();j++){
                    if(Net.places.containsKey(transitions.get(a.transitionNumber).outArc.get(j).placeNumber)){
                        Net.arcs.add(a);
                        break;
                    }
                }               
                
                if(Net.arcs.contains(a)){
                if (Net.transitions.containsKey(a.transitionNumber)) {
                    Net.transitions.get(a.transitionNumber).inArc.add(a);
                } else {
                    Transition t = transitions.get(a.transitionNumber).takePartially(pl, a);
                    //Net.AddTransition(t);
                    Net.AddTransitionToPart(t);
                    //Net.arcs.addAll(t.outArc);
                }
                }
            }
        }
        Net.letInitialState();
        return Net;
    }

    public class State {

        HashMap<Integer, Integer> pMark = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> tMark = new HashMap<Integer, Integer>();

        public State clone() {
            State ns = new State();
            ns.pMark = (HashMap<Integer, Integer>) pMark.clone();
            ns.tMark = (HashMap<Integer, Integer>) tMark.clone();
            return ns;
        }

        @Override
        public boolean equals(Object o) {
            if (o.getClass() != State.class) {
                return false;
            }
            State s = (State) o;
            if (s.pMark.size() != pMark.size()||s.tMark.size()!=s.tMark.size()) {
                return false;
            }
            for(Integer i:pMark.keySet()){
            	if(!s.pMark.keySet().contains(i)||!s.pMark.get(i).equals(pMark.get(i))){
            		return false;
            	}
            }
            for(Integer i:tMark.keySet()){
            	if(!s.tMark.keySet().contains(i)||!s.tMark.get(i).equals(tMark.get(i))){
            		return false;
            	}
            }

            return true;
            //CHECK equals for map
        }
        
//        @Override
//        public boolean equals(Object o) {
//            if (o.getClass() != State.class) {
//                return false;
//            }
//            State s = (State) o;
//            if (!s.pMark.equals(pMark) || !s.tMark.equals(tMark)) {
//                return false;
//            }
//            return true;
//            //CHECK equals for map
//        }
        
        public String toString(){
        	String s="p-marking: \n";
        	for(Integer a: pMark.keySet()){
        		s+=a+": "+pMark.get(a)+"; ";
        	}
        	s+="\nt-marking: \n";
        	for(Integer a: tMark.keySet()){
        		s+=a+": "+tMark.get(a)+"; ";
        	}
        	return s;
        }
        
        public String toDot(){
        	String s="\"p:";
        	for(Integer a: pMark.keySet()){
        		s+=a+": "+pMark.get(a)+"; ";
        	}
        	s+=" t: ";
        	for(Integer a: tMark.keySet()){
        		s+=a+": "+tMark.get(a)+"; ";
        	}
        	s+="\"";
        	return s;
        }
    }

    /*public class Graph {

        Map<State, Vertice> vertices = new HashMap<State, Vertice>();
        List<Edge> edges = new ArrayList<Edge>();

        class Vertice {

            List<Edge> edges = new ArrayList<Edge>();
            State st;//что содержит

            public Vertice(State s) {
                st = s.clone();
            }
            
        }

        public class Edge {
            //Vertice[] vertices=new Vertice[2];

            State st1;
            State st2;
            Transition t;
            double time;

            public Edge(State s1, State s2, Transition trans, double tim) {
                st1 = s1;
                st2 = s2;
                t = trans;
                time = tim;
            }
            
            public State from(){
            	return st1;
            }
            
            public State to(){
            	return st2;
            }
            
            public Transition getTrans(){
            	return t;
            }
            
            public double getTime(){
            	return time;
            }
            
           
        }

        public void AddVertice(State st) {
            vertices.put(st, new Vertice(st));
        }

        public void AddEdge(State s1, State s2, Transition trans, double time) {
            //Edge e = new Edge(s1, s2, trans, time);
            edges.add(new Edge(s1.clone(), s2.clone(), trans, time));
            //vertices.get(s1).edges.add(e);
            //vertices.get(s2).edges.add(e);
        }
        
        public List<Edge> getEdges(){
        	return edges;
        }
        
        public Map<State,Vertice> getVertices(){
        	return vertices;
        }
        
        
    }// class Graph definition ends here
*/
    public List<Transition> getEnabledTransitions() {
        List<Transition> list = new ArrayList<Transition>();
        Iterator it = transitions.values().iterator();
        while (it.hasNext()) {
            Transition t = (Transition) it.next();
            if (t.isEnabled()) {
                list.add(t);
            }
        }
        return list;
    }

    public List<Transition> getFiniteTransitions(Collection<Transition> coll) {
        List<Transition> list = new ArrayList<Transition>();
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            Transition t = (Transition) it.next();
            if (t.lft.isFinite()) {
                list.add(t);
            }
        }
        return list;
    }

    public int getLFTMin(Collection<Transition> coll) {
        int min;
        Iterator it = coll.iterator();
        Transition t = (Transition) it.next();
        min = t.lft.getTime() - t.currentTime;
        while (it.hasNext()) {
            t = (Transition) it.next();
            int tmp = t.lft.getTime() - t.currentTime;
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
        max = t.eft - t.currentTime;
        while (it.hasNext()) {
            t = (Transition) it.next();
            int tmp = t.eft - t.currentTime;
            if (tmp > max) {
                max = tmp;
            }
        }

        return max;
    }

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
                            transitions.get(t.number).activate();
                            //znew = currentState.clone();
                            znew = currentState;
                            updateState();
                            reis.AddEdge(znew, currentState, t, time);//clone t?
                            Iterator iter = reis.vertices.keySet().iterator();
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
                            	System.out.println(reis.vertices.size()+"added");
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
            /*
             Iterator it = transitions.values().iterator();
             while(it.hasNext()){
             Transition t=(Transition)it.next();
             if(t.isEnabled()){
             if(t.lft.isFinite()){
                     
             }
             else{
                     
             }
             }
             }
             */

        }
        setState(initialState);

        return reis;
    }
    
    public String toDot(Graph g){
    	String s="<graph>\ndigraph G{\n";
    	
    	for(Graph.Edge ed: g.getEdges()){
    		s+=ed.st1.toDot()+"->"+ed.st2.toDot()+"[label=\"t"+ed.t.number+"\"]\n";    		
    	}    	    	
    	s+="}\n</graph>";
    	return s;
    }
    
    public Map<Integer, Place> getPlaces(){
    	return places;
    }
    
}
