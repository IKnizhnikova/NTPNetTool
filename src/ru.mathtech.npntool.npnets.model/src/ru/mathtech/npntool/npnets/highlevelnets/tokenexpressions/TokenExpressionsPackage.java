/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface TokenExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tokenexpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mathtech.ru/npntool/tokenexpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tokenexpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenExpressionsPackage eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenWeightImpl <em>Token Weight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenWeightImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenWeight()
	 * @generated
	 */
	int TOKEN_WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_WEIGHT__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_WEIGHT__TOKEN = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_WEIGHT__WEIGHT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_WEIGHT_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_WEIGHT_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultisetExpressionImpl <em>Token Multiset Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultisetExpressionImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenMultisetExpression()
	 * @generated
	 */
	int TOKEN_MULTISET_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTISET_EXPRESSION__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTISET_EXPRESSION__TYPE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTISET_EXPRESSION__VALUE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Multiset Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTISET_EXPRESSION_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Multiset Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTISET_EXPRESSION_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultiSetImpl <em>Token Multi Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultiSetImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenMultiSet()
	 * @generated
	 */
	int TOKEN_MULTI_SET = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTI_SET__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTI_SET__WEIGHT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTI_SET__TYPE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Multi Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTI_SET_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Multi Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_MULTI_SET_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.VariableImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONTEXT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenVariadicExpressionImpl <em>Token Variadic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenVariadicExpressionImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenVariadicExpression()
	 * @generated
	 */
	int TOKEN_VARIADIC_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Monoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION__MONOMS = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monom Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Variadic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Variadic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VARIADIC_EXPRESSION_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomImpl <em>Monom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getMonom()
	 * @generated
	 */
	int MONOM = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM__VARIABLE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM__POWER = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Monom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionBindingImpl <em>Token Expression Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionBindingImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenExpressionBinding()
	 * @generated
	 */
	int TOKEN_EXPRESSION_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_EXPRESSION_BINDING__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_EXPRESSION_BINDING__EXPRESSION = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_EXPRESSION_BINDING__BINDING_TOKENS = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Expression Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_EXPRESSION_BINDING_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Expression Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_EXPRESSION_BINDING_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenBindingImpl <em>Token Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenBindingImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenBinding()
	 * @generated
	 */
	int TOKEN_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BINDING__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BINDING__VARIABLE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BINDING__VALUE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BINDING_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BINDING_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomConstantImpl <em>Monom Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomConstantImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getMonomConstant()
	 * @generated
	 */
	int MONOM_CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_CONSTANT__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_CONSTANT__CONSTANT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_CONSTANT__VALUE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_CONSTANT__POWER = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monom Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_CONSTANT_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Monom Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOM_CONSTANT_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.NetConstantImpl <em>Net Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.NetConstantImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getNetConstant()
	 * @generated
	 */
	int NET_CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONSTANT__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONSTANT__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONSTANT__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONSTANT__BINDING = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Net Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONSTANT_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The number of operations of the '<em>Net Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_CONSTANT_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight <em>Token Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Weight</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight
	 * @generated
	 */
	EClass getTokenWeight();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight#getToken()
	 * @see #getTokenWeight()
	 * @generated
	 */
	EReference getTokenWeight_Token();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight#getWeight()
	 * @see #getTokenWeight()
	 * @generated
	 */
	EAttribute getTokenWeight_Weight();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression <em>Token Multiset Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Multiset Expression</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression
	 * @generated
	 */
	EClass getTokenMultisetExpression();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getType()
	 * @see #getTokenMultisetExpression()
	 * @generated
	 */
	EReference getTokenMultisetExpression_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression#getValue()
	 * @see #getTokenMultisetExpression()
	 * @generated
	 */
	EReference getTokenMultisetExpression_Value();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet <em>Token Multi Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Multi Set</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet
	 * @generated
	 */
	EClass getTokenMultiSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weight</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet#getWeight()
	 * @see #getTokenMultiSet()
	 * @generated
	 */
	EReference getTokenMultiSet_Weight();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet#getType()
	 * @see #getTokenMultiSet()
	 * @generated
	 */
	EReference getTokenMultiSet_Type();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable#getContext()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Context();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression <em>Token Variadic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Variadic Expression</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression
	 * @generated
	 */
	EClass getTokenVariadicExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression#getMonoms <em>Monoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monoms</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression#getMonoms()
	 * @see #getTokenVariadicExpression()
	 * @generated
	 */
	EReference getTokenVariadicExpression_Monoms();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression#getMonomConstants <em>Monom Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monom Constants</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression#getMonomConstants()
	 * @see #getTokenVariadicExpression()
	 * @generated
	 */
	EReference getTokenVariadicExpression_MonomConstants();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom <em>Monom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monom</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom
	 * @generated
	 */
	EClass getMonom();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getVariable()
	 * @see #getMonom()
	 * @generated
	 */
	EReference getMonom_Variable();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom#getPower()
	 * @see #getMonom()
	 * @generated
	 */
	EAttribute getMonom_Power();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding <em>Token Expression Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Expression Binding</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding
	 * @generated
	 */
	EClass getTokenExpressionBinding();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getExpression()
	 * @see #getTokenExpressionBinding()
	 * @generated
	 */
	EReference getTokenExpressionBinding_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getBindingTokens <em>Binding Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Tokens</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding#getBindingTokens()
	 * @see #getTokenExpressionBinding()
	 * @generated
	 */
	EReference getTokenExpressionBinding_BindingTokens();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding <em>Token Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Binding</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding
	 * @generated
	 */
	EClass getTokenBinding();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding#getVariable()
	 * @see #getTokenBinding()
	 * @generated
	 */
	EReference getTokenBinding_Variable();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding#getValue()
	 * @see #getTokenBinding()
	 * @generated
	 */
	EReference getTokenBinding_Value();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant <em>Monom Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monom Constant</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant
	 * @generated
	 */
	EClass getMonomConstant();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant#getConstant()
	 * @see #getMonomConstant()
	 * @generated
	 */
	EReference getMonomConstant_Constant();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant#getValue()
	 * @see #getMonomConstant()
	 * @generated
	 */
	EReference getMonomConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant#getPower()
	 * @see #getMonomConstant()
	 * @generated
	 */
	EAttribute getMonomConstant_Power();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant <em>Net Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Constant</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant
	 * @generated
	 */
	EClass getNetConstant();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant#getBinding()
	 * @see #getNetConstant()
	 * @generated
	 */
	EReference getNetConstant_Binding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TokenExpressionsFactory getTokenExpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenWeightImpl <em>Token Weight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenWeightImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenWeight()
		 * @generated
		 */
		EClass TOKEN_WEIGHT = eINSTANCE.getTokenWeight();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_WEIGHT__TOKEN = eINSTANCE.getTokenWeight_Token();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_WEIGHT__WEIGHT = eINSTANCE.getTokenWeight_Weight();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultisetExpressionImpl <em>Token Multiset Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultisetExpressionImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenMultisetExpression()
		 * @generated
		 */
		EClass TOKEN_MULTISET_EXPRESSION = eINSTANCE.getTokenMultisetExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_MULTISET_EXPRESSION__TYPE = eINSTANCE.getTokenMultisetExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_MULTISET_EXPRESSION__VALUE = eINSTANCE.getTokenMultisetExpression_Value();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultiSetImpl <em>Token Multi Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenMultiSetImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenMultiSet()
		 * @generated
		 */
		EClass TOKEN_MULTI_SET = eINSTANCE.getTokenMultiSet();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_MULTI_SET__WEIGHT = eINSTANCE.getTokenMultiSet_Weight();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_MULTI_SET__TYPE = eINSTANCE.getTokenMultiSet_Type();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.VariableImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CONTEXT = eINSTANCE.getVariable_Context();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenVariadicExpressionImpl <em>Token Variadic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenVariadicExpressionImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenVariadicExpression()
		 * @generated
		 */
		EClass TOKEN_VARIADIC_EXPRESSION = eINSTANCE.getTokenVariadicExpression();

		/**
		 * The meta object literal for the '<em><b>Monoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_VARIADIC_EXPRESSION__MONOMS = eINSTANCE.getTokenVariadicExpression_Monoms();

		/**
		 * The meta object literal for the '<em><b>Monom Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS = eINSTANCE.getTokenVariadicExpression_MonomConstants();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomImpl <em>Monom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getMonom()
		 * @generated
		 */
		EClass MONOM = eINSTANCE.getMonom();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOM__VARIABLE = eINSTANCE.getMonom_Variable();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONOM__POWER = eINSTANCE.getMonom_Power();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionBindingImpl <em>Token Expression Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionBindingImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenExpressionBinding()
		 * @generated
		 */
		EClass TOKEN_EXPRESSION_BINDING = eINSTANCE.getTokenExpressionBinding();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_EXPRESSION_BINDING__EXPRESSION = eINSTANCE.getTokenExpressionBinding_Expression();

		/**
		 * The meta object literal for the '<em><b>Binding Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_EXPRESSION_BINDING__BINDING_TOKENS = eINSTANCE.getTokenExpressionBinding_BindingTokens();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenBindingImpl <em>Token Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenBindingImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getTokenBinding()
		 * @generated
		 */
		EClass TOKEN_BINDING = eINSTANCE.getTokenBinding();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_BINDING__VARIABLE = eINSTANCE.getTokenBinding_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_BINDING__VALUE = eINSTANCE.getTokenBinding_Value();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomConstantImpl <em>Monom Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomConstantImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getMonomConstant()
		 * @generated
		 */
		EClass MONOM_CONSTANT = eINSTANCE.getMonomConstant();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOM_CONSTANT__CONSTANT = eINSTANCE.getMonomConstant_Constant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOM_CONSTANT__VALUE = eINSTANCE.getMonomConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONOM_CONSTANT__POWER = eINSTANCE.getMonomConstant_Power();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.NetConstantImpl <em>Net Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.NetConstantImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl#getNetConstant()
		 * @generated
		 */
		EClass NET_CONSTANT = eINSTANCE.getNetConstant();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_CONSTANT__BINDING = eINSTANCE.getNetConstant_Binding();

	}

} //TokenExpressionsPackage
