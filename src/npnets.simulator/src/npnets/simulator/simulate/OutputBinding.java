package npnets.simulator.simulate;

	import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;
import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsFactoryImpl;

	public class OutputBinding {
		private Token token;
		private ArcTP transition;
		
		public OutputBinding(Token token, ArcTP transition){
			this.setToken(token);
			this.setTransition(transition);
		}


		public ArcTP getTransition() {
			return transition;
		}

		public void setTransition(ArcTP transition) {
			this.transition = transition;
		}

		public Token getToken() {
			return token;
		}

		public void setToken(Token token) {
			this.token = token;
		}

		public void move(MarkingAdapter ma,Map<Transition, List<Token>> markingTrans) {
			ma.getMarkingMap().get(transition.getTarget()).add(token);
			//addTokenDiagram();
		}
		
		public void move(MarkingAdapter ma,Map<Transition, List<Token>> markingTrans,Marking mark){
			if(ma.elementMarkingMap.get(mark).containsKey(transition.getTarget()))
				if(ma.elementMarkingMap.get(mark).get(transition.getTarget())==null){
					ma.elementMarkingMap.get(mark).put(transition.getTarget(), new ArrayList<Token>());
				}
				ma.elementMarkingMap.get(mark).get(transition.getTarget()).add(token);
		}
		public void undo(MarkingAdapter ma,Map<Transition, List<Token>> markingTrans){
			markingTrans.get(transition.getSource()).add(token);
			ma.getMarkingMap().get(transition.getTarget()).remove(token);
		}
		
		private void addTokenDiagram(){
			for(NPNSymbolNodeSN dNode:Simulator.net.getDiagramNetSystem().getNodes()){
				if(dNode.getModel().equals(transition.getTarget())){
					NPNSymbolPlaceSN dPlace=(NPNSymbolPlaceSN)dNode;
					dPlace.getTokens().add(searchToken(dPlace));
					break;
				}
			}
		}
		private NPNSymbolTokenSN searchToken(NPNSymbolPlaceSN dplace){
			for(NPNSymbolNodeSN dNode:Simulator.net.getDiagramNetSystem().getNodes()){
				if(dNode instanceof NPNSymbolPlaceSN){
					for(NPNSymbolTokenSN dToken:((NPNSymbolPlaceSN)dNode).getTokens()){
						if(token.getUuid().contains(dToken.getModel().getUuid())){
							return new NetCopyMaker().makeDiagramTokenCopy(dToken);
						}
						if(dplace.equals(dNode)){
							return new NetCopyMaker().makeDiagramTokenCopy(((NPNSymbolPlaceSN)dNode).getTokens().get(((NPNSymbolPlaceSN)dNode).getTokens().size()-1));
						}
					}
				}
			}
		return null;
		}
}
