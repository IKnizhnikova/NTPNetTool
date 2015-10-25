/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory
 * @model kind="package"
 * @generated
 */
public interface TokenTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tokentypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mathtech.ru/npntool/nets/tokentypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tokentypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenTypesPackage eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeImpl <em>Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenType()
	 * @generated
	 */
	int TOKEN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeAtomicImpl <em>Token Type Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeAtomicImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenTypeAtomic()
	 * @generated
	 */
	int TOKEN_TYPE_ATOMIC = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC__UUID = TOKEN_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC__NAME = TOKEN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC__COMMENT = TOKEN_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC__INSTANCE = TOKEN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC__ATOM = TOKEN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Type Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC_FEATURE_COUNT = TOKEN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token Type Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ATOMIC_OPERATION_COUNT = TOKEN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl <em>Token Type Element Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenTypeElementNet()
	 * @generated
	 */
	int TOKEN_TYPE_ELEMENT_NET = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET__UUID = TOKEN_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET__NAME = TOKEN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET__COMMENT = TOKEN_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Element Net Markeds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS = TOKEN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET__NET = TOKEN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token Nets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS = TOKEN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Token Type Element Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET_FEATURE_COUNT = TOKEN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Instance By ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET___GET_INSTANCE_BY_ID__INT = TOKEN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET___CREATE_INSTANCE = TOKEN_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Token Type Element Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_ELEMENT_NET_OPERATION_COUNT = TOKEN_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ATTRIBUTE = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN___GET_TYPE = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAtomicImpl <em>Token Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAtomicImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenAtomic()
	 * @generated
	 */
	int TOKEN_ATOMIC = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC__UUID = TOKEN__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC__NAME = TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC__COMMENT = TOKEN__COMMENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC__ATTRIBUTE = TOKEN__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC__TYPE = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC__VALUE = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC___GET_TYPE = TOKEN___GET_TYPE;

	/**
	 * The number of operations of the '<em>Token Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATOMIC_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenNetImpl <em>Token Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenNetImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenNet()
	 * @generated
	 */
	int TOKEN_NET = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET__UUID = TOKEN__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET__NAME = TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET__COMMENT = TOKEN__COMMENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET__ATTRIBUTE = TOKEN__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET__TYPE = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET__VALUE = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET___GET_TYPE = TOKEN___GET_TYPE;

	/**
	 * The number of operations of the '<em>Token Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NET_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAttributeImpl <em>Token Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAttributeImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenAttribute()
	 * @generated
	 */
	int TOKEN_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATTRIBUTE__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATTRIBUTE__TYPE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATTRIBUTE__NAME = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATTRIBUTE__VALUE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Token Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATTRIBUTE_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Token Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_ATTRIBUTE_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.ElementNetMarkedImpl <em>Element Net Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.ElementNetMarkedImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getElementNetMarked()
	 * @generated
	 */
	int ELEMENT_NET_MARKED = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED__TYPE = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED__MARKING = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Net Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Net Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NET_MARKED_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.AtomImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType
	 * @generated
	 */
	EClass getTokenType();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic <em>Token Type Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Type Atomic</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic
	 * @generated
	 */
	EClass getTokenTypeAtomic();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getInstance()
	 * @see #getTokenTypeAtomic()
	 * @generated
	 */
	EReference getTokenTypeAtomic_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atom</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic#getAtom()
	 * @see #getTokenTypeAtomic()
	 * @generated
	 */
	EReference getTokenTypeAtomic_Atom();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet <em>Token Type Element Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Type Element Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet
	 * @generated
	 */
	EClass getTokenTypeElementNet();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getElementNetMarkeds <em>Element Net Markeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Net Markeds</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getElementNetMarkeds()
	 * @see #getTokenTypeElementNet()
	 * @generated
	 */
	EReference getTokenTypeElementNet_ElementNetMarkeds();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getNet()
	 * @see #getTokenTypeElementNet()
	 * @generated
	 */
	EReference getTokenTypeElementNet_Net();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getTokenNets <em>Token Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Nets</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getTokenNets()
	 * @see #getTokenTypeElementNet()
	 * @generated
	 */
	EReference getTokenTypeElementNet_TokenNets();

	/**
	 * Returns the meta object for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getInstanceByID(int) <em>Get Instance By ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance By ID</em>' operation.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#getInstanceByID(int)
	 * @generated
	 */
	EOperation getTokenTypeElementNet__GetInstanceByID__int();

	/**
	 * Returns the meta object for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#createInstance() <em>Create Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Instance</em>' operation.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet#createInstance()
	 * @generated
	 */
	EOperation getTokenTypeElementNet__CreateInstance();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token#getAttribute()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Attribute();

	/**
	 * Returns the meta object for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token#getType()
	 * @generated
	 */
	EOperation getToken__GetType();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic <em>Token Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Atomic</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic
	 * @generated
	 */
	EClass getTokenAtomic();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic#getType()
	 * @see #getTokenAtomic()
	 * @generated
	 */
	EReference getTokenAtomic_Type();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic#getValue()
	 * @see #getTokenAtomic()
	 * @generated
	 */
	EReference getTokenAtomic_Value();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet <em>Token Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet
	 * @generated
	 */
	EClass getTokenNet();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getType()
	 * @see #getTokenNet()
	 * @generated
	 */
	EReference getTokenNet_Type();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet#getValue()
	 * @see #getTokenNet()
	 * @generated
	 */
	EReference getTokenNet_Value();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute <em>Token Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Attribute</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute
	 * @generated
	 */
	EClass getTokenAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute#getType()
	 * @see #getTokenAttribute()
	 * @generated
	 */
	EAttribute getTokenAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute#getName()
	 * @see #getTokenAttribute()
	 * @generated
	 */
	EAttribute getTokenAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute#getValue()
	 * @see #getTokenAttribute()
	 * @generated
	 */
	EAttribute getTokenAttribute_Value();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked <em>Element Net Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Net Marked</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked
	 * @generated
	 */
	EClass getElementNetMarked();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getType()
	 * @see #getElementNetMarked()
	 * @generated
	 */
	EReference getElementNetMarked_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked#getMarking()
	 * @see #getElementNetMarked()
	 * @generated
	 */
	EReference getElementNetMarked_Marking();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TokenTypesFactory getTokenTypesFactory();

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
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeImpl <em>Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenType()
		 * @generated
		 */
		EClass TOKEN_TYPE = eINSTANCE.getTokenType();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeAtomicImpl <em>Token Type Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeAtomicImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenTypeAtomic()
		 * @generated
		 */
		EClass TOKEN_TYPE_ATOMIC = eINSTANCE.getTokenTypeAtomic();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE_ATOMIC__INSTANCE = eINSTANCE.getTokenTypeAtomic_Instance();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE_ATOMIC__ATOM = eINSTANCE.getTokenTypeAtomic_Atom();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl <em>Token Type Element Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenTypeElementNet()
		 * @generated
		 */
		EClass TOKEN_TYPE_ELEMENT_NET = eINSTANCE.getTokenTypeElementNet();

		/**
		 * The meta object literal for the '<em><b>Element Net Markeds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS = eINSTANCE.getTokenTypeElementNet_ElementNetMarkeds();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE_ELEMENT_NET__NET = eINSTANCE.getTokenTypeElementNet_Net();

		/**
		 * The meta object literal for the '<em><b>Token Nets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS = eINSTANCE.getTokenTypeElementNet_TokenNets();

		/**
		 * The meta object literal for the '<em><b>Get Instance By ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN_TYPE_ELEMENT_NET___GET_INSTANCE_BY_ID__INT = eINSTANCE.getTokenTypeElementNet__GetInstanceByID__int();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN_TYPE_ELEMENT_NET___CREATE_INSTANCE = eINSTANCE.getTokenTypeElementNet__CreateInstance();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__ATTRIBUTE = eINSTANCE.getToken_Attribute();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOKEN___GET_TYPE = eINSTANCE.getToken__GetType();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAtomicImpl <em>Token Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAtomicImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenAtomic()
		 * @generated
		 */
		EClass TOKEN_ATOMIC = eINSTANCE.getTokenAtomic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_ATOMIC__TYPE = eINSTANCE.getTokenAtomic_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_ATOMIC__VALUE = eINSTANCE.getTokenAtomic_Value();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenNetImpl <em>Token Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenNetImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenNet()
		 * @generated
		 */
		EClass TOKEN_NET = eINSTANCE.getTokenNet();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_NET__TYPE = eINSTANCE.getTokenNet_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_NET__VALUE = eINSTANCE.getTokenNet_Value();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAttributeImpl <em>Token Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenAttributeImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getTokenAttribute()
		 * @generated
		 */
		EClass TOKEN_ATTRIBUTE = eINSTANCE.getTokenAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ATTRIBUTE__TYPE = eINSTANCE.getTokenAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ATTRIBUTE__NAME = eINSTANCE.getTokenAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_ATTRIBUTE__VALUE = eINSTANCE.getTokenAttribute_Value();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.ElementNetMarkedImpl <em>Element Net Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.ElementNetMarkedImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getElementNetMarked()
		 * @generated
		 */
		EClass ELEMENT_NET_MARKED = eINSTANCE.getElementNetMarked();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_NET_MARKED__TYPE = eINSTANCE.getElementNetMarked_Type();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_NET_MARKED__MARKING = eINSTANCE.getElementNetMarked_Marking();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.AtomImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

	}

} //TokenTypesPackage
