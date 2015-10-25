/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getName <em>Name</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(ContextVariable)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getVariable_Context()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	ContextVariable getContext();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextVariable value);

} // Variable
