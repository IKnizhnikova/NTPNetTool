/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKind <em>Kind</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKey <em>Key</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getInvolved <em>Involved</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getSynchronization()
 * @model
 * @generated
 */
public interface Synchronization extends INetElement {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind
	 * @see #setKind(ESynchronizationKind)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getSynchronization_Kind()
	 * @model required="true"
	 * @generated
	 */
	ESynchronizationKind getKind();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ESynchronizationKind value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getSynchronization_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Involved</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized#getSynchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getSynchronization_Involved()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized#getSynchronization
	 * @model opposite="synchronization"
	 * @generated
	 */
	EList<TransitionSynchronized> getInvolved();

} // Synchronization
