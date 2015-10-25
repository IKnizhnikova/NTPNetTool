/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenExpressionsFactoryImpl extends EFactoryImpl implements TokenExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TokenExpressionsFactory init() {
		try {
			TokenExpressionsFactory theTokenExpressionsFactory = (TokenExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("mathtech.ru/npntool/tokenexpressions"); //$NON-NLS-1$ 
			if (theTokenExpressionsFactory != null) {
				return theTokenExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TokenExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TokenExpressionsPackage.TOKEN_WEIGHT: return createTokenWeight();
			case TokenExpressionsPackage.TOKEN_MULTISET_EXPRESSION: return createTokenMultisetExpression();
			case TokenExpressionsPackage.TOKEN_MULTI_SET: return createTokenMultiSet();
			case TokenExpressionsPackage.VARIABLE: return createVariable();
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION: return createTokenVariadicExpression();
			case TokenExpressionsPackage.MONOM: return createMonom();
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING: return createTokenExpressionBinding();
			case TokenExpressionsPackage.TOKEN_BINDING: return createTokenBinding();
			case TokenExpressionsPackage.MONOM_CONSTANT: return createMonomConstant();
			case TokenExpressionsPackage.NET_CONSTANT: return createNetConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenWeight createTokenWeight() {
		TokenWeightImpl tokenWeight = new TokenWeightImpl();
		return tokenWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenMultisetExpression createTokenMultisetExpression() {
		TokenMultisetExpressionImpl tokenMultisetExpression = new TokenMultisetExpressionImpl();
		return tokenMultisetExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenMultiSet createTokenMultiSet() {
		TokenMultiSetImpl tokenMultiSet = new TokenMultiSetImpl();
		return tokenMultiSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVariadicExpression createTokenVariadicExpression() {
		TokenVariadicExpressionImpl tokenVariadicExpression = new TokenVariadicExpressionImpl();
		return tokenVariadicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monom createMonom() {
		MonomImpl monom = new MonomImpl();
		return monom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionBinding createTokenExpressionBinding() {
		TokenExpressionBindingImpl tokenExpressionBinding = new TokenExpressionBindingImpl();
		return tokenExpressionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenBinding createTokenBinding() {
		TokenBindingImpl tokenBinding = new TokenBindingImpl();
		return tokenBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonomConstant createMonomConstant() {
		MonomConstantImpl monomConstant = new MonomConstantImpl();
		return monomConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetConstant createNetConstant() {
		NetConstantImpl netConstant = new NetConstantImpl();
		return netConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionsPackage getTokenExpressionsPackage() {
		return (TokenExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TokenExpressionsPackage getPackage() {
		return TokenExpressionsPackage.eINSTANCE;
	}

} //TokenExpressionsFactoryImpl
