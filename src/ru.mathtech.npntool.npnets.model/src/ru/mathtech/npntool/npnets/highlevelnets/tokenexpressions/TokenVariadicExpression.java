/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Variadic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression#getMonoms <em>Monoms</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression#getMonomConstants <em>Monom Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenVariadicExpression()
 * @model
 * @generated
 */
public interface TokenVariadicExpression extends INetElement {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Monoms</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monoms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monoms</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenVariadicExpression_Monoms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Monom> getMonoms();

	/**
	 * Returns the value of the '<em><b>Monom Constants</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monom Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monom Constants</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getTokenVariadicExpression_MonomConstants()
	 * @model containment="true"
	 * @generated
	 */
	EList<MonomConstant> getMonomConstants();

} // TokenVariadicExpression
