package tpnchecker.editors;

import java.awt.Color;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.event.HyperlinkEvent.EventType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.swt.widgets.Table;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import algorithms.*;
import model.NTPNet;
import model.parts.ElNet;
import model.parts.ElNet.State;
import model.parts.pMarking;
import algorithms.CTLformula.AtomicPredicate;
import algorithms.CTLformula.CTLFormula;
import algorithms.CTLformula.CompOperators;
import algorithms.CTLformula.Operators;
import algorithms.ctlparser.CTLBaseListener;
import algorithms.ctlparser.CTLLexer;
import algorithms.ctlparser.CTLParser;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

class ctrlData{
	public String pName;//predicate name
	public String colName;//column Name
	public ctrlData(String p, String c){
		pName=p;
		colName=c;
	}
}
public class NPNEditor extends EditorPart {
	
	private ContentProviderResults contentProviderResults =
			new ContentProviderResults();

	private TableViewer viewerModel;
	private TableViewer viewerResults;
	private Resource resourceNPN;
	private NPnetMarked npnetMarked;
	private List<ReachabilityGraph> reachGraphs = new ArrayList<>();
	private Graph TReachGraph;
	private List<CoverabilityTree> covTrees = new ArrayList<>();

	//private Action doubleClickAction;
	private Action RGbasic;
	private Action modelChecking;
	private Action parseCTL;
	
	private Map<String,AtomicPredicate> predicates=new HashMap<String,AtomicPredicate>();
	//private String CTLformula;
	//private HashSet<String> atomic;
	private NTPNet Net;
	private Map<String, CTLResult> ctlresults=new HashMap<String, CTLResult>();
	//private Text text;
	
	Table ptable;
	Table ftable;
	CCombo placeCombo;
	TableEditor combEditor;
	//private CTLFormula f;
	CTLFormula ctl;
	//ArrayList<CTLFormula> ctlList;
	
	
	 private int parseLeft(String s){
		 int res=0;
     	if(s.indexOf("[")<s.indexOf(";")){
     		try{
		 res=Integer.parseInt(s.substring(s.indexOf("[")+1, s.indexOf(";")));
     		}
     		catch(Exception e){

    			showMessage("ParseLeft failed!");
     			//!!!
     			
     		}
     		
     	}
     	return res;
	 }
     	
     	private int parseRight(String s){
     		int res=-1;
     	
     	if(s.indexOf("[")<s.indexOf(";")){
     		try{
     			//!!!if()
     			res=Integer.parseInt(s.substring(s.indexOf(";")+1, s.indexOf("]")));
     		}
     		catch(Exception e){//infinity

    			//showMessage("ParseRight failed!");
     			res=-1;
     			
     		}
     	}
     	return res;
     	
     }

	
	

	

	public NPNEditor() {
		super();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		setSite(site);
		setInput(input);

		loadInput(input);
	}

	private void loadInput(IEditorInput input) {
		NPNetsPackage.eINSTANCE.eClass();

		ResourceSet resourceSet = new ResourceSetImpl();

		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			IFile file = fileInput.getFile();
			resourceNPN = resourceSet.createResource(URI.createURI(file
					.getLocationURI().toString()));
			try {
				resourceNPN.load(null);
				npnetMarked = (NPnetMarked) resourceNPN.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
				npnetMarked = null;
			}
		}
	}
	
	void createMarking(pMarking[] mark, Marking m, ArrayList<String> pids, Map<String, Marking> em)
	{
		for(PlaceMarking pm:m.getMap()){
			int ind=pids.indexOf(pm.getPlace().getUuid());
			//EList<TokenWeight> tms=pm.getMarking().getWeight();
			//if(pm.getMarking().getType().getClass()==TokenTypeAtomic.class)//black tokens TODO CHECK!!
			if(pm.getMarking().getType() instanceof TokenTypeAtomic)
					{
				mark[pids.indexOf(pm.getPlace().getUuid())]=new pMarking(
						pm.getMarking().getWeight().get(0).getWeight().intValue());
					}
			else{//el. net
				
				mark[ind]=new pMarking();

				if(pm.getMarking().getWeight().get(0).getWeight().intValue()>0){
				mark[ind].addNet(Net.getENByName(pm.getMarking().getType().getName()).clone());
				pMarking[] pmarr=new pMarking[em.get(pm.getMarking().getType().getName()).getMap().size()];
				int i=0;
				for(PlaceMarking pem:em.get(pm.getMarking().getType().getName()).getMap()){
					pmarr[i]=new pMarking(
							pem.getMarking().getWeight().get(0).getWeight().intValue());
					i++;
				}
				//markings for all places in el net was set
				for(model.parts.Transition tr:mark[ind].getNet(pm.getMarking().getType().getName()).getTransitions().values()){
					tr.setEnInf("["+pm.getPlace().getName()+"."+pm.getMarking().getType().getName()+"]");
				}
				try {
					
					mark[ind].getNet(pm.getMarking().getType().getName()).setPMarking(pmarr);
				} catch (Exception e) {
					// TODO Auto-generated catch block

					showMessage("Invalid token number");
					e.printStackTrace();
				}
				mark[ind].getNet(pm.getMarking().getType().getName()).setInitialTMarking();
				mark[ind].getNet(pm.getMarking().getType().getName()).letInitialState();
			}
			}		

			Net.getPlaceByName(pm.getPlace().getName()).setMarking(mark[ind]);
		}
	}
	
//	ElNet createEN(){
//		ElNet en=new ElNet();
//	}
	
	void setCNet(){//constructed net, stub
		Net = new NTPNet();
		model.parts.Place pl=new model.parts.Place(0);
		pl.setName("p1");
		pl.setMarking(new pMarking(1));
		Net.AddPlace(pl);
		model.parts.Transition tr=new model.parts.Transition(0,2, 0);
		tr.setName("t1");
		Net.AddTransition(tr);
		Net.AddArc(0,0, true, (char)0);
		model.parts.Place pl1=new model.parts.Place(1);
		pl1.setName("p2");
		pl1.setMarking(new pMarking(2));
		Net.AddPlace(pl1);
		Net.AddArc(1,0, false, (char)0);
		Net.AddArc(1,0, true, (char)0);
		Net.setInitialTMarking();
        Net.letInitialState();
		
	}
	
	void setCNNet(){//constructed net, stub, nested
		ElNet en=new ElNet();
		en.setName("en1");
		en.AddPlace("ep1");
		en.AddTransition(1, 2);
		en.getTransitions().get(0).setName("et1");
		en.AddArc(0, 0, true, (char)0);
		en.AddArc(0, 0, false, (char)0);
		Net = new NTPNet();
		model.parts.Place pl=new model.parts.Place(0);
		pl.setName("p1");
		pl.setMarking(new pMarking(1));
		Net.AddPlace(pl);
		model.parts.Transition tr=new model.parts.Transition(1,1, 0);
		tr.setName("t1");
		Net.AddTransition(tr);
		Net.AddArc(0,0, true, (char)0);
		
		Net.addElNet(en);
		model.parts.Place pl1=new model.parts.Place(1);
		pl1.setName("p2");
		pMarking pm=new pMarking(0);
		pm.addNet(en.clone());
		try {
			pm.getNet("en1").setPMarking(new pMarking[]{new pMarking(1)});
		} catch (Exception e) {
			// TODO Auto-generated catch block

			showMessage("Invalid token number");
			e.printStackTrace();
		}
		pm.getNet("en1").setInitialTMarking();
		pm.getNet("en1").letInitialState();
		pl1.setMarking(pm);
		Net.AddPlace(pl1);
		Net.AddArc(1,0, false, 'a');
		Net.AddArc(1,0, true, 'a');
		Net.setInitialTMarking();
        Net.letInitialState();
		
	}
	
	
	void setCVNet(){//constructed net, stub, nested, vsync
		ElNet en=new ElNet();
		en.setName("en1");
		en.AddPlace("ep1");
		en.AddTransition(1, false);
		en.getTransitions().get(0).setName("et1");
		en.getTransitions().get(0).setVSync(""+1);
		en.AddArc(0, 0, true, (char)0);
		en.AddArc(0, 0, false, (char)0);
		Net = new NTPNet();
		model.parts.Place pl=new model.parts.Place(0);
		pl.setName("p1");
		pl.setMarking(new pMarking(1));
		Net.AddPlace(pl);
		model.parts.Transition tr=new model.parts.Transition(1,false, 0);
		tr.setVSync(""+1);
		tr.setName("t1");
		Net.AddTransition(tr);
		Net.AddArc(0,0, true, (char)0);
		
		Net.addElNet(en);
		model.parts.Place pl1=new model.parts.Place(1);
		pl1.setName("p2");
		pMarking pm=new pMarking(0);
		pm.addNet(en.clone());
		try {
			pm.getNet("en1").setPMarking(new pMarking[]{new pMarking(1)});
		} catch (Exception e) {
			// TODO Auto-generated catch block

			showMessage("Invalid token number");
			e.printStackTrace();
		}
		pm.getNet("en1").setInitialTMarking();
		pm.getNet("en1").letInitialState();
		pl1.setMarking(pm);
		Net.AddPlace(pl1);
		Net.AddArc(1,0, false, 'a');
		Net.AddArc(1,0, true, 'a');
		Net.setInitialTMarking();
        Net.letInitialState();
		
	}
	
	void setCVWNet(){//constructed net, stub, nested, vsync
		ElNet en=new ElNet();
		en.setName("en1");
		en.AddPlace("ep1");
		en.AddTransition(1, false);
		en.getTransitions().get(0).setName("et1");
		en.getTransitions().get(0).setVSync(""+1);
		en.AddArc(0, 0, true, (char)0);
		//en.AddArc(0, 0, false, (char)0);
		Net = new NTPNet();
		model.parts.Place pl=new model.parts.Place(0);
		pl.setName("p1");
		pl.setMarking(new pMarking(2));
		Net.AddPlace(pl);
		model.parts.Transition tr=new model.parts.Transition(1,false, 0);
		tr.setVSync(""+1);
		tr.setName("t1");
		Net.AddTransition(tr);
		Net.AddArc(0,0, true, (char)0,2);
		Net.AddArc(0,0, false, (char)0);
		
		Net.addElNet(en);
		model.parts.Place pl1=new model.parts.Place(1);
		pl1.setName("p2");
		pMarking pm=new pMarking(0);
		pm.addNet(en.clone());
		try {
			pm.getNet("en1").setPMarking(new pMarking[]{new pMarking(1)});
		} catch (Exception e) {
			// TODO Auto-generated catch block

			showMessage("Invalid token number");
			e.printStackTrace();
		}
		pm.getNet("en1").setInitialTMarking();
		pm.getNet("en1").letInitialState();
		pl1.setMarking(pm);
		Net.AddPlace(pl1);
		Net.AddArc(1,0, false, 'a');
		Net.AddArc(1,0, true, 'a');
		Net.setInitialTMarking();
        Net.letInitialState();
		
	}
	
	ElNet creatCNet(int eft, int lft,String s){//constructed net, stub, nested, vsync
		ElNet en=new ElNet();
		en.setName(s);
		en.AddPlace(s+"st");
		en.AddPlace(s+"sec");
		en.AddPlace(s+"wait");
		en.AddTransition(eft, lft);
		en.getTransitions().get(0).setName(s+"work");
		en.AddTransition(0, 2);
		en.getTransitions().get(1).setName(s+"sync");
		en.getTransitions().get(1).setVSync(""+1);//lamb
		en.AddTransition(0, 1);
		en.getTransitions().get(2).setName(s+"get");
		en.getTransitions().get(2).setVSync(""+2);//beta
		en.AddArc(0, 0, true, (char)0);
		en.AddArc(1, 0, false, (char)0);
		en.AddArc(1, 1, true, (char)0);
		en.AddArc(2, 1, false, (char)0);
		en.AddArc(2, 2, true, (char)0);
		en.AddArc(0, 2, false, (char)0);
		return en;
		
	}
//	void setExNet(){//constructed net, stub, nested, vsync
//		Net = new NTPNet();
//		Net.AddPlace("p1");
//		Net.AddPlace("p2");
//		Net.AddPlace("p3");
//		Net.AddPlace("collect");
//		Net.AddPlace("give");
//		
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(0).setName("t1");
//		Net.getTransitions().get(0).setVSync(1);
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(1).setName("t2");
//		Net.getTransitions().get(1).setVSync(1);
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(2).setName("t3");
//		Net.getTransitions().get(2).setVSync(1);
//		Net.AddTransition(2,3);
//		Net.getTransitions().get(3).setName("compute");
//		
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(4).setName("tr1");
//		Net.getTransitions().get(4).setVSync(2);
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(5).setName("tr2");
//		Net.getTransitions().get(5).setVSync(2);
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(6).setName("tr3");
//		Net.getTransitions().get(6).setVSync(2);
//		
//		Net.AddArc(0,0, true, 'x');
//		Net.AddArc(0,0, false, 'x');
//		Net.AddArc(1,1, true, 'x');
//		Net.AddArc(1,1, false, 'x');
//		Net.AddArc(2,2, true, 'x');
//		Net.AddArc(2,2, false, 'x');
//		
//		Net.AddArc(0,4, true, 'x');
//		Net.AddArc(0,4, false, 'x');
//		Net.AddArc(1,5, true, 'x');
//		Net.AddArc(1,5, false, 'x');
//		Net.AddArc(2,6, true, 'x');
//		Net.AddArc(2,6, false, 'x');
//		
//		Net.AddArc(3,0, false, (char)0);
//		Net.AddArc(3,1, false, (char)0);
//		Net.AddArc(3,2, false, (char)0);
//		
//		Net.AddArc(3,3, true, (char)0,3);
//		Net.AddArc(4,3, false, (char)0,3);
//		
//		Net.AddArc(4,4, true, (char)0);
//		Net.AddArc(4,5, true, (char)0);
//		Net.AddArc(4,6, true, (char)0);
//		
//		Net.addElNet(creatCNet(1,"c1"));
//		Net.addElNet(creatCNet(2,"c2"));
//		Net.addElNet(creatCNet(3,"c3"));
//
//		pMarking pm=new pMarking(0);
//		pm.addNet(Net.getENByName("c1").clone());
//		try {
//			pm.getNet("c1").setPMarking(new pMarking[]{new pMarking(1),new pMarking(0),new pMarking(0)});
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//
//			showMessage("Invalid token number");
//			e.printStackTrace();
//		}
//		pm.getNet("c1").setInitialTMarking();
//		pm.getNet("c1").letInitialState();
//		Net.getPlaces().get(0).setMarking(pm.clone());
//		
//		pm=new pMarking(0);
//		pm.addNet(Net.getENByName("c2").clone());
//		try {
//			pm.getNet("c2").setPMarking(new pMarking[]{new pMarking(1),new pMarking(0),new pMarking(0)});
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//
//			showMessage("Invalid token number");
//			e.printStackTrace();
//		}
//		pm.getNet("c2").setInitialTMarking();
//		pm.getNet("c2").letInitialState();
//		Net.getPlaces().get(1).setMarking(pm.clone());
//		
//		pm=new pMarking(0);
//		pm.addNet(Net.getENByName("c3").clone());
//		try {
//			pm.getNet("c3").setPMarking(new pMarking[]{new pMarking(1),new pMarking(0),new pMarking(0)});
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//
//			showMessage("Invalid token number");
//			e.printStackTrace();
//		}
//		pm.getNet("c3").setInitialTMarking();
//		pm.getNet("c3").letInitialState();
//		Net.getPlaces().get(2).setMarking(pm.clone());
//		
//
//		
//		Net.setInitialTMarking();
//        Net.letInitialState();
//		
//	}
	
	
//	void setExNet(){//constructed net, stub, nested, vsync
//		Net = new NTPNet();
//		Net.AddPlace("p1");
//		Net.AddPlace("collect");
//		Net.AddPlace("give");
//		
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(0).setName("t1");
//		Net.getTransitions().get(0).setVSync(1);
//		Net.AddTransition(2,3);
//		Net.getTransitions().get(1).setName("compute");
//		
//		Net.AddTransition(0, false);
//		Net.getTransitions().get(2).setName("tr1");
//		Net.getTransitions().get(2).setVSync(2);
//		
//		Net.AddArc(0,0, true, 'x');
//		Net.AddArc(0,0, false, 'x');
//		
//		Net.AddArc(0,2, true, 'x');
//		Net.AddArc(0,2, false, 'x');
//		
//		Net.AddArc(1,0, false, (char)0);
//		
//		Net.AddArc(1,1, true, (char)0);
//		Net.AddArc(2,1, false, (char)0);
//		
//		Net.AddArc(2,2, true, (char)0);
//		
//		Net.addElNet(creatCNet(1,"c1"));
//
//		pMarking pm=new pMarking(0);
//		pm.addNet(Net.getENByName("c1").clone());
//		try {
//			pm.getNet("c1").setPMarking(new pMarking[]{new pMarking(1),new pMarking(0),new pMarking(0)});
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//
//			showMessage("Invalid token number");
//			e.printStackTrace();
//		}
//		pm.getNet("c1").setInitialTMarking();
//		pm.getNet("c1").letInitialState();
//		Net.getPlaces().get(0).setMarking(pm.clone());
//				
//		Net.setInitialTMarking();
//        Net.letInitialState();
//		
//	}
	
	ElNet creatCSNet(String s){//constructed net, stub, nested, vsync
		ElNet en=new ElNet();
		en.setName(s);
		en.AddPlace(s+"st");
		en.AddPlace(s+"wait");
		en.AddTransition(0, 3);
		en.getTransitions().get(0).setName(s+"sync");
		en.getTransitions().get(0).setVSync(""+1);//lamb
		en.AddTransition(0, false);
		en.getTransitions().get(1).setName(s+"get");
		en.getTransitions().get(1).setVSync(""+2);//beta
		en.AddArc(0, 0, true, (char)0);
		en.AddArc(1, 0, false, (char)0);
		en.AddArc(1, 1, true, (char)0);
		en.AddArc(0, 1, false, (char)0);
		return en;
		
	}
	
	void setExNet(){//constructed net, stub, nested, vsync
		Net = new NTPNet();
		Net.setName("ExNet");
		Net.AddPlace("p1");
		Net.AddPlace("p2");
		Net.AddPlace("collect");
		Net.AddPlace("give");
		
		Net.AddTransition(0, false);
		Net.getTransitions().get(0).setName("t1");
		Net.getTransitions().get(0).setVSync(""+1);
		Net.AddTransition(0, false);
		Net.getTransitions().get(1).setName("t2");
		Net.getTransitions().get(1).setVSync(""+1);
		Net.AddTransition(1,1);
		Net.getTransitions().get(2).setName("compute");
		
		Net.AddTransition(0, 1);
		Net.getTransitions().get(3).setName("tr1");
		Net.getTransitions().get(3).setVSync(""+2);
		Net.AddTransition(0, 1);
		Net.getTransitions().get(4).setName("tr2");
		Net.getTransitions().get(4).setVSync(""+2);
		
		Net.AddArc(0,0, true, 'x');
		//Net.AddArc(0,0, false, 'x');
		Net.AddArc(1,1, true, 'x');
		Net.AddArc(1,1, false, 'x');
		
		Net.AddArc(0,3, true, 'x');
		Net.AddArc(0,3, false, 'x');
		Net.AddArc(1,4, true, 'x');
		Net.AddArc(1,4, false, 'x');
		
		Net.AddArc(2,0, false, (char)0);
		Net.AddArc(2,1, false, (char)0);
		
		Net.AddArc(2,2, true, (char)0,2);
		Net.AddArc(3,2, false, (char)0,2);
		
		Net.AddArc(3,3, true, (char)0);
		Net.AddArc(3,4, true, (char)0);
		
		Net.addElNet(creatCNet(0,2,"c1"));
		Net.addElNet(creatCNet(1,4,"c2"));

		pMarking pm=new pMarking(0);
		pm.addNet(Net.getENByName("c1").clone());
		try {
			pm.getNet("c1").setPMarking(new pMarking[]{new pMarking(1),new pMarking(0),new pMarking(0)});
		} catch (Exception e) {
			// TODO Auto-generated catch block

			showMessage("Invalid token number");
			e.printStackTrace();
		}
		pm.getNet("c1").setInitialTMarking();
		pm.getNet("c1").letInitialState();
		Net.getPlaces().get(0).setMarking(pm.clone());
		
		pm=new pMarking(0);
		pm.addNet(Net.getENByName("c2").clone());
		try {
			pm.getNet("c2").setPMarking(new pMarking[]{new pMarking(1),new pMarking(0),new pMarking(0)});
		} catch (Exception e) {
			// TODO Auto-generated catch block

			showMessage("Invalid token number");
			e.printStackTrace();
		}
		pm.getNet("c2").setInitialTMarking();
		pm.getNet("c2").letInitialState();
		Net.getPlaces().get(1).setMarking(pm.clone());
		
		
		Net.setInitialTMarking();
        Net.letInitialState();
		
	}
	void setNetStruct(ElNet Net, HighLevelPetriNet net, ArrayList<String> pids, ArrayList<String> tids ){
		for (Node node : net.getNodes()) {
		    if (node instanceof Place) {
		    	//Place p=(Place)node;
		    	//places.add((Place)node);
		    	//Net.AddPlace();
		    	Net.AddPlace(((Place)node).getName());
		    	pids.add(((Place)node).getUuid());
		    } else {
		    	//transitions.add((Transition)node);
		    	//Net.AddTransition(parseLeft(((Transition)node).getName()), parseRight(((Transition)node).getName()));
		    	Net.AddTransition(parseLeft(((Transition)node).getName()), parseRight(((Transition)node).getName())
		    			,((Transition)node).getName());
		    	Transition tr=(Transition)node;
		    	for(Variable var:tr.getVariables()){
		    		
		    	Net.getTransitionByName(((Transition)node).getName()).setVSync(var.getName());
		    	}
		    	tids.add(((Transition)node).getUuid());
		    	
		    }
		}
		
		for (Arc arc : net.getArcs()) {
			if(arc instanceof ArcPT){
			ArcPT a=(ArcPT)arc;
			if(arc.getName()==null){//TODO check
		    Net.AddArc(pids.indexOf(a.getSource().getUuid()),
		    		tids.indexOf(a.getTarget().getUuid()), true, (char)0,Integer.parseInt(a.getComment()));//TODO check too
			}
			else{
				Net.AddArc(pids.indexOf(a.getSource().getUuid()),
			    		tids.indexOf(a.getTarget().getUuid()), true, arc.getName().charAt(0),Integer.parseInt(a.getComment()));//TODO check too
			}
			}
			else{
				if(arc.getName()==null){//TODO check
					ArcTP a=(ArcTP)arc;
					Net.AddArc(pids.indexOf(a.getTarget().getUuid()),
				    		tids.indexOf(a.getSource().getUuid()), false, (char)0,Integer.parseInt(a.getComment()));
					}
					else{

						ArcTP a=(ArcTP)arc;
						Net.AddArc(pids.indexOf(a.getTarget().getUuid()),
					    		tids.indexOf(a.getSource().getUuid()), false, arc.getName().charAt(0),Integer.parseInt(a.getComment()));
					}
			}
		}

	}
	private void setNet(){
		//set small
		Net=null;
		Net = new NTPNet();
		ISelection selection = viewerModel.getSelection();
		Object obj = ((IStructuredSelection) selection)
				.getFirstElement();

		HighLevelPetriNet net = null;
		Marking m = null;
		NPnetMarked bnet=null;
		Map<String, Marking> em=new HashMap<String, Marking>();
		if (obj instanceof NPnetMarked) {
			bnet=(NPnetMarked) obj;
			net = ((NPnetMarked) obj).getNet().getNetSystem();
			m = ((NPnetMarked) obj).getMarking();
		} else if (obj instanceof ElementNetMarked) {
			net = ((ElementNetMarked) obj).getType().getNet();
			m = ((ElementNetMarked) obj).getMarking();
		} else {
			showMessage("This is not applicable to given type!");
			return;
		}

		
		ArrayList<String> pids=new ArrayList<String>();
		ArrayList<String> tids=new ArrayList<String>();
				
		setNetStruct(Net, net, pids,tids);
		//systemNet struct is set
		
		EList<TokenTypeElementNet> tempAr=bnet.getNet().getTypeElementNet();
		for(TokenTypeElementNet tn:tempAr){
			ElNet en=new ElNet();
			en.setName(tn.getName());
			ArrayList<String> pids2=new ArrayList<String>();
			ArrayList<String> tids2=new ArrayList<String>();
			setNetStruct(en,tn.getNet(),pids2, tids2);
			Net.addElNet(en);
			em.put(en.getName(), tn.getElementNetMarkeds().get(0).getMarking());
			
		}
		
		//BigInteger[] mark=new BigInteger[pids.size()];
		pMarking[] mark=new pMarking[pids.size()];
		

		
		createMarking(mark,m,pids, em);
		
		
		//Net completed
		//Set marking!
		
//		try {
//	           Net.setPMarking(mark);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            
//	        }
//	       
	        Net.setInitialTMarking();
	        Net.letInitialState();
	        
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	
	
	
	void addFMenus(){
		Menu menu = new Menu (ftable.getParent().getShell(), SWT.POP_UP);
		ftable.setMenu(menu);
		MenuItem item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Save");
		item.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event event) {
				FileDialog dialog = new FileDialog (ftable.getShell(), SWT.SAVE);
				String [] filterNames = new String [] {"Formula files", "All Files (*)"};
				String [] filterExtensions = new String [] {"*.frs", "*"};
				String filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				String platform = SWT.getPlatform();
				if (platform.equals("win32")) {
					filterNames = new String [] {"Formula Files", "All Files (*.*)"};
					filterExtensions = new String [] {"*.frs", "*.*"};
					filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				}
				dialog.setFilterNames (filterNames);
				dialog.setFilterExtensions (filterExtensions);
				dialog.setFilterPath (filterPath);
				dialog.setFileName ("formulas.frs");
				//System.out.println ("Save to: " + dialog.open ());
				try {
						saveFTable(dialog.open());
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Open");
		
		item.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event event) {
				FileDialog dialog = new FileDialog (ftable.getShell(), SWT.OPEN);
				String [] filterNames = new String [] {"Formula files", "All Files (*)"};
				String [] filterExtensions = new String [] {"*.frs", "*"};
				String filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				String platform = SWT.getPlatform();
				if (platform.equals("win32")) {
					filterNames = new String [] {"Formula Files", "All Files (*.*)"};
					filterExtensions = new String [] {"*.frs", "*.*"};
					filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				}
				dialog.setFilterNames (filterNames);
				dialog.setFilterExtensions (filterExtensions);
				dialog.setFilterPath (filterPath);
				dialog.setFileName ("formulas.frs");
				//System.out.println ("Save to: " + dialog.open ());
				try {
						loadFTable(dialog.open());
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Delete Selection");
		item.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event event) {
				ftable.remove (ftable.getSelectionIndices ());
				
			}
		});
	}
	
	
	
	
	void addPMenus(){
		Menu menu = new Menu (ptable.getParent().getShell(), SWT.POP_UP);
		ptable.setMenu(menu);
		MenuItem item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Save");
		item.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event event) {
				FileDialog dialog = new FileDialog (ptable.getShell(), SWT.SAVE);
				String [] filterNames = new String [] {"Predicate files", "All Files (*)"};
				String [] filterExtensions = new String [] {"*.prs", "*"};
				String filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				String platform = SWT.getPlatform();
				if (platform.equals("win32")) {
					filterNames = new String [] {"Predicate Files", "All Files (*.*)"};
					filterExtensions = new String [] {"*.prs", "*.*"};
					filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				}
				dialog.setFilterNames (filterNames);
				dialog.setFilterExtensions (filterExtensions);
				dialog.setFilterPath (filterPath);
				dialog.setFileName ("preds.prs");
				//System.out.println ("Save to: " + dialog.open ());
				try {
						savePTable(dialog.open());
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Open");
		
		item.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event event) {
				FileDialog dialog = new FileDialog (ptable.getShell(), SWT.OPEN);
				String [] filterNames = new String [] {"Predicate files", "All Files (*)"};
				String [] filterExtensions = new String [] {"*.prs", "*"};
				String filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				String platform = SWT.getPlatform();
				if (platform.equals("win32")) {
					filterNames = new String [] {"Predicate Files", "All Files (*.*)"};
					filterExtensions = new String [] {"*.prs", "*.*"};
					filterPath = "C:\\Users\\Соланж\\Desktop\\sfiles";
				}
				dialog.setFilterNames (filterNames);
				dialog.setFilterExtensions (filterExtensions);
				dialog.setFilterPath (filterPath);
				dialog.setFileName ("preds.prs");
				//System.out.println ("Save to: " + dialog.open ());
				try {
						loadPTable(dialog.open());
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Delete Selection");
		item.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event event) {
				for(int ind:ptable.getSelectionIndices()){
				for(Control control:ptable.getChildren()){
					if(control.getData()!=null&&((ctrlData)(control.getData())).pName.equals(ptable.getItem(ind).getText(0))){
						
					control.dispose();	
					}
				}
				}
				ptable.remove (ptable.getSelectionIndices ());
				ptable.notifyListeners(SWT.MouseDown, new Event());
			}
		});
		
		item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Set Predicates");
		item.addListener (SWT.Selection, new Listener () {
			
			public void widgetSelected(Event event) {
					  predicates=new HashMap<String,AtomicPredicate>();
					  for(TableItem it:ptable.getItems()){
						  //String ptext="";
						  model.parts.Place pp=null;
						  String pop="";
						  String ppred=null;
						  int pnum=-1;
						  ElNet tn=null;
						  for(Control control : ptable.getChildren()) {
							  if(control instanceof CCombo){
							        CCombo ck=(CCombo)control;
							        if(((ctrlData)ck.getData()).pName.equals(it.getText(0))){//this line
							        	
							        	switch(((ctrlData)ck.getData()).colName){
							        	case "Context":{
							        		if(ck.getItem(ck.getSelectionIndex()).equals(Net.getName())){
							        			tn=Net;
							        		}
							        		else{tn=Net.getENByName(ck.getItem(ck.getSelectionIndex()));}
							        		break;
							        	}
							        	case "Place":{    
							        		pp=tn.getPlaceByName(ck.getItem(ck.getSelectionIndex()));
							        		break;
							        	}
							        	case "Operator":{    
							        		pop=ck.getItem(ck.getSelectionIndex());
							        		break;
							        	}
							        	case "Predicate":{    
							        		ppred=ck.getItem(ck.getSelectionIndex());
							        		break;
							        	}
							        	}
							        	
							    }
							  }
							  if(control instanceof Spinner){
								  Spinner sp=(Spinner)control;
								  if(((ctrlData)sp.getData()).pName.equals(it.getText(0))){//this line
										pnum=sp.getSelection();
								  }
							  }
						  }//all parts are set
						  if(!predicates.keySet().contains(it.getText(0))){
							  if(ppred==null){//with spinner
							  predicates.put(it.getText(0),
										new AtomicPredicate(//TODO check set
												it.getText(0), pp,CompOperators.fromStr(pop),pnum,tn.getName()));
							  }
							  else{
								  model.parts.Place pt=pp.getMarking().getNet(predicates.get(ppred).getNetName()).getPlaceByName(
										  predicates.get(ppred).getPlace().getName());
								  AtomicPredicate apt=new AtomicPredicate(predicates.get(ppred).getSymbolic(),pt,predicates.get(ppred).getOperator(),
										  predicates.get(ppred).getNumber(),predicates.get(ppred).getNetName());
										
								  predicates.put(it.getText(0),
											new AtomicPredicate(//TODO check set
													it.getText(0), pp,apt, tn.getName()));
							  }
						  }
						  
						  }
								  }
				  //addBuuton action
			
			
			@Override
			public void handleEvent (Event event) {
				widgetSelected(event);
			}
		});
		
		
	}
	
	
	void addPLine(String pname){
		if(Net==null){
			showMessage("There is no suitable net");
		return;
		}

		final TableItem item = new TableItem (ptable, SWT.NONE);
			//TableEditor 
		item.setText(0,pname);
		combEditor = new TableEditor (ptable);
//			Text text = new Text (ptable, SWT.NONE);
//			text.setText("Text");
//			combEditor.grabHorizontal = true;
//			combEditor.setEditor(text, items[i], 0);
//			
//			combEditor = new TableEditor (ptable);
			final CCombo contCombo = new CCombo (ptable, SWT.NONE);
			contCombo.setData(new ctrlData(pname,"Context"));
			contCombo.add(Net.getName());
			for(String s:Net.getElNets().keySet()){
   			contCombo.add(s);
			}
			contCombo.setEditable(false);
			
			contCombo.addSelectionListener(new SelectionListener() {

			  public void widgetSelected(SelectionEvent e) {
String s=item.getText(0);
	   			//contCombo.setData(new ctrlData(item.getText(0),"Context"));
				combEditor = new TableEditor (ptable);
   			placeCombo=new CCombo(ptable, SWT.NONE);
   			placeCombo.setData(new ctrlData(item.getText(0),"Place"));
   			ElNet tn;
   			if(contCombo.getItem(contCombo.getSelectionIndex()).equals(Net.getName())){tn=Net;}
   			else{tn=Net.getENByName(contCombo.getItem(contCombo.getSelectionIndex()));}
   			for(Integer j:tn.getPlaces().keySet()){
			    	//TODO check double places
			    	placeCombo.add(tn.getPlaces().get(j).getName());
			    }
   			placeCombo.setEditable(false);
   			combEditor.grabHorizontal = true;
   			combEditor.setEditor(placeCombo, item, 2);
   			//place combo was set
   			
   			//operators combo setting starts here
   			combEditor = new TableEditor (ptable);
   		    final CCombo opCombo=new CCombo(ptable, SWT.NONE);
   			opCombo.setData(new ctrlData(item.getText(0),"Operator"));
   		    opCombo.add(">");
   		    opCombo.add(">=");
   		    opCombo.add("=");
   		    opCombo.add("!=");
   		    opCombo.add("<=");
   		    opCombo.add("<"); 
  			if(contCombo.getItem(contCombo.getSelectionIndex()).equals(Net.getName())){//system can, can be 'include' in opCombo
  				if(contCombo.getItem(contCombo.getSelectionIndex()).equals(Net.getName())){
		   		    opCombo.add("includes"); 
		   		    }
   			}

   		    opCombo.setEditable(false);  		    

   			//start setting value
   		    opCombo.addSelectionListener(new SelectionListener() {

	  			  public void widgetSelected(SelectionEvent e) {//TODO tocheck
	  				combEditor = new TableEditor (ptable);
	  				  if(opCombo.getItem(opCombo.getSelectionIndex()).equals("includes"))
	  				  {
	  					CCombo predCombo=new CCombo(ptable, SWT.NONE);
			   			predCombo.setData(new ctrlData(item.getText(0),"Predicate"));
			   			for(TableItem it:ptable.getItems()){
						    	//TODO check double preds
			   				for(Control control:ptable.getChildren()){
			   				if(control instanceof CCombo){
						        CCombo ck=(CCombo)control;
						        if(((ctrlData)ck.getData()).pName.equals(it.getText(0)) &&//this line
						        	((ctrlData)ck.getData()).colName.equals("Context")){
						        	int a=ck.getSelectionIndex();
						        	String ss=ck.getItem(ck.getSelectionIndex());
						        	if(!ck.getItem(ck.getSelectionIndex()).equals(Net.getName()))
					   				{
					   				boolean fl=true;
					   				for(String s:predCombo.getItems()){
					   					if(it.getText(0).equals(s))//2+ predicates with the same name
					   						{
					   						
					   						Device device = Display.getCurrent ();
					   						it.setBackground(0, device.getSystemColor(SWT.COLOR_RED));
					   						fl=false;
					   						ptable.redraw();
					   						break;
					   						}
					   						
					   				}
					   				if(fl){
								    	predCombo.add(it.getText(0));
					   				}
					   			}
						        	
						    }
						  }
			   			}
			   				
			   				
						    }
			   			predCombo.setEditable(false);
			   			predCombo.pack();
			   			combEditor.grabHorizontal = true;
			   			combEditor.setEditor(predCombo, item, 4);
			   			//predicate combo was set
	  				  }
	  				  else{
	  					//combEditor = new TableEditor (ptable);
			   		    Spinner nSpinner=new Spinner(ptable, SWT.NONE);
			   		    //nSpinner.setLocation(55,15);
			   		    nSpinner.setDigits(0);
			   		    nSpinner.setSelection(0);
			   		    nSpinner.setData(new ctrlData(item.getText(0),"Spinner"));
			   		    nSpinner.pack();
			   			
			   			combEditor.minimumWidth = nSpinner.getSize ().x;
			   			combEditor.grabHorizontal = true;
			   			combEditor.setEditor (nSpinner, item, 4);
	  				  }
	  									   		    
		   			
			   	  }
				  public void widgetDefaultSelected(SelectionEvent e) {
				  widgetSelected(e);
				  }

				  });

   			combEditor.grabHorizontal = true;
   			combEditor.setEditor(opCombo, item, 3);
   			
   			//operators combo set
   			
   			
	   	  }
		  public void widgetDefaultSelected(SelectionEvent e) {
		  widgetSelected(e);
		  }

		  });
			
			
			combEditor.grabHorizontal = true;
			combEditor.setEditor(contCombo, item, 1);
			
		}
	
	
	void addPLine(){
		if(Net==null){
			showMessage("There is no suitable net");
		return;
		}

		final TableItem item = new TableItem (ptable, SWT.NONE);
			//TableEditor 
		
		combEditor = new TableEditor (ptable);
//			Text text = new Text (ptable, SWT.NONE);
//			text.setText("Text");
//			combEditor.grabHorizontal = true;
//			combEditor.setEditor(text, items[i], 0);
//			
//			combEditor = new TableEditor (ptable);
			final CCombo contCombo = new CCombo (ptable, SWT.NONE);
			//in addPline
			contCombo.setData(new ctrlData(item.getText(0),"Context"));
			contCombo.add(Net.getName());
			for(String s:Net.getElNets().keySet()){
   			contCombo.add(s);
			}
			contCombo.setEditable(false);
			
			contCombo.addSelectionListener(new SelectionListener() {

			  public void widgetSelected(SelectionEvent e) {
				//in addPline
	   			contCombo.setData(new ctrlData(item.getText(0),"Context"));
				combEditor = new TableEditor (ptable);
   			placeCombo=new CCombo(ptable, SWT.NONE);
   			placeCombo.setData(new ctrlData(item.getText(0),"Place"));
   			ElNet tn;
   			if(contCombo.getItem(contCombo.getSelectionIndex()).equals(Net.getName())){tn=Net;}
   			else{tn=Net.getENByName(contCombo.getItem(contCombo.getSelectionIndex()));}
   			for(Integer j:tn.getPlaces().keySet()){
			    	//TODO check double places
			    	placeCombo.add(tn.getPlaces().get(j).getName());
			    }
   			placeCombo.setEditable(false);
   			combEditor.grabHorizontal = true;
   			combEditor.setEditor(placeCombo, item, 2);
   			//place combo was set
   			
   			//operators combo setting starts here
   			combEditor = new TableEditor (ptable);
   		    final CCombo opCombo=new CCombo(ptable, SWT.NONE);
   			opCombo.setData(new ctrlData(item.getText(0),"Operator"));
   		    opCombo.add(">");
   		    opCombo.add(">=");
   		    opCombo.add("=");
   		    opCombo.add("!=");
   		    opCombo.add("<=");
   		    opCombo.add("<"); 
  			if(contCombo.getItem(contCombo.getSelectionIndex()).equals(Net.getName())){//system can, can be 'include' in opCombo
  				if(contCombo.getItem(contCombo.getSelectionIndex()).equals(Net.getName())){
		   		    opCombo.add("includes"); 
		   		    }
   			}

   		    opCombo.setEditable(false);  		    

   			//start setting value
   		    opCombo.addSelectionListener(new SelectionListener() {

	  			  public void widgetSelected(SelectionEvent e) {//TODO tocheck
	  				combEditor = new TableEditor (ptable);
	  				  if(opCombo.getItem(opCombo.getSelectionIndex()).equals("includes"))
	  				  {
	  					CCombo predCombo=new CCombo(ptable, SWT.NONE);
			   			predCombo.setData(new ctrlData(item.getText(0),"Predicate"));
			   			for(TableItem it:ptable.getItems()){
						    	//TODO check double preds
			   				for(Control control:ptable.getChildren()){
				   				if(control instanceof CCombo){
							        CCombo ck=(CCombo)control;
							        if(((ctrlData)ck.getData()).pName.equals(it.getText(0)) &&//this line
							        	((ctrlData)ck.getData()).colName.equals("Context")){
							        	int a=ck.getSelectionIndex();
							        	String ss=ck.getItem(ck.getSelectionIndex());
							        	if(!ck.getItem(ck.getSelectionIndex()).equals(Net.getName()))
						   				{
						   				boolean fl=true;
						   				for(String s:predCombo.getItems()){
						   					if(it.getText(0).equals(s))//2+ predicates with the same name
						   						{
						   						
						   						Device device = Display.getCurrent ();
						   						it.setBackground(0, device.getSystemColor(SWT.COLOR_RED));
						   						fl=false;
						   						ptable.redraw();
						   						break;
						   						}
						   						
						   				}
						   				if(fl){
									    	predCombo.add(it.getText(0));
						   				}
						   			}
							        	
							    }
							  }
				   			}
			   				
//			   				if(!it.getText(1).equals(Net.getName()))
//			   				{
//			   				boolean fl=true;
//			   				for(String s:predCombo.getItems()){
//			   					if(it.getText(0).equals(s))//2+ predicates with the same name
//			   						{
//			   						
//			   						Device device = Display.getCurrent ();
//			   						it.setBackground(0, device.getSystemColor(SWT.COLOR_RED));
//			   						fl=false;
//			   						ptable.redraw();
//			   						break;
//			   						}
//			   						
//			   				}
//			   				if(fl){
//						    	predCombo.add(it.getText(0));
//			   				}
//			   			}
						    }
			   			predCombo.setEditable(false);
			   			predCombo.pack();
			   			combEditor.grabHorizontal = true;
			   			combEditor.setEditor(predCombo, item, 4);
			   			//predicate combo was set
	  				  }
	  				  else{
	  					//combEditor = new TableEditor (ptable);
			   		    Spinner nSpinner=new Spinner(ptable, SWT.NONE);
			   		    nSpinner.setData(new ctrlData(item.getText(0),"Spinner"));
			   		    //nSpinner.setLocation(55,15);
			   		    nSpinner.setSelection(0);
			   		    nSpinner.pack();
			   			
			   			combEditor.minimumWidth = nSpinner.getSize ().x;
			   			combEditor.grabHorizontal = true;
			   			combEditor.setEditor (nSpinner, item, 4);
	  				  }
	  									   		    
		   			
			   	  }
				  public void widgetDefaultSelected(SelectionEvent e) {
				  widgetSelected(e);
				  }

				  });

   			combEditor.grabHorizontal = true;
   			combEditor.setEditor(opCombo, item, 3);
   			
   			//operators combo set
   			
   			
	   	  }
		  public void widgetDefaultSelected(SelectionEvent e) {
		  widgetSelected(e);
		  }

		  });
			
			
			combEditor.grabHorizontal = true;
			combEditor.setEditor(contCombo, item, 1);
			
		}
	void setModText(){
		final TableEditor editor = new TableEditor (ptable);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		ptable.addListener (SWT.MouseDown, new Listener () {
			@Override
			public void handleEvent (Event event) {
				Rectangle clientArea = ptable.getClientArea ();
				Point pt = new Point (event.x, event.y);
				int index = ptable.getTopIndex ();
				while (index < ptable.getItemCount ()) {
					boolean visible = false;
					final TableItem item = ptable.getItem (index);
					for (int i=0; i<ptable.getColumnCount (); i+=5) {
						Rectangle rect = item.getBounds (i);
						if (rect.contains (pt)) {
							final int column = i;
							final Text ptext = new Text (ptable, SWT.NONE);
							Listener textListener = new Listener () {
								@Override
								public void handleEvent (final Event e) {
									switch (e.type) {
										case SWT.FocusOut:
											//item.setText (column, ptext.getText ());
											ptext.dispose ();
											break;
										case SWT.Traverse:
											switch (e.detail) {
												case SWT.TRAVERSE_RETURN:
													item.setText (column, ptext.getText ());
													//FALL THROUGH
												case SWT.TRAVERSE_ESCAPE:
													ptext.dispose ();
													e.doit = false;
											}
											break;
									}
								}
							};
							ptext.addListener (SWT.FocusOut, textListener);
							ptext.addListener (SWT.Traverse, textListener);
							editor.setEditor (ptext, item, i);
							ptext.setText (item.getText (i));
							ptext.selectAll ();
							ptext.setFocus ();
							return;
						}
						if (!visible && rect.intersects (clientArea)) {
							visible = true;
						}
					}
					if (!visible) return;
					index++;
				}
			}
		});
	}
	
	void addRowListener(){
		ptable.addListener (SWT.MouseDoubleClick, new Listener () {

			
			@Override
			public void handleEvent (Event event) {
				addPLine();
			}
			
		});
	}
	
public void setPTable(){
		//-------------------
		final TableEditor editor = new TableEditor (ptable);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		
		setModText();
		addPMenus();
		addRowListener();
		//return data;
	
}
	@Override
	public void createPartControl(Composite parent) {
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    parent.setLayout(layout);
	    

		viewerModel = new TableViewer(parent,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
		ViewContentProvider contentProvider = new ViewContentProvider();
		viewerModel.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					Object[] arraySelection = ((IStructuredSelection) selection).toArray();
					if (arraySelection.length > 0) {
						Object targetSelection = arraySelection[0]; 
						if (contentProviderResults != null && viewerResults != null) {
							contentProviderResults.setTarget(targetSelection);
							contentProviderResults.results.add(new ResultAnalysis(targetSelection.toString()));
							viewerResults.refresh();

						}
					}
				}
			}
		});
		viewerModel.setContentProvider(contentProvider);
		viewerModel.setLabelProvider(new ViewLabelProvider());
		viewerModel.setSorter(new NameSorter());
		viewerModel.setInput(getEditorSite());
		GridData data0 = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		data0.horizontalSpan = 2;
		viewerModel.getTable().setLayoutData(data0);


	   // parseGroup pG=new parseGroup(parent);
	    GridData data1 = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		data1.verticalAlignment = GridData.FILL;
		//pG.setLayoutData(data1);
	    //tableGroup tG=new tableGroup(parent);//TODO
	    
		//text = new Text(parent, SWT.BORDER);
	    //text.setText("AF(qUp)");
	    //CTLformula=text.getText();
//	    GridData data2 = new GridData(SWT.FILL, SWT.FILL, true, true);//sec fill was beginning
//	    data2.horizontalSpan = 2;
//		data2.verticalAlignment = SWT.TOP;
//		data2.heightHint = 70;
//	    text.setLayoutData(data2);
//	    
	   
	  
	  //here comes the predicate table
   		//final Table 
	    
   		
   		ptable = new Table (parent, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		ptable.setLinesVisible (true);
		ptable.setHeaderVisible (true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalSpan=2;
		data.heightHint = 200;
		ptable.setLayoutData(data);
		String[] titles = {"Name", "Context", "Place", "Comparison", "Number", "Description"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (ptable, SWT.NONE);
			column.setText (titles [i]);
		}	

		for (int i=0; i<titles.length; i++) {
			ptable.getColumn (i).pack ();
		}

		setPTable();
   		

   		
   		
   		
//		    final Button cPredButton = new Button(parent, SWT.PUSH);
//		    cPredButton.setText("Add predicates");
//		    cPredButton.addSelectionListener(new SelectionListener() {
//			  public void widgetSelected(SelectionEvent e) {
//				  predicates=new HashMap<String,AtomicPredicate>();
//				  for(TableItem it:ptable.getItems()){
//					  //String ptext="";
//					  model.parts.Place pp=null;
//					  String pop="";
//					  String ppred=null;
//					  int pnum=-1;
//					  ElNet tn=null;
//					  for(Control control : ptable.getChildren()) {
//						  if(control instanceof CCombo){
//						        CCombo ck=(CCombo)control;
//						        if(((ctrlData)ck.getData()).pName.equals(it.getText(0))){//this line
//						        	
//						        	switch(((ctrlData)ck.getData()).colName){
//						        	case "Context":{
//						        		if(ck.getItem(ck.getSelectionIndex()).equals(Net.getName())){
//						        			tn=Net;
//						        		}
//						        		else{tn=Net.getENByName(ck.getItem(ck.getSelectionIndex()));}
//						        		break;
//						        	}
//						        	case "Place":{    
//						        		pp=tn.getPlaceByName(ck.getItem(ck.getSelectionIndex()));
//						        		break;
//						        	}
//						        	case "Operator":{    
//						        		pop=ck.getItem(ck.getSelectionIndex());
//						        		break;
//						        	}
//						        	case "Predicate":{    
//						        		ppred=ck.getItem(ck.getSelectionIndex());
//						        		break;
//						        	}
//						        	}
//						        	
//						    }
//						  }
//						  if(control instanceof Spinner){
//							  Spinner sp=(Spinner)control;
//							  if(((ctrlData)sp.getData()).pName.equals(it.getText(0))){//this line
//									pnum=sp.getSelection();
//							  }
//						  }
//					  }//all parts are set
//					  if(!predicates.keySet().contains(it.getText(0))){
//						  if(ppred==null){//with spinner
//						  predicates.put(it.getText(0),
//									new AtomicPredicate(//TODO check set
//											it.getText(0), pp,CompOperators.fromStr(pop),pnum,tn.getName()));
//						  }
//						  else{
//							  model.parts.Place pt=pp.getMarking().getNet(predicates.get(ppred).getNetName()).getPlaceByName(
//									  predicates.get(ppred).getPlace().getName());
//							  AtomicPredicate apt=new AtomicPredicate(predicates.get(ppred).getSymbolic(),pt,predicates.get(ppred).getOperator(),
//									  predicates.get(ppred).getNumber(),predicates.get(ppred).getNetName());
//									
//							  predicates.put(it.getText(0),
//										new AtomicPredicate(//TODO check set
//												it.getText(0), pp,apt, tn.getName()));
//						  }
//					  }
//					  
//					  }
//							  }
//			  public void widgetDefaultSelected(SelectionEvent e) {
//			  widgetSelected(e);
//			  }
//
//			  });//addBuuton action
   		   	
   		
   		
   	//here comes the formula table
   		ftable = new Table (parent, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
   		ftable.setLinesVisible (true);
   		ftable.setHeaderVisible (true);
   		//GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
   		data.heightHint = 200;
   		ftable.setLayoutData(data);
   		String[] ftitles = {"Name", "Formula", "Description","Result"};
   		for (int i=0; i<ftitles.length; i++) {
   			TableColumn column = new TableColumn (ftable, SWT.NONE);
   			column.setText (ftitles [i]);
   		}	
   		for (int i=0; i<ftitles.length; i++) {
   			ftable.getColumn (i).pack ();
   		}
   		

   		final TableEditor feditor = new TableEditor (ftable);
   		feditor.horizontalAlignment = SWT.LEFT;
   		feditor.grabHorizontal = true;
   		ftable.addListener (SWT.MouseDown, new Listener () {
   			@Override
   			public void handleEvent (Event event) {
   				
   				//-------
   				if (event.button==3 
   						&& ftable.getItem(ftable.getSelectionIndex()).getText(3).equals("false")){ 
   					Menu menu = new Menu (ftable.getShell(), SWT.POP_UP); 
   					MenuItem item = new MenuItem (menu, SWT.PUSH); 
   					item.setText ("Show Trace"); 
   					
   					item.addListener (SWT.Selection, new Listener () {
   						@Override
   						public void handleEvent (Event event) {
   							showMessage(ctlresults.get(ftable.getItem(ftable.getSelectionIndex()).getText(1)).getTrace());
   							
   						}
   					});

   					//draws pop up menu: 
   					Point pt = new Point (event.x, event.y); 
   					pt = ftable.toDisplay (pt); 
   					menu.setLocation (pt.x, pt.y); 
   					menu.setVisible (true); 
   					}
   				//-------
   				
   				Rectangle clientArea = ftable.getClientArea ();
   				Point pt = new Point (event.x, event.y);
   				int index = ftable.getTopIndex ();
   				while (index < ftable.getItemCount ()) {
   					boolean visible = false;
   					final TableItem item = ftable.getItem (index);
   					for (int i=0; i<ftable.getColumnCount ()-1; i++) {
   						Rectangle rect = item.getBounds (i);
   						if (rect.contains (pt)) {
   							final int column = i;
   							final Text ptext = new Text (ftable, SWT.NONE);
   							Listener textListener = new Listener () {
   								@Override
   								public void handleEvent (final Event e) {
   									switch (e.type) {
   										case SWT.FocusOut:
   											item.setText (column, ptext.getText ());
   											ptext.dispose ();
   											break;
   										case SWT.Traverse:
   											switch (e.detail) {
   												case SWT.TRAVERSE_RETURN:
   													item.setText (column, ptext.getText ());
   													//FALL THROUGH
   												case SWT.TRAVERSE_ESCAPE:
   													ptext.dispose ();
   													e.doit = false;
   											}
   											break;
   									}
   								}
   							};
   							ptext.addListener (SWT.FocusOut, textListener);
   							ptext.addListener (SWT.Traverse, textListener);
   							feditor.setEditor (ptext, item, i);
   							ptext.setText (item.getText (i));
   							ptext.selectAll ();
   							ptext.setFocus ();
   							return;
   						}
   						if (!visible && rect.intersects (clientArea)) {
   							visible = true;
   						}
   					}
   					if (!visible) return;
   					index++;
   				}
   			}
   		});
   		
   		
   		
   		ftable.addListener (SWT.MouseDoubleClick, new Listener () {

   			@Override
   			public void handleEvent (Event event) {
   				TableItem item = new TableItem (ftable, SWT.NONE);
   			}
   			
   		});
		   addFMenus();
	    
	    
//	    GridData data3 = new GridData(SWT.FILL, SWT.FILL, true, true);
//	    data3.horizontalSpan = 2;
//		data3.verticalAlignment = GridData.FILL;
//	    pG.setLayoutData(data3);
	    
	    //---    

		makeActions();
		hookContextMenu();
		//hookDoubleClickAction();
	}


	@Override
	public void setFocus() {

		viewerModel.getControl().setFocus();

		

	}

	class ViewContentProvider implements IStructuredContentProvider {

		@Override
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {

			List<Object> result = new ArrayList<>();

			List<TokenTypeElementNet> types;
			List<ElementNetMarked> markeds = new ArrayList<>();

			try {
				types = npnetMarked.getNet().getTypeElementNet();

			} catch (NullPointerException ex) {
				ex.printStackTrace();
				return new Object[1];
			}

			for (TokenTypeElementNet type : types) {
				for (ElementNetMarked marked : type.getElementNetMarkeds()) {
					markeds.add(marked);
				}
			}

			result.add(npnetMarked); // system net
			result.addAll(markeds); // all marked element nets
			result.addAll(reachGraphs); // reach. graphs
			result.addAll(covTrees); // cov. trees

			
			return result.toArray();
		}

	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		public String getColumnText(Object obj, int index) {
			if (obj instanceof NPnetMarked) {
				return "System Marked Net";
			} else if (obj instanceof ElementNetMarked) {
				return "Element Marked Net "
						+ ((ElementNetMarked) obj).getName() + ". Type : "
						+ ((ElementNetMarked) obj).getType().getName();
			} else if (obj instanceof ReachabilityGraph) {
				return "Reachability Graph of "
						+ ((ReachabilityGraph) obj).getNet().getName();
			} else if (obj instanceof CoverabilityTree) {
				return "Coverability Tree of "
						+ ((CoverabilityTree) obj).getNet().getName();
			} else {
				return "error: unknown type";
			}
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}

	}

	class NameSorter extends ViewerSorter {
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewerModel.getControl().getShell(),
				"Results of analysis", message);
	}

//	private void hookDoubleClickAction() {
//		viewerModel.addDoubleClickListener(new IDoubleClickListener() {
//			@Override
//			public void doubleClick(DoubleClickEvent event) {
//				doubleClickAction.run();
//			}
//		});
//	}

	private void makeActions() {

		
		RGbasic = new Action() {
			
			public void run() {
				//TODO check it!!!
				setNet();

				//TPNet Net = new TPNet();
				
		        Graph reis=null;

		        //Net=null;
		        //setExNet();
		        //setCVWNet();
			        try {
						reis=Net.getREIS();
					} catch (Exception e) {
						e.printStackTrace();
					}
			        
			        
			        

			        if(reis!=null){
			        	
			        	PrintWriter zzz = null;
			        	         try
			        	         {
			        	             zzz = new PrintWriter(new FileOutputStream("reachabilityGraph.txt"));
			        	        }
			        	         catch(FileNotFoundException e)
			        	         {
			        	             System.out.println("reachabilityGraph.txt");
			        	         }
			        	         zzz.print(Net.toDot(reis));
			        	         zzz.close();
			        	
					showMessage(reachGraphInfo(reis));
					TReachGraph=reis;
					viewerModel.setContentProvider(new ViewContentProvider());
					
					
//					TableItem item = new TableItem (ptable, SWT.NONE);
//	   	   			item.setText (0, "Modified");
//	   	   			item.setText (1, "Added");
//	  	   			item.setText (2, "Line!");
//					ptable.setVisible(true);
			        }
			        else{
			        	showMessage("RG is null!");
			        }
					
			}
//			void createMarking(pMarking[] mark, Marking m, ArrayList<String> pids)
//			{
//				for(PlaceMarking pm:m.getMap()){
//					//EList<TokenWeight> tms=pm.getMarking().getWeight();
//					if(pm.getMarking().getType().getClass()==TokenTypeAtomic.class)//black tokens TODO CHECK!!
//							{
//						mark[pids.indexOf(pm.getPlace().getUuid())]=new pMarking(
//								pm.getMarking().getWeight().get(0).getWeight().intValue());
//							}
//					//TODO do el nets
////					else{//el. net
////						mark[pids.indexOf(pm.getPlace().getUuid())]=new pMarking();
////						mark[pids.indexOf(pm.getPlace().getUuid())].addNet(pm.getMarking().);
////						mark[pids.indexOf(pm.getPlace().getUuid())]=pm.getMarking().getWeight().get(0).getWeight();	
////					}			
//				}
//			}
		};
		
		
		parseCTL=new Action() {
			public void run() {
				for(TableItem ti:ftable.getItems()){
					
				CTLLexer lexer = new CTLLexer(
						new org.antlr.v4.runtime.ANTLRInputStream(ti.getText(1)));
//				CTLLexer lexer=null;
//				try {
//					lexer = new CTLLexer(new ANTLRFileStream("test.txt"));
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			    CommonTokenStream tokens = new CommonTokenStream(lexer);
			    CTLParser p = new CTLParser(tokens);
			    p.setBuildParseTree(true);
			    p.addParseListener(new CTLBaseListener());
			    ParserRuleContext t = p.f();
				//ctl=((CTLBaseListener)(p.getParseListeners().get(0)))
			    CTLBaseListener q=(CTLBaseListener)(p.getParseListeners().get(0));
			    PrintWriter zzz = null;
   	         try
   	         {
   	             zzz = new PrintWriter(new FileOutputStream("parseTree.txt"));

   	        }
   	         catch(FileNotFoundException e)
   	         {
   	             System.out.println("reachabilityGraph.txt");
   	         }
   	         zzz.print(q.st+"\r\n}");
   	         zzz.close();
			    ctl=q.getFormula();

	   	          System.out.println(ctl.getSymbolic());
				}

			}
		};
		
//		parseCTL=new Action() {
//			public void run() {
//				CTLLexer lexer = new CTLLexer(
//						new org.antlr.v4.runtime.ANTLRInputStream(text.getText()));
////				CTLLexer lexer=null;
////				try {
////					lexer = new CTLLexer(new ANTLRFileStream("test.txt"));
////				} catch (IOException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
//			    CommonTokenStream tokens = new CommonTokenStream(lexer);
//			    CTLParser p = new CTLParser(tokens);
//			    p.setBuildParseTree(true);
//			    p.addParseListener(new CTLBaseListener());
//			    ParserRuleContext t = p.f();
//				//ctl=((CTLBaseListener)(p.getParseListeners().get(0)))
//			    CTLBaseListener q=(CTLBaseListener)(p.getParseListeners().get(0));
//			    PrintWriter zzz = null;
//   	         try
//   	         {
//   	             zzz = new PrintWriter(new FileOutputStream("parseTree.txt"));
//   	             showMessage("Done");
//   	        }
//   	         catch(FileNotFoundException e)
//   	         {
//   	             System.out.println("reachabilityGraph.txt");
//   	         }
//   	         zzz.print(q.st+"\r\n}");
//   	         zzz.close();
//			    ctl=q.getFormula();
//			    
//			}
//		};
		
		modelChecking= new Action() {
			

				public CTLFormula parseF(String s) {
						
					CTLLexer lexer = new CTLLexer(
							new org.antlr.v4.runtime.ANTLRInputStream(s));
//					CTLLexer lexer=null;
//					try {
//						lexer = new CTLLexer(new ANTLRFileStream("test.txt"));
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				    CommonTokenStream tokens = new CommonTokenStream(lexer);
				    CTLParser p = new CTLParser(tokens);
				    p.setBuildParseTree(true);
				    p.addParseListener(new CTLBaseListener());
				    ParserRuleContext t = p.f();
					//ctl=((CTLBaseListener)(p.getParseListeners().get(0)))
				    CTLBaseListener q=(CTLBaseListener)(p.getParseListeners().get(0));
				    PrintWriter zzz = null;
	   	         try
	   	         {
	   	             zzz = new PrintWriter(new FileOutputStream("parseTree.txt"));

	   	        }
	   	         catch(FileNotFoundException e)
	   	         {
	   	             System.out.println("reachabilityGraph.txt");
	   	         }
	   	         zzz.print(q.st+"\r\n}");
	   	         zzz.close();
				    CTLFormula ctlf=q.getFormula();

		   	          System.out.println(ctlf.getSymbolic());
		   	          return ctlf;
					

				}
				
				
				
				void recSetPred(CTLFormula cf){
					if(cf.getDepth()==1){
						if(cf.getSymbolic().equals("1")){
							cf.setAP(new AtomicPredicate("1"));
							return;
						}
						if(cf.getSymbolic().equals("0")){
							cf.setAP(new AtomicPredicate("0"));	
							return;
						}
						cf.setAP(predicates.get(cf.getSymbolic()));
						return;// cf;
					}
					recSetPred(cf.getFirst());
					if(cf.hasSecond()){
						recSetPred(cf.getSecond());}
					
				}
				
				CTLFormula setPredicatesToCTL(CTLFormula cf){
					recSetPred(cf);
					return cf;
				}

			
			public void run() {			        
				//TODO is temp
				if(TReachGraph!=null && Net!=null){


	
					
					
					ModelChecker ch=new ModelChecker(TReachGraph);


					
					
					//одновременный запуск
						for(TableItem ti:ftable.getItems()){
							
							CTLResult res=null;
			   	          try {
			   	        	  CTLFormula cf=parseF(ti.getText(1));
			   	        	setPredicatesToCTL(cf);
							res=ch.check(cf,Net.getIS());
							ctlresults.put(ti.getText(1), res);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			   	       //System.out.println(fr.getSymbolic()+" is "+b);
			   	       ti.setText(3, ""+res.getResult());
			   	    Device device = Display.getCurrent ();
			   	       if(res.getResult()){
			   	    	ti.setBackground(3, device.getSystemColor(SWT.COLOR_GREEN));
			   	       }
			   	       else{
   						ti.setBackground(3, device.getSystemColor(SWT.COLOR_RED));
			   	       }
			   	       ftable.redraw();
						}
					
					
				}
				else{
					showMessage("No reachability graph");
				}
				
				
//				ISelection selection = viewerModel.getSelection();
//				Object obj = ((IStructuredSelection) selection)
//						.getFirstElement();
				}
			
		};
		
		parseCTL.setText("ParseCTL");
		modelChecking.setText("Model Checking");
		modelChecking.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		RGbasic.setText("Reachability graph construction");
		RGbasic.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});

		Menu menu = menuMgr.createContextMenu(viewerModel.getControl());
		viewerModel.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewerModel);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(RGbasic);
		manager.add(modelChecking);
		manager.add(parseCTL);

		// Other plug-ins can contribute their actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	
	


	/**
	 * Returns textual information about reachability graph
	 */
	public String reachGraphInfo(ReachabilityGraph graph) {
		String result = "Reachability Graph was constructed. Its arcs are the following:\n\n";

		for (int i = 0; i < graph.getArcs().size(); i++) {
			result += Arrays.toString(graph.getArcs().get(i).getFromMarking());
			result += " ->(" + graph.getArcs().get(i).getTransition().getName()
					+ ") ";
			result += Arrays.toString(graph.getArcs().get(i).getToMarking())
					+ "\n";
		}

		return result;
	}
	
	public String reachGraphInfo(Graph graph) {
		String result = "Reachability Graph was constructed. Its arcs are the following:\n\n";

		for(State s:graph.getVertices().keySet()){
			result +=s.toString();
		}
//		for (int i = 0; i < graph.getEdges().size(); i++) {
//			
//			result += graph.getEdges().get(i).from().toString();
//			result += " ->(" + graph.getEdges().get(i).getTrans().getName()+") ";
//			result += graph.getEdges().get(i).to().toString()+ "\n";
//		}

		return result;
	}
	
	
	
	
	public void saveFTable(String fileName) throws Exception{
		Document doc=null;
		  DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		  DocumentBuilder db=dbf.newDocumentBuilder();
		  doc=db.newDocument();
		  Element element = doc.createElement("root");
		  doc.appendChild(element);
		  	    
		  for(TableItem it:ftable.getItems()){
		
		  // add element after the first child of the root element
		  Element predElement = doc.createElement("formula");
		  element.appendChild(predElement);
		  // add an attribute to the node
		  predElement.setAttribute("name", it.getText(0));
		  //predElement.setAttribute("number", it.getText(4));
		  predElement.setAttribute("text", it.getText(1));
		  predElement.setAttribute("description", it.getText(2));
		  predElement.setAttribute("result", it.getText(3));
		  }
		  predPrint(doc, fileName);
	}
	
	public void loadFTable(String fileName) throws ParserConfigurationException, SAXException, IOException{
    	
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
	 
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
	 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("formula");

		ftable.clearAll();
		ftable.removeAll();
		for(Control c:ftable.getChildren()){
			c.dispose();
		}
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			 
			org.w3c.dom.Node nNode = nList.item(temp);
			
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				System.out.println("F name : " + eElement.getAttribute("name"));
				System.out.println("F desc : " + eElement.getAttribute("description"));
				System.out.println("F text : " + eElement.getAttribute("contextInd"));
				System.out.println("F result: " + eElement.getAttribute("placeInd"));
				TableItem item = new TableItem (ftable, SWT.NONE);
				item.setText(0, eElement.getAttribute("name"));
				item.setText(1, eElement.getAttribute("text"));
				item.setText(2, eElement.getAttribute("description"));
				item.setText(3, eElement.getAttribute("result"));
				if(item.getText(3).equals("true")){
					Device device = Display.getCurrent ();
						item.setBackground(3, device.getSystemColor(SWT.COLOR_GREEN));
				}
				else{
					Device device = Display.getCurrent ();
					item.setBackground(3, device.getSystemColor(SWT.COLOR_RED));
					
				}

				
	 
			}
		}
		  
    	
	}
	
	
	public void savePTable(String fileName) throws Exception{
		Document doc=null;
		  DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		  DocumentBuilder db=dbf.newDocumentBuilder();
		  doc=db.newDocument();
		  Element element = doc.createElement("root");
		  doc.appendChild(element);
		  	    
		  for(TableItem it:ptable.getItems()){
		
		  // add element after the first child of the root element
		  Element predElement = doc.createElement("predicate");
		  element.appendChild(predElement);
		  // add an attribute to the node
		  predElement.setAttribute("name", it.getText(0));
		  //predElement.setAttribute("number", it.getText(4));
		  predElement.setAttribute("description", it.getText(5));
		  
		  
		  for(Control control : ptable.getChildren()) {
			  if(control instanceof CCombo){
			        CCombo ck=(CCombo)control;
			        if(((ctrlData)ck.getData()).pName.equals(it.getText(0))){
			        	switch(((ctrlData)ck.getData()).colName){
			        	case "Context":{
			        		predElement.setAttribute("contextInd", ""+ck.getSelectionIndex());
			        		//Element contElement = doc.createElement("context");
			      		  //predElement.appendChild(contElement);
			      		  //contElement.setAttribute("selected", ""+ck.getSelectionIndex());
			      		  //TODO get all the combobox
			      		  for(String s:ck.getItems()){
			      			Element combElement = doc.createElement("contextCombo");
//				      		  contElement.appendChild(combElement);
				      		  combElement.setAttribute("name", s);  
			      			predElement.appendChild(combElement);
				      		  //predElement.setAttribute("name", s); 
			      		  }
			        		break;
			        	}
			        	case "Place":{        		
			        		predElement.setAttribute("placeInd", ""+ck.getSelectionIndex());
			        		
			      		  //TODO get all the combobox
			      		  for(String s:ck.getItems()){
			      			Element combElement = doc.createElement("placeCombo");
			      			combElement.setAttribute("name", s);  
			      			predElement.appendChild(combElement);
				      		}
			        		break;
			        	}
			        	case "Operator":{
			        		predElement.setAttribute("opInd", ""+ck.getSelectionIndex());
			        		
			        		for(String s:ck.getItems()){
			      			Element combElement = doc.createElement("operatorCombo");
			      			combElement.setAttribute("name", s);  
			      			predElement.appendChild(combElement);
			      		  }
			        		break;
			        	}
			        	case "Predicate":{
			        		predElement.setAttribute("number", ""+ck.getSelectionIndex());
			        		
			        		break;
			        	}
			        	}
			        }
			    }
			  else{ if(control instanceof Spinner){//Spinner TODO
				  Spinner sp=(Spinner)control;
				  if(((ctrlData)sp.getData()).pName.equals(it.getText(0))){
				  //Element contElement = doc.createElement("number");
	      		  //predElement.appendChild(contElement);
	      		  predElement.setAttribute("number", ""+sp.getSelection());
			  }
			  }
			  }
		  }
	}	      	
		
		predPrint(doc, fileName);
	}
	
	public  void predPrint(Document xml, String fileName) throws Exception {
		PrintWriter zzz = null;
        try
        {
            zzz = new PrintWriter(new FileOutputStream(fileName));
       }
        catch(FileNotFoundException e)
        {
            System.out.println("no "+fileName);
        }
		Transformer tf = TransformerFactory.newInstance().newTransformer();
//		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(xml), new StreamResult(out));
        zzz.print(out.toString());;
        zzz.close();
		//return(out.toString());
	}
	

	
	public void renewPTable(HashMap<String,Integer> contInds,HashMap<String,Integer> placeInds,
			HashMap<String,Integer> opInds, HashMap<String,Integer> nums){
		for(TableItem item2:ptable.getItems()){
			final TableItem item=item2; 
			
			for(Control control : ptable.getChildren()) {
				
				  if(control instanceof CCombo){
				        CCombo ck=(CCombo)control;
				        if(((ctrlData)ck.getData()).pName.equals(item.getText(0))){
				        	if(((ctrlData)ck.getData()).colName.equals("Context")){
				        		ck.select(contInds.get(item.getText(0)));
					   			ck.notifyListeners(SWT.Selection,new Event());
				        		}
				    }
				  }
			  }//context combos
		}
		for(TableItem item2:ptable.getItems()){
			final TableItem item=item2; 
			
			for(Control control : ptable.getChildren()) {//places and operators
				  if(control instanceof CCombo){
				        CCombo ck=(CCombo)control;
				        if(((ctrlData)ck.getData()).pName.equals(item.getText(0))){
				        	if(((ctrlData)ck.getData()).colName.equals("Place")){
				        		ck.select(placeInds.get(item.getText(0)));
					   			ck.notifyListeners(SWT.Selection,new Event());
				        		}
				        	else{if(((ctrlData)ck.getData()).colName.equals("Operator")){
				        		ck.select(opInds.get(item.getText(0)));
					   			ck.notifyListeners(SWT.Selection,new Event());
				        		}}
				    }
				  }
//				  else{ if(control instanceof Spinner){//Spinner TODO
//					  Spinner sp=(Spinner)control;
//					  //Element contElement = doc.createElement("number");
//		      		  //predElement.appendChild(contElement);
//		      		  sp.setDigits(contInds.get(item.getText(0)));
//				  }
//				  }
			  }
			
			
			for(Control control : ptable.getChildren()) {
				if(control instanceof CCombo){
			        CCombo ck=(CCombo)control;
			        if(((ctrlData)ck.getData()).pName.equals(item.getText(0))){
			        	if(((ctrlData)ck.getData()).colName.equals("Predicate")){
			        		ck.select(nums.get(item.getText(0)));
				   			}
			    }
			  }
				    if(control instanceof Spinner){//Spinner TODO
					  Spinner sp=(Spinner)control;
					  if(((ctrlData)sp.getData()).pName.equals(item.getText(0))){
						  sp.setSelection(nums.get(item.getText(0)));
				    }
					  
				  }
				  
			  }
			
		}
		
	}
	
	
	public void loadPTable(String fileName) throws ParserConfigurationException, SAXException, IOException{
    	
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
	 
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
	 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	 
		NodeList nList = doc.getElementsByTagName("predicate");

		ptable.clearAll();
		ptable.removeAll();
		for(Control c:ptable.getChildren()){
			c.dispose();
		}
		
		HashMap<String,Integer> contInds=new HashMap<String,Integer>();
		HashMap<String,Integer> placeInds=new HashMap<String,Integer>();
		HashMap<String,Integer> opInds=new HashMap<String,Integer>();
		HashMap<String,Integer> nums=new HashMap<String,Integer>();
		for (int temp = 0; temp < nList.getLength(); temp++) {
			 
			org.w3c.dom.Node nNode = nList.item(temp);
			
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 
			if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				System.out.println("Pr name : " + eElement.getAttribute("name"));
				System.out.println("Pr desc : " + eElement.getAttribute("description"));
				System.out.println("Pr cont ind : " + eElement.getAttribute("contextInd"));
				System.out.println("Pr placeind : " + eElement.getAttribute("placeInd"));
				System.out.println("Pr op ind : " + eElement.getAttribute("opInd"));
				System.out.println("Num : " + eElement.getAttribute("number"));
				addPLine(eElement.getAttribute("name"));
				TableItem item=ptable.getItem(ptable.getItems().length-1);//new TableItem(ptable, SWT.NONE);
				item.setText(0, eElement.getAttribute("name"));
				item.setText(5, eElement.getAttribute("description"));
//				combEditor = new TableEditor (ptable);
//				final CCombo contCombo = new CCombo (ptable, SWT.NONE);
//				contCombo.setData(new ctrlData(item.getText(0),"Context"));
				contInds.put(eElement.getAttribute("name"),Integer.parseInt(eElement.getAttribute("contextInd")));
				placeInds.put(eElement.getAttribute("name"),Integer.parseInt(eElement.getAttribute("placeInd")));
				opInds.put(eElement.getAttribute("name"),Integer.parseInt(eElement.getAttribute("opInd")));
				int a=Integer.parseInt(eElement.getAttribute("number"));
				nums.put(eElement.getAttribute("name"),Integer.parseInt(eElement.getAttribute("number")));
				
//				for(int i=0; i<eElement.getChildNodes().getLength();i++){
//					if (eElement.getChildNodes().item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE){
//					Element elt = (Element)(eElement.getChildNodes().item(i));
//					if(elt.getNodeName().equals("contextCombo")){
//						System.out.println("CC : " + elt.getAttribute("name"));
//		
//						continue;
//					}
//					if(elt.getNodeName().equals("placeCombo")){
//						System.out.println("Place : " + elt.getAttribute("name"));
//						continue;
//					}
//					if(elt.getNodeName().equals("operatorCombo")){
//						System.out.println("Operator : " + elt.getAttribute("name"));
//						continue;
//					}
//				}
//				}
				
	 
			}
		}
		
			  renewPTable(contInds, placeInds, opInds, nums);  
    	
	}
	
//	public String reachGraphInfo(Graph graph) {
//		String result = "Reachability Graph was constructed. Its arcs are the following:\n\n";
//
//		for (int i = 0; i < graph.getEdges().size(); i++) {
//			
//			result += graph.getEdges().get(i).from().toString();
//			result += " ->(t" + graph.getEdges().get(i).getTrans().getNumber()+") ";
//			result += graph.getEdges().get(i).to().toString()+ "\n";
//		}
//
//		return result;
//	}
}
