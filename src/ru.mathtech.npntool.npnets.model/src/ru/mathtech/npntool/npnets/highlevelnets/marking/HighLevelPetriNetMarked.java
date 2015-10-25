/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.marking;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Level Petri Net Marked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getNet <em>Net</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#getHighLevelPetriNetMarked()
 * @model
 * @generated
 */
public interface HighLevelPetriNetMarked extends INetElement {

/* eperzhand */

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#getHighLevelPetriNetMarked_Net()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HighLevelPetriNet getNet();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(HighLevelPetriNet value);

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#getHighLevelPetriNetMarked_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getMarking();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(Marking value);

} // HighLevelPetriNetMarked
