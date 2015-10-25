/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.NetConstant;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenWeight;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;

import ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenExpressionsPackageImpl extends EPackageImpl implements TokenExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenWeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenMultisetExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenMultiSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenVariadicExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenExpressionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monomConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netConstantEClass = null;

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TokenExpressionsPackageImpl() {
		super(eNS_URI, TokenExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TokenExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TokenExpressionsPackage init() {
		if (isInited) return (TokenExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		TokenExpressionsPackageImpl theTokenExpressionsPackage = (TokenExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TokenExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TokenExpressionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MarkingPackageImpl theMarkingPackage = (MarkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) instanceof MarkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) : MarkingPackage.eINSTANCE);
		TokenTypesPackageImpl theTokenTypesPackage = (TokenTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) instanceof TokenTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) : TokenTypesPackage.eINSTANCE);
		HLPNPackageImpl theHLPNPackage = (HLPNPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) instanceof HLPNPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) : HLPNPackage.eINSTANCE);
		NPNetsPackageImpl theNPNetsPackage = (NPNetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) instanceof NPNetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) : NPNetsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		NPNDiagramsPackageImpl theNPNDiagramsPackage = (NPNDiagramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) instanceof NPNDiagramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) : NPNDiagramsPackage.eINSTANCE);

		// Create package meta-data objects
		theTokenExpressionsPackage.createPackageContents();
		theMarkingPackage.createPackageContents();
		theTokenTypesPackage.createPackageContents();
		theHLPNPackage.createPackageContents();
		theNPNetsPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theNPNDiagramsPackage.createPackageContents();

		// Initialize created meta-data
		theTokenExpressionsPackage.initializePackageContents();
		theMarkingPackage.initializePackageContents();
		theTokenTypesPackage.initializePackageContents();
		theHLPNPackage.initializePackageContents();
		theNPNetsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theNPNDiagramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTokenExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TokenExpressionsPackage.eNS_URI, theTokenExpressionsPackage);
		return theTokenExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenWeight() {
		return tokenWeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenWeight_Token() {
		return (EReference)tokenWeightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenWeight_Weight() {
		return (EAttribute)tokenWeightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenMultisetExpression() {
		return tokenMultisetExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenMultisetExpression_Type() {
		return (EReference)tokenMultisetExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenMultisetExpression_Value() {
		return (EReference)tokenMultisetExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenMultiSet() {
		return tokenMultiSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenMultiSet_Weight() {
		return (EReference)tokenMultiSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenMultiSet_Type() {
		return (EReference)tokenMultiSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Context() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenVariadicExpression() {
		return tokenVariadicExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenVariadicExpression_Monoms() {
		return (EReference)tokenVariadicExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenVariadicExpression_MonomConstants() {
		return (EReference)tokenVariadicExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonom() {
		return monomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonom_Variable() {
		return (EReference)monomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonom_Power() {
		return (EAttribute)monomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenExpressionBinding() {
		return tokenExpressionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenExpressionBinding_Expression() {
		return (EReference)tokenExpressionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenExpressionBinding_BindingTokens() {
		return (EReference)tokenExpressionBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenBinding() {
		return tokenBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenBinding_Variable() {
		return (EReference)tokenBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenBinding_Value() {
		return (EReference)tokenBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonomConstant() {
		return monomConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonomConstant_Constant() {
		return (EReference)monomConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonomConstant_Value() {
		return (EReference)monomConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonomConstant_Power() {
		return (EAttribute)monomConstantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetConstant() {
		return netConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetConstant_Binding() {
		return (EReference)netConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionsFactory getTokenExpressionsFactory() {
		return (TokenExpressionsFactory)getEFactoryInstance();
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
		tokenWeightEClass = createEClass(TOKEN_WEIGHT);
		createEReference(tokenWeightEClass, TOKEN_WEIGHT__TOKEN);
		createEAttribute(tokenWeightEClass, TOKEN_WEIGHT__WEIGHT);

		tokenMultisetExpressionEClass = createEClass(TOKEN_MULTISET_EXPRESSION);
		createEReference(tokenMultisetExpressionEClass, TOKEN_MULTISET_EXPRESSION__TYPE);
		createEReference(tokenMultisetExpressionEClass, TOKEN_MULTISET_EXPRESSION__VALUE);

		tokenMultiSetEClass = createEClass(TOKEN_MULTI_SET);
		createEReference(tokenMultiSetEClass, TOKEN_MULTI_SET__WEIGHT);
		createEReference(tokenMultiSetEClass, TOKEN_MULTI_SET__TYPE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__CONTEXT);

		tokenVariadicExpressionEClass = createEClass(TOKEN_VARIADIC_EXPRESSION);
		createEReference(tokenVariadicExpressionEClass, TOKEN_VARIADIC_EXPRESSION__MONOMS);
		createEReference(tokenVariadicExpressionEClass, TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS);

		monomEClass = createEClass(MONOM);
		createEReference(monomEClass, MONOM__VARIABLE);
		createEAttribute(monomEClass, MONOM__POWER);

		tokenExpressionBindingEClass = createEClass(TOKEN_EXPRESSION_BINDING);
		createEReference(tokenExpressionBindingEClass, TOKEN_EXPRESSION_BINDING__EXPRESSION);
		createEReference(tokenExpressionBindingEClass, TOKEN_EXPRESSION_BINDING__BINDING_TOKENS);

		tokenBindingEClass = createEClass(TOKEN_BINDING);
		createEReference(tokenBindingEClass, TOKEN_BINDING__VARIABLE);
		createEReference(tokenBindingEClass, TOKEN_BINDING__VALUE);

		monomConstantEClass = createEClass(MONOM_CONSTANT);
		createEReference(monomConstantEClass, MONOM_CONSTANT__CONSTANT);
		createEReference(monomConstantEClass, MONOM_CONSTANT__VALUE);
		createEAttribute(monomConstantEClass, MONOM_CONSTANT__POWER);

		netConstantEClass = createEClass(NET_CONSTANT);
		createEReference(netConstantEClass, NET_CONSTANT__BINDING);
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
		TokenTypesPackage theTokenTypesPackage = (TokenTypesPackage)EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI);
		HLPNPackage theHLPNPackage = (HLPNPackage)EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tokenWeightEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		tokenMultisetExpressionEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		tokenMultiSetEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		variableEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		tokenVariadicExpressionEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		monomEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		tokenExpressionBindingEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		tokenBindingEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		monomConstantEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		netConstantEClass.getESuperTypes().add(theCommonPackage.getINetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenWeightEClass, TokenWeight.class, "TokenWeight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenWeight_Token(), theTokenTypesPackage.getToken(), null, "token", null, 1, 1, TokenWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTokenWeight_Weight(), ecorePackage.getEBigInteger(), "weight", null, 1, 1, TokenWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenMultisetExpressionEClass, TokenMultisetExpression.class, "TokenMultisetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenMultisetExpression_Type(), theTokenTypesPackage.getTokenType(), null, "type", null, 1, 1, TokenMultisetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenMultisetExpression_Value(), this.getTokenMultiSet(), null, "value", null, 1, 1, TokenMultisetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenMultiSetEClass, TokenMultiSet.class, "TokenMultiSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenMultiSet_Weight(), this.getTokenWeight(), null, "weight", null, 0, -1, TokenMultiSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenMultiSet_Type(), theTokenTypesPackage.getTokenType(), null, "type", null, 1, 1, TokenMultiSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariable_Context(), theHLPNPackage.getContextVariable(), theHLPNPackage.getContextVariable_Variables(), "context", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenVariadicExpressionEClass, TokenVariadicExpression.class, "TokenVariadicExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenVariadicExpression_Monoms(), this.getMonom(), null, "monoms", null, 1, -1, TokenVariadicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenVariadicExpression_MonomConstants(), this.getMonomConstant(), null, "monomConstants", null, 0, -1, TokenVariadicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(monomEClass, Monom.class, "Monom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMonom_Variable(), this.getVariable(), null, "variable", null, 1, 1, Monom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMonom_Power(), ecorePackage.getEBigInteger(), "power", "1", 1, 1, Monom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(tokenExpressionBindingEClass, TokenExpressionBinding.class, "TokenExpressionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenExpressionBinding_Expression(), this.getTokenVariadicExpression(), null, "expression", null, 1, 1, TokenExpressionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenExpressionBinding_BindingTokens(), this.getTokenBinding(), null, "bindingTokens", null, 0, -1, TokenExpressionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tokenBindingEClass, TokenBinding.class, "TokenBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokenBinding_Variable(), this.getVariable(), null, "variable", null, 1, 1, TokenBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTokenBinding_Value(), theTokenTypesPackage.getToken(), null, "value", null, 1, 1, TokenBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(monomConstantEClass, MonomConstant.class, "MonomConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMonomConstant_Constant(), this.getVariable(), null, "constant", null, 1, 1, MonomConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMonomConstant_Value(), theTokenTypesPackage.getToken(), null, "value", null, 1, 1, MonomConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMonomConstant_Power(), ecorePackage.getEBigInteger(), "power", "1", 1, 1, MonomConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(netConstantEClass, NetConstant.class, "NetConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNetConstant_Binding(), this.getTokenBinding(), null, "binding", null, 1, 1, NetConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //TokenExpressionsPackageImpl
