package algorithms.CTLformula;

public class UnaryOperator implements IformulaElement {
CTLFormula first;
String symbolic;
String type="unoperator";



@Override
public String getSymbolic() {
	// TODO Auto-generated method stub
	return symbolic;
}

@Override
public String getType() {
	// TODO Auto-generated method stub
	return type;
}

public CTLFormula getFirstOperand(){
	return first;
}

}
