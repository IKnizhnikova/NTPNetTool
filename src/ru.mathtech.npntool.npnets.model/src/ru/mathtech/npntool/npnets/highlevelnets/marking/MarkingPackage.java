/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.marking;

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
 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingFactory
 * @model kind="package"
 * @generated
 */
public interface MarkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "marking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mathtech.ru/npntool/nets/marking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "marking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkingPackage eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__MAP = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.impl.PlaceMarkingImpl <em>Place Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.PlaceMarkingImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl#getPlaceMarking()
	 * @generated
	 */
	int PLACE_MARKING = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING__PLACE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING__MARKING = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.impl.HighLevelPetriNetMarkedImpl <em>High Level Petri Net Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.HighLevelPetriNetMarkedImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl#getHighLevelPetriNetMarked()
	 * @generated
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED__NET = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED__MARKING = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>High Level Petri Net Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The number of operations of the '<em>High Level Petri Net Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_MARKED_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.Marking#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.Marking#getMap()
	 * @see #getMarking()
	 * @generated
	 */
	EReference getMarking_Map();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking <em>Place Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Marking</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking
	 * @generated
	 */
	EClass getPlaceMarking();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getPlace()
	 * @see #getPlaceMarking()
	 * @generated
	 */
	EReference getPlaceMarking_Place();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking#getMarking()
	 * @see #getPlaceMarking()
	 * @generated
	 */
	EReference getPlaceMarking_Marking();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked <em>High Level Petri Net Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Level Petri Net Marked</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked
	 * @generated
	 */
	EClass getHighLevelPetriNetMarked();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getNet()
	 * @see #getHighLevelPetriNetMarked()
	 * @generated
	 */
	EReference getHighLevelPetriNetMarked_Net();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked#getMarking()
	 * @see #getHighLevelPetriNetMarked()
	 * @generated
	 */
	EReference getHighLevelPetriNetMarked_Marking();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkingFactory getMarkingFactory();

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
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING__MAP = eINSTANCE.getMarking_Map();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.impl.PlaceMarkingImpl <em>Place Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.PlaceMarkingImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl#getPlaceMarking()
		 * @generated
		 */
		EClass PLACE_MARKING = eINSTANCE.getPlaceMarking();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_MARKING__PLACE = eINSTANCE.getPlaceMarking_Place();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_MARKING__MARKING = eINSTANCE.getPlaceMarking_Marking();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.impl.HighLevelPetriNetMarkedImpl <em>High Level Petri Net Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.HighLevelPetriNetMarkedImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.impl.MarkingPackageImpl#getHighLevelPetriNetMarked()
		 * @generated
		 */
		EClass HIGH_LEVEL_PETRI_NET_MARKED = eINSTANCE.getHighLevelPetriNetMarked();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_PETRI_NET_MARKED__NET = eINSTANCE.getHighLevelPetriNetMarked_Net();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_PETRI_NET_MARKED__MARKING = eINSTANCE.getHighLevelPetriNetMarked_Marking();

	}

} //MarkingPackage
