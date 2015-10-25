package npnets.simulator.exceptions;

public class NoBindingAvaliableException extends Exception {
	String cause;
	public boolean deadline=false;
	public NoBindingAvaliableException(String cause){
		this.cause=cause;
		deadline=true;
		message="No Bindings Available. Cause: "+cause;
	}
	public NoBindingAvaliableException(){
		cause="Not enough tokens to perform any transition";
		message="No Bindings Available. Cause: "+cause;
	}
	public String message;
}
