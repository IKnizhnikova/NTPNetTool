package npnets.simulator.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class TokenChangeConstraintCommand extends Command {

	private Rectangle oldConstraint;
	private Rectangle newConstraint;

	private NPNSymbolTokenSN symbolToken;
	
	public TokenChangeConstraintCommand(NPNSymbolTokenSN symbolToken) {
		this.symbolToken = symbolToken;
	}

	@Override
	public void execute() {
		if (oldConstraint == null) {
			oldConstraint = symbolToken.getConstraints();
		}
		symbolToken.setConstraints(newConstraint);
	}

	@Override
	public void undo() {
		symbolToken.setConstraints(oldConstraint);
	}
	
	public void setNewConstraint(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}
	
}
