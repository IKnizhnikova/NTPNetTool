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
}; 
public abstract CompOperators not(); 
}