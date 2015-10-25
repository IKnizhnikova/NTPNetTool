package tpnchecker.editors;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.ANTLRFileStream;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.Token;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.IFileEditorInput;

import algorithms.*;
import algorithms.TPNet.State;
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
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class NPNEditor extends EditorPart {
	
	
	 private int parseLeft(String s){
		 int res=0;
     	if(s.indexOf("[")<s.indexOf(";")){
     		try{
		 res=Integer.parseInt(s.substring(s.indexOf("["), s.indexOf(";")));
     		}
     		catch(Exception e){
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
     			res=Integer.parseInt(s.substring(s.indexOf(";"), s.indexOf("]")));
     		}
     		catch(Exception e){
     			res=-1;
     			
     		}
     	}
     	return res;
     	
     }
	
	
	
     	class parseGroup extends Composite {
     		  public parseGroup(Composite parent) {
     		    super(parent, SWT.NONE);
     		    Group group = new Group(this, SWT.SHADOW_ETCHED_IN);
     		    group.setText("Set predicates");
     		    
     		    GridLayout layout = new GridLayout();
     		    layout.numColumns = 3;
     		    group.setLayout(layout);
     		    
     		    final Combo predCombo=new Combo(group, SWT.NONE);
     		    final Combo placeCombo=new Combo(group, SWT.NONE);
    			//predCombo.setLocation(5,15);
    			predCombo.pack();
    		   
    		    final Combo opCombo=new Combo(group, SWT.NONE);
    		    opCombo.add(">");
    		    opCombo.add(">=");
    		    opCombo.add("=");
    		    opCombo.add("!=");
    		    opCombo.add("<=");
    		    opCombo.add("<");  
    		    //opCombo.setLocation(30,15);
   		    	opCombo.pack();
   			
    		    final Spinner nSpinner=new Spinner(group, SWT.NONE);
    		    //nSpinner.setLocation(55,15);
    		    nSpinner.setDigits(0);
    		    nSpinner.pack();

     		    
     		    Label label = new Label(group, SWT.NONE);
     		    label.setText("Text\nText\nqwertyuiopiuytrdsadfghjk");
     		    //label.setAlignment(SWT.CENTER);
     		    //label.setLocation(5, 60);
     		    label.pack();
     		    

     		    final Button addButton = new Button(group, SWT.PUSH);
     		    addButton.setText("Add predicate");
     		    addButton.addSelectionListener(new SelectionListener() {
      			  public void widgetSelected(SelectionEvent e) {
      				if(predCombo.getSelectionIndex()>=0 &&opCombo.getSelectionIndex()>=0){

      					predicates.add(new AtomicPredicate(//TODO
      							predCombo.getItem(predCombo.getSelectionIndex())));
      				}

      			  // 
      			  }
      			  public void widgetDefaultSelected(SelectionEvent e) {
      			  widgetSelected(e);
      			  }

      			  });//addBuuton action
     		   
     		    
     		    final Button cButton = new Button(group, SWT.PUSH);
     	  	    cButton.setText("Check formula");
    		    cButton.setEnabled(false);
    		    
     		    Button pButton = new Button(group, SWT.PUSH);
     		    pButton.setText("Parse formula");
     		    //button1.setLocation(20, 45);
     		    
     		    pButton.addSelectionListener(new SelectionListener() {
     			  public void widgetSelected(SelectionEvent e) {
     				 CTLLexer lexer=null;
     				try {
     					lexer = new CTLLexer(new ANTLRFileStream("test.txt"));
     				} catch (IOException e1) {
     					// TODO Auto-generated catch block
     					e1.printStackTrace();
     				}
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
        	             showMessage("Done");
        	        }
        	         catch(FileNotFoundException e1)
        	         {
        	             System.out.println("parseTree.txt");
        	         }
        	         zzz.print(q.st+"\r\n}");
        	         zzz.close();
     			    ctl=q.getFormula();
     			    for(String ap:q.atomic){
     			    predCombo.add(ap);
     			    }
     			    cButton.setEnabled(true);

     			  // 
     			  }
     			  public void widgetDefaultSelected(SelectionEvent e) {
     			  widgetSelected(e);
     			  }

     			  });
     		    
     		    pButton.pack();

     		    
     		    //button2.setBounds(20, 75, 90, 30);
     		    
     		    
   			
     		    group.pack();
     		  }
     		}	
	
	

	private ContentProviderResults contentProviderResults =
			new ContentProviderResults();

	private TableViewer viewerModel;
	private TableViewer viewerResults;
	private Resource resourceNPN;
	private NPnetMarked npnetMarked;
	private List<ReachabilityGraph> reachGraphs = new ArrayList<>();
	private List<Graph> TReachGraphs = new ArrayList<>();
	private List<CoverabilityTree> covTrees = new ArrayList<>();

	private Action doubleClickAction;
	private Action freeChoiceAnalysis;
	private Action extFreeChoiceAnalysis;
	private Action covTreeConstruction;
	private Action reachGraphConstruction;
	private Action farkasAlgorithm;
	private Action RGbasic;
	private Action modelChecking;
	private Action parseCTL;
	
//	private Combo predCombo;
//	private Combo opCombo;
//	private Spinner nSpinner;
//	private Button parseButton;
//	private Button checkButton;
//	private Group pGroup;
//	private Label parseLabel;
	
	private ArrayList<AtomicPredicate> predicates=new ArrayList<AtomicPredicate>();
	private String CTLformula;
	private HashSet<String> atomic;
	//private CTLFormula f;
	CTLFormula ctl;

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

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
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
		viewerModel.getTable().setLayoutData(data0);

		viewerResults = new TableViewer(parent,
				SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		Table table = viewerResults.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		GridData data1 = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		data1.verticalAlignment = GridData.FILL;
		table.setLayoutData(data1);
		
		//viewerModel.set

		ResultAnalysis result1 = new ResultAnalysis("Free choiceness");
		result1.setResult(Boolean.TRUE);
		contentProviderResults.results.add(result1);

		viewerResults.setContentProvider(contentProviderResults);
		createColumnsResults(parent, viewerResults);

		// viewerResults.setLabelProvider(new LabelProviderResults());
		viewerResults.setSorter(new NameSorter());
		viewerResults.setInput(getEditorSite());
		
		Text text = new Text(parent, SWT.BORDER);
	    text.setText("HEeeleo");
	    CTLformula=text.getText();
	    
	    GridData data2 = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
	    data2.horizontalSpan = 2;
		data2.verticalAlignment = GridData.FILL;
	    text.setLayoutData(data2);
	    
	    //TODO---
	    //pGroup=new Group(parent, 0);
//	    parseButton=new Button(parent, 2);
//	    checkButton=new Button(parent, 2);
//	    predCombo=new Combo(parent, 0);
//	    opCombo=new Combo(parent, 0);
//	    nSpinner=new Spinner(parent, 1);
	    parseGroup pG=new parseGroup(parent);
	    
	    //---    

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
	}

	// This will create the columns for the table
	private void createColumnsResults(final Composite parent,
			final TableViewer viewer) {
		String[] titles = { "Analysis type", "Result" };
		int[] bounds = { 100, 100 };

		// First column is for the first name
		TableViewerColumn col = createTableViewerColumn(viewer, titles[0],
				bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				String res = "unknown";
				if (element instanceof ResultAnalysis) {
					res = ((ResultAnalysis) element).getName();
				}
				return res;
			}
		});

		// Second column is for the last name
		col = createTableViewerColumn(viewer, titles[1], bounds[1], 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				String res = "unknown";
				if (element instanceof ResultAnalysis) {
					Object verdict = ((ResultAnalysis) element).getResult();
					if (verdict != null) {
						res = verdict.toString();
					}
				}
				return res;
			}
		});

	}

	private TableViewerColumn createTableViewerColumn(TableViewer viewer,
			String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
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

	private void hookDoubleClickAction() {
		viewerModel.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void makeActions() {
		freeChoiceAnalysis = new Action() {
			public void run() {
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;

				if (obj instanceof NPnetMarked) {
					net = ((NPnetMarked) obj).getNet().getNetSystem();
				} else if (obj instanceof ElementNetMarked) {
					net = ((ElementNetMarked) obj).getType().getNet();
				} else {
					showMessage("This is not applicable to given type!");
					return;
				}

				List<Transition> notFCtransitions = FreeChoice
						.notFreeChoiceT(net);

				String result;

				if (notFCtransitions.size() == 0) {
					result = "The given net is free-choice.";
				} else {
					result = "The following transitions make the given net not free-choice:\n\n";

					for (Transition t : notFCtransitions) {
						result += t.getName() + "\n";
					}
				}

				showMessage(result);
			}
		};

		extFreeChoiceAnalysis = new Action() {
			public void run() {
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;

				if (obj instanceof NPnetMarked) {
					net = ((NPnetMarked) obj).getNet().getNetSystem();
				} else if (obj instanceof ElementNetMarked) {
					net = ((ElementNetMarked) obj).getType().getNet();
				} else {
					showMessage("This is not applicable to given type!");
					return;
				}

				List<Pair<Transition>> notFCpairs = FreeChoice
						.notExtFreeChoiceT(net);

				String result;

				if (notFCpairs.size() == 0) {
					result = "The given net is extended free-choice.";
				} else {
					result = "The following pairs of transitions make the given net not extended free-choice:\n\n";

					for (Pair<Transition> pair : notFCpairs) {
						result += pair.getT1().getName() + " - "
								+ pair.getT2().getName() + "\n";
					}
				}

				showMessage(result);
			}
		};

		reachGraphConstruction = new Action() {
			public void run() {
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;
				Marking m = null;

				if (obj instanceof NPnetMarked) {
					net = ((NPnetMarked) obj).getNet().getNetSystem();
					m = ((NPnetMarked) obj).getMarking();
				} else if (obj instanceof ElementNetMarked) {
					net = ((ElementNetMarked) obj).getType().getNet();
					m = ((ElementNetMarked) obj).getMarking();
				} else {
					showMessage("This is not applicable to given type!");
					return;
				}

				ReachabilityGraph reachGraph = new ReachabilityGraph(
						npnetMarked, net, m);

				showMessage(reachGraphInfo(reachGraph));
				reachGraphs.add(reachGraph);
				viewerModel.setContentProvider(new ViewContentProvider());
			}
		};

		covTreeConstruction = new Action() {
			public void run() {
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;
				Marking m = null;

				if (obj instanceof NPnetMarked) {
					net = ((NPnetMarked) obj).getNet().getNetSystem();
					m = ((NPnetMarked) obj).getMarking();
				} else if (obj instanceof ElementNetMarked) {
					net = ((ElementNetMarked) obj).getType().getNet();
					m = ((ElementNetMarked) obj).getMarking();
				} else {
					showMessage("This is not applicable to given type!");
					return;
				}

				CoverabilityTree covTree = new CoverabilityTree(npnetMarked,
						net, m);

				showMessage(covTreeInfo(covTree));
				covTrees.add(covTree);
				viewerModel.setContentProvider(new ViewContentProvider());
			}
		};

		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				ReachabilityGraph graph = null;
				CoverabilityTree tree = null;

				if (obj instanceof ReachabilityGraph) {
					graph = ((ReachabilityGraph) obj);
				} else if (obj instanceof CoverabilityTree) {
					tree = ((CoverabilityTree) obj);
				} else {
					showMessage("This is not applicable to given type!");
					return;
				}

				if (graph == null) {
					showMessage(covTreeInfo(tree));
				} else {
					showMessage(reachGraphInfo(graph));
				}
			}
		};

		farkasAlgorithm = new Action() {
			public void run() {
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;

				
				if (obj instanceof NPnetMarked) {
					net = ((NPnetMarked) obj).getNet().getNetSystem();
				} else if (obj instanceof ElementNetMarked) {
					net = ((ElementNetMarked) obj).getType().getNet();
				} else {
					showMessage("This is not applicable to given type!");
					return;
				}
				
		       
		        

				int[][] PInvariants = new Farkas(net).getPInvariants();

				String result = "Net has the following P-Invariants and their linear combinations:\n\n";

				for (int[] inv : PInvariants) {
					result += Arrays.toString(inv) + "\n";
				}

				showMessage(result);
			}
		};
		
		
		
		RGbasic = new Action() {
			public void run() {

				TPNet Net = new TPNet();
		        Graph reis=null;
				ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;
				Marking m = null;

				if (obj instanceof NPnetMarked) {
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
				for (Node node : net.getNodes()) {
				    if (node instanceof Place) {
				    	//Place p=(Place)node;
				    	//places.add((Place)node);
				    	Net.AddPlace();
				    	pids.add(((Place)node).getUuid());
				    } else {
				    	//transitions.add((Transition)node);
				    	Net.AddTransition(parseLeft(((Transition)node).getName()), parseRight(((Transition)node).getName()));
				    	tids.add(((Transition)node).getUuid());
				    	
				    }
				}
				
				for (Arc arc : net.getArcs()) {
					if(arc instanceof ArcPT){
					ArcPT a=(ArcPT)arc;
				    Net.AddArc(pids.indexOf(a.getSource().getUuid()),
				    		tids.indexOf(a.getTarget().getUuid()), true);
					}
					else{
						ArcTP a=(ArcTP)arc;
						Net.AddArc(pids.indexOf(a.getTarget().getUuid()),
					    		tids.indexOf(a.getSource().getUuid()), false);
					}
				}
				
				BigInteger[] mark=new BigInteger[pids.size()];
				
              /* for(int i=0; i<m.getMap().size();i++){
            	   EList<TokenWeight> tms;
					tms=m.getMap().get(i).getMarking().getWeight();
            	   mark[pids.indexOf(m.getMap().get(i).getPlace().getUuid())]=
            			   m.getMap().get(i).getMarking().getWeight().get(0).getWeight();
					
				}*/
				
				
				for(PlaceMarking pm:m.getMap()){
					//EList<TokenWeight> tms=pm.getMarking().getWeight();
					mark[pids.indexOf(pm.getPlace().getUuid())]=pm.getMarking().getWeight().get(0).getWeight();				
				}
				
				
				
				//Net completed
				//Set marking!
				
				try {
			           Net.setPMarking(mark);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			       
			        Net.setInitialTMarking();
			        Net.letInitialState();
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
					TReachGraphs.add(reis);
					viewerModel.setContentProvider(new ViewContentProvider());
			        }
			        else{
			        	showMessage("RG is null!");
			        }
					
			}
		};
		
		parseCTL=new Action() {
			public void run() {
				CTLLexer lexer=null;
				try {
					lexer = new CTLLexer(new ANTLRFileStream("test.txt"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
   	             showMessage("Done");
   	        }
   	         catch(FileNotFoundException e)
   	         {
   	             System.out.println("reachabilityGraph.txt");
   	         }
   	         zzz.print(q.st+"\r\n}");
   	         zzz.close();
			    ctl=q.getFormula();
			    
			}
		};
		
		modelChecking= new Action() {
			public void run() {
//				CTLLexer lexer=null;
//				try {
//					lexer = new CTLLexer(new ANTLRFileStream("test.txt"));
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
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
//   	        }
//   	         catch(FileNotFoundException e)
//   	         {
//   	             System.out.println("reachabilityGraph.txt");
//   	         }
//   	         zzz.print(q.st+"\r\n}");
//   	         zzz.close();
//			    ctl=q.getFormula();
				
				TPNet Net = new TPNet();
		        ISelection selection = viewerModel.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				HighLevelPetriNet net = null;
				Marking m = null;

				if (obj instanceof NPnetMarked) {
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
				for (Node node : net.getNodes()) {
				    if (node instanceof Place) {
				    	//Place p=(Place)node;
				    	//places.add((Place)node);
				    	Net.AddPlace();
				    	pids.add(((Place)node).getUuid());
				    } else {
				    	//transitions.add((Transition)node);
				    	Net.AddTransition(parseLeft(((Transition)node).getName()), parseRight(((Transition)node).getName()));
				    	tids.add(((Transition)node).getUuid());
				    	
				    }
				}
				
				for (Arc arc : net.getArcs()) {
					if(arc instanceof ArcPT){
					ArcPT a=(ArcPT)arc;
				    Net.AddArc(pids.indexOf(a.getSource().getUuid()),
				    		tids.indexOf(a.getTarget().getUuid()), true);
					}
					else{
						ArcTP a=(ArcTP)arc;
						Net.AddArc(pids.indexOf(a.getTarget().getUuid()),
					    		tids.indexOf(a.getSource().getUuid()), false);
					}
				}
				
				BigInteger[] mark=new BigInteger[pids.size()];
				
				for(PlaceMarking pm:m.getMap()){
					//EList<TokenWeight> tms=pm.getMarking().getWeight();
					mark[pids.indexOf(pm.getPlace().getUuid())]=pm.getMarking().getWeight().get(0).getWeight();				
				}

				
				try {
			           Net.setPMarking(mark);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			       
			        Net.setInitialTMarking();
			        Net.letInitialState();

			        
				//TODO is temp
				if(TReachGraphs.size()>0){
//					CTLFormula f1=new CTLFormula(new AtomicPredicate("p", Net.getPlaces().get(0), CompOperators.EQUAL, 0));
//					CTLFormula f2=new CTLFormula(new AtomicPredicate("q", Net.getPlaces().get(1), CompOperators.EQUAL, 1));
//					CTLFormula f3=new CTLFormula(Operators.NOT, f1,"!p");
//					CTLFormula fr =new CTLFormula(Operators.OR, f3,f2,"(!p)|(q)");
					
//					CTLFormula f1=new CTLFormula(new AtomicPredicate("p", Net.getPlaces().get(1), CompOperators.EQUAL, 1));
//					CTLFormula f2=new CTLFormula(new AtomicPredicate("q", Net.getPlaces().get(2), CompOperators.LARGER, 1));
//					CTLFormula fr =new CTLFormula(Operators.E, f1, Operators.U, f2,"E(pUq)");
					
//					CTLFormula f1=new CTLFormula(new AtomicPredicate("p", Net.getPlaces().get(2), CompOperators.LARGER, 1));
//					CTLFormula f2=new CTLFormula(new AtomicPredicate("q", Net.getPlaces().get(1), CompOperators.LARGER, 1));
//					CTLFormula f3=new CTLFormula(Operators.OR, f1, f2,"(p)|(q)");
//					CTLFormula fr =new CTLFormula(Operators.AF, f3,"AF((p)|(q))");
					
					CTLFormula f1=new CTLFormula(new AtomicPredicate("p", Net.getPlaces().get(0), CompOperators.EQUAL, 0));
					CTLFormula f2=new CTLFormula(new AtomicPredicate("q", Net.getPlaces().get(1), CompOperators.LARGER, 0));
					CTLFormula f3=new CTLFormula(Operators.NOT, f1,"!p");
					CTLFormula f4 =new CTLFormula(Operators.OR, f3,f2,"(!p)|(q)");
					CTLFormula fr =new CTLFormula(Operators.EX, f4,"EX((!p)|(q))");
					
					ModelChecker ch=new ModelChecker(TReachGraphs.get(0));
					try {
						showMessage(fr.getSymbolic()+" is "+ch.check(fr));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
		freeChoiceAnalysis.setText("Free Choice Analysis");
		freeChoiceAnalysis.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		extFreeChoiceAnalysis.setText("Extended Free Choice Analysis");
		extFreeChoiceAnalysis.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		reachGraphConstruction.setText("Reachability Graph Construction");
		reachGraphConstruction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		covTreeConstruction.setText("Coverability Tree Construction");
		covTreeConstruction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		doubleClickAction.setText("Get Graph Information");
		doubleClickAction.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		farkasAlgorithm.setText("Find P-Invariants using Farkas Algorithm");
		farkasAlgorithm.setImageDescriptor(PlatformUI.getWorkbench()
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
		manager.add(freeChoiceAnalysis);
		manager.add(extFreeChoiceAnalysis);
		manager.add(reachGraphConstruction);
		manager.add(covTreeConstruction);
		manager.add(doubleClickAction);
		manager.add(farkasAlgorithm);
		manager.add(RGbasic);
		manager.add(modelChecking);
		manager.add(parseCTL);

		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	/**
	 * Returns textual information about coverability tree
	 */
	public String covTreeInfo(CoverabilityTree tree) {
		if (tree.getLeaves().size() == 0) {
			return "Cannot construct coverability tree. Try reachability graph instead.";
		}

		String result = "Coverability Tree was constructed. Its paths are the following:\n\n";

		for (int i = 0; i < tree.getLeaves().size(); i++) {

			String path = "";
			Vertex v = tree.getLeaves().get(i);
			path = Arrays.toString(v.getMarking());

			while (!(v.getPrevious() == null)) {
				String trName = v.getTransition().getName();
				v = v.getPrevious();

				path = Arrays.toString(v.getMarking()) + " ->(" + trName + ") "
						+ path;
			}

			result += path + "\n";
		}

		result = result.replace("-1", "w");

		return result;
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

		for (int i = 0; i < graph.getEdges().size(); i++) {
			
			result += graph.getEdges().get(i).from().toString();
			result += " ->(t" + graph.getEdges().get(i).getTrans().getNumber()+") ";
			result += graph.getEdges().get(i).to().toString()+ "\n";
		}

		return result;
	}
}
