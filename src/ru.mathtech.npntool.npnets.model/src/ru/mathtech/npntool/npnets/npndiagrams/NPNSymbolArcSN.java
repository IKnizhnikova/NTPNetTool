/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPN Symbol Arc SN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getModel <em>Model</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcSN()
 * @model abstract="true"
 * @generated
 */
public interface NPNSymbolArcSN extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(NPNDiagramNetSystem)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcSN_Diagram()
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getArcs
	 * @model opposite="arcs" required="true" transient="false"
	 * @generated
	 */
	NPNDiagramNetSystem getDiagram();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(NPNDiagramNetSystem value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Arc)
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcSN_Model()
	 * @model required="true"
	 * @generated
	 */
	Arc getModel();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Arc value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#getNPNSymbolArcSN_Bendpoints()
	 * @model dataType="ru.mathtech.npntool.npnets.highlevelnets.common.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

} // NPNSymbolArcSN
