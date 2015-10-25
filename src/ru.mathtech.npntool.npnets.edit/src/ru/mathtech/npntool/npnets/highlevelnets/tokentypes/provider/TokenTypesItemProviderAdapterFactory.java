/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.util.TokenTypesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypesItemProviderAdapterFactory extends TokenTypesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTypeAtomicItemProvider tokenTypeAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenTypeAtomicAdapter() {
		if (tokenTypeAtomicItemProvider == null) {
			tokenTypeAtomicItemProvider = new TokenTypeAtomicItemProvider(this);
		}

		return tokenTypeAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTypeElementNetItemProvider tokenTypeElementNetItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenTypeElementNetAdapter() {
		if (tokenTypeElementNetItemProvider == null) {
			tokenTypeElementNetItemProvider = new TokenTypeElementNetItemProvider(this);
		}

		return tokenTypeElementNetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenAtomicItemProvider tokenAtomicItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenAtomicAdapter() {
		if (tokenAtomicItemProvider == null) {
			tokenAtomicItemProvider = new TokenAtomicItemProvider(this);
		}

		return tokenAtomicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenNetItemProvider tokenNetItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenNetAdapter() {
		if (tokenNetItemProvider == null) {
			tokenNetItemProvider = new TokenNetItemProvider(this);
		}

		return tokenNetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenAttributeItemProvider tokenAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenAttributeAdapter() {
		if (tokenAttributeItemProvider == null) {
			tokenAttributeItemProvider = new TokenAttributeItemProvider(this);
		}

		return tokenAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementNetMarkedItemProvider elementNetMarkedItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementNetMarkedAdapter() {
		if (elementNetMarkedItemProvider == null) {
			elementNetMarkedItemProvider = new ElementNetMarkedItemProvider(this);
		}

		return elementNetMarkedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomItemProvider atomItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomAdapter() {
		if (atomItemProvider == null) {
			atomItemProvider = new AtomItemProvider(this);
		}

		return atomItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (tokenTypeAtomicItemProvider != null) tokenTypeAtomicItemProvider.dispose();
		if (tokenTypeElementNetItemProvider != null) tokenTypeElementNetItemProvider.dispose();
		if (tokenAtomicItemProvider != null) tokenAtomicItemProvider.dispose();
		if (tokenNetItemProvider != null) tokenNetItemProvider.dispose();
		if (tokenAttributeItemProvider != null) tokenAttributeItemProvider.dispose();
		if (elementNetMarkedItemProvider != null) elementNetMarkedItemProvider.dispose();
		if (atomItemProvider != null) atomItemProvider.dispose();
	}

}
