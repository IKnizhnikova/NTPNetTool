/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getContextVariable()
 * @model abstract="true"
 * @generated
 */
public interface ContextVariable extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getContextVariable_Variables()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // ContextVariable
