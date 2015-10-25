/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.CommonPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage;

import ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenType;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;

import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypesPackageImpl extends EPackageImpl implements TokenTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTypeAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTypeElementNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementNetMarkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TokenTypesPackageImpl() {
		super(eNS_URI, TokenTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TokenTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TokenTypesPackage init() {
		if (isInited) return (TokenTypesPackage)EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI);

		// Obtain or create and register package
		TokenTypesPackageImpl theTokenTypesPackage = (TokenTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TokenTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TokenTypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MarkingPackageImpl theMarkingPackage = (MarkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) instanceof MarkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) : MarkingPackage.eINSTANCE);
		TokenExpressionsPackageImpl theTokenExpressionsPackage = (TokenExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) instanceof TokenExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) : TokenExpressionsPackage.eINSTANCE);
		HLPNPackageImpl theHLPNPackage = (HLPNPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) instanceof HLPNPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) : HLPNPackage.eINSTANCE);
		NPNetsPackageImpl theNPNetsPackage = (NPNetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) instanceof NPNetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) : NPNetsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		NPNDiagramsPackageImpl theNPNDiagramsPackage = (NPNDiagramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) instanceof NPNDiagramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) : NPNDiagramsPackage.eINSTANCE);

		// Create package meta-data objects
		theTokenTypesPackage.createPackageContents();
		theMarkingPackage.createPackageContents();
		theTokenExpressionsPackage.createPackageContents();
		theHLPNPackage.createPackageContents();
		theNPNetsPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theNPNDiagramsPackage.createPackageContents();

		// Initialize created meta-data
		theTokenTypesPackage.initializePackageContents();
		theMarkingPackage.initializePackageContents();
		theTokenExpressionsPackage.initializePackageContents();
		theHLPNPackage.initializePackageContents();
		theNPNetsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theNPNDiagramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTokenTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TokenTypesPackage.eNS_URI, theTokenTypesPackage);
		return theTokenTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenType() {
		return tokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenTypeAtomic() {
		return tokenTypeAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenTypeAtomic_Instance() {
		return (EReference)tokenTypeAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenTypeAtomic_Atom() {
		return (EReference)tokenTypeAtomicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenTypeElementNet() {
		return tokenTypeElementNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenTypeElementNet_ElementNetMarkeds() {
		return (EReference)tokenTypeElementNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenTypeElementNet_Net() {
		return (EReference)tokenTypeElementNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenTypeElementNet_TokenNets() {
		return (EReference)tokenTypeElementNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTokenTypeElementNet__GetInstanceByID__int() {
		return tokenTypeElementNetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTokenTypeElementNet__CreateInstance() {
		return tokenTypeElementNetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Attribute() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__GetType() {
		return tokenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenAtomic() {
		return tokenAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenAtomic_Type() {
		return (EReference)tokenAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenAtomic_Value() {
		return (EReference)tokenAtomicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenNet() {
		return tokenNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenNet_Type() {
		return (EReference)tokenNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenNet_Value() {
		return (EReference)tokenNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenAttribute() {
		return tokenAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAttribute_Type() {
		return (EAttribute)tokenAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAttribute_Name() {
		return (EAttribute)tokenAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAttribute_Value() {
		return (EAttribute)tokenAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementNetMarked() {
		return elementNetMarkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementNetMarked_Type() {
		return (EReference)elementNetMarkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementNetMarked_Marking() {
		return (EReference)elementNetMarkedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesFactory getTokenTypesFactory() {
		return (TokenTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tokenTypeEClass = createEClass(TOKEN_TYPE);

		tokenTypeAtomicEClass = createEClass(TOKEN_TYPE_ATOMIC);
		createEReference(tokenTypeAtomicEClass, TOKEN_TYPE_ATOMIC__INSTANCE);
		createEReference(tokenTypeAtomicEClass, TOKEN_TYPE_ATOMIC__ATOM);

		tokenTypeElementNetEClass = createEClass(TOKEN_TYPE_ELEMENT_NET);
		createEReference(tokenTypeElementNetEClass, TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS);
		createEReference(tokenTypeElementNetEClass, TOKEN_TYPE_ELEMENT_NET__NET);
		createEReference(tokenTypeElementNetEClass, TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS);
		createEOperation(tokenTypeElementNetEClass, TOKEN_TYPE_ELEMENT_NET___GET_INSTANCE_BY_ID__INT);
		createEOperation(tokenTypeElementNetEClass, TOKEN_TYPE_ELEMENT_NET___CREATE_INSTANCE);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__ATTRIBUTE);
		createEOperation(tokenEClass, TOKEN___GET_TYPE);

		tokenAtomicEClass = createEClass(TOKEN_ATOMIC);
		createEReference(tokenAtomicEClass, TOKEN_ATOMIC__TYPE);
		createEReference(tokenAtomicEClass, TOKEN_ATOMIC__VALUE);

		tokenNetEClass = createEClass(TOKEN_NET);
		createEReference(tokenNetEClass, TOKEN_NET__TYPE);
		createEReference(tokenNetEClass, TOKEN_NET__VALUE);

		tokenAttributeEClass = createEClass(TOKEN_ATTRIBUTE);
		createEAttribute(tokenAttributeEClass, TOKEN_ATTRIBUTE__TYPE);
		createEAttribute(tokenAttributeEClass, TOKEN_ATTRIBUTE__NAME);
		createEAttribute(tokenAttributeEClass, TOKEN_ATTRIBUTE__VALUE);

		elementNetMarkedEClass = createEClass(ELEMENT_NET_MARKED);
		createEReference(elementNetMarkedEClass, ELEMENT_NET_MARKED__TYPE);
		createEReference(elementNetMarkedEClass, ELEMENT_NET_MARKED__MARKING);

		atomEClass = createEClass(ATOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		HLPNPackage theHLPNPackage = (HLPNPackage)EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI);
		MarkingPackage theMarkingPackage = (MarkingPackage)EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tokenTypeEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		tokenTypeAtomicEClass.getESuperTypes().add(this.getTokenType());
		tokenTypeElementNetEClass.getESuperTypes().add(this.getTokenType());
		tokenEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		tokenAtomicEClass.getESuperTypes().add(this.getToken());
		tokenNetEClass.getESuperTypes().add(this.getToken());
		tokenAttributeEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		elementNetMarkedEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		atomEClass.getESuperTypes().add(theCommonPackage.getINetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenTypeEClass, TokenType.class, "TokenType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(tokenTypeAtomicEClass, TokenTypeAtomic.class, "TokenTypeAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenTypeAtomic_Instance(), this.getAtom(), null, "instance", null, 1, 1, TokenTypeAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenTypeAtomic_Atom(), this.getTokenAtomic(), this.getTokenAtomic_Type(), "atom", null, 1, 1, TokenTypeAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenTypeElementNetEClass, TokenTypeElementNet.class, "TokenTypeElementNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenTypeElementNet_ElementNetMarkeds(), this.getElementNetMarked(), this.getElementNetMarked_Type(), "elementNetMarkeds", null, 0, -1, TokenTypeElementNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenTypeElementNet_Net(), theHLPNPackage.getHighLevelPetriNet(), null, "net", null, 1, 1, TokenTypeElementNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenTypeElementNet_TokenNets(), this.getTokenNet(), this.getTokenNet_Type(), "tokenNets", null, 0, -1, TokenTypeElementNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getTokenTypeElementNet__GetInstanceByID__int(), null, "getInstanceByID", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "id", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getTokenTypeElementNet__CreateInstance(), null, "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenEClass, Token.class, "Token", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getToken_Attribute(), this.getTokenAttribute(), null, "attribute", null, 0, -1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getToken__GetType(), this.getTokenType(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenAtomicEClass, TokenAtomic.class, "TokenAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenAtomic_Type(), this.getTokenTypeAtomic(), this.getTokenTypeAtomic_Atom(), "type", null, 1, 1, TokenAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenAtomic_Value(), this.getAtom(), null, "value", null, 1, 1, TokenAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenNetEClass, TokenNet.class, "TokenNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenNet_Type(), this.getTokenTypeElementNet(), this.getTokenTypeElementNet_TokenNets(), "type", null, 1, 1, TokenNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenNet_Value(), this.getElementNetMarked(), null, "value", null, 0, 1, TokenNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenAttributeEClass, TokenAttribute.class, "TokenAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTokenAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, TokenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTokenAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, TokenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTokenAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, TokenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(elementNetMarkedEClass, ElementNetMarked.class, "ElementNetMarked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getElementNetMarked_Type(), this.getTokenTypeElementNet(), this.getTokenTypeElementNet_ElementNetMarkeds(), "type", null, 1, 1, ElementNetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getElementNetMarked_Marking(), theMarkingPackage.getMarking(), null, "marking", null, 1, 1, ElementNetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //TokenTypesPackageImpl
