/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.*;

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
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage
 * @generated
 */
public class TokenExpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TokenExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = TokenExpressionsPackage.eINSTANCE;
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
			case TokenExpressionsPackage.TOKEN_WEIGHT: {
				TokenWeight tokenWeight = (TokenWeight)theEObject;
				T result = caseTokenWeight(tokenWeight);
				if (result == null) result = caseIEntityIdentifiable(tokenWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.TOKEN_MULTISET_EXPRESSION: {
				TokenMultisetExpression tokenMultisetExpression = (TokenMultisetExpression)theEObject;
				T result = caseTokenMultisetExpression(tokenMultisetExpression);
				if (result == null) result = caseIEntityIdentifiable(tokenMultisetExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.TOKEN_MULTI_SET: {
				TokenMultiSet tokenMultiSet = (TokenMultiSet)theEObject;
				T result = caseTokenMultiSet(tokenMultiSet);
				if (result == null) result = caseIEntityIdentifiable(tokenMultiSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseIEntityIdentifiable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION: {
				TokenVariadicExpression tokenVariadicExpression = (TokenVariadicExpression)theEObject;
				T result = caseTokenVariadicExpression(tokenVariadicExpression);
				if (result == null) result = caseINetElement(tokenVariadicExpression);
				if (result == null) result = caseIEntityIdentifiable(tokenVariadicExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.MONOM: {
				Monom monom = (Monom)theEObject;
				T result = caseMonom(monom);
				if (result == null) result = caseIEntityIdentifiable(monom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING: {
				TokenExpressionBinding tokenExpressionBinding = (TokenExpressionBinding)theEObject;
				T result = caseTokenExpressionBinding(tokenExpressionBinding);
				if (result == null) result = caseIEntityIdentifiable(tokenExpressionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.TOKEN_BINDING: {
				TokenBinding tokenBinding = (TokenBinding)theEObject;
				T result = caseTokenBinding(tokenBinding);
				if (result == null) result = caseIEntityIdentifiable(tokenBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.MONOM_CONSTANT: {
				MonomConstant monomConstant = (MonomConstant)theEObject;
				T result = caseMonomConstant(monomConstant);
				if (result == null) result = caseIEntityIdentifiable(monomConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TokenExpressionsPackage.NET_CONSTANT: {
				NetConstant netConstant = (NetConstant)theEObject;
				T result = caseNetConstant(netConstant);
				if (result == null) result = caseINetElement(netConstant);
				if (result == null) result = caseIEntityIdentifiable(netConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenWeight(TokenWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Multiset Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Multiset Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenMultisetExpression(TokenMultisetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Multi Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Multi Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenMultiSet(TokenMultiSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Variadic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Variadic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenVariadicExpression(TokenVariadicExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonom(Monom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Expression Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Expression Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenExpressionBinding(TokenExpressionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenBinding(TokenBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monom Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monom Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonomConstant(MonomConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetConstant(NetConstant object) {
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

} //TokenExpressionsSwitch
