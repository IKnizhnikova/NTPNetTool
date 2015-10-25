/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage
 * @generated
 */
public class TokenTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TokenTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TokenTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TokenTypesPackage.TOKEN_TYPE: {
				TokenType tokenType = (TokenType)theEObject;
				T result = caseTokenType(tokenType);
				if (result == null) result = caseINetElement(tokenType);
				if (result == null) result = caseIEntityIdentifiable(tokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC: {
				TokenTypeAtomic tokenTypeAtomic = (TokenTypeAtomic)theEObject;
				T result = caseTokenTypeAtomic(tokenTypeAtomic);
				if (result == null) result = caseTokenType(tokenTypeAtomic);
				if (result == null) result = caseINetElement(tokenTypeAtomic);
				if (result == null) result = caseIEntityIdentifiable(tokenTypeAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET: {
				TokenTypeElementNet tokenTypeElementNet = (TokenTypeElementNet)theEObject;
				T result = caseTokenTypeElementNet(tokenTypeElementNet);
				if (result == null) result = caseTokenType(tokenTypeElementNet);
				if (result == null) result = caseINetElement(tokenTypeElementNet);
				if (result == null) result = caseIEntityIdentifiable(tokenTypeElementNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = caseINetElement(token);
				if (result == null) result = caseIEntityIdentifiable(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.TOKEN_ATOMIC: {
				TokenAtomic tokenAtomic = (TokenAtomic)theEObject;
				T result = caseTokenAtomic(tokenAtomic);
				if (result == null) result = caseToken(tokenAtomic);
				if (result == null) result = caseINetElement(tokenAtomic);
				if (result == null) result = caseIEntityIdentifiable(tokenAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.TOKEN_NET: {
				TokenNet tokenNet = (TokenNet)theEObject;
				T result = caseTokenNet(tokenNet);
				if (result == null) result = caseToken(tokenNet);
				if (result == null) result = caseINetElement(tokenNet);
				if (result == null) result = caseIEntityIdentifiable(tokenNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.TOKEN_ATTRIBUTE: {
				TokenAttribute tokenAttribute = (TokenAttribute)theEObject;
				T result = caseTokenAttribute(tokenAttribute);
				if (result == null) result = caseIEntityIdentifiable(tokenAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.ELEMENT_NET_MARKED: {
				ElementNetMarked elementNetMarked = (ElementNetMarked)theEObject;
				T result = caseElementNetMarked(elementNetMarked);
				if (result == null) result = caseINetElement(elementNetMarked);
				if (result == null) result = caseIEntityIdentifiable(elementNetMarked);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenTypesPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseINetElement(atom);
				if (result == null) result = caseIEntityIdentifiable(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenType(TokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Type Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Type Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenTypeAtomic(TokenTypeAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Type Element Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Type Element Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenTypeElementNet(TokenTypeElementNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenAtomic(TokenAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenNet(TokenNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenAttribute(TokenAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Net Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Net Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementNetMarked(ElementNetMarked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEntity Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEntity Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEntityIdentifiable(IEntityIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INet Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INet Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINetElement(INetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TokenTypesSwitch
