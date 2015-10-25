package algorithms.CTLformula;

import java.util.ArrayList;

public class CTLFormula implements IformulaElement {
	String symbolic;
	int depth;
	IformulaElement highElement;
	Operators operator=null;
	String type="formula";
	CTLFormula first=null;
	CTLFormula second=null;
	Operators operatorAdd=null;
	
	public CTLFormula getFirst(){
		return first;
		//TODO null
	}
	
	public CTLFormula getSecond(){
		return second;
		//TODO
	}
	
	public Operators getOperator(){
		return operator;
		//TODO
	}
	
	public CTLFormula(AtomicPredicate ap){
		symbolic=ap.getSymbolic();
		type=ap.getType();
		highElement=ap;
		depth=1;
	}
	
	public CTLFormula(Operators op, CTLFormula f, String st){
		switch(op){
		case AX:{
			CTLFormula temp1=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
			first=new CTLFormula(Operators.EX, temp1,"EX("+temp1.getSymbolic()+")");
			operator=Operators.NOT;
			symbolic="!("+first.getSymbolic()+")";
			depth=f.depth+3;
			break;
			
		}
		case EG:{
			CTLFormula temp1=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
			first=new CTLFormula(Operators.AF, temp1,"AF("+temp1.getSymbolic()+")");
			operator=Operators.NOT;
			symbolic="!("+first.getSymbolic()+")";
			depth=f.depth+3;
			break;
			
		}
		case AG:{
			CTLFormula temp1=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
			first=new CTLFormula(Operators.EF, temp1,"EF("+temp1.getSymbolic()+")");
			operator=Operators.NOT;
			symbolic="!("+first.getSymbolic()+")";
			depth=f.depth+3;
			break;
			
		}
		case EF:{//TODO check carefully!
			first=new CTLFormula(new AtomicPredicate("1"));
			second=f;
					//new CTLFormula(Operators.E, temp1, Operators.U,f, "E(("+"1)U("+f.getSymbolic()+"))");
			operator=Operators.E;
			operatorAdd=Operators.U;
			symbolic="E(("+"1)U("+f.getSymbolic()+"))";
			depth=f.depth+2;
			break;
			
		}
		default:{
			symbolic=op.toStr()+"("+f.getSymbolic()+")";
			operator=op;
			first=f;
			depth=f.depth+1;
		}

		
		}
		//check if not switch
	}
	
	public CTLFormula(Operators op, CTLFormula f, CTLFormula s, String st){
		second = s;
		
		if(op.equals(Operators.IMPL)){
			first=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
			operator=Operators.OR;
			symbolic="("+first.getSymbolic()+")|("+second.getSymbolic()+")";
		}
		else{
		symbolic="("+f.getSymbolic()+")"+op.toStr()+"("+s.getSymbolic()+")";
		operator=op;
		first=f;
		}
		depth=Math.max(first.depth, second.depth)+1;
		
	}

	public CTLFormula(Operators op, CTLFormula f, Operators o2, CTLFormula s, String st){
		if(op.equals(Operators.A)){
			CTLFormula t1=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
			CTLFormula t2=new CTLFormula(Operators.NOT, s,"!("+s.getSymbolic()+")");
			t1=new CTLFormula(Operators.AND, t1, t2,"("+t1.getSymbolic()+")&("+t2.getSymbolic()+")");
			t1=new CTLFormula(Operators.E, t2,Operators.U, t1,"E("+t2.getSymbolic()+")U("+t1.getSymbolic()+")");
			second=new CTLFormula(Operators.NOT, t1, "!("+t1.getSymbolic()+")");
			first=new CTLFormula(Operators.AF, s, "AF("+s.getSymbolic()+")");
			operator=Operators.AND;
			symbolic="("+first.getSymbolic()+")&("+second.getSymbolic()+")";
			depth=Math.max(first.depth, second.depth)+1;
			//TODO check it all
		}
		else{
		symbolic=op.toStr()+"(("+f.getSymbolic()+")U("+s.getSymbolic()+"))";
		operator=op;
		first=f;
		second = s;
		depth=Math.max(f.depth, s.depth)+1;
		operatorAdd=Operators.U;
		}
	}
	
	
	
//	
//	public CTLFormula(UnaryOperator op, CTLFormula f){
//		formula=op.getSymbolic()+f.getSymbolic();
//		highElement=op;
//		depth=f.depth+1;
//	}
//	
//	public CTLFormula(BinaryOperator op, CTLFormula f, CTLFormula s){
//		formula=f.getSymbolic()+op.getSymbolic()+s.getSymbolic();
//		highElement=op;
//		depth=Math.max(f.depth, s.depth)+1;
//	}
	
	
//	public ArrayList<CTLFormula> getOnDepth(int d){
//		ArrayList<CTLFormula> res
//	}
	
	@Override
	public String getSymbolic() {
		return symbolic;
	}
	@Override
	public String getType() {
		return type;
	}
	
	public int getDepth(){
		return depth;
	}
	
	public AtomicPredicate getAP(){
		if(depth==1){
		return (AtomicPredicate)highElement;
		}
		else return null;
		//exception TODO
	}
	public boolean hasSecond(){
		if(second==null){
			return false;
		}
		return true;
	}
	

}
