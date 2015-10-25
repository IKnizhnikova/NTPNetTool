/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INet Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement#getName <em>Name</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage#getINetElement()
 * @model abstract="true"
 * @generated
 */
public interface INetElement extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage#getINetElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage#getINetElement_Comment()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' targetspace='null'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // INetElement
