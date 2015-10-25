package npnets.simulator.simulate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.EList;

import npnets.simulator.exceptions.DeadlineViolationException;
import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.exceptions.NoOutputBindingAvaliableException;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class DefaultBindingManager implements BindingManager {
	private TokenTimeList TTimeMap = new TokenTimeList();
	ElementNetMarked elementNet;
	public ElementNetMarked getElementNet() {
		return elementNet;
	}

	public void setElementNet(ElementNetMarked elementNet) {
		this.elementNet = elementNet;
	}

	int usedOutputs=0;
	@Override
	public List<Binding> obtainBindings(ArcPT arc,MarkingAdapter ma,Report report, boolean checkOnly) throws NoBindingAvaliableException {

		List<Binding> bindings=new ArrayList<Binding>();
		Place place=arc.getSource();
		List<Token> placeTokens=new ArrayList<Token>();
		if(ma.getMarkingMap().containsKey(place))
		{
			 for(Token tn:ma.getMarkingMap().get(place))
			 {
				 if(TTimeMap.findBound(tn).getLower()<=0)
					 placeTokens.add(tn);
				 else if(!checkOnly && !TTimeMap.findByToken(tn).isLocked())
					 {
					 		TTimeMap.findBound(tn).setLower(TTimeMap.findBound(tn).getLower()-1);
							if(TTimeMap.findBound(tn).getUpper()>0)
								TTimeMap.findBound(tn).setUpper(TTimeMap.findBound(tn).getUpper()-1);
							else if(TTimeMap.findBound(tn).getUpper()==0)
								TTimeMap.findBound(tn).setUpper(-3);
							TTimeMap.findByToken(tn).lock();
					 }
			 }
			try {
				if(checkForDeadline(placeTokens,place))
					{
						for(int i=0;i<placeTokens.size();i++){
							if(TTimeMap.findBound(placeTokens.get(i)).getUpper()!=0)
							{
								if(!checkOnly)
									TTimeMap.findBound(placeTokens.get(i)).setUpper(TTimeMap.findBound(placeTokens.get(i)).getUpper()-1);
								placeTokens.remove(i);
								i--;
							}
						}
					}
			} catch (DeadlineViolationException e) {
				throw new NoBindingAvaliableException(e.message);
			}
				if(placeTokens.size()==0){
					throw new NoBindingAvaliableException();
				}
				performBinding(bindings, placeTokens, arc, report,checkOnly);
		}
		else{
			TokenTypeElementNet tten=findNetForPlace(place);
			List<ElementNetMarked> used=new ArrayList<ElementNetMarked>();
			while(used.size()!=tten.getElementNetMarkeds().size()){
				ElementNetMarked enm=randomizer(tten.getElementNetMarkeds());
				if(used.contains(enm))
					continue;
				used.add(enm);
				try{
					performBinding(bindings, ma.elementMarkingMap.get(enm.getMarking()).get(place), arc, report, checkOnly);
					setElementNet(enm);
					return bindings;
				}catch (Exception e){
					throw new NoBindingAvaliableException();
			}
		}
		}
		return bindings;
	}
		
	public TokenTimeList getTTimeMap() {
		return TTimeMap;
	}

	public void setTTimeMap(TokenTimeList ttl) {
		TTimeMap = ttl;
	}

	private ElementNetMarked randomizer(
			EList<ElementNetMarked> elementNetMarkeds) {
		return elementNetMarkeds.get(new Random().nextInt(elementNetMarkeds.size()));
	}

	public void performBinding(List<Binding> bindings,List<Token>placeTokens,ArcPT arc,Report report,boolean checkOnly) throws NoBindingAvaliableException{
		try{
		Map<TokenType,Integer> tokenMap=new HashMap<TokenType,Integer>();
		for(Token token:placeTokens){
			TokenType tt=token.getType();
			if(tokenMap.containsKey(tt))
				tokenMap.put(tt,tokenMap.get(tt)+1);
			else
				tokenMap.put(tt, 1);
			
		}
	    for(Monom monom:arc.getInscription().getMonoms()){
	    	if(!(tokenMap.containsKey(Simulator.getVariableMap().get(monom.getVariable()))))
	    		throw new NoBindingAvaliableException();
	    	if (monom.getPower().intValue()>tokenMap.get(Simulator.getVariableMap().get(monom.getVariable())))
	    		throw new NoBindingAvaliableException();
	    }
	    	List<Token> used=new ArrayList<Token>();
	    	for(Monom monom:arc.getInscription().getMonoms())
	    	{
	    		int counter=monom.getPower().intValue();
	    		for(int i=0;i<counter;){
	    			Token token=randomizer(placeTokens);
	    				if(!used.contains(token)){
	    				if(Simulator.getVariableMap().get(monom.getVariable()).equals(token.getType())){
	    					bindings.add(new Binding(token,arc));
	    					used.add(token);
	    					counter--;
    						String tokenName=token.getName()==null||token.getName().trim().equals("")?"<unnamed>":token.getName();
	    					report.appendLineToReport("Token \""+tokenName+ "\" binded on variable "+Simulator.getVariableMap().get(monom.getVariable()).getName()+" of arc \""+ arc.getName() +"\" for transition \""+arc.getTarget().getName()+"\"");
	    				}
	    			}
	    		}
	    	}
	    	for(Token tn:placeTokens)
	    	{
	    		if(!used.contains(tn) && !checkOnly && !TTimeMap.findByToken(tn).isLocked())
	    		{
				 		TTimeMap.findBound(tn).setLower(TTimeMap.findBound(tn).getLower()-1);
						if(TTimeMap.findBound(tn).getUpper()>0)
							TTimeMap.findBound(tn).setUpper(TTimeMap.findBound(tn).getUpper()-1);
						else if(TTimeMap.findBound(tn).getUpper()==0)
							TTimeMap.findBound(tn).setUpper(-3);
	    		}
	    	}
		}catch(NullPointerException e){
			report.appendLineToReport("Something wrong with the net. Maybe you missed token variadic expressions on your arcs",true);
			throw new NoBindingAvaliableException();
		}
	}
	private boolean checkForDeadline(List<Token> tl, Place pl) throws DeadlineViolationException {
		for(Token token:tl)
		{
			if(TTimeMap.findBound(token).getUpper()==-3)
				throw new DeadlineViolationException(pl);
		}
		for(Token token:tl)
		{
			if(TTimeMap.findBound(token).getUpper()==0)
				return true;
		}
		return false;
	}

	private TokenTypeElementNet findNetForPlace(Place place) {
		for(TokenTypeElementNet tten:Simulator.net.getNet().getTypeElementNet()){
			if(tten.getNet().getNodes().contains(place)){
				return tten;
			}
		}
		return null;
		
	}

	@Override
	public List<OutputBinding> obtainOutputBindings(ArcTP arc, MarkingAdapter ma, Map<Transition, List<Token>> markingTrans,Report report,boolean checkOnly) throws NoOutputBindingAvaliableException {
		try{
		List<OutputBinding> bindings=new ArrayList<OutputBinding>();
		Transition trans=arc.getSource();
		List<Token> placeTokens= markingTrans.get(trans);
		Map<TokenType,Integer> tokenMap=new HashMap<TokenType,Integer>();
		for(Token token:placeTokens){
			TokenType tt=token.getType();
			if(tokenMap.containsKey(tt))
				tokenMap.put(tt,tokenMap.get(tt)+1);
			else
				tokenMap.put(tt, 1);
			
		}
	    for(Monom monom:arc.getInscription().getMonoms()){
	    	if(!(tokenMap.containsKey(Simulator.getVariableMap().get(monom.getVariable()))))
	    		throw new NoOutputBindingAvaliableException();
	    }
	    	for(Monom monom:arc.getInscription().getMonoms())
	    	{
	    		int counter=monom.getPower().intValue();
	    		for(int i=0;i<counter;){
	    			for(Token token:placeTokens){
	    				if(Simulator.getVariableMap().get(monom.getVariable()).equals(token.getType())){
    						String tokenName=token.getName()==null||token.getName().trim().equals("")?"<unnamed>":token.getName();
    						Token newToken=new NetCopyMaker().makeTokenCopy(token);
	    						bindings.add(new OutputBinding(newToken,arc));
	    						if(!checkOnly){
	    						if(TTimeMap.containsToken(newToken))
	    						{
	    							TTimeMap.findBound(newToken).setLower(arc.getTarget().getFirstTimeConstraint());
	    							TTimeMap.findBound(newToken).setUpper(arc.getTarget().getSecondTimeConstraint());
	    						}
	    						else TTimeMap.add( new TokenTime(newToken, new TimeBound(arc.getTarget().getFirstTimeConstraint(), arc.getTarget().getSecondTimeConstraint())));
	    						}
	    		    		TTimeMap.getList().remove(TTimeMap.findByToken(token));
	    						report.appendLineToReport("Token \""+tokenName+ "\" binded on variable "+Simulator.getVariableMap().get(monom.getVariable()).getName()+" copied and moved via arc \""+ arc.getName() +"\" to place \""+arc.getTarget().getName()+"\"");
	    					counter--;
	    					break;
	    				}
	    			}
	    		}
	    	}
		return bindings;
	}catch(NullPointerException e){
		report.appendLineToReport("Something wrong with the net. Maybe you missed token variadic expressions on your arcs");
	}
	return null;
		
	}

	private Token randomizer(List<Token> placeTokens) {
		return placeTokens.get(new Random().nextInt(placeTokens.size()));
	}

	@Override
	public Collection<? extends Binding> obtainBindingsFromSync(ArcPT arc,
			ElementNetMarked value, Report report,boolean checkOnly) throws NoBindingAvaliableException {
		List<Binding> bindings=new ArrayList<Binding>();
		performBinding(bindings, Simulator.markingHistory.getCurrentState().elementMarkingMap.get(value.getMarking()).get(arc.getSource()), arc, report,checkOnly);
		return bindings;
	}


}
