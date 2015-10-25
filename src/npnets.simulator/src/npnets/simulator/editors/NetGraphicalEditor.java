package npnets.simulator.editors;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;








import java.util.EventObject;

import npnets.simulator.NPNGraphicalEditorPalette;
import npnets.simulator.PropertySource;
import npnets.simulator.UnwrapPropertySource;
import npnets.simulator.actions.PlaceAddTokenAction;
import npnets.simulator.actions.SetTimeConstraintsAction;
import npnets.simulator.actions.TransitionAddSynchronizationAction;
import npnets.simulator.factory.NPNEditPartFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.CommonUIPlugin;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import ru.mathtech.npntool.npnets.highlevelnets.common.provider.CommonItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.provider.HLPNItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.provider.MarkingItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.provider.NPNetsItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.provider.TokenExpressionsItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.provider.TokenTypesItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.provider.NPNDiagramsItemProviderAdapterFactory;

public class NetGraphicalEditor extends GraphicalEditorWithFlyoutPalette
	implements IPropertyListener, Listener{
	  
	  private ContextMenuProvider contextMenu;
	  private PropertySheetPage pageProperty;
		private NPNDiagramNetSystem netDiagram;
		private Marking marking;
		private TokenTypeElementNet type;
		private ComposedAdapterFactory adapterFactory;

		public NetGraphicalEditor() {
			setEditDomain(new DefaultEditDomain(this));
			initializeAdapterFactory();
		}
		
		protected void initializeAdapterFactory() {
			// Create an adapter factory that yields item providers.
			//
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new MarkingItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new TokenTypesItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new TokenExpressionsItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new HLPNItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new NPNetsItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new CommonItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new NPNDiagramsItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			
		}
	  
	  protected IWorkbenchPage page;
	  protected IWorkbenchPart part;
	  protected Collection<Object> buddies = new ArrayList<Object>();
	  protected GraphicalViewer viewer;
	  protected Composite container;
	  boolean isActive;
	  protected CLabel titleLabel;
	  protected ToolBar actionBar;
	  protected ToolBarManager toolBarManager;
	  protected MenuManager menuManager;
	  protected Image pullDownImage;
	  protected ToolBar systemBar;
	  protected FlyoutPaletteComposite control;
	  
	  protected MouseListener mouseListener = 
	    new MouseAdapter() 
	    {
	      @Override
	      public void mouseDown(MouseEvent e){
	        requestActivation();
	      }
	      @Override
	      public void mouseDoubleClick(MouseEvent e) {
	        if (e.getSource() == titleLabel) {
	          doMaximize();
	        }
	      } 
	    };

	    public TokenTypeElementNet getType() {
	  		return type;
	  	}

	  	public void setType(TokenTypeElementNet type) {
	  		this.type = type;
	  	}

	  	public Marking getMarking() {
	  		return marking;
	  	}

	  	public void setMarking(Marking marking) {
	  		this.marking = marking;
	  	}
	  	
	  protected IPartListener partListener = 
	    new IPartListener()
	    {
	      public void partActivated(IWorkbenchPart p) {
	        // Do nothing
	      }
	      
	      public void partBroughtToTop(IWorkbenchPart p) {
	        // Do nothing
	      }
	      public void partClosed(IWorkbenchPart p) {
	        // Do nothing
	      }
	      public void partDeactivated(IWorkbenchPart p) {
	        if (p == NetGraphicalEditor.this.part) {
	          showFocus(false);
	        }
	      }
	      
	      public void partOpened(IWorkbenchPart p) {
	        // Do nothing
	      }
	    };
	    
	    class PaneToolBarManager extends ToolBarManager {
	      public PaneToolBarManager(ToolBar paneToolBar) {
	        super(paneToolBar);
	      }

	      /**
	       *  EATM I have no idea how this is supposed to be called.
	       */
	      @Override
	      protected void relayout(ToolBar toolBar, int oldCount, int newCount) {
	        // remove/add the action bar from the view so to avoid
	        // having an empty action bar participating in the view's
	        // layout calculation (and maybe causing an empty bar to appear)
	        /*if (newCount < 1) {
	          if (control.getTopCenter() != null) {
	            control.setTopCenter(null);
	          }
	        } else {
	          toolBar.layout();
	          if (control.getTopCenter() == null) {
	            control.setTopCenter(toolBar);
	          }
	        }*/
	        Composite parent= toolBar.getParent();
	        parent.layout();
	        if (parent.getParent() != null)
	        {
	          parent.getParent().layout();
	        }
	      }    
	    }

//-----------------GraphicalEdtitor properties-------------------------	

	public NetGraphicalEditor(IWorkbenchPage page, IWorkbenchPart part) {
	    this.page = page;
	    this.part = part;
	    page.addPartListener(partListener);
    }
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		  super.init(site, input);
		}

	public void setInput(NPNDiagramNetSystem netDiagram){
		this.netDiagram = netDiagram;
		getGraphicalViewer().setContents(netDiagram);
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
	    //getGraphicalViewer().setContents(net);
	} 
	   
	@Override
	protected void configureGraphicalViewer() {
	    super.configureGraphicalViewer();
	    getGraphicalViewer().setEditPartFactory(new NPNEditPartFactory());
	    contextMenu = new NetGraphicalEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry());
	    getGraphicalViewer().setContextMenu(contextMenu);
	} 
	
	
//------------------Tools-----------------------
	
	@Override
	@SuppressWarnings("unchecked")
	protected void createActions() {
		super.createActions();

	    SelectionAction action = new PlaceAddTokenAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
	    
	    
	    action = new TransitionAddSynchronizationAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
	    
	    action = new SetTimeConstraintsAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		return new NPNGraphicalEditorPalette();
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		updateActions(getSelectionActions());
		bDirty=true;
	
	}
	
	boolean bDirty = false;

	public boolean isDirty() {
	return bDirty;
	}

	public void dirtyStateChanged() {
	bDirty = !bDirty;
	}
	
	public ContextMenuProvider getContextMenu(){
		return new NetGraphicalEditorContextMenuProvider(viewer, getActionRegistry());
	}
	
//-----------------Misc------------------------
	
	@Override
	public void handleEvent(Event event) {
	 if (event.type == SWT.Activate) {
	      requestActivation();
	    }
	}

	public void createControl(Composite parent) {
	    if (getControl() == null) {
	      container = parent;

	      // Create view form.    
	      //control = new ViewForm(parent, SWT.NONE);
	      //control = new FigureCanvas(parent, SWT.NONE);\
	      
	      control = new FlyoutPaletteComposite(parent, 0, this.page, this.getPaletteViewerProvider(), this.getPalettePreferences());
	      
	      control.addDisposeListener
	        (new DisposeListener() {
	           public void widgetDisposed(DisposeEvent event) {
	             dispose();
	           }
	         });
	      control.setSize(200, 500);
	      //control.marginHeight = 0;

	      // Create a title bar.
	      createTitleBar();
	      
	      viewer = createViewer(control);
	      //control.setContent(viewer.getControl());

	      control.setTabList(new Control [] { viewer.getControl() });
	      
	      // When the pane or any child gains focus, notify the workbench.
	      control.addListener(SWT.Activate, this);
	      hookFocus(control);
	      hookFocus(viewer.getControl());
	    }
	  }
	
	public void hookFocus(Control ctrl) {
		  ctrl.addMouseListener(mouseListener);
	}

	public GraphicalViewer createViewer(Composite parent) {
		try {
			init((IEditorSite) part.getSite(), ((IEditorPart) part).getEditorInput());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.createPartControl(new Composite(parent, SWT.LEFT_TO_RIGHT));
		return getGraphicalViewer();
	}
	
	public GraphicalViewer getViewer() {
		//this.viewer = getGraphicalViewer();
		//return getGraphicalViewer();
		/*this.addPropertyListener(new IPropertyListener() {
			public void propertyChanged(Object source, int propertyId) {
				MultiPageEditorPart.this.handlePropertyChange(propertyId);
			}
		});*
		
		initializeGraphicalViewer();
		configureGraphicalViewer();*/
		return this.viewer;
	}

	public Control getControl() {
	    return control;
	}

	protected void createTitleBar() {
		// Only do this once.
	    if (titleLabel == null) {
	      // Title.  
	      titleLabel = new CLabel(control, SWT.SHADOW_NONE);
	      hookFocus(titleLabel);
	      titleLabel.setAlignment(SWT.LEFT);
	      titleLabel.setBackground(null, null);
	      titleLabel.addMouseListener (new MouseAdapter() {
	           @Override
	          public void mouseDown(MouseEvent e) {
	             if (e.button == 3) {
	               showTitleLabelMenu(e);
	             }
	           }
	         });
	      updateTitles();

	      // Listen to title changes.
	      // getViewPart().addPropertyListener(this);
	      
	      // Action bar.
	      actionBar = new ToolBar(control, SWT.FLAT | SWT.WRAP);
	      hookFocus(actionBar);
	      //control.setTopCenter(actionBar);
	      
	      // System bar.  
	      systemBar = new ToolBar(control, SWT.FLAT | SWT.WRAP);
	      hookFocus(systemBar);
	      if (menuManager != null && !menuManager.isEmpty()) {
	        createPulldownMenu();
	      }
	      //control.setTopRight(systemBar);
	    }
		
	}
	

	
	  protected void doMaximize()
	  {
	    Control child = control;
	    for (Control parent = control.getParent(); parent instanceof SashForm || parent instanceof CTabFolder; parent = parent.getParent())
	    {
	      if (parent instanceof CTabFolder)
	      {
	        CTabFolder cTabFolder = (CTabFolder)parent;
	        cTabFolder.setMaximized(!cTabFolder.getMaximized());
	      }
	      else if (parent instanceof SashForm)
	      {
	        SashForm sashForm = (SashForm)parent;
	        if (sashForm.getMaximizedControl() == null)
	        {
	          sashForm.setMaximizedControl(child);
	        }
	        else
	        {
	          sashForm.setMaximizedControl(null);
	        }
	      }
	      child = parent;
	    }
	  }
	  
	private void showTitleLabelMenu(MouseEvent e) {
		Menu menu = new Menu(titleLabel);

	    boolean isMaximized = 
	        control.getParent() instanceof SashForm ? 
	          ((SashForm)control.getParent()).getMaximizedControl() != null :
	          control.getParent() instanceof CTabFolder && ((CTabFolder)control.getParent()).getMaximized();

	    MenuItem restoreItem = new MenuItem(menu, SWT.NONE);
	    restoreItem.setText(CommonUIPlugin.INSTANCE.getString("_UI_Restore_menu_item"));
	    restoreItem.addSelectionListener
	      (new SelectionAdapter() 
	       {
	         @Override
	        public void widgetSelected(SelectionEvent selectionEvent) 
	         {
	           doMaximize();
	         }
	       });
	    restoreItem.setEnabled(isMaximized);

	    MenuItem maximizeItem = new MenuItem(menu, SWT.NONE);
	    maximizeItem.setText(CommonUIPlugin.INSTANCE.getString("_UI_Maximize_menu_item"));
	    maximizeItem.addSelectionListener
	      (new SelectionAdapter() 
	       {
	         @Override
	        public void widgetSelected(SelectionEvent selectionEvent) 
	         {
	           doMaximize();
	         }
	       });
	    maximizeItem.setEnabled(!isMaximized);

	    Point point = new Point(e.x, e.y);
	    point = titleLabel.toDisplay(point);
	    menu.setLocation(point.x, point.y);
	    menu.setVisible(true);
		
	}

	protected void requestActivation() {
	    control.setFocus();//.getContents().setFocus();
	    showFocus(true);		
	}

	public void showFocus(boolean inFocus) {
		if (inFocus != isActive) {
	      isActive = inFocus;

	      if (titleLabel != null) {
	        if (inFocus){
	          //titleLabel.setBackground(WorkbenchColors.getActiveGradient(), WorkbenchColors.getActiveGradientPercents());
	          // titleLabel.setForeground(titleLabel.getDisplay().getSystemColor(SWT.COLOR_TITLE_FOREGROUND));
	          titleLabel.update();
	          titleLabel.redraw();
	          //actionBar.setBackground(WorkbenchColors.getActiveGradientEnd());
	          //systemBar.setBackground(WorkbenchColors.getActiveGradientEnd());
	        } else {
	          //titleLabel.setBackground(null, null);
	          // titleLabel.setForeground(null);
	          titleLabel.update();
	          titleLabel.redraw();
	          //actionBar.setBackground(WorkbenchColors.getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
	          //systemBar.setBackground(WorkbenchColors.getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
	        }
	      }
	    }
	}

	@Override
	public void propertyChanged(Object source, int propID) {
		if (propID == IWorkbenchPart.PROP_TITLE)
	      updateTitles();
	}

	public void updateTitles() {
	    titleLabel.update();
	}
	
	 private void createMenuManager() 
	  {
	    menuManager = new MenuManager("Pane Menu");
	    if (systemBar != null)
	    {
	      createPulldownMenu();
	    }
	  }

	  /**
	   * Create a pull-down menu on the action bar.
	   */
	  private void createPulldownMenu() {
	    if (systemBar != null) {
	      ToolItem ti = new ToolItem(systemBar, SWT.PUSH, 0);
	      try {
	        pullDownImage = 
	          ImageDescriptor.createFromURL
	            (new URL(CommonUIPlugin.INSTANCE.getImage("full/ctool16/ViewPullDown").toString())).createImage();
	        ti.setImage(pullDownImage);
	        ti.addSelectionListener
	          (new SelectionAdapter() {
	             @Override
	            public void widgetSelected(SelectionEvent e) {
	              showViewMenu();
	             }
	           });
	      }
	      catch (MalformedURLException exception) {
	        // Do nothing
	      }
	    }
	  }
	  
	  public MenuManager getMenuManager() {
	    if (menuManager == null) {
	      createMenuManager();
	    }
	    return menuManager;
	  }

	  public ToolBarManager getToolBarManager() {
	    if (toolBarManager == null) {
	      toolBarManager = new PaneToolBarManager(actionBar);
	    }
	    return toolBarManager;
	  }
	  
	  private void showViewMenu() {
	    Menu aMenu = menuManager.createContextMenu(getControl());
	    Point topLeft = new Point(0, 0);
	    topLeft.y += systemBar.getBounds().height;
	    topLeft = systemBar.toDisplay(topLeft);
	    aMenu.setLocation(topLeft.x, topLeft.y);
	    aMenu.setVisible(true);
	  }
	  
		public Object getAdapter(Class type) {
			if (type.equals(IPropertySheetPage.class)) {
				if (pageProperty == null) {
					pageProperty = (UndoablePropertySheetPage) super
							.getAdapter(type);

					IPropertySourceProvider propertySourceProvider = new IPropertySourceProvider() {

						IPropertySourceProvider propertySourceProvider =
								new AdapterFactoryContentProvider(adapterFactory);

						@Override
						public IPropertySource getPropertySource(Object object) {

							IPropertySource res = null;

							Object target;
							if (object instanceof EditPart) {
								target = ((EditPart) object).getModel();
							} else {
								target = object;
							}

							IPropertySource propertySource = 
									propertySourceProvider.getPropertySource(target);
							
							if (propertySource != null) {
								IPropertySource propsrc = new UnwrapPropertySource(propertySource);
								
								if (target instanceof NPNSymbolNodeSN) {
									Node node = ((NPNSymbolNodeSN) target).getModel();
									IPropertySource propsrcModel = new UnwrapPropertySource(
											propertySourceProvider.getPropertySource(node));
									res = new PropertySource(target, propsrc, propsrcModel);
								} else if (target instanceof NPNSymbolArcSN) {
									Arc arc = ((NPNSymbolArcSN) target).getModel();
									IPropertySource propsrcModel = new UnwrapPropertySource(
											propertySourceProvider.getPropertySource(arc));
									res = new PropertySource(target, propsrc, propsrcModel);
								} else {
									res = propsrc;
								}
							}

							return res;
						}
					};

					UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(
							getCommandStack());
					root.setPropertySourceProvider(propertySourceProvider);
					pageProperty.setRootEntry(root);
				}
				return pageProperty;
			}
			return super.getAdapter(type);
		}
		
		@Override
		public void commandStackChanged(EventObject event) {
			firePropertyChange(PROP_DIRTY);
			super.commandStackChanged(event);
		}
}
