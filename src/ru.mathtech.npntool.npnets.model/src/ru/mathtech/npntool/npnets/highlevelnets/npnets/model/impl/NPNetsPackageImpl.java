/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.CommonPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage;

import ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;

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
public class NPNetsPackageImpl extends EPackageImpl implements NPNetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nPnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nPnetMarkedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionSynchronizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eSynchronizationKindEEnum = null;

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NPNetsPackageImpl() {
		super(eNS_URI, NPNetsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NPNetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NPNetsPackage init() {
		if (isInited) return (NPNetsPackage)EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI);

		// Obtain or create and register package
		NPNetsPackageImpl theNPNetsPackage = (NPNetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NPNetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NPNetsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MarkingPackageImpl theMarkingPackage = (MarkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) instanceof MarkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI) : MarkingPackage.eINSTANCE);
		TokenTypesPackageImpl theTokenTypesPackage = (TokenTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) instanceof TokenTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) : TokenTypesPackage.eINSTANCE);
		TokenExpressionsPackageImpl theTokenExpressionsPackage = (TokenExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) instanceof TokenExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) : TokenExpressionsPackage.eINSTANCE);
		HLPNPackageImpl theHLPNPackage = (HLPNPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) instanceof HLPNPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) : HLPNPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		NPNDiagramsPackageImpl theNPNDiagramsPackage = (NPNDiagramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) instanceof NPNDiagramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) : NPNDiagramsPackage.eINSTANCE);

		// Create package meta-data objects
		theNPNetsPackage.createPackageContents();
		theMarkingPackage.createPackageContents();
		theTokenTypesPackage.createPackageContents();
		theTokenExpressionsPackage.createPackageContents();
		theHLPNPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theNPNDiagramsPackage.createPackageContents();

		// Initialize created meta-data
		theNPNetsPackage.initializePackageContents();
		theMarkingPackage.initializePackageContents();
		theTokenTypesPackage.initializePackageContents();
		theTokenExpressionsPackage.initializePackageContents();
		theHLPNPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theNPNDiagramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNPNetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NPNetsPackage.eNS_URI, theNPNetsPackage);
		return theNPNetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPnet() {
		return nPnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnet_NetSystem() {
		return (EReference)nPnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnet_TypeElementNet() {
		return (EReference)nPnetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnet_TypeAtomic() {
		return (EReference)nPnetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnet_NetConstants() {
		return (EReference)nPnetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnet_Synchronizations() {
		return (EReference)nPnetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPnetMarked() {
		return nPnetMarkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnetMarked_Net() {
		return (EReference)nPnetMarkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnetMarked_Marking() {
		return (EReference)nPnetMarkedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPnetMarked_DiagramNetSystem() {
		return (EReference)nPnetMarkedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronization_Kind() {
		return (EAttribute)synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronization_Key() {
		return (EAttribute)synchronizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_Involved() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionSynchronized() {
		return transitionSynchronizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionSynchronized_Synchronization() {
		return (EReference)transitionSynchronizedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESynchronizationKind() {
		return eSynchronizationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNetsFactory getNPNetsFactory() {
		return (NPNetsFactory)getEFactoryInstance();
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
		nPnetEClass = createEClass(NPNET);
		createEReference(nPnetEClass, NPNET__NET_SYSTEM);
		createEReference(nPnetEClass, NPNET__TYPE_ELEMENT_NET);
		createEReference(nPnetEClass, NPNET__TYPE_ATOMIC);
		createEReference(nPnetEClass, NPNET__NET_CONSTANTS);
		createEReference(nPnetEClass, NPNET__SYNCHRONIZATIONS);

		nPnetMarkedEClass = createEClass(NPNET_MARKED);
		createEReference(nPnetMarkedEClass, NPNET_MARKED__NET);
		createEReference(nPnetMarkedEClass, NPNET_MARKED__MARKING);
		createEReference(nPnetMarkedEClass, NPNET_MARKED__DIAGRAM_NET_SYSTEM);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEAttribute(synchronizationEClass, SYNCHRONIZATION__KIND);
		createEAttribute(synchronizationEClass, SYNCHRONIZATION__KEY);
		createEReference(synchronizationEClass, SYNCHRONIZATION__INVOLVED);

		transitionSynchronizedEClass = createEClass(TRANSITION_SYNCHRONIZED);
		createEReference(transitionSynchronizedEClass, TRANSITION_SYNCHRONIZED__SYNCHRONIZATION);

		// Create enums
		eSynchronizationKindEEnum = createEEnum(ESYNCHRONIZATION_KIND);
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
		TokenTypesPackage theTokenTypesPackage = (TokenTypesPackage)EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI);
		TokenExpressionsPackage theTokenExpressionsPackage = (TokenExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI);
		MarkingPackage theMarkingPackage = (MarkingPackage)EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI);
		NPNDiagramsPackage theNPNDiagramsPackage = (NPNDiagramsPackage)EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nPnetEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		nPnetMarkedEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		synchronizationEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		transitionSynchronizedEClass.getESuperTypes().add(theHLPNPackage.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(nPnetEClass, NPnet.class, "NPnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPnet_NetSystem(), theHLPNPackage.getHighLevelPetriNet(), null, "netSystem", null, 1, 1, NPnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPnet_TypeElementNet(), theTokenTypesPackage.getTokenTypeElementNet(), null, "typeElementNet", null, 0, -1, NPnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPnet_TypeAtomic(), theTokenTypesPackage.getTokenTypeAtomic(), null, "typeAtomic", null, 1, 1, NPnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPnet_NetConstants(), theTokenExpressionsPackage.getNetConstant(), null, "netConstants", null, 0, -1, NPnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPnet_Synchronizations(), this.getSynchronization(), null, "synchronizations", null, 0, -1, NPnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(nPnetMarkedEClass, NPnetMarked.class, "NPnetMarked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNPnetMarked_Net(), this.getNPnet(), null, "net", null, 1, 1, NPnetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPnetMarked_Marking(), theMarkingPackage.getMarking(), null, "marking", null, 1, 1, NPnetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNPnetMarked_DiagramNetSystem(), theNPNDiagramsPackage.getNPNDiagramNetSystem(), null, "diagramNetSystem", null, 1, 1, NPnetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSynchronization_Kind(), this.getESynchronizationKind(), "kind", null, 1, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSynchronization_Key(), ecorePackage.getEString(), "key", null, 1, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSynchronization_Involved(), this.getTransitionSynchronized(), this.getTransitionSynchronized_Synchronization(), "involved", null, 0, -1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionSynchronizedEClass, TransitionSynchronized.class, "TransitionSynchronized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTransitionSynchronized_Synchronization(), this.getSynchronization(), this.getSynchronization_Involved(), "synchronization", null, 0, 1, TransitionSynchronized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(eSynchronizationKindEEnum, ESynchronizationKind.class, "ESynchronizationKind"); //$NON-NLS-1$
		addEEnumLiteral(eSynchronizationKindEEnum, ESynchronizationKind.VERTICAL_SYNCHRONIZATION);
		addEEnumLiteral(eSynchronizationKindEEnum, ESynchronizationKind.HORIZONTAL_SYNCHRONIZATION);

		// Create resource
		createResource(eNS_URI);
	}

} //NPNetsPackageImpl
