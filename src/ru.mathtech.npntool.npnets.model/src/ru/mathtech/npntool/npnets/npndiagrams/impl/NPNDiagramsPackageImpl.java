/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.impl;

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

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionsPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypesPackageImpl;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNDiagramsPackageImpl extends EPackageImpl implements NPNDiagramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnDiagramNPNMarkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnDiagramNetSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolPlaceSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolTransitionSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolArcPTSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolArcTPSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolNodeSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolArcSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npnSymbolTokenSNEClass = null;

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
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NPNDiagramsPackageImpl() {
		super(eNS_URI, NPNDiagramsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NPNDiagramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NPNDiagramsPackage init() {
		if (isInited) return (NPNDiagramsPackage)EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI);

		// Obtain or create and register package
		NPNDiagramsPackageImpl theNPNDiagramsPackage = (NPNDiagramsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NPNDiagramsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NPNDiagramsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MarkingPackageImpl theMarkingPackage = (MarkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) instanceof MarkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) : MarkingPackage.eINSTANCE);
		TokenTypesPackageImpl theTokenTypesPackage = (TokenTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) instanceof TokenTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) : TokenTypesPackage.eINSTANCE);
		TokenExpressionsPackageImpl theTokenExpressionsPackage = (TokenExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) instanceof TokenExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) : TokenExpressionsPackage.eINSTANCE);
		HLPNPackageImpl theHLPNPackage = (HLPNPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) instanceof HLPNPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) : HLPNPackage.eINSTANCE);
		NPNetsPackageImpl theNPNetsPackage = (NPNetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) instanceof NPNetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) : NPNetsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theNPNDiagramsPackage.createPackageContents();
		theMarkingPackage.createPackageContents();
		theTokenTypesPackage.createPackageContents();
		theTokenExpressionsPackage.createPackageContents();
		theHLPNPackage.createPackageContents();
		theNPNetsPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theNPNDiagramsPackage.initializePackageContents();
		theMarkingPackage.initializePackageContents();
		theTokenTypesPackage.initializePackageContents();
		theTokenExpressionsPackage.initializePackageContents();
		theHLPNPackage.initializePackageContents();
		theNPNetsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNPNDiagramsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NPNDiagramsPackage.eNS_URI, theNPNDiagramsPackage);
		return theNPNDiagramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNDiagramNPNMarked() {
		return npnDiagramNPNMarkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNDiagramNPNMarked_DiagramNetSystem() {
		return (EReference)npnDiagramNPNMarkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNDiagramNPNMarked_Model() {
		return (EReference)npnDiagramNPNMarkedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNDiagramNetSystem() {
		return npnDiagramNetSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNDiagramNetSystem_Model() {
		return (EReference)npnDiagramNetSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNDiagramNetSystem_Nodes() {
		return (EReference)npnDiagramNetSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNDiagramNetSystem_Arcs() {
		return (EReference)npnDiagramNetSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolPlaceSN() {
		return npnSymbolPlaceSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolPlaceSN_OutArcs() {
		return (EReference)npnSymbolPlaceSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolPlaceSN_InArcs() {
		return (EReference)npnSymbolPlaceSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolPlaceSN_Tokens() {
		return (EReference)npnSymbolPlaceSNEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolTransitionSN() {
		return npnSymbolTransitionSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolTransitionSN_OutArcs() {
		return (EReference)npnSymbolTransitionSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolTransitionSN_InArcs() {
		return (EReference)npnSymbolTransitionSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolArcPTSN() {
		return npnSymbolArcPTSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolArcPTSN_Target() {
		return (EReference)npnSymbolArcPTSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolArcPTSN_Source() {
		return (EReference)npnSymbolArcPTSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolArcTPSN() {
		return npnSymbolArcTPSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolArcTPSN_Target() {
		return (EReference)npnSymbolArcTPSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolArcTPSN_Source() {
		return (EReference)npnSymbolArcTPSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolNodeSN() {
		return npnSymbolNodeSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolNodeSN_Diagram() {
		return (EReference)npnSymbolNodeSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNPNSymbolNodeSN_Constraints() {
		return (EAttribute)npnSymbolNodeSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolNodeSN_Model() {
		return (EReference)npnSymbolNodeSNEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolArcSN() {
		return npnSymbolArcSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolArcSN_Diagram() {
		return (EReference)npnSymbolArcSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolArcSN_Model() {
		return (EReference)npnSymbolArcSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNPNSymbolArcSN_Bendpoints() {
		return (EAttribute)npnSymbolArcSNEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPNSymbolTokenSN() {
		return npnSymbolTokenSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPNSymbolTokenSN_Place() {
		return (EReference)npnSymbolTokenSNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNPNSymbolTokenSN_Constraints() {
		return (EAttribute)npnSymbolTokenSNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramsFactory getNPNDiagramsFactory() {
		return (NPNDiagramsFactory)getEFactoryInstance();
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
		npnDiagramNPNMarkedEClass = createEClass(NPN_DIAGRAM_NPN_MARKED);
		createEReference(npnDiagramNPNMarkedEClass, NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM);
		createEReference(npnDiagramNPNMarkedEClass, NPN_DIAGRAM_NPN_MARKED__MODEL);

		npnDiagramNetSystemEClass = createEClass(NPN_DIAGRAM_NET_SYSTEM);
		createEReference(npnDiagramNetSystemEClass, NPN_DIAGRAM_NET_SYSTEM__MODEL);
		createEReference(npnDiagramNetSystemEClass, NPN_DIAGRAM_NET_SYSTEM__NODES);
		createEReference(npnDiagramNetSystemEClass, NPN_DIAGRAM_NET_SYSTEM__ARCS);

		npnSymbolPlaceSNEClass = createEClass(NPN_SYMBOL_PLACE_SN);
		createEReference(npnSymbolPlaceSNEClass, NPN_SYMBOL_PLACE_SN__OUT_ARCS);
		createEReference(npnSymbolPlaceSNEClass, NPN_SYMBOL_PLACE_SN__IN_ARCS);
		createEReference(npnSymbolPlaceSNEClass, NPN_SYMBOL_PLACE_SN__TOKENS);

		npnSymbolTransitionSNEClass = createEClass(NPN_SYMBOL_TRANSITION_SN);
		createEReference(npnSymbolTransitionSNEClass, NPN_SYMBOL_TRANSITION_SN__OUT_ARCS);
		createEReference(npnSymbolTransitionSNEClass, NPN_SYMBOL_TRANSITION_SN__IN_ARCS);

		npnSymbolArcPTSNEClass = createEClass(NPN_SYMBOL_ARC_PTSN);
		createEReference(npnSymbolArcPTSNEClass, NPN_SYMBOL_ARC_PTSN__TARGET);
		createEReference(npnSymbolArcPTSNEClass, NPN_SYMBOL_ARC_PTSN__SOURCE);

		npnSymbolArcTPSNEClass = createEClass(NPN_SYMBOL_ARC_TPSN);
		createEReference(npnSymbolArcTPSNEClass, NPN_SYMBOL_ARC_TPSN__TARGET);
		createEReference(npnSymbolArcTPSNEClass, NPN_SYMBOL_ARC_TPSN__SOURCE);

		npnSymbolNodeSNEClass = createEClass(NPN_SYMBOL_NODE_SN);
		createEReference(npnSymbolNodeSNEClass, NPN_SYMBOL_NODE_SN__DIAGRAM);
		createEAttribute(npnSymbolNodeSNEClass, NPN_SYMBOL_NODE_SN__CONSTRAINTS);
		createEReference(npnSymbolNodeSNEClass, NPN_SYMBOL_NODE_SN__MODEL);

		npnSymbolArcSNEClass = createEClass(NPN_SYMBOL_ARC_SN);
		createEReference(npnSymbolArcSNEClass, NPN_SYMBOL_ARC_SN__DIAGRAM);
		createEReference(npnSymbolArcSNEClass, NPN_SYMBOL_ARC_SN__MODEL);
		createEAttribute(npnSymbolArcSNEClass, NPN_SYMBOL_ARC_SN__BENDPOINTS);

		npnSymbolTokenSNEClass = createEClass(NPN_SYMBOL_TOKEN_SN);
		createEReference(npnSymbolTokenSNEClass, NPN_SYMBOL_TOKEN_SN__PLACE);
		createEAttribute(npnSymbolTokenSNEClass, NPN_SYMBOL_TOKEN_SN__CONSTRAINTS);
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
		NPNetsPackage theNPNetsPackage = (NPNetsPackage)EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI);
		HLPNPackage theHLPNPackage = (HLPNPackage)EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		npnDiagramNPNMarkedEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		npnDiagramNetSystemEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		npnSymbolPlaceSNEClass.getESuperTypes().add(this.getNPNSymbolNodeSN());
		npnSymbolTransitionSNEClass.getESuperTypes().add(this.getNPNSymbolNodeSN());
		npnSymbolArcPTSNEClass.getESuperTypes().add(this.getNPNSymbolArcSN());
		npnSymbolArcTPSNEClass.getESuperTypes().add(this.getNPNSymbolArcSN());
		npnSymbolNodeSNEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		npnSymbolArcSNEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		npnSymbolTokenSNEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(npnDiagramNPNMarkedEClass, NPNDiagramNPNMarked.class, "NPNDiagramNPNMarked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNDiagramNPNMarked_DiagramNetSystem(), this.getNPNDiagramNetSystem(), null, "diagramNetSystem", null, 1, 1, NPNDiagramNPNMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNDiagramNPNMarked_Model(), theNPNetsPackage.getNPnetMarked(), null, "model", null, 1, 1, NPNDiagramNPNMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnDiagramNetSystemEClass, NPNDiagramNetSystem.class, "NPNDiagramNetSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNDiagramNetSystem_Model(), theHLPNPackage.getHighLevelPetriNet(), null, "model", null, 1, 1, NPNDiagramNetSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNDiagramNetSystem_Nodes(), this.getNPNSymbolNodeSN(), this.getNPNSymbolNodeSN_Diagram(), "nodes", null, 0, -1, NPNDiagramNetSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNDiagramNetSystem_Arcs(), this.getNPNSymbolArcSN(), this.getNPNSymbolArcSN_Diagram(), "arcs", null, 0, -1, NPNDiagramNetSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolPlaceSNEClass, NPNSymbolPlaceSN.class, "NPNSymbolPlaceSN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolPlaceSN_OutArcs(), this.getNPNSymbolArcPTSN(), this.getNPNSymbolArcPTSN_Source(), "outArcs", null, 0, -1, NPNSymbolPlaceSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolPlaceSN_InArcs(), this.getNPNSymbolArcTPSN(), this.getNPNSymbolArcTPSN_Target(), "inArcs", null, 0, -1, NPNSymbolPlaceSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolPlaceSN_Tokens(), this.getNPNSymbolTokenSN(), this.getNPNSymbolTokenSN_Place(), "tokens", null, 0, -1, NPNSymbolPlaceSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolTransitionSNEClass, NPNSymbolTransitionSN.class, "NPNSymbolTransitionSN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolTransitionSN_OutArcs(), this.getNPNSymbolArcTPSN(), this.getNPNSymbolArcTPSN_Source(), "outArcs", null, 0, -1, NPNSymbolTransitionSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolTransitionSN_InArcs(), this.getNPNSymbolArcPTSN(), this.getNPNSymbolArcPTSN_Target(), "inArcs", null, 0, -1, NPNSymbolTransitionSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolArcPTSNEClass, NPNSymbolArcPTSN.class, "NPNSymbolArcPTSN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolArcPTSN_Target(), this.getNPNSymbolTransitionSN(), this.getNPNSymbolTransitionSN_InArcs(), "target", null, 1, 1, NPNSymbolArcPTSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolArcPTSN_Source(), this.getNPNSymbolPlaceSN(), this.getNPNSymbolPlaceSN_OutArcs(), "source", null, 1, 1, NPNSymbolArcPTSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolArcTPSNEClass, NPNSymbolArcTPSN.class, "NPNSymbolArcTPSN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolArcTPSN_Target(), this.getNPNSymbolPlaceSN(), this.getNPNSymbolPlaceSN_InArcs(), "target", null, 1, 1, NPNSymbolArcTPSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolArcTPSN_Source(), this.getNPNSymbolTransitionSN(), this.getNPNSymbolTransitionSN_OutArcs(), "source", null, 1, 1, NPNSymbolArcTPSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolNodeSNEClass, NPNSymbolNodeSN.class, "NPNSymbolNodeSN", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolNodeSN_Diagram(), this.getNPNDiagramNetSystem(), this.getNPNDiagramNetSystem_Nodes(), "diagram", null, 1, 1, NPNSymbolNodeSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getNPNSymbolNodeSN_Constraints(), theCommonPackage.getRectangle(), "constraints", null, 1, 1, NPNSymbolNodeSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolNodeSN_Model(), theHLPNPackage.getNode(), null, "model", null, 1, 1, NPNSymbolNodeSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolArcSNEClass, NPNSymbolArcSN.class, "NPNSymbolArcSN", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolArcSN_Diagram(), this.getNPNDiagramNetSystem(), this.getNPNDiagramNetSystem_Arcs(), "diagram", null, 1, 1, NPNSymbolArcSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPNSymbolArcSN_Model(), theHLPNPackage.getArc(), null, "model", null, 1, 1, NPNSymbolArcSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getNPNSymbolArcSN_Bendpoints(), theCommonPackage.getPoint(), "bendpoints", null, 0, -1, NPNSymbolArcSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(npnSymbolTokenSNEClass, NPNSymbolTokenSN.class, "NPNSymbolTokenSN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPNSymbolTokenSN_Place(), this.getNPNSymbolPlaceSN(), this.getNPNSymbolPlaceSN_Tokens(), "place", null, 1, 1, NPNSymbolTokenSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getNPNSymbolTokenSN_Constraints(), theCommonPackage.getRectangle(), "constraints", "", 1, 1, NPNSymbolTokenSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //NPNDiagramsPackageImpl
