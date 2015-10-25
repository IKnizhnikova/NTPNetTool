/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import org.eclipse.draw2d.geometry.Rectangle;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPN Symbol Node SN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolNodeSN()
 * @model abstract="true"
 * @generated
 */
public interface NPNSymbolNodeSN extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(NPNDiagramNetSystem)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolNodeSN_Diagram()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	NPNDiagramNetSystem getDiagram();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(NPNDiagramNetSystem value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolNodeSN_Constraints()
	 * @model dataType="ru.mathtech.npntool.npnets.highlevelnets.common.Rectangle" required="true"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Node)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolNodeSN_Model()
	 * @model required="true"
	 * @generated
	 */
	Node getModel();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Node value);

} // NPNSymbolNodeSN
