/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage
 * @generated
 */
public interface TokenExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenExpressionsFactory eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Token Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Weight</em>'.
	 * @generated
	 */
	TokenWeight createTokenWeight();

	/**
	 * Returns a new object of class '<em>Token Multiset Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Multiset Expression</em>'.
	 * @generated
	 */
	TokenMultisetExpression createTokenMultisetExpression();

	/**
	 * Returns a new object of class '<em>Token Multi Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Multi Set</em>'.
	 * @generated
	 */
	TokenMultiSet createTokenMultiSet();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Token Variadic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Variadic Expression</em>'.
	 * @generated
	 */
	TokenVariadicExpression createTokenVariadicExpression();

	/**
	 * Returns a new object of class '<em>Monom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monom</em>'.
	 * @generated
	 */
	Monom createMonom();

	/**
	 * Returns a new object of class '<em>Token Expression Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Expression Binding</em>'.
	 * @generated
	 */
	TokenExpressionBinding createTokenExpressionBinding();

	/**
	 * Returns a new object of class '<em>Token Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Binding</em>'.
	 * @generated
	 */
	TokenBinding createTokenBinding();

	/**
	 * Returns a new object of class '<em>Monom Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monom Constant</em>'.
	 * @generated
	 */
	MonomConstant createMonomConstant();

	/**
	 * Returns a new object of class '<em>Net Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Constant</em>'.
	 * @generated
	 */
	NetConstant createNetConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TokenExpressionsPackage getTokenExpressionsPackage();

} //TokenExpressionsFactory
