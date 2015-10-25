/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPN Symbol Arc PTSN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getTarget <em>Target</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcPTSN()
 * @model
 * @generated
 */
public interface NPNSymbolArcPTSN extends NPNSymbolArcSN {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NPNSymbolTransitionSN)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcPTSN_Target()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getInArcs
	 * @model opposite="inArcs" required="true"
	 * @generated
	 */
	NPNSymbolTransitionSN getTarget();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NPNSymbolTransitionSN value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NPNSymbolPlaceSN)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcPTSN_Source()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getOutArcs
	 * @model opposite="outArcs" required="true"
	 * @generated
	 */
	NPNSymbolPlaceSN getSource();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NPNSymbolPlaceSN value);

} // NPNSymbolArcPTSN
