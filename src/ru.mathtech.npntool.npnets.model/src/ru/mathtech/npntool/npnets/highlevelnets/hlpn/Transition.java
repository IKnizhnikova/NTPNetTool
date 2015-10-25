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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getOutArcs <em>Out Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ContextVariable, Node {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getTransition_InArcs()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ArcPT> getInArcs();

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getTransition_OutArcs()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ArcTP> getOutArcs();

} // Transition
