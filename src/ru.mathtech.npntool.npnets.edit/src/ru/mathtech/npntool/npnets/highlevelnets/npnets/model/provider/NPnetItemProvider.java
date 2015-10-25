/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.mathtech.npntool.npnets.edit.npnetsEditPlugin;

import ru.mathtech.npntool.npnets.highlevelnets.common.provider.INetElementItemProvider;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;

/**
 * This is the item provider adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NPnetItemProvider
	extends INetElementItemProvider
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
	public NPnetItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(NPNetsPackage.Literals.NPNET__NET_SYSTEM);
			childrenFeatures.add(NPNetsPackage.Literals.NPNET__TYPE_ELEMENT_NET);
			childrenFeatures.add(NPNetsPackage.Literals.NPNET__TYPE_ATOMIC);
			childrenFeatures.add(NPNetsPackage.Literals.NPNET__NET_CONSTANTS);
			childrenFeatures.add(NPNetsPackage.Literals.NPNET__SYNCHRONIZATIONS);
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
	 * This returns NPnet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NPnet")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NPnet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NPnet_type") : //$NON-NLS-1$
			getString("_UI_NPnet_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(NPnet.class)) {
			case NPNetsPackage.NPNET__NET_SYSTEM:
			case NPNetsPackage.NPNET__TYPE_ELEMENT_NET:
			case NPNetsPackage.NPNET__TYPE_ATOMIC:
			case NPNetsPackage.NPNET__NET_CONSTANTS:
			case NPNetsPackage.NPNET__SYNCHRONIZATIONS:
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
				(NPNetsPackage.Literals.NPNET__NET_SYSTEM,
				 HLPNFactory.eINSTANCE.createHighLevelPetriNet()));

		newChildDescriptors.add
			(createChildParameter
				(NPNetsPackage.Literals.NPNET__TYPE_ELEMENT_NET,
				 TokenTypesFactory.eINSTANCE.createTokenTypeElementNet()));

		newChildDescriptors.add
			(createChildParameter
				(NPNetsPackage.Literals.NPNET__TYPE_ATOMIC,
				 TokenTypesFactory.eINSTANCE.createTokenTypeAtomic()));

		newChildDescriptors.add
			(createChildParameter
				(NPNetsPackage.Literals.NPNET__NET_CONSTANTS,
				 TokenExpressionsFactory.eINSTANCE.createNetConstant()));

		newChildDescriptors.add
			(createChildParameter
				(NPNetsPackage.Literals.NPNET__SYNCHRONIZATIONS,
				 NPNetsFactory.eINSTANCE.createSynchronization()));
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
