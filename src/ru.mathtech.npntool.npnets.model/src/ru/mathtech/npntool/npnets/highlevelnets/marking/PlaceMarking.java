/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.marking;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Marking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getPlace <em>Place</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#getPlaceMarking()
 * @model
 * @generated
 */
public interface PlaceMarking extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#getPlaceMarking_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(TokenMultiSet)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#getPlaceMarking_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TokenMultiSet getMarking();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(TokenMultiSet value);

} // PlaceMarking
