package ru.mathtech.npntool.editor;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.DirectEditAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import ru.mathtech.npntool.editor.actions.NPNSymbolResizeToContentAction;
import ru.mathtech.npntool.editor.parts.NPNEditPartFactory;
import ru.mathtech.npntool.npnets.highlevelnets.common.provider.CommonItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.provider.HLPNItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.marking.provider.MarkingItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.provider.NPNetsItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.provider.TokenExpressionsItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.provider.TokenTypesItemProviderAdapterFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.provider.NPNDiagramsItemProviderAdapterFactory;

public class NPNGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	private Resource resourceNPN;
	private NPnetMarked npnMarked;
	private NPNDiagramNetSystem diagramNetSystem;

	PropertySheetPage pageProperty;
	private ComposedAdapterFactory adapterFactory;

	public NPNGraphicalEditor() {
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
	

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		getGraphicalViewer().setContents(diagramNetSystem);
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewerGraphical = getGraphicalViewer(); 
		viewerGraphical.setEditPartFactory(new NPNEditPartFactory());
		viewerGraphical.setContextMenu(new NPNSNGraphicalEditorContextMenuProvider(
				viewerGraphical, getActionRegistry()));
		getSite().setSelectionProvider(getGraphicalViewer());

		getActionRegistry().registerAction(
				new ToggleGridAction(getGraphicalViewer()));
		getActionRegistry().registerAction(
				new ToggleSnapToGeometryAction(getGraphicalViewer()));

		configureKeyboardShortcuts();
		
		getGraphicalViewer().addDropTargetListener(
				new TemplateTransferDropTargetListener(getGraphicalViewer()));
		getEditDomain().getPaletteViewer().addDragSourceListener(
				new TemplateTransferDragSourceListener(
						getEditDomain().getPaletteViewer()));
	}

	private void configureKeyboardShortcuts() {
		GraphicalViewerKeyHandler newKeyHandler =
				(GraphicalViewerKeyHandler) getGraphicalViewer().getKeyHandler();
		GraphicalViewerKeyHandler oldKeyHandler = newKeyHandler;
		if (newKeyHandler == null) {
			newKeyHandler = new GraphicalViewerKeyHandler(getGraphicalViewer());
		}
		newKeyHandler.put(KeyStroke.getPressed(SWT.F2, 0),
				getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
		newKeyHandler.put(KeyStroke.getPressed(SWT.F3, 0),
				getActionRegistry().getAction(NPNSymbolResizeToContentAction.ID_RESIZE_TO_CONTENTS));

		if (oldKeyHandler == null) {
			getGraphicalViewer().setKeyHandler(newKeyHandler);
		}
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return new NPNGraphicalEditorPalette();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		if (resourceNPN == null) {
			return;
		}

		try {
			resourceNPN.save(null);
			getCommandStack().markSaveLocation();
		} catch (IOException e) {
			e.printStackTrace();
			resourceNPN = null;
		}
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		loadInput(input);
	}

	private void loadInput(IEditorInput input) {
		NPNetsPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		if (input instanceof IFileEditorInput) {
			IFileEditorInput iFileEditorInput = (IFileEditorInput) input;
			IFile file = iFileEditorInput.getFile();
			URI uri = URI.createURI(file.getLocationURI().toString());
			resourceNPN = resourceSet.createResource(uri);
			try {
				resourceNPN.load(null);
				npnMarked = (NPnetMarked) resourceNPN.getContents().get(0);
				diagramNetSystem = npnMarked.getDiagramNetSystem();
			} catch (IOException e) {
				e.printStackTrace();
				resourceNPN = null;
			}
		}
	}
	
	@Override
	protected void createActions() {
		super.createActions();

		IAction action = new NPNSymbolResizeToContentAction(this);
		getActionRegistry().registerAction(action);
		getSelectionActions().add(action.getId());
		
	    action = new DirectEditAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
		
	}

	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(event);
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
							IPropertySource propsrc = new UnwrappingPropertySource(propertySource);
							
							if (target instanceof NPNSymbolNodeSN) {
								Node node = ((NPNSymbolNodeSN) target).getModel();
								IPropertySource propsrcModel = new UnwrappingPropertySource(
										propertySourceProvider.getPropertySource(node));
								res = new NPNSymbolPropertySource(target, propsrc, propsrcModel);
							} else if (target instanceof NPNSymbolArcSN) {
								Arc arc = ((NPNSymbolArcSN) target).getModel();
								IPropertySource propsrcModel = new UnwrappingPropertySource(
										propertySourceProvider.getPropertySource(arc));
								res = new NPNSymbolPropertySource(target, propsrc, propsrcModel);
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
}
