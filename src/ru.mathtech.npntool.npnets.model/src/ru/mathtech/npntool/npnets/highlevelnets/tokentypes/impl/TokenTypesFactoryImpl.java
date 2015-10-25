/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypesFactoryImpl extends EFactoryImpl implements TokenTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TokenTypesFactory init() {
		try {
			TokenTypesFactory theTokenTypesFactory = (TokenTypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://mathtech.ru/npntool/nets/tokentypes"); //$NON-NLS-1$ 
			if (theTokenTypesFactory != null) {
				return theTokenTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TokenTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC: return createTokenTypeAtomic();
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET: return createTokenTypeElementNet();
			case TokenTypesPackage.TOKEN_ATOMIC: return createTokenAtomic();
			case TokenTypesPackage.TOKEN_NET: return createTokenNet();
			case TokenTypesPackage.TOKEN_ATTRIBUTE: return createTokenAttribute();
			case TokenTypesPackage.ELEMENT_NET_MARKED: return createElementNetMarked();
			case TokenTypesPackage.ATOM: return createAtom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypeAtomic createTokenTypeAtomic() {
		TokenTypeAtomicImpl tokenTypeAtomic = new TokenTypeAtomicImpl();
		return tokenTypeAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypeElementNet createTokenTypeElementNet() {
		TokenTypeElementNetImpl tokenTypeElementNet = new TokenTypeElementNetImpl();
		return tokenTypeElementNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAtomic createTokenAtomic() {
		TokenAtomicImpl tokenAtomic = new TokenAtomicImpl();
		return tokenAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenNet createTokenNet() {
		TokenNetImpl tokenNet = new TokenNetImpl();
		return tokenNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAttribute createTokenAttribute() {
		TokenAttributeImpl tokenAttribute = new TokenAttributeImpl();
		return tokenAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementNetMarked createElementNetMarked() {
		ElementNetMarkedImpl elementNetMarked = new ElementNetMarkedImpl();
		return elementNetMarked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesPackage getTokenTypesPackage() {
		return (TokenTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TokenTypesPackage getPackage() {
		return TokenTypesPackage.eINSTANCE;
	}

} //TokenTypesFactoryImpl
