package ru.mathtech.npntool.editor.commands;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class NPNSymbolTokenSNDeleteCommand extends Command {

	NPNSymbolPlaceSN symbPlace;
	NPNSymbolTokenSN symbToken;

	public NPNSymbolTokenSNDeleteCommand(NPNSymbolTokenSN symbToken) {
		this.symbToken = symbToken;
		this.symbPlace = symbToken.getPlace();
	}
	
	@Override
	public boolean canExecute() {
		return symbToken != null;
	}

	@Override
	public void execute() {
		symbToken.setPlace(null);
	}

	@Override
	public void undo() {
		symbToken.setPlace(symbPlace);
	}
	
}
