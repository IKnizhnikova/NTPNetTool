/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Type Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getInstance <em>Instance</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeAtomic()
 * @model
 * @generated
 */
public interface TokenTypeAtomic extends TokenType {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Atom)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeAtomic_Instance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Atom getInstance();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Atom value);

	/**
	 * Returns the value of the '<em><b>Atom</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' containment reference.
	 * @see #setAtom(TokenAtomic)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#getTokenTypeAtomic_Atom()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic#getType
	 * @model opposite="type" containment="true" required="true"
	 * @generated
	 */
	TokenAtomic getAtom();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getAtom <em>Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom</em>' containment reference.
	 * @see #getAtom()
	 * @generated
	 */
	void setAtom(TokenAtomic value);

} // TokenTypeAtomic
