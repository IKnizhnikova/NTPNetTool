package npnets.simulator.simulate;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenImpl;

public class TokenAdapter extends TokenImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7154167782236736437L;
	TokenType type;
	
	public TokenType getType() {
		return type;
	}
	public void setType(TokenType type) {
		this.type = type;
	}
	
}
