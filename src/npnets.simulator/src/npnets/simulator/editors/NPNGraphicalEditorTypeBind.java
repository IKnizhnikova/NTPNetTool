package npnets.simulator.editors;


import java.awt.Window;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import npnets.simulator.simulate.Simulator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class NPNGraphicalEditorTypeBind extends ViewPart {
	
	private Map<Label,Combo> bindMap;
	private Button userDrivenTrans;
	private Button userDrivenBind;
	private Button multiEntry;
	private Button openLog;
	private Button saveLog;
	private Text scale;
	public NPNGraphicalEditorTypeBind() {
	}

	@Override
	public void createPartControl(final Composite parent) {
		parent.setLayout(new GridLayout());
		((GridLayout)parent.getLayout()).numColumns=2;
		if(Simulator.net!=null){
		userDrivenTrans=new Button(parent,SWT.CHECK);
		userDrivenTrans.setText("User driven transitions");
		userDrivenTrans.setSelection(Simulator.userDriven);
		userDrivenBind=new Button(parent,SWT.CHECK);
		userDrivenBind.setText("User driven bindings");
		userDrivenTrans.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent e) {
				Simulator.userDriven=!Simulator.userDriven;
				((Button)e.getSource()).redraw();
				if(!userDrivenTrans.getSelection()){
					Simulator.userBindings=false;
					userDrivenBind.setEnabled(false);
					userDrivenBind.setSelection(false);
				}
				else{
					if(Simulator.getVariableMap()!=null && Simulator.getVariableMap().size()==Simulator.net.getNet().getNetSystem().getVariables().size())
					userDrivenBind.setEnabled(true);
				}
				userDrivenBind.redraw();
				
				
			}});
		userDrivenBind.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent e) {
				Simulator.userBindings=!Simulator.userBindings;
				((Button)e.getSource()).redraw();
				
			}});
		if(!userDrivenTrans.getSelection()){
			Simulator.userBindings=false;
			userDrivenBind.setEnabled(false);
			userDrivenBind.setSelection(false);
		}
		else{
			userDrivenBind.setEnabled(true);
		}
		bindMap=new HashMap<Label,Combo>();
		fillBindMap(parent);
		userDrivenBind.setSelection(Simulator.userBindings);
		multiEntry=new Button(parent,SWT.CHECK);
		multiEntry.setText("Multi entry");
		multiEntry.setSelection(Simulator.multiEntry);
		multiEntry.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent e) {
				Simulator.multiEntry=!Simulator.multiEntry;
				((Button)e.getSource()).redraw();			
			}});
		}
		scale=new Text(parent,SWT.BORDER);
		openLog=new Button(parent,SWT.BUTTON1);
		saveLog=new Button(parent,SWT.BUTTON1);
		openLog.setText("Открыть файл");
		saveLog.setText("Сохранить операции");
		openLog.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent e) {
				FileDialog fd=new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),SWT.OPEN);
				if(fd.open()!=null)
				{
					Simulator.markingHistory.readFromFile(fd.getFileName());
				}
			}});
		saveLog.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent e) {
				FileDialog fd=new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),SWT.SAVE);
				if(fd.open()!=null)
				{
					Simulator.markingHistory.putToFile(fd.getFileName());
				}
			}});
		
	}

	private void fillBindMap(Composite parent) {
		for(Variable var:Simulator.net.getNet().getNetSystem().getVariables()){
			Label label=new Label(parent,0);
			label.setText(var.getName()+" ("+var.getUuid().substring(27)+")");
			bindMap.put(label,createNewList(parent));
		}
	}
	

	private Combo createNewList(Composite parent) {
		Combo varList= new Combo(parent,SWT.DROP_DOWN | SWT.READ_ONLY);
		varList.addListener(SWT.Selection, listener);
		String[] str=new String[Simulator.net.getNet().getTypeElementNet().size()+1];
		int counter=1;
		str[0]="Atomic Type";
		for(TokenTypeElementNet tt:Simulator.net.getNet().getTypeElementNet()){
			
			str[counter]=("Type Element Net "+(tt.getName()=="" ||tt.getName()==null?"<unnamed>":tt.getName()) +" ("+ tt.getUuid().substring(27) +")");
			counter++;
		}
		varList.setItems(str);
		return varList;
	}
	
	Listener listener= new Listener(){

		@Override
		public void handleEvent(Event event) {
			Combo source=(Combo)event.widget;
			String str=source.getItem(source.getSelectionIndex());
			for(Entry<Label,Combo> es:bindMap.entrySet()){
				if(es.getValue().equals(source)){
					for(Variable var:Simulator.net.getNet().getNetSystem().getVariables()){
						if(es.getKey().getText().contains(var.getUuid().substring(27)))
							Simulator.variableMap.put(var,searchTypeByName(str));
					}
				}
			}
			System.out.println("variable successfully remapped");
			if(!(Simulator.getVariableMap()!=null && Simulator.getVariableMap().size()==Simulator.net.getNet().getNetSystem().getVariables().size()) && Simulator.userDriven)
				userDrivenBind.setEnabled(true);
			
		}

		private TokenType searchTypeByName(String str) {
			for(TokenTypeElementNet tten: Simulator.net.getNet().getTypeElementNet()){
				if(str.contains(tten.getUuid().substring(27))){
					return tten;
				}
			}
			return Simulator.net.getNet().getTypeAtomic();
		}
		
	};
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}

