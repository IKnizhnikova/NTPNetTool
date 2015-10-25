package model;

import model.parts.ElNet;

public class IntegerTime {


	        

	        boolean finite = true;
	        int lft = 0;

	        public IntegerTime clone() {
	            IntegerTime t = new IntegerTime();
	            t.finite = finite;
	            t.lft = lft;
	            return t;
	        }
	        public boolean equals(Object o){
	        	if (o.getClass() != IntegerTime.class) {
		            return false;
		        }
	        	if(((IntegerTime)o).finite!=finite||((IntegerTime)o).lft!=lft){
	        		return false;
	        	}
	        	return true;
	        	
	        }
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
