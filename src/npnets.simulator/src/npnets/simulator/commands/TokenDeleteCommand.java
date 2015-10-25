package npnets.simulator.commands;
import java.math.BigInteger;

import npnets.simulator.simulate.Simulator;

import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class TokenDeleteCommand extends Command {

	NPNSymbolPlaceSN symbPlace;
	NPNSymbolTokenSN symbToken;

	public TokenDeleteCommand(NPNSymbolTokenSN symbToken) {
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
		removefromMarking();
	}

	private void removefromMarking() {
		for(Marking mark:Simulator.markingHistory.getCurrentState().makeMarkingsList()){
			for(PlaceMarking pm:mark.getMap()){
				if(symbPlace.getModel().getUuid().equals(pm.getPlace().getUuid())){
					for (TokenWeight tw:pm.getMarking().getWeight()){
						if(tw.getToken().getUuid().equals(symbToken.getModel().getUuid())){
							if(tw.getWeight().intValue()==1){
								pm.getMarking().getWeight().remove(tw);
								return;
							}
							String weight= (tw.getWeight().intValue()-1)+"";
							tw.setWeight(new BigInteger(weight));
							return;
						}
					}
				}
			}
		}
		
	}

	@Override
	public void undo() {
		symbToken.setPlace(symbPlace);
	}
	
}
