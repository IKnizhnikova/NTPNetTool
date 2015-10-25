/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Net Marked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getType <em>Type</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getElementNetMarked()
 * @model
 * @generated
 */
public interface ElementNetMarked extends INetElement {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getElementNetMarkeds <em>Element Net Markeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(TokenTypeElementNet)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getElementNetMarked_Type()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getElementNetMarkeds
	 * @model opposite="elementNetMarkeds" required="true" transient="false"
	 * @generated
	 */
	TokenTypeElementNet getType();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TokenTypeElementNet value);

	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(Marking)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getElementNetMarked_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getMarking();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(Marking value);

} // ElementNetMarked
