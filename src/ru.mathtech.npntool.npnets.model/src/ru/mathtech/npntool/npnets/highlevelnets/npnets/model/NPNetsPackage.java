/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;

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
 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory
 * @model kind="package"
 * @generated
 */
public interface NPNetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "npnets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mathtech.ru/npntool/npnets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "npnets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NPNetsPackage eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetImpl <em>NPnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getNPnet()
	 * @generated
	 */
	int NPNET = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Net System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__NET_SYSTEM = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Element Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__TYPE_ELEMENT_NET = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Atomic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__TYPE_ATOMIC = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Net Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__NET_CONSTANTS = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET__SYNCHRONIZATIONS = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>NPnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>NPnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl <em>NPnet Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getNPnetMarked()
	 * @generated
	 */
	int NPNET_MARKED = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED__NET = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED__MARKING = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram Net System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED__DIAGRAM_NET_SYSTEM = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NPnet Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NPnet Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPNET_MARKED_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.SynchronizationImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__KIND = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__KEY = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Involved</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__INVOLVED = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionSynchronizedImpl <em>Transition Synchronized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionSynchronizedImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getTransitionSynchronized()
	 * @generated
	 */
	int TRANSITION_SYNCHRONIZED = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__UUID = HLPNPackage.TRANSITION__UUID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__VARIABLES = HLPNPackage.TRANSITION__VARIABLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__NAME = HLPNPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__COMMENT = HLPNPackage.TRANSITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__NET = HLPNPackage.TRANSITION__NET;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__IN_ARCS = HLPNPackage.TRANSITION__IN_ARCS;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__OUT_ARCS = HLPNPackage.TRANSITION__OUT_ARCS;

	/**
	 * The feature id for the '<em><b>Synchronization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED__SYNCHRONIZATION = HLPNPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Synchronized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED_FEATURE_COUNT = HLPNPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition Synchronized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYNCHRONIZED_OPERATION_COUNT = HLPNPackage.TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind <em>ESynchronization Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getESynchronizationKind()
	 * @generated
	 */
	int ESYNCHRONIZATION_KIND = 4;


	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet <em>NPnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPnet</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet
	 * @generated
	 */
	EClass getNPnet();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getNetSystem <em>Net System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net System</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getNetSystem()
	 * @see #getNPnet()
	 * @generated
	 */
	EReference getNPnet_NetSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getTypeElementNet <em>Type Element Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Element Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getTypeElementNet()
	 * @see #getNPnet()
	 * @generated
	 */
	EReference getNPnet_TypeElementNet();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getTypeAtomic <em>Type Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Atomic</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getTypeAtomic()
	 * @see #getNPnet()
	 * @generated
	 */
	EReference getNPnet_TypeAtomic();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getNetConstants <em>Net Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net Constants</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getNetConstants()
	 * @see #getNPnet()
	 * @generated
	 */
	EReference getNPnet_NetConstants();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getSynchronizations <em>Synchronizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronizations</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet#getSynchronizations()
	 * @see #getNPnet()
	 * @generated
	 */
	EReference getNPnet_Synchronizations();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked <em>NPnet Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPnet Marked</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked
	 * @generated
	 */
	EClass getNPnetMarked();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked#getNet()
	 * @see #getNPnetMarked()
	 * @generated
	 */
	EReference getNPnetMarked_Net();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked#getMarking()
	 * @see #getNPnetMarked()
	 * @generated
	 */
	EReference getNPnetMarked_Marking();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked#getDiagramNetSystem <em>Diagram Net System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram Net System</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked#getDiagramNetSystem()
	 * @see #getNPnetMarked()
	 * @generated
	 */
	EReference getNPnetMarked_DiagramNetSystem();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKind()
	 * @see #getSynchronization()
	 * @generated
	 */
	EAttribute getSynchronization_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getKey()
	 * @see #getSynchronization()
	 * @generated
	 */
	EAttribute getSynchronization_Key();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getInvolved <em>Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization#getInvolved()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_Involved();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized <em>Transition Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Synchronized</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized
	 * @generated
	 */
	EClass getTransitionSynchronized();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized#getSynchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronization</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized#getSynchronization()
	 * @see #getTransitionSynchronized()
	 * @generated
	 */
	EReference getTransitionSynchronized_Synchronization();

	/**
	 * Returns the meta object for enum '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind <em>ESynchronization Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESynchronization Kind</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind
	 * @generated
	 */
	EEnum getESynchronizationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NPNetsFactory getNPNetsFactory();

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
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetImpl <em>NPnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getNPnet()
		 * @generated
		 */
		EClass NPNET = eINSTANCE.getNPnet();

		/**
		 * The meta object literal for the '<em><b>Net System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET__NET_SYSTEM = eINSTANCE.getNPnet_NetSystem();

		/**
		 * The meta object literal for the '<em><b>Type Element Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET__TYPE_ELEMENT_NET = eINSTANCE.getNPnet_TypeElementNet();

		/**
		 * The meta object literal for the '<em><b>Type Atomic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET__TYPE_ATOMIC = eINSTANCE.getNPnet_TypeAtomic();

		/**
		 * The meta object literal for the '<em><b>Net Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET__NET_CONSTANTS = eINSTANCE.getNPnet_NetConstants();

		/**
		 * The meta object literal for the '<em><b>Synchronizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET__SYNCHRONIZATIONS = eINSTANCE.getNPnet_Synchronizations();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl <em>NPnet Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getNPnetMarked()
		 * @generated
		 */
		EClass NPNET_MARKED = eINSTANCE.getNPnetMarked();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET_MARKED__NET = eINSTANCE.getNPnetMarked_Net();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET_MARKED__MARKING = eINSTANCE.getNPnetMarked_Marking();

		/**
		 * The meta object literal for the '<em><b>Diagram Net System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPNET_MARKED__DIAGRAM_NET_SYSTEM = eINSTANCE.getNPnetMarked_DiagramNetSystem();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.SynchronizationImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZATION__KIND = eINSTANCE.getSynchronization_Kind();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZATION__KEY = eINSTANCE.getSynchronization_Key();

		/**
		 * The meta object literal for the '<em><b>Involved</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__INVOLVED = eINSTANCE.getSynchronization_Involved();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionSynchronizedImpl <em>Transition Synchronized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionSynchronizedImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getTransitionSynchronized()
		 * @generated
		 */
		EClass TRANSITION_SYNCHRONIZED = eINSTANCE.getTransitionSynchronized();

		/**
		 * The meta object literal for the '<em><b>Synchronization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SYNCHRONIZED__SYNCHRONIZATION = eINSTANCE.getTransitionSynchronized_Synchronization();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind <em>ESynchronization Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.ESynchronizationKind
		 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPNetsPackageImpl#getESynchronizationKind()
		 * @generated
		 */
		EEnum ESYNCHRONIZATION_KIND = eINSTANCE.getESynchronizationKind();

	}

} //NPNetsPackage
