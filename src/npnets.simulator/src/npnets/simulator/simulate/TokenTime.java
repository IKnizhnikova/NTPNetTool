package npnets.simulator.simulate;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;

public class TokenTime {
	boolean locked=false;
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	public TimeBound getTime() {
		return time;
	}
	public void setTime(TimeBound time) {
		this.time = time;
	}
	public TokenTime(Token token, TimeBound time) {
		super();
		this.token = token;
		this.time = time;
	}
	private Token token;
	private TimeBound time;
	public void lock() {
		locked=true;
	}
	public void unlock() {
		locked=false;
	}
	public boolean isLocked(){
		return locked;
	}
	
	

}
