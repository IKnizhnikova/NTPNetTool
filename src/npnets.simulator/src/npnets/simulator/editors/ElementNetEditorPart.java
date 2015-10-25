package npnets.simulator.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;




import npnets.simulator.NPNGraphicalSimulator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageSelectionProvider;

import ru.mathtech.npntool.npnets.highlevelnets.common.provider.CommonItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.provider.HLPNItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.provider.NPNetsItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.provider.TokenExpressionsItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;

public class ElementNetEditorPart extends MultiPageEditorPart {
	
	protected TokenTypeElementNet net;
	
	protected NPNDiagramNetSystem netDiagram;
	
	protected NPNGraphicalSimulator parentEditor;
	
	protected AdapterFactoryEditingDomain editingDomain;
		
	protected ComposedAdapterFactory adapterFactory;
	
	protected Viewer currentViewer;
	
	protected ViewerPane currentViewerPane;

	protected ISelection editorSelection = StructuredSelection.EMPTY;
	
	protected MultiPageSelectionProvider selectionProvider;
	
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	
	protected List<NetSimpleGraphicalEditor> editors;
	
	public ElementNetEditorPart(TokenTypeElementNet net, NPNGraphicalSimulator parentEditor) {
		super();
		initializeEditingDomain();
		this.parentEditor = parentEditor; 		
		this.net = net;
		this.netDiagram = this.net.getDiagram();
	}
	
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}
	
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new HLPNItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new NPNetsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TokenExpressionsItemProviderAdapterFactory());// GlobalsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new CommonItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 getContainer().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  firePropertyChange(IEditorPart.PROP_DIRTY);

								  // Try to select the affected objects.
								  //
								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
								  if (mostRecentCommand != null) {
									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
								  }
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}
	
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable =
				new Runnable() {
					public void run() {
						// Try to select the items in the current content viewer of the editor.
						//
						if (currentViewer != null) {
							currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
						}
					}
				};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}	
	
	@Override
	public void dispose() {
		adapterFactory.dispose();

		super.dispose();
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		site.setSelectionProvider(selectionProvider);
		site.getPage().addPartListener(partListener);
		this.net = ((ElementNetEditorInput) input).getContent();
	}
	
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
		  editingDomain.getResourceToReadOnlyMap().clear();

		  // Refresh any actions that may become enabled or disabled.
		  //
		  selectionProvider.setSelection(getSelection());
		}
	}
	
	public ISelection getSelection() {
		return editorSelection;
	}
	
	protected IPartListener partListener =
		new IPartListener() {
			public void partActivated(IWorkbenchPart p) {
				if (p == ElementNetEditorPart.this) {
					handleActivate();
				}
			}
			public void partBroughtToTop(IWorkbenchPart p) {
				// Ignore.
			}
			public void partClosed(IWorkbenchPart p) {
				// Ignore.
			}
			public void partDeactivated(IWorkbenchPart p) {
				// Ignore.
			}
			public void partOpened(IWorkbenchPart p) {
				// Ignore.
			}
	};
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);
	}

	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			// Remember it.
			//
			currentViewer = viewer;
		}
	}

	public void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}
	
	@Override
	public void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		} else {
			getControl(getActivePage()).setFocus();
		}
	}
	
	@Override
	protected void createPages() {
		if (net != null && !net.getElementNetMarkeds().isEmpty()) {
			this.editors = new ArrayList<NetSimpleGraphicalEditor>();
			for (ElementNetMarked enm : net.getElementNetMarkeds()) {
				this.editors.add(new NetSimpleGraphicalEditor());
			}
			
			int pageIndex = 0;
			try {
				for(NetSimpleGraphicalEditor editor : this.editors) {
					pageIndex = addPage(editor, getEditorInput());
					GraphicalViewer graphicalViewer = (GraphicalViewer) editor.getAdapter(GraphicalViewer.class);
					setPageText(pageIndex, "Editor");
					graphicalViewer.setContents(netDiagram);
				}
				pageIndex = addPage(null);
				setPageText(pageIndex, "+");
			}
			catch(PartInitException e) {
				e.printStackTrace();
			}

			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					setActivePage(0);
				}
			});
	
			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				 public void run() {
					 
				 }
			 });
		}
	}
}

