/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPN Diagram NPN Marked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getDiagramNetSystem <em>Diagram Net System</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNPNMarked()
 * @model
 * @generated
 */
public interface NPNDiagramNPNMarked extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Diagram Net System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Net System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Net System</em>' reference.
	 * @see #setDiagramNetSystem(NPNDiagramNetSystem)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNPNMarked_DiagramNetSystem()
	 * @model required="true"
	 * @generated
	 */
	NPNDiagramNetSystem getDiagramNetSystem();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getDiagramNetSystem <em>Diagram Net System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Net System</em>' reference.
	 * @see #getDiagramNetSystem()
	 * @generated
	 */
	void setDiagramNetSystem(NPNDiagramNetSystem value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(NPnetMarked)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNDiagramNPNMarked_Model()
	 * @model required="true"
	 * @generated
	 */
	NPnetMarked getModel();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(NPnetMarked value);

} // NPNDiagramNPNMarked
