/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.mathtech.npntool.npnets.edit.npnetsEditPlugin;
import ru.mathtech.npntool.npnets.highlevelnets.common.provider.IEntityIdentifiableItemProvider;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;

/**
 * This is the item provider adapter for a {@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNDiagramNetSystemItemProvider
	extends IEntityIdentifiableItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NPNDiagramNetSystem_model_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_NPNDiagramNetSystem_model_feature", "_UI_NPNDiagramNetSystem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__NODES);
			childrenFeatures.add(NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__ARCS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NPNDiagramNetSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NPNDiagramNetSystem")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NPNDiagramNetSystem)object).getUuid();
		return label == null || label.length() == 0 ?
			getString("_UI_NPNDiagramNetSystem_type") : //$NON-NLS-1$
			getString("_UI_NPNDiagramNetSystem_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NPNDiagramNetSystem.class)) {
			case NPNDiagramsPackage.NPN_DIAGRAM_NET_SYSTEM__NODES:
			case NPNDiagramsPackage.NPN_DIAGRAM_NET_SYSTEM__ARCS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__NODES,
				 NPNDiagramsFactory.eINSTANCE.createNPNSymbolPlaceSN()));

		newChildDescriptors.add
			(createChildParameter
				(NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__NODES,
				 NPNDiagramsFactory.eINSTANCE.createNPNSymbolTransitionSN()));

		newChildDescriptors.add
			(createChildParameter
				(NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__ARCS,
				 NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcPTSN()));

		newChildDescriptors.add
			(createChildParameter
				(NPNDiagramsPackage.Literals.NPN_DIAGRAM_NET_SYSTEM__ARCS,
				 NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcTPSN()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return npnetsEditPlugin.INSTANCE;
	}

}
