/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc PT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getSource <em>Source</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getTarget <em>Target</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getInscription <em>Inscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcPT()
 * @model
 * @generated
 */
public interface ArcPT extends Arc {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcPT_Source()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getOutArcs
	 * @model opposite="outArcs" required="true"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Transition)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcPT_Target()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getInArcs
	 * @model opposite="inArcs" required="true"
	 * @generated
	 */
	Transition getTarget();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Transition value);

	/**
	 * Returns the value of the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscription</em>' containment reference.
	 * @see #setInscription(TokenVariadicExpression)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcPT_Inscription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TokenVariadicExpression getInscription();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getInscription <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscription</em>' containment reference.
	 * @see #getInscription()
	 * @generated
	 */
	void setInscription(TokenVariadicExpression value);

} // ArcPT
