/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import org.eclipse.emf.common.util.EList;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPN Diagram Net System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getModel <em>Model</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getNodes <em>Nodes</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNetSystem()
 * @model
 * @generated
 */
public interface NPNDiagramNetSystem extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(HighLevelPetriNet)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNetSystem_Model()
	 * @model required="true"
	 * @generated
	 */
	HighLevelPetriNet getModel();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(HighLevelPetriNet value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNetSystem_Nodes()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<NPNSymbolNodeSN> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN}.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNetSystem_Arcs()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<NPNSymbolArcSN> getArcs();

} // NPNDiagramNetSystem
