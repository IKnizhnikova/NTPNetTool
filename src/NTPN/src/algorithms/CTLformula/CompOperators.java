package algorithms.CTLformula;

public enum CompOperators{
	LEQ{ 
        public CompOperators not() { return SMALLER; } 
   }, 
   LARGER{ 
       public CompOperators not() { return SEQ; } 
  }, 
  EQUAL{ 
      public CompOperators not() { return NEQ; } 
 }, 
 SMALLER{ 
     public CompOperators not() { return LEQ; } 
}, 
SEQ{ 
    public CompOperators not() { return LARGER; } 
}, 
NEQ{ 
    public CompOperators not() { return EQUAL; } 
}, 
HAS{ 
    public CompOperators not() { return HAS; } 
};  
public abstract CompOperators not();
public static CompOperators fromStr(String s){
	switch (s){
	case ">":return LARGER;
	case ">=":return LEQ;
	case "=":return EQUAL;
	case "!=":return NEQ;
	case "<=":return SEQ;
	case "<":return SMALLER;
	case "includes":return HAS;
	}
	return null;//TODO
}
}