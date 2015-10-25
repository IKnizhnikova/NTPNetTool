/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.provider;

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

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.util.TokenExpressionsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenExpressionsItemProviderAdapterFactory extends TokenExpressionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TokenExpressionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenWeightItemProvider tokenWeightItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenWeightAdapter() {
		if (tokenWeightItemProvider == null) {
			tokenWeightItemProvider = new TokenWeightItemProvider(this);
		}

		return tokenWeightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenMultisetExpressionItemProvider tokenMultisetExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenMultisetExpressionAdapter() {
		if (tokenMultisetExpressionItemProvider == null) {
			tokenMultisetExpressionItemProvider = new TokenMultisetExpressionItemProvider(this);
		}

		return tokenMultisetExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenMultiSetItemProvider tokenMultiSetItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenMultiSetAdapter() {
		if (tokenMultiSetItemProvider == null) {
			tokenMultiSetItemProvider = new TokenMultiSetItemProvider(this);
		}

		return tokenMultiSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenVariadicExpressionItemProvider tokenVariadicExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenVariadicExpressionAdapter() {
		if (tokenVariadicExpressionItemProvider == null) {
			tokenVariadicExpressionItemProvider = new TokenVariadicExpressionItemProvider(this);
		}

		return tokenVariadicExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonomItemProvider monomItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonomAdapter() {
		if (monomItemProvider == null) {
			monomItemProvider = new MonomItemProvider(this);
		}

		return monomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenExpressionBindingItemProvider tokenExpressionBindingItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenExpressionBindingAdapter() {
		if (tokenExpressionBindingItemProvider == null) {
			tokenExpressionBindingItemProvider = new TokenExpressionBindingItemProvider(this);
		}

		return tokenExpressionBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenBindingItemProvider tokenBindingItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenBindingAdapter() {
		if (tokenBindingItemProvider == null) {
			tokenBindingItemProvider = new TokenBindingItemProvider(this);
		}

		return tokenBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonomConstantItemProvider monomConstantItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonomConstantAdapter() {
		if (monomConstantItemProvider == null) {
			monomConstantItemProvider = new MonomConstantItemProvider(this);
		}

		return monomConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetConstantItemProvider netConstantItemProvider;

	/**
	 * This creates an adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetConstantAdapter() {
		if (netConstantItemProvider == null) {
			netConstantItemProvider = new NetConstantItemProvider(this);
		}

		return netConstantItemProvider;
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
		if (tokenWeightItemProvider != null) tokenWeightItemProvider.dispose();
		if (tokenMultisetExpressionItemProvider != null) tokenMultisetExpressionItemProvider.dispose();
		if (tokenMultiSetItemProvider != null) tokenMultiSetItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (tokenVariadicExpressionItemProvider != null) tokenVariadicExpressionItemProvider.dispose();
		if (monomItemProvider != null) monomItemProvider.dispose();
		if (tokenExpressionBindingItemProvider != null) tokenExpressionBindingItemProvider.dispose();
		if (tokenBindingItemProvider != null) tokenBindingItemProvider.dispose();
		if (monomConstantItemProvider != null) monomConstantItemProvider.dispose();
		if (netConstantItemProvider != null) netConstantItemProvider.dispose();
	}

}