package model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.parts.Arc;
import model.parts.ElNet;
import model.parts.Place;
import model.parts.Transition;
import algorithms.Graph;
import algorithms.Graph.Edge;

public class NTPNet extends ElNet{
	protected Map<String, ElNet> elNets = new HashMap<String, ElNet>();//структура сетей
	
	public ElNet getENByName(String s){
		return elNets.get(s);
	}
	
	public Map<String, ElNet> getElNets(){
		return elNets;
	}
	
	public void addElNet(ElNet en){
		elNets.put(en.getName(), en);
	}
	//high-level net


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
     
    
    private Transition findTrByName(String n){
    	ArrayList<Transition> at=getAllTrans();
    	for(Transition tr: at){
    		if(tr.getName().equals(n)) return tr;
    	}
    	return null; //TODO fix
    }
  
    
    public Graph getREIS() throws Exception {//algorythm
        Graph reis = new Graph();
        List<State> R = new ArrayList<State>();
        letInitialState();
        updateState();
        R.add(initialState.clone());
        while (R.size() > 0) {
            //State z = R.get(0).clone();
            //TODO check clone needed
        	State z = R.get(0);
            R.remove(0);
            State tmp=z.clone();
            reis.AddVertice(tmp);
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
                State znew = currentState.clone();

                for (int time = 0; time <= k; time++) {
                    //Iterator it = transitions.values().iterator();
                	ArrayList<Transition> arrl=getAllUnSTrans();
                	Iterator it =getAllUnSTrans().iterator();
                    while (it.hasNext()) {
                        //Transition t = (Transition) it.next();
                    	Transition t = findTrByName(((Transition) it.next()).getName());
                        if (t.isReady(time)) {
                        	
                            elapseTime(time);  
                            t.activate();
                            //transitions.get(t.getNumber()).activate();
                            //znew = currentState;
                            updateState();
                            //reis.AddEdge(znew, currentState, t, time);//clone t?
                            reis.AddEdge(tmp, currentState, t, time);//clone t?
                            Iterator iter = reis.getVertices().keySet().iterator();
                            boolean fl = true;
                            while (iter.hasNext()) {
                                if (((State) iter.next()).equals(currentState)) {
                                    fl = false;
                                    break;
                                }

                            }
                            
                            //если последний?
                            if (fl){
                            	boolean tmps=true;
                            	         for(State s:R){
                            	        	 if(s.equals(currentState)){
                            	        		 tmps=false; break;
                            	        	 }
                            	         }
                            	         if(tmps)
                            	         {
                                R.add(currentState.clone()); //clone?
                            	//R.add(currentState);
                            	System.out.println(reis.getVertices().size()+"added");
                            	System.out.println(currentState);
                                //System.out.println(t.getName()+" "+time+" "+currentState.toDot());
                            }
                            }

//                            //если последний?
//                            if (fl && !R.contains(currentState)) {
//                                R.add(currentState.clone()); //clone?
//                            	//R.add(currentState);
//                            	System.out.println(reis.getVertices().size()+"added");
//                            	System.out.println(currentState);
//                                //System.out.println(t.getName()+" "+time+" "+currentState.toDot());
//                            }
                           // setState(znew);
                            setState(znew.clone());//чтобы без повторений 
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
        
        for(Edge e:reis.getEdges()){
        	boolean efl=false;
        	for(State s:reis.getVertices().keySet()){
        		if(e.getSt2().equals(s)){
        			efl=true;
        			break;
        		}
        	}
        	if(!efl){
        		reis.AddVertice(e.getSt2());
        	}
        }

        return reis;
    }
    
//    public Graph getREIS() throws Exception {//algorythm
//        Graph reis = new Graph();
//        List<State> R = new ArrayList<State>();
//        letInitialState();
//        updateState();
//        R.add(initialState);
//        while (R.size() > 0) {
//            //State z = R.get(0).clone();
//            //TODO check clone needed
//        	State z = R.get(0);
//            R.remove(0);
//            State tmp=z.clone();
//            reis.AddVertice(tmp);
//            setState(z);
//            List<Transition> enTrans = getEnabledTransitions();
//            if (!enTrans.isEmpty()) {
//                List<Transition> finTrans = getFiniteTransitions(enTrans);
//                int k;
//                if (!finTrans.isEmpty()) {
//                    k = getLFTMin(finTrans);
//                } else {
//                    k = getEFTMax(enTrans);
//                }
//                State znew = currentState.clone();
//
//                for (int time = 0; time <= k; time++) {
//                    Iterator it = transitions.values().iterator();
//                    while (it.hasNext()) {
//                        Transition t = (Transition) it.next();
//                        if (t.isReady(time)) {
//                        	
//                            elapseTime(time);          
//                            transitions.get(t.getNumber()).activate();
//                            //znew = currentState;
//                            updateState();
//                            //reis.AddEdge(znew, currentState, t, time);//clone t?
//                            reis.AddEdge(tmp, currentState, t, time);//clone t?
//                            Iterator iter = reis.getVertices().keySet().iterator();
//                            boolean fl = true;
//                            while (iter.hasNext()) {
//                                if (((State) iter.next()).equals(currentState)) {
//                                    fl = false;
//                                    break;
//                                }
//
//                            }
//
//                            //если последний?
//                            if (fl && !R.contains(currentState)) {
//                                //R.add(currentState.clone()); //clone?
//                            	R.add(currentState);
//                            	System.out.println(reis.getVertices().size()+"added");
//                            }
//                           // setState(znew);
//                            setState(znew.clone());//чтобы без повторений 
//                            // setState(initialState);
//                        }
//                    }
//                }
//                // if(znew!=null){
//                //setState(znew);
//                // }
//            }
//            /*
//             Iterator it = transitions.values().iterator();
//             while(it.hasNext()){
//             Transition t=(Transition)it.next();
//             if(t.isEnabled()){
//             if(t.lft.isFinite()){
//                     
//             }
//             else{
//                     
//             }
//             }
//             }
//             */
//
//        }
//        setState(initialState);
//
//        return reis;
//    }
    
    
    
    

}
