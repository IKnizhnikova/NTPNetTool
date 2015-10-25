/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.CommonPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage;

import ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl;

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
public class HLPNPackageImpl extends EPackageImpl implements HLPNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highLevelPetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcPTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HLPNPackageImpl() {
		super(eNS_URI, HLPNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HLPNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HLPNPackage init() {
		if (isInited) return (HLPNPackage)EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI);

		// Obtain or create and register package
		HLPNPackageImpl theHLPNPackage = (HLPNPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HLPNPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HLPNPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MarkingPackageImpl theMarkingPackage = (MarkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) instanceof MarkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) : MarkingPackage.eINSTANCE);
		TokenTypesPackageImpl theTokenTypesPackage = (TokenTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) instanceof TokenTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) : TokenTypesPackage.eINSTANCE);
		TokenExpressionsPackageImpl theTokenExpressionsPackage = (TokenExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) instanceof TokenExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) : TokenExpressionsPackage.eINSTANCE);
		NPNetsPackageImpl theNPNetsPackage = (NPNetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) instanceof NPNetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) : NPNetsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		NPNDiagramsPackageImpl theNPNDiagramsPackage = (NPNDiagramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) instanceof NPNDiagramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) : NPNDiagramsPackage.eINSTANCE);

		// Create package meta-data objects
		theHLPNPackage.createPackageContents();
		theMarkingPackage.createPackageContents();
		theTokenTypesPackage.createPackageContents();
		theTokenExpressionsPackage.createPackageContents();
		theNPNetsPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theNPNDiagramsPackage.createPackageContents();

		// Initialize created meta-data
		theHLPNPackage.initializePackageContents();
		theMarkingPackage.initializePackageContents();
		theTokenTypesPackage.initializePackageContents();
		theTokenExpressionsPackage.initializePackageContents();
		theNPNetsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theNPNDiagramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHLPNPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HLPNPackage.eNS_URI, theHLPNPackage);
		return theHLPNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighLevelPetriNet() {
		return highLevelPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelPetriNet_Nodes() {
		return (EReference)highLevelPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelPetriNet_Arcs() {
		return (EReference)highLevelPetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_OutArcs() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InArcs() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Type() {
		return (EReference)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_InArcs() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OutArcs() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcPT() {
		return arcPTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcPT_Source() {
		return (EReference)arcPTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcPT_Target() {
		return (EReference)arcPTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcPT_Inscription() {
		return (EReference)arcPTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcTP() {
		return arcTPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcTP_Source() {
		return (EReference)arcTPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcTP_Target() {
		return (EReference)arcTPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcTP_Inscription() {
		return (EReference)arcTPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextVariable() {
		return contextVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextVariable_Variables() {
		return (EReference)contextVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Net() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Net() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNFactory getHLPNFactory() {
		return (HLPNFactory)getEFactoryInstance();
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
		highLevelPetriNetEClass = createEClass(HIGH_LEVEL_PETRI_NET);
		createEReference(highLevelPetriNetEClass, HIGH_LEVEL_PETRI_NET__NODES);
		createEReference(highLevelPetriNetEClass, HIGH_LEVEL_PETRI_NET__ARCS);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__OUT_ARCS);
		createEReference(placeEClass, PLACE__IN_ARCS);
		createEReference(placeEClass, PLACE__TYPE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__IN_ARCS);
		createEReference(transitionEClass, TRANSITION__OUT_ARCS);

		arcPTEClass = createEClass(ARC_PT);
		createEReference(arcPTEClass, ARC_PT__SOURCE);
		createEReference(arcPTEClass, ARC_PT__TARGET);
		createEReference(arcPTEClass, ARC_PT__INSCRIPTION);

		arcTPEClass = createEClass(ARC_TP);
		createEReference(arcTPEClass, ARC_TP__SOURCE);
		createEReference(arcTPEClass, ARC_TP__TARGET);
		createEReference(arcTPEClass, ARC_TP__INSCRIPTION);

		contextVariableEClass = createEClass(CONTEXT_VARIABLE);
		createEReference(contextVariableEClass, CONTEXT_VARIABLE__VARIABLES);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__NET);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__NET);
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
		TokenExpressionsPackage theTokenExpressionsPackage = (TokenExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		highLevelPetriNetEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		highLevelPetriNetEClass.getESuperTypes().add(this.getContextVariable());
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getContextVariable());
		transitionEClass.getESuperTypes().add(this.getNode());
		arcPTEClass.getESuperTypes().add(this.getArc());
		arcTPEClass.getESuperTypes().add(this.getArc());
		contextVariableEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		nodeEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		arcEClass.getESuperTypes().add(theCommonPackage.getINetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(highLevelPetriNetEClass, HighLevelPetriNet.class, "HighLevelPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHighLevelPetriNet_Nodes(), this.getNode(), this.getNode_Net(), "nodes", null, 0, -1, HighLevelPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHighLevelPetriNet_Arcs(), this.getArc(), this.getArc_Net(), "arcs", null, 0, -1, HighLevelPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlace_OutArcs(), this.getArcPT(), this.getArcPT_Source(), "outArcs", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPlace_InArcs(), this.getArcTP(), this.getArcTP_Target(), "inArcs", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPlace_Type(), theTokenTypesPackage.getTokenType(), null, "type", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTransition_InArcs(), this.getArcPT(), this.getArcPT_Target(), "inArcs", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTransition_OutArcs(), this.getArcTP(), this.getArcTP_Source(), "outArcs", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcPTEClass, ArcPT.class, "ArcPT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArcPT_Source(), this.getPlace(), this.getPlace_OutArcs(), "source", null, 1, 1, ArcPT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArcPT_Target(), this.getTransition(), this.getTransition_InArcs(), "target", null, 1, 1, ArcPT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArcPT_Inscription(), theTokenExpressionsPackage.getTokenVariadicExpression(), null, "inscription", null, 1, 1, ArcPT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcTPEClass, ArcTP.class, "ArcTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArcTP_Source(), this.getTransition(), this.getTransition_OutArcs(), "source", null, 1, 1, ArcTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArcTP_Target(), this.getPlace(), this.getPlace_InArcs(), "target", null, 1, 1, ArcTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArcTP_Inscription(), theTokenExpressionsPackage.getTokenVariadicExpression(), null, "inscription", null, 1, 1, ArcTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(contextVariableEClass, ContextVariable.class, "ContextVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContextVariable_Variables(), theTokenExpressionsPackage.getVariable(), theTokenExpressionsPackage.getVariable_Context(), "variables", null, 0, -1, ContextVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNode_Net(), this.getHighLevelPetriNet(), this.getHighLevelPetriNet_Nodes(), "net", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(arcEClass, Arc.class, "Arc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArc_Net(), this.getHighLevelPetriNet(), this.getHighLevelPetriNet_Arcs(), "net", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //HLPNPackageImpl
