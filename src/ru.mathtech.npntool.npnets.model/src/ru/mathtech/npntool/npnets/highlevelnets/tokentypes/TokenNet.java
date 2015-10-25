/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getType <em>Type</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenNet()
 * @model
 * @generated
 */
public interface TokenNet extends Token {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getTokenNets <em>Token Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(TokenTypeElementNet)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenNet_Type()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getTokenNets
	 * @model opposite="tokenNets" required="true" transient="false"
	 * @generated
	 */
	TokenTypeElementNet getType();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TokenTypeElementNet value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ElementNetMarked)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenNet_Value()
	 * @model
	 * @generated
	 */
	ElementNetMarked getValue();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ElementNetMarked value);

} // TokenNet
