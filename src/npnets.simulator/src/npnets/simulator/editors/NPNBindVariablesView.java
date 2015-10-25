package npnets.simulator.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.lang.model.element.TypeElement;

import npnets.simulator.exceptions.DeadlineViolationException;
import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.simulate.Binding;
import npnets.simulator.simulate.MarkingAdapter;
import npnets.simulator.simulate.NetCopyMaker;
import npnets.simulator.simulate.OutputBinding;
import npnets.simulator.simulate.Report;
import npnets.simulator.simulate.Simulator;
import npnets.simulator.simulate.TimeBound;
import npnets.simulator.simulate.TokenNetAdapter;
import npnets.simulator.simulate.TokenTimeList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class NPNBindVariablesView extends Dialog {

	public NPNBindVariablesView(Shell parentShell) {
		super(parentShell);
		bindings = new ArrayList<Binding>();
		outputBindings = new ArrayList<OutputBinding>();
	}

	private List<Binding> bindings;
	private List<OutputBinding> outputBindings;
	private TokenTimeList TTimeMap = new TokenTimeList();
	public TokenTimeList getTTimeMap() {
		return TTimeMap;
	}

	public void setTTimeMap(TokenTimeList tTimeMap) {
		TTimeMap = tTimeMap;
	}

	private MarkingAdapter marking;
	private Simulator simulator;
	public void setSimulator(Simulator simulator) {
		this.simulator = simulator;
	}

	private Map<Label, Combo> bindMap;
	private Transition trans;
	private boolean isOutput;

	Composite parent;

	@Override
	public Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		this.parent = parent;
		container.setLayout(new GridLayout());
		((GridLayout) container.getLayout()).numColumns = 2;
		if (Simulator.net != null) {
			Label label = new Label(container, 0);
			label.setText((!isOutput ? "Choose bindings for transition: " : "Choose output bindings for transition: ") + trans.getName());
			Label filler = new Label(container, 0);
			filler.setText(" ");
			bindMap = new HashMap<Label, Combo>();
			try {
				fillBindMap(container);
			} catch (NoBindingAvaliableException e) {
				new Report().appendLineToReport(e.message);
			}
		}
		return container;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Select bindings");
	}

	private void fillBindMap(Composite parent) throws NoBindingAvaliableException {
		if (!isOutput) {
			for (ArcPT apt : trans.getInArcs()) {
				for (Monom monom : apt.getInscription().getMonoms()) {
					Label label = new Label(parent, 0);
					label.setText((apt.getName() == null || apt.getName().equals("") ? "<unnamed Arc>" : apt.getName()) + " -- " + monom.getVariable().getName());
					bindMap.put(label, createNewList(parent, apt.getSource(), monom));
				}
			}
		} else {
			for (ArcTP atp : trans.getOutArcs()) {
				for (Monom monom : atp.getInscription().getMonoms()) {
					for (int i = 0; i < monom.getPower().intValue(); i++) {
						Label label = new Label(parent, 0);
						label.setText((atp.getName() == null || atp.getName().equals("") ? "<unnamed Arc>" : atp.getName()) + " -- " + monom.getVariable().getName());
						bindMap.put(label, createNewOutputList(parent, Simulator.getOutputTokens(), monom));
					}
				}
			}
		}

	}

	private Combo createNewList(Composite parent, Place place, Monom monom) throws NoBindingAvaliableException {
		Combo varList = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		varList.addListener(SWT.Selection, listener);
		List<Token> allTokens = new ArrayList<Token>();
		for(Token tn:marking.getMarkingMap().get(place))
		 {
			 if(TTimeMap.findBound(tn).getLower()==0)
				 allTokens.add(tn);
			 else
				 {
				 		TTimeMap.findBound(tn).setLower(TTimeMap.findBound(tn).getLower()-1);
						if(TTimeMap.findBound(tn).getUpper()>0)
							TTimeMap.findBound(tn).setUpper(TTimeMap.findBound(tn).getUpper()-1);
						if(TTimeMap.findBound(tn).getUpper()==0)
							TTimeMap.findBound(tn).setUpper(-3);
				 }
		 }
		try {
			if(checkForDeadline(allTokens,place))
				{
					for(int i=0;i<allTokens.size();i++){
						if(TTimeMap.findBound(allTokens.get(i)).getUpper()!=0)
						{
							TTimeMap.findBound(allTokens.get(i)).setUpper(TTimeMap.findBound(allTokens.get(i)).getUpper()-1);
							allTokens.remove(i);
							i--;
						}
					}
				}
		} catch (DeadlineViolationException e) {
			throw new NoBindingAvaliableException(e.message);
		}
		
		for (int i = 0; i < allTokens.size(); i++) {
			if (Simulator.getVariableMap().get(monom.getVariable()).equals(allTokens.get(i).getType()) && checkSync(allTokens.get(i)));
			else{
					allTokens.remove(i);
					i--;
			}
		}
		String[] str = new String[allTokens.size()];
		int counter = 0;
		for (Token token : allTokens) {
			String type = token.getType().equals(Simulator.net.getNet().getTypeAtomic()) ? "Atomic" : "Element net";
			str[counter++] = (token.getName() == null || token.getName().equals("") ? "<unnamed Token>" : token.getName()) + " (" + type + ")" + " ("
					+ token.getUuid().substring(27) + ")";
		}
		varList.setItems(str);
		return varList;
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


	private boolean checkSync(Token token) {
		if(token.getType() instanceof TokenTypeAtomic){
			return true;
		}
		else if(!(trans instanceof TransitionSynchronized))
			return true;
		else{
			TransitionSynchronized transS=null;
			TokenNetAdapter tokennet=(TokenNetAdapter) token;
			for(TransitionSynchronized ts:((TransitionSynchronized)trans).getSynchronization().getInvolved()){
				for(TokenTypeElementNet ten:Simulator.net.getNet().getTypeElementNet()){
						if(token.getType().equals(ten)){
							if(ten.getNet().getNodes().contains(ts)){
								transS=ts;
							}
						}
				}
			}
			if (transS==null) return false;
			return simulator.checkTransition(transS, tokennet.getValue());
		}
	}

	private Combo createNewOutputList(Composite parent, List<Token> tokens, Monom monom) {
		Combo varList = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		varList.addListener(SWT.Selection, listener);
		List<Token> allTokens = new ArrayList<Token>();
		allTokens.addAll(tokens);
		for (int i = 0; i < allTokens.size(); i++) {
			if (!Simulator.getVariableMap().get(monom.getVariable()).equals(allTokens.get(i).getType())) {
				allTokens.remove(i);
				i--;
			}
		}
		String[] str = new String[allTokens.size()];
		int counter = 0;
		for (Token token : allTokens) {
			String type = token.getType().equals(Simulator.net.getNet().getTypeAtomic()) ? "Atomic" : "Element net";
			str[counter++] = (token.getName() == null || token.getName().equals("") ? "<unnamed Token>" : token.getName()) + " (" + type + ")" + " ("
					+ token.getUuid().substring(27) + ")";
		}
		varList.setItems(str);
		return varList;
	}

	private ArcTP findOutArc(String str) {
		for (ArcTP atp : trans.getOutArcs()) {
			if (str.contains(atp.getName() + " -- "))
				return atp;
		}
		return null;
	}

	private ArcPT findInArc(String str) {
		for (ArcPT apt : trans.getInArcs()) {
			if (str.contains(apt.getName() + " -- "))
				return apt;
		}
		return null;
	}

	private Token findOutputToken(String str) {
		for (Token token : Simulator.getOutputTokens()) {
			if (str.contains(token.getUuid().substring(27)))
				return token;
		}
		return null;
	}

	private Token findToken(String str) {
		for (ArcPT apt : trans.getInArcs()) {
			for (Token token : marking.getMarkingMap().get(apt.getSource())) {
				if (str.contains(token.getUuid().substring(27)))
					return token;
			}
		}
		return null;
	}

	public void setTrans(Transition trans) {
		this.trans = trans;
	}

	public void setOutput(boolean flag) {
		isOutput = flag;
	}

	@Override
	public void okPressed() {
		for (Entry<Label, Combo> es : bindMap.entrySet()) {
			String str = es.getValue().getItem(es.getValue().getSelectionIndex());
			if (isOutput) {
				boolean added = false;
				for (OutputBinding ob : outputBindings) {
					if (ob.getToken().equals(findOutputToken(str))) {
						outputBindings.add(new OutputBinding(new NetCopyMaker().makeTokenCopy(findOutputToken(str)), findOutArc(es.getKey().getText())));
						added = true;
						break;
					}
				}
				if (!added)
					outputBindings.add(new OutputBinding(findOutputToken(str), findOutArc(es.getKey().getText())));
			} else {
				bindings.add(new Binding(findToken(str), findInArc(es.getKey().getText())));
				for(String tokenstr : es.getValue().getItems()){
					if(!es.getValue().getItem(es.getValue().getSelectionIndex()).equals(tokenstr))
						{
							Token token=findToken(tokenstr);
							TTimeMap.findBound(token).setLower(TTimeMap.findBound(token).getLower()-1);
							if(TTimeMap.findBound(token).getUpper()>0)
								TTimeMap.findBound(token).setUpper(TTimeMap.findBound(token).getUpper()-1);
							if(TTimeMap.findBound(token).getUpper()==0)
								TTimeMap.findBound(token).setUpper(-3);
						}
				}
			}
		}
		super.okPressed();
	}

	public List<Binding> getBindings() {
		return bindings;
	}

	public List<OutputBinding> getOutputBindings() {
		return outputBindings;
	}

	public void setMarkingAdapter(MarkingAdapter marking) {
		this.marking = marking;

	}

	Listener listener = new Listener() {

		@Override
		public void handleEvent(Event event) {
			for (Entry<Label, Combo> es : bindMap.entrySet()) {
				if (es.getValue().getSelectionIndex() == -1) {
					NPNBindVariablesView.super.getButton(IDialogConstants.OK_ID).setEnabled(false);
					return;
				}
				NPNBindVariablesView.super.getButton(IDialogConstants.OK_ID).setEnabled(true);
			}
		}
	};
	@Override
	protected void createButtonsForButtonBar(Composite parent){
		super.createButtonsForButtonBar(parent);
		
	}
	@Override
	protected Button createButton(Composite parent, int id, String label,
			boolean defaultButton){
		Button button=super.createButton(parent, id, label, defaultButton);
		if(id==IDialogConstants.OK_ID)
			button.setEnabled(false);
		return button;
	}

}
