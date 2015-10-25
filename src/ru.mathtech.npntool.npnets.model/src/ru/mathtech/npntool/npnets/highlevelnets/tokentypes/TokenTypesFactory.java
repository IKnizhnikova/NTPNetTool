/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage
 * @generated
 */
public interface TokenTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenTypesFactory eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Token Type Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Type Atomic</em>'.
	 * @generated
	 */
	TokenTypeAtomic createTokenTypeAtomic();

	/**
	 * Returns a new object of class '<em>Token Type Element Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Type Element Net</em>'.
	 * @generated
	 */
	TokenTypeElementNet createTokenTypeElementNet();

	/**
	 * Returns a new object of class '<em>Token Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Atomic</em>'.
	 * @generated
	 */
	TokenAtomic createTokenAtomic();

	/**
	 * Returns a new object of class '<em>Token Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Net</em>'.
	 * @generated
	 */
	TokenNet createTokenNet();

	/**
	 * Returns a new object of class '<em>Token Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Attribute</em>'.
	 * @generated
	 */
	TokenAttribute createTokenAttribute();

	/**
	 * Returns a new object of class '<em>Element Net Marked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Net Marked</em>'.
	 * @generated
	 */
	ElementNetMarked createElementNetMarked();

	/**
	 * Returns a new object of class '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom</em>'.
	 * @generated
	 */
	Atom createAtom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TokenTypesPackage getTokenTypesPackage();

} //TokenTypesFactory
