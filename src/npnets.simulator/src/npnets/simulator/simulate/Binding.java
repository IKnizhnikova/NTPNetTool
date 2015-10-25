package npnets.simulator.simulate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class Binding {
	private Token token;
	private ArcPT transition;
	
	public Binding(Token token, ArcPT transition){
		this.setToken(token);
		this.setTransition(transition);
	}


	public ArcPT getTransition() {
		return transition;
	}

	public void setTransition(ArcPT transition) {
		this.transition = transition;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public void move(MarkingAdapter ma,Map<Transition, List<Token>> markingTrans) {
		if(ma.getMarkingMap().containsKey(transition.getSource())){
			ma.getMarkingMap().get(transition.getSource()).remove(token);
		}
		if(!markingTrans.containsKey(transition.getTarget())){
			markingTrans.put(transition.getTarget(), new ArrayList<Token>());
		}
		markingTrans.get(transition.getTarget()).add(token);
	}
	public void move(MarkingAdapter ma,Map<Transition, List<Token>> markingTrans,Marking mark){
		if(ma.elementMarkingMap.get(mark).containsKey(transition.getSource())){
			ma.elementMarkingMap.get(mark).get(transition.getSource()).remove(token);
		}
		if(!markingTrans.containsKey(transition.getTarget())){
			markingTrans.put(transition.getTarget(), new ArrayList<Token>());
		}
		markingTrans.get(transition.getTarget()).add(token);
	}
	public void undo(MarkingAdapter ma,Map<Transition, List<Token>> markingTrans){
		ma.getMarkingMap().get(transition.getSource()).add(token);
	}
	public void removeTokenDiagram(){
		for(NPNSymbolNodeSN dNode:Simulator.net.getDiagramNetSystem().getNodes()){
			if(dNode.getModel().equals(transition.getSource())){
				NPNSymbolPlaceSN dPlace=(NPNSymbolPlaceSN)dNode;
				dPlace.getTokens().remove(searchToken(dPlace));
				break;
			}
		}
	}
	private NPNSymbolTokenSN searchToken(NPNSymbolPlaceSN dNode){
		for(NPNSymbolTokenSN dToken:dNode.getTokens()){
			if(token.getUuid().contains(dToken.getModel().getUuid())){
				return dToken;
			}
		}
		return null;
	}
}
