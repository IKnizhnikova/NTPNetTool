/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.marking.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.CommonPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl;

import ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;
import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingFactory;
import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage;
import ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking;

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
public class MarkingPackageImpl extends EPackageImpl implements MarkingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highLevelPetriNetMarkedEClass = null;

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
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkingPackageImpl() {
		super(eNS_URI, MarkingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MarkingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkingPackage init() {
		if (isInited) return (MarkingPackage)EPackage.Registry.INSTANCE.getEPackage(MarkingPackage.eNS_URI);

		// Obtain or create and register package
		MarkingPackageImpl theMarkingPackage = (MarkingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarkingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarkingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TokenTypesPackageImpl theTokenTypesPackage = (TokenTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) instanceof TokenTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenTypesPackage.eNS_URI) : TokenTypesPackage.eINSTANCE);
		TokenExpressionsPackageImpl theTokenExpressionsPackage = (TokenExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) instanceof TokenExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI) : TokenExpressionsPackage.eINSTANCE);
		HLPNPackageImpl theHLPNPackage = (HLPNPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) instanceof HLPNPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLPNPackage.eNS_URI) : HLPNPackage.eINSTANCE);
		NPNetsPackageImpl theNPNetsPackage = (NPNetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) instanceof NPNetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNetsPackage.eNS_URI) : NPNetsPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		NPNDiagramsPackageImpl theNPNDiagramsPackage = (NPNDiagramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) instanceof NPNDiagramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NPNDiagramsPackage.eNS_URI) : NPNDiagramsPackage.eINSTANCE);

		// Create package meta-data objects
		theMarkingPackage.createPackageContents();
		theTokenTypesPackage.createPackageContents();
		theTokenExpressionsPackage.createPackageContents();
		theHLPNPackage.createPackageContents();
		theNPNetsPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theNPNDiagramsPackage.createPackageContents();

		// Initialize created meta-data
		theMarkingPackage.initializePackageContents();
		theTokenTypesPackage.initializePackageContents();
		theTokenExpressionsPackage.initializePackageContents();
		theHLPNPackage.initializePackageContents();
		theNPNetsPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theNPNDiagramsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkingPackage.eNS_URI, theMarkingPackage);
		return theMarkingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarking() {
		return markingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarking_Map() {
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceMarking() {
		return placeMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceMarking_Place() {
		return (EReference)placeMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceMarking_Marking() {
		return (EReference)placeMarkingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighLevelPetriNetMarked() {
		return highLevelPetriNetMarkedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelPetriNetMarked_Net() {
		return (EReference)highLevelPetriNetMarkedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighLevelPetriNetMarked_Marking() {
		return (EReference)highLevelPetriNetMarkedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingFactory getMarkingFactory() {
		return (MarkingFactory)getEFactoryInstance();
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
		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__MAP);

		placeMarkingEClass = createEClass(PLACE_MARKING);
		createEReference(placeMarkingEClass, PLACE_MARKING__PLACE);
		createEReference(placeMarkingEClass, PLACE_MARKING__MARKING);

		highLevelPetriNetMarkedEClass = createEClass(HIGH_LEVEL_PETRI_NET_MARKED);
		createEReference(highLevelPetriNetMarkedEClass, HIGH_LEVEL_PETRI_NET_MARKED__NET);
		createEReference(highLevelPetriNetMarkedEClass, HIGH_LEVEL_PETRI_NET_MARKED__MARKING);
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
		TokenExpressionsPackage theTokenExpressionsPackage = (TokenExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(TokenExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		markingEClass.getESuperTypes().add(theCommonPackage.getINetElement());
		placeMarkingEClass.getESuperTypes().add(theCommonPackage.getIEntityIdentifiable());
		highLevelPetriNetMarkedEClass.getESuperTypes().add(theCommonPackage.getINetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMarking_Map(), this.getPlaceMarking(), null, "map", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(placeMarkingEClass, PlaceMarking.class, "PlaceMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlaceMarking_Place(), theHLPNPackage.getPlace(), null, "place", null, 1, 1, PlaceMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPlaceMarking_Marking(), theTokenExpressionsPackage.getTokenMultiSet(), null, "marking", null, 1, 1, PlaceMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(highLevelPetriNetMarkedEClass, HighLevelPetriNetMarked.class, "HighLevelPetriNetMarked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHighLevelPetriNetMarked_Net(), theHLPNPackage.getHighLevelPetriNet(), null, "net", null, 1, 1, HighLevelPetriNetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHighLevelPetriNetMarked_Marking(), this.getMarking(), null, "marking", null, 1, 1, HighLevelPetriNetMarked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //MarkingPackageImpl
