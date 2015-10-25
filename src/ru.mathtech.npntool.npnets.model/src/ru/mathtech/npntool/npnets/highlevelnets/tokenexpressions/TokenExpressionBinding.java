/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Expression Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getExpression <em>Expression</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getBindingTokens <em>Binding Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenExpressionBinding()
 * @model
 * @generated
 */
public interface TokenExpressionBinding extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(TokenVariadicExpression)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenExpressionBinding_Expression()
	 * @model required="true"
	 * @generated
	 */
	TokenVariadicExpression getExpression();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(TokenVariadicExpression value);

	/**
	 * Returns the value of the '<em><b>Binding Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Tokens</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenExpressionBinding_BindingTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenBinding> getBindingTokens();

} // TokenExpressionBinding
