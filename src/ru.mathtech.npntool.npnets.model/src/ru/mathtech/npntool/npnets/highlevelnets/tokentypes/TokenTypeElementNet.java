/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Type Element Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getElementNetMarkeds <em>Element Net Markeds</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getNet <em>Net</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getTokenNets <em>Token Nets</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeElementNet()
 * @model
 * @generated
 */
public interface TokenTypeElementNet extends TokenType {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Element Net Markeds</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Net Markeds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Net Markeds</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeElementNet_ElementNetMarkeds()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<ElementNetMarked> getElementNetMarkeds();

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(HighLevelPetriNet)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeElementNet_Net()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HighLevelPetriNet getNet();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(HighLevelPetriNet value);

	/**
	 * Returns the value of the '<em><b>Token Nets</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Nets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Nets</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeElementNet_TokenNets()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<TokenNet> getTokenNets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getInstanceByID(int id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createInstance();

} // TokenTypeElementNet
