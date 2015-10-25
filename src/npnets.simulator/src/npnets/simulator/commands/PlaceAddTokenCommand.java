package npnets.simulator.commands;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingFactory;
import ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.*;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import npnets.simulator.exceptions.WrongModelException;
import npnets.simulator.simulate.Simulator;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;

public class PlaceAddTokenCommand extends Command {	 
	  private Place place;
	  static public Marking marking;
	  private Token newToken;
	  private NPNSymbolPlaceSN dplace;
	  private List<Object> pool;
	  private ListDialog sd;
	private boolean isElement;
	 
	  @Override public void execute() {
		  if(marking==null){
			  marking=Simulator.net.getMarking();
		  }
		  TokenType tt=null;
		  sd = new ListDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		  sd.setContentProvider(new ArrayContentProvider());
		  sd.setLabelProvider(new LabelProvider());
		  sd.setInput(getPool());
	      sd.setTitle("Choose the Type");
		  if (sd.open() == Window.OK){
			  if(sd.getResult()[0].equals("New TokenTypeElementNet")){
				  tt=TokenTypesFactory.eINSTANCE.createTokenTypeElementNet();
				  Simulator.net.getNet().getTypeElementNet().add((TokenTypeElementNet) tt);
				  ((TokenTypeElementNet)tt).setDiagram(NPNDiagramsFactory.eINSTANCE.createNPNDiagramNetSystem());
				  ((TokenTypeElementNet)tt).setNet(HLPNFactory.eINSTANCE.createHighLevelPetriNet());
				  ((TokenTypeElementNet)tt).getDiagram().setModel(((TokenTypeElementNet)tt).getNet());
			  }
			  else if(sd.getResult()[0].equals("TokenTypeAtomic"))
				  tt=(TokenType) Simulator.net.getNet().getTypeAtomic();
			  else
				  tt=(TokenType) sd.getResult()[0];
			  
			Token model=null ; 
			if(tt instanceof TokenTypeElementNet){
				sd = new ListDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
				sd.setContentProvider(new ArrayContentProvider());
				sd.setLabelProvider(new LabelProvider());
				sd.setInput(createModelPicker((TokenTypeElementNet)tt));
			    sd.setTitle("Choose the Model");
				if (sd.open() == Window.OK){
					if (sd.getResult()==null)
						return;
					if(sd.getResult()[0].equals("New TokenNet")){
						model= TokenTypesFactory.eINSTANCE.createTokenNet();
						TokenNet tn=(TokenNet)model;
						((TokenTypeElementNet) tt).getTokenNets().add(tn);
						tn.setType((TokenTypeElementNet)tt);
						sd = new ListDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
						sd.setContentProvider(new ArrayContentProvider());
						sd.setLabelProvider(new LabelProvider());
						sd.setInput(createMarkingPicker((TokenTypeElementNet)tt));
					    sd.setTitle("Choose the Marking");
					    if (sd.open() == Window.OK){
					    	ElementNetMarked enm=null;
					    	if(sd.getResult()[0].equals("New ElementNetMarked"))
					    	{
					    		 enm=TokenTypesFactory.eINSTANCE.createElementNetMarked();
					    	}
					    	else if (sd.getResult()!=null){
					    		 enm=(ElementNetMarked) sd.getResult()[0];
					    	}
					    	else return;
				    		((TokenTypeElementNet) tt).getElementNetMarkeds().add(enm);
				    		tn.setValue(enm);
					    }
					}
					else
						model=(Token) sd.getResult()[0];
				}
			else return;
			}
		  InputDialog sd;
		  sd = new InputDialog(
				  PlatformUI.getWorkbench().getDisplay().getActiveShell(),
				  "Hello", "Enter the weight of token", "1", null);
		  TokenWeight tw=TokenExpressionsFactory.eINSTANCE.createTokenWeight();
		  if (sd.open() == Window.OK) {
			  if (sd.getValue()==null)
				  return;
			  tw.setWeight(new BigInteger(sd.getValue()));
			  if (tt instanceof TokenTypeElementNet)
				  tw.setToken(model);
			  else{
				  tw.setToken(Simulator.net.getNet().getTypeAtomic().getAtom());
			  }
			  
			  if(isElement)
				  findElementPlace().getMarking().getWeight().add(tw);
			  else
				  findPlace(place,tt,marking).getMarking().getWeight().add(tw);
			  try {
					  Simulator.markingHistory.getCurrentState().makeMarkingMap(Simulator.net);
				  
				  	  Simulator.changed=true;
			} catch (WrongModelException e) {
				e.printStackTrace();
			}
			  
		  }
		}
	  }
	 
	  private Object createMarkingPicker(TokenTypeElementNet tt) {
		  List<Object> res=new ArrayList<Object>();
		  res.addAll(tt.getElementNetMarkeds());
		  res.add("New ElementNetMarked");
		  return res;
	}

	private List<Object> getPool() {
		  if(pool==null){
			  pool=new ArrayList<Object>();
			  if(Simulator.net.getNet().getTypeAtomic()==null)
			  {
				  Simulator.net.getNet().setTypeAtomic(TokenTypesFactory.eINSTANCE.createTokenTypeAtomic());
				  Simulator.net.getNet().getTypeAtomic().setAtom(TokenTypesFactory.eINSTANCE.createTokenAtomic());
			  }
			  pool.add("TokenTypeAtomic");
			  if(!isElement)
			  {
				  pool.addAll(Simulator.net.getNet().getTypeElementNet());
				  pool.add("New TokenTypeElementNet");
			  }
		  }
		return pool;
	}
	  
	  private List<Object> createModelPicker(TokenTypeElementNet tt){
		  List<Object> res=new ArrayList<Object>();
		  res.addAll(tt.getTokenNets());
		  res.add("New TokenNet");
		  return res;
	  }

	private PlaceMarking findPlace(Place place,TokenType tt,Marking ma) {
		  for (PlaceMarking pm : ma.getMap())
			  if (pm.getPlace() == place)
			  {
				  if(pm.getMarking()==null){
					  pm.setMarking(TokenExpressionsFactory.eINSTANCE.createTokenMultiSet());
				  }
				  else return pm;
			  }
		  PlaceMarking pm = MarkingFactory.eINSTANCE.createPlaceMarking();
		  pm.setMarking(TokenExpressionsFactory.eINSTANCE.createTokenMultiSet());
		  ma.getMap().add(pm);
		  pm.setPlace(place);
		  pm.getMarking().setType(tt);
		  return pm;
	  }
	private PlaceMarking findElementPlace(){
		for(TokenTypeElementNet tten:Simulator.net.getNet().getTypeElementNet()){
			if(place.getNet().getUuid().equals(tten.getNet().getUuid())){
				if(tten.getElementNetMarkeds().get(0).getMarking()==null){
					tten.getElementNetMarkeds().get(0).setMarking(MarkingFactory.eINSTANCE.createMarking());
				}
				return findPlace(place,Simulator.net.getNet().getTypeAtomic(),marking);
			}
			
		}
		return null;
	}
	  
	  
	  public void setToken(Token newToken) {
		  this.newToken = newToken;
	  }
	 
	 
	  public void setPlace(NPNSymbolPlaceSN place) {
	    this.place = (Place)place.getModel();
	  }
	  @Override public void undo() {
		  
	  }
	   
	  public void setdPlace(NPNSymbolPlaceSN place) {
		  this.dplace = place;
		  pool = new ArrayList<Object>();
		  pool.add(Simulator.net.getNet().getTypeAtomic());
		  for (TokenType tt : (Simulator.net.getNet()).getTypeElementNet())
			  pool.add(tt);
	  }

	public void setElementNet(boolean b) {
		this.isElement=b;
		
	}
}
