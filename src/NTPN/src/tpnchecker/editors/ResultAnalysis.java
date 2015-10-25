package tpnchecker.editors;

class ResultAnalysis {
	String name;
	Object result;
	
	public ResultAnalysis(String name) {
		super();
		this.name = name;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getName() {
		return name;
	}
	
}