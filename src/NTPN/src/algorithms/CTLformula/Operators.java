package algorithms.CTLformula;

public enum Operators {
	    NOT{
		public String toStr(){return "!";}
	    }, 
	    AND{
	    public String toStr(){return "&";}
	    }, 
	    OR{
		public String toStr(){return "|";}
		}, IMPL{
			public String toStr(){return "=>";}
		}, AF{
			public String toStr(){return "AF";}
		}, AX{
			public String toStr(){return "AX";}
		}, EF{
			public String toStr(){return "EF";}
		}, EX{
			public String toStr(){return "EX";}
		}, AG{
			public String toStr(){return "AG";}
		}, EG{
			public String toStr(){return "EG";}
		}, E{
			public String toStr(){return "E";}
		}, A{
			public String toStr(){return "A";}
		}, U{
			public String toStr(){return "U";}
		};

public static Operators fromStr(String s){
	switch (s){
	case "!":return NOT;
	case "&":return AND;
	case "|":return OR;
	case "=>":return IMPL;
	case "AF":return AF;
	case "AX":return AX;
	case "AG":return AG;
	case "EF":return EF;
	case "EX":return EX;
	case "EG":return EG;	
	case "E":return E;
	case "A":return A;
	case "U":return U;
	}
	return null;//TODO
}
public abstract String toStr();
}
