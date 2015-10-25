/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Synchronized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized#getSynchronization <em>Synchronization</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getTransitionSynchronized()
 * @model
 * @generated
 */
public interface TransitionSynchronized extends Transition {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Synchronization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getInvolved <em>Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization</em>' reference.
	 * @see #setSynchronization(Synchronization)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getTransitionSynchronized_Synchronization()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getInvolved
	 * @model opposite="involved"
	 * @generated
	 */
	Synchronization getSynchronization();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized#getSynchronization <em>Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization</em>' reference.
	 * @see #getSynchronization()
	 * @generated
	 */
	void setSynchronization(Synchronization value);

} // TransitionSynchronized
