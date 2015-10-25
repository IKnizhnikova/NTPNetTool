/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPN Symbol Transition SN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getInArcs <em>In Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolTransitionSN()
 * @model
 * @generated
 */
public interface NPNSymbolTransitionSN extends NPNSymbolNodeSN {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolTransitionSN_OutArcs()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<NPNSymbolArcTPSN> getOutArcs();

	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolTransitionSN_InArcs()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<NPNSymbolArcPTSN> getInArcs();

} // NPNSymbolTransitionSN
