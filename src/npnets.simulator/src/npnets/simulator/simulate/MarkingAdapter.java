package npnets.simulator.simulate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import npnets.simulator.commands.PlaceAddTokenCommand;
import npnets.simulator.exceptions.WrongModelException;

import org.eclipse.draw2d.geometry.Rectangle;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingFactory;
import ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;
import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsFactoryImpl;

public abstract class MarkingAdapter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3884621419911099486L;



	public Marking marking;
	Map<Place,List<Token>> markingMap;
	Map<Marking,Map<Place,List<Token>>> elementMarkingMap;
	public Map<Place, List<Token>> getMarkingMap() {
		return markingMap;
	}
	public void setMarkingMap(Map<Place, List<Token>> markingMap) {
		this.markingMap = markingMap;
	}
	public MarkingAdapter(NPnetMarked np) throws WrongModelException{
		marking=np.getMarking();
		makeMarkingMap(np);
	}
	public List<Marking> makeMarkingsList() {
		List<Marking> markings=new ArrayList<Marking>();
		markings.add(Simulator.net.getMarking());
		for(TokenTypeElementNet tten:Simulator.net.getNet().getTypeElementNet()){
			for(ElementNetMarked markedNet:tten.getElementNetMarkeds())
				if(markedNet.getMarking()!=null)
					markings.add(markedNet.getMarking());
		}
		return markings;
		
	}
	public void clearDiagram() {
		for (NPNSymbolNodeSN dNode:fillDiagramNodeList()){
			if(dNode instanceof NPNSymbolPlaceSN){
				NPNSymbolPlaceSN dPlace=(NPNSymbolPlaceSN)dNode;
				dPlace.getTokens().clear();
			}
		}
		
	}
	
	 public void setViewElementMarkingMap(TokenTypeElementNet tten, Marking ma){
		clearElementNetDiagram(tten);
		createDiagramMap(elementMarkingMap.get(ma));
	}
	 public void clearElementNetDiagram(TokenTypeElementNet tten){
		 if(tten==null || tten.getDiagram()==null) return;
		 for(NPNSymbolNodeSN dNode:tten.getDiagram().getNodes()){
				if(dNode instanceof NPNSymbolPlaceSN){
					NPNSymbolPlaceSN dPlace=(NPNSymbolPlaceSN)dNode;
					dPlace.getTokens().clear();
				}
		 }
	 }
	
	public void makeMarkingMap(NPnetMarked np) throws WrongModelException{
		try{
			markingMap=new HashMap<Place,List<Token>>();
			for(Node node:np.getNet().getNetSystem().getNodes()){
				if(node instanceof Place){
					markingMap.put((Place)node, new ArrayList<Token>());
				}
			}
			if(np.getMarking()==null){
				throw new WrongModelException();
			}
			fillElementMarking();
			for(PlaceMarking pm:marking.getMap()){
				List<Token> tl=new ArrayList<Token>();
					for(TokenWeight tw:pm.getMarking().getWeight()){
					for (int i=0;i<tw.getWeight().intValue();i++){
						if(tw.getToken().getType() instanceof TokenTypeAtomic){
							TokenAdapter token=new TokenAdapter();
							token.setType((TokenTypeAtomic) tw.getToken().getType());
							token.setComment(tw.getToken().getComment());
							token.setName(tw.getToken().getName());
							token.setUuid(tw.getToken().getUuid());
							tl.add(token);
						}
						else{
							TokenNetAdapter token=new TokenNetAdapter();
							token.setType((TokenTypeElementNet) tw.getToken().getType());
							token.setComment(tw.getToken().getComment());
							token.setName(tw.getToken().getName());
							token.setUuid(tw.getToken().getUuid());
							token.setValue(((TokenNet)tw.getToken()).getValue());
							tl.add(token);
						}
				
				}
				}
				markingMap.put(pm.getPlace(),tl);
			}
			clearDiagram();
			createDiagramMap(markingMap);
			}catch (NullPointerException e){
				new Report().appendLineToReport("Something wrong with the net you are trying to simulate. Maybe you missed something while creating your net",true);
				e.printStackTrace();
			}
	}
	private void fillElementMarking() {
		elementMarkingMap=new HashMap<Marking,Map<Place,List<Token>>>();
		for(TokenTypeElementNet tten:Simulator.net.getNet().getTypeElementNet()){
			for(ElementNetMarked enm:tten.getElementNetMarkeds()){
				if(enm.getMarking()==null){
					enm.setMarking(MarkingFactory.eINSTANCE.createMarking());
				}
				elementMarkingMap.put(enm.getMarking(), new HashMap<Place,List<Token>>());
				for(Node node:tten.getNet().getNodes()){
					if(node instanceof Place){
						elementMarkingMap.get(enm.getMarking()).put((Place)node, new ArrayList<Token>());
					}
				}
				for(PlaceMarking pm:enm.getMarking().getMap()){
					List<Token> tl=new ArrayList<Token>();
					for(TokenWeight tw:pm.getMarking().getWeight()){
					for (int i=0;i<tw.getWeight().intValue();i++){
						if(tw.getToken().getType() instanceof TokenTypeAtomic){
							TokenAdapter token=new TokenAdapter();
							token.setType((TokenTypeAtomic) tw.getToken().getType());
							token.setComment(tw.getToken().getComment());
							token.setName(tw.getToken().getName());
							token.setUuid(tw.getToken().getUuid());
							tl.add(token);
						}
					}
					}
					elementMarkingMap.get(enm.getMarking()).put(pm.getPlace(), tl);
				}
			}
		}
		
	}
	public void createDiagramMap(Map<Place,List<Token>> markingMap) {
		for(Entry<Place,List<Token>> es:markingMap.entrySet()){
			for (NPNSymbolNodeSN dNode:fillDiagramNodeList()){
				if(dNode instanceof NPNSymbolPlaceSN){
					NPNSymbolPlaceSN dPlace=(NPNSymbolPlaceSN)dNode;
					if(dPlace.getModel().equals(es.getKey())){
						for(Token token:es.getValue()){
							dPlace.getTokens().add(createNewDiagramToken(token,dPlace));
						}
						break;
					}
				}
			}
		}
		
	}
	private NPNSymbolTokenSN createNewDiagramToken(Token token, NPNSymbolPlaceSN dPlace) {
		NPNSymbolTokenSN dToken= new NPNDiagramsFactoryImpl().createNPNSymbolTokenSN();
		Rectangle pc=dPlace.getConstraints();
		Random rand=new Random();
		dToken.setConstraints(new Rectangle(rand.nextInt(pc.width-20)+10,rand.nextInt(pc.height-20)+10,10,10));
		dToken.setModel(token);
		dToken.setPlace(dPlace);
		return dToken;
	}
	private List<NPNSymbolNodeSN> fillDiagramNodeList(){
		List<NPNSymbolNodeSN> nodes=new ArrayList<NPNSymbolNodeSN>();
		nodes.addAll(Simulator.net.getDiagramNetSystem().getNodes());
		for(TokenTypeElementNet tten:Simulator.net.getNet().getTypeElementNet()){
			nodes.addAll(tten.getDiagram().getNodes());
		}
		return nodes;
	}
	private List<Node> fillNodeList(){
		List<Node> nodes=new ArrayList<Node>();
				nodes.addAll(Simulator.net.getNet().getNetSystem().getNodes());
		for(TokenTypeElementNet tten:Simulator.net.getNet().getTypeElementNet()){
			nodes.addAll(tten.getNet().getNodes());
		}
		return nodes;
	}
}
