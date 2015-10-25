/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Node {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getPlace_OutArcs()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ArcPT> getOutArcs();

	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getPlace_InArcs()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ArcTP> getInArcs();

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getPlace_Type()
	 * @model required="true"
	 * @generated
	 */
	TokenType getType();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TokenType value);

} // Place
