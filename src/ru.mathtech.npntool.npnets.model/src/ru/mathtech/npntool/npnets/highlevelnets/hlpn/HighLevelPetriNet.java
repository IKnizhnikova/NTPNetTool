/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Level Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getNodes <em>Nodes</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getHighLevelPetriNet()
 * @model
 * @generated
 */
public interface HighLevelPetriNet extends INetElement, ContextVariable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getHighLevelPetriNet_Nodes()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getHighLevelPetriNet_Arcs()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

} // HighLevelPetriNet
