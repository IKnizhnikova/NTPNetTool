/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Multiset Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getType <em>Type</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenMultisetExpression()
 * @model
 * @generated
 */
public interface TokenMultisetExpression extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TokenType)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenMultisetExpression_Type()
	 * @model required="true"
	 * @generated
	 */
	TokenType getType();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TokenType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TokenMultiSet)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenMultisetExpression_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TokenMultiSet getValue();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TokenMultiSet value);

} // TokenMultisetExpression
