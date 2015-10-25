/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import java.math.BigInteger;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getVariable <em>Variable</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getMonom()
 * @model
 * @generated
 */
public interface Monom extends IEntityIdentifiable {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getMonom_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(BigInteger)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#getMonom_Power()
	 * @model default="1" required="true"
	 * @generated
	 */
	BigInteger getPower();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(BigInteger value);

} // Monom
