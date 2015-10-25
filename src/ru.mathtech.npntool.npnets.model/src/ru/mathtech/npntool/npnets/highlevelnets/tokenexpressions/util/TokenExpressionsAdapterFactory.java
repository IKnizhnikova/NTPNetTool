/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage
 * @generated
 */
public class TokenExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TokenExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TokenExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenExpressionsSwitch<Adapter> modelSwitch =
		new TokenExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseTokenWeight(TokenWeight object) {
				return createTokenWeightAdapter();
			}
			@Override
			public Adapter caseTokenMultisetExpression(TokenMultisetExpression object) {
				return createTokenMultisetExpressionAdapter();
			}
			@Override
			public Adapter caseTokenMultiSet(TokenMultiSet object) {
				return createTokenMultiSetAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseTokenVariadicExpression(TokenVariadicExpression object) {
				return createTokenVariadicExpressionAdapter();
			}
			@Override
			public Adapter caseMonom(Monom object) {
				return createMonomAdapter();
			}
			@Override
			public Adapter caseTokenExpressionBinding(TokenExpressionBinding object) {
				return createTokenExpressionBindingAdapter();
			}
			@Override
			public Adapter caseTokenBinding(TokenBinding object) {
				return createTokenBindingAdapter();
			}
			@Override
			public Adapter caseMonomConstant(MonomConstant object) {
				return createMonomConstantAdapter();
			}
			@Override
			public Adapter caseNetConstant(NetConstant object) {
				return createNetConstantAdapter();
			}
			@Override
			public Adapter caseIEntityIdentifiable(IEntityIdentifiable object) {
				return createIEntityIdentifiableAdapter();
			}
			@Override
			public Adapter caseINetElement(INetElement object) {
				return createINetElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight <em>Token Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight
	 * @generated
	 */
	public Adapter createTokenWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression <em>Token Multiset Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression
	 * @generated
	 */
	public Adapter createTokenMultisetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet <em>Token Multi Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet
	 * @generated
	 */
	public Adapter createTokenMultiSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression <em>Token Variadic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression
	 * @generated
	 */
	public Adapter createTokenVariadicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom <em>Monom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom
	 * @generated
	 */
	public Adapter createMonomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding <em>Token Expression Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding
	 * @generated
	 */
	public Adapter createTokenExpressionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding <em>Token Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding
	 * @generated
	 */
	public Adapter createTokenBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant <em>Monom Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant
	 * @generated
	 */
	public Adapter createMonomConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant <em>Net Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant
	 * @generated
	 */
	public Adapter createNetConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable <em>IEntity Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable
	 * @generated
	 */
	public Adapter createIEntityIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement <em>INet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.INetElement
	 * @generated
	 */
	public Adapter createINetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TokenExpressionsAdapterFactory
