/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage
 * @generated
 */
public class TokenTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TokenTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TokenTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTypesSwitch<Adapter> modelSwitch =
		new TokenTypesSwitch<Adapter>() {
			@Override
			public Adapter caseTokenType(TokenType object) {
				return createTokenTypeAdapter();
			}
			@Override
			public Adapter caseTokenTypeAtomic(TokenTypeAtomic object) {
				return createTokenTypeAtomicAdapter();
			}
			@Override
			public Adapter caseTokenTypeElementNet(TokenTypeElementNet object) {
				return createTokenTypeElementNetAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseTokenAtomic(TokenAtomic object) {
				return createTokenAtomicAdapter();
			}
			@Override
			public Adapter caseTokenNet(TokenNet object) {
				return createTokenNetAdapter();
			}
			@Override
			public Adapter caseTokenAttribute(TokenAttribute object) {
				return createTokenAttributeAdapter();
			}
			@Override
			public Adapter caseElementNetMarked(ElementNetMarked object) {
				return createElementNetMarkedAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseIEntityIdentifiable(IEntityIdentifiable object) {
				return createIEntityIdentifiableAdapter();
			}
			@Override
			public Adapter caseINetElement(INetElement object) {
				return createINetElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType
	 * @generated
	 */
	public Adapter createTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic <em>Token Type Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic
	 * @generated
	 */
	public Adapter createTokenTypeAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet <em>Token Type Element Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet
	 * @generated
	 */
	public Adapter createTokenTypeElementNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic <em>Token Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic
	 * @generated
	 */
	public Adapter createTokenAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet <em>Token Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet
	 * @generated
	 */
	public Adapter createTokenNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute <em>Token Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute
	 * @generated
	 */
	public Adapter createTokenAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked <em>Element Net Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked
	 * @generated
	 */
	public Adapter createElementNetMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable <em>IEntity Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable
	 * @generated
	 */
	public Adapter createIEntityIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement <em>INet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.INetElement
	 * @generated
	 */
	public Adapter createINetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TokenTypesAdapterFactory
