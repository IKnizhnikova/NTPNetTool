/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

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
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory
 * @model kind="package"
 * @generated
 */
public interface HLPNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlpn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mathtech.ru/npntool/hlpn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlpn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HLPNPackage eINSTANCE = ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HighLevelPetriNetImpl <em>High Level Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HighLevelPetriNetImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getHighLevelPetriNet()
	 * @generated
	 */
	int HIGH_LEVEL_PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET__VARIABLES = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET__NODES = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET__ARCS = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>High Level Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>High Level Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_PETRI_NET_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NET = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.PlaceImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UUID = NODE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NET = NODE__NET;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT_ARCS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN_ARCS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcPTImpl <em>Arc PT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcPTImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getArcPT()
	 * @generated
	 */
	int ARC_PT = 3;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl <em>Arc TP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getArcTP()
	 * @generated
	 */
	int ARC_TP = 4;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ContextVariableImpl <em>Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ContextVariableImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getContextVariable()
	 * @generated
	 */
	int CONTEXT_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__VARIABLES = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UUID = CONTEXT_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VARIABLES = CONTEXT_VARIABLE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENT = CONTEXT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NET = CONTEXT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN_ARCS = CONTEXT_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT_ARCS = CONTEXT_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CONTEXT_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcImpl
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UUID = CommonPackage.INET_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = CommonPackage.INET_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__COMMENT = CommonPackage.INET_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NET = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = CommonPackage.INET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = CommonPackage.INET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__UUID = ARC__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__COMMENT = ARC__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__NET = ARC__NET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__SOURCE = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__TARGET = ARC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT__INSCRIPTION = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arc PT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT_FEATURE_COUNT = ARC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arc PT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PT_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__UUID = ARC__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__COMMENT = ARC__COMMENT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__NET = ARC__NET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__SOURCE = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__TARGET = ARC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP__INSCRIPTION = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arc TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP_FEATURE_COUNT = ARC_FEATURE_COUNT + 3;


	/**
	 * The number of operations of the '<em>Arc TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TP_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet <em>High Level Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Level Petri Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet
	 * @generated
	 */
	EClass getHighLevelPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getNodes()
	 * @see #getHighLevelPetriNet()
	 * @generated
	 */
	EReference getHighLevelPetriNet_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getArcs()
	 * @see #getHighLevelPetriNet()
	 * @generated
	 */
	EReference getHighLevelPetriNet_Arcs();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getOutArcs()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_OutArcs();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getInArcs()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InArcs();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getInArcs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_InArcs();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getOutArcs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutArcs();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT <em>Arc PT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc PT</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT
	 * @generated
	 */
	EClass getArcPT();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getSource()
	 * @see #getArcPT()
	 * @generated
	 */
	EReference getArcPT_Source();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getTarget()
	 * @see #getArcPT()
	 * @generated
	 */
	EReference getArcPT_Target();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT#getInscription()
	 * @see #getArcPT()
	 * @generated
	 */
	EReference getArcPT_Inscription();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP <em>Arc TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc TP</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP
	 * @generated
	 */
	EClass getArcTP();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSource()
	 * @see #getArcTP()
	 * @generated
	 */
	EReference getArcTP_Source();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getTarget()
	 * @see #getArcTP()
	 * @generated
	 */
	EReference getArcTP_Target();

	/**
	 * Returns the meta object for the containment reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getInscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inscription</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getInscription()
	 * @see #getArcTP()
	 * @generated
	 */
	EReference getArcTP_Inscription();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Variable</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable
	 * @generated
	 */
	EClass getContextVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.ContextVariable#getVariables()
	 * @see #getContextVariable()
	 * @generated
	 */
	EReference getContextVariable_Variables();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node#getNet()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Net();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Net</em>'.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc#getNet()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Net();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HLPNFactory getHLPNFactory();

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
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HighLevelPetriNetImpl <em>High Level Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HighLevelPetriNetImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getHighLevelPetriNet()
		 * @generated
		 */
		EClass HIGH_LEVEL_PETRI_NET = eINSTANCE.getHighLevelPetriNet();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_PETRI_NET__NODES = eINSTANCE.getHighLevelPetriNet_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_PETRI_NET__ARCS = eINSTANCE.getHighLevelPetriNet_Arcs();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.PlaceImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OUT_ARCS = eINSTANCE.getPlace_OutArcs();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__IN_ARCS = eINSTANCE.getPlace_InArcs();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__IN_ARCS = eINSTANCE.getTransition_InArcs();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUT_ARCS = eINSTANCE.getTransition_OutArcs();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcPTImpl <em>Arc PT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcPTImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getArcPT()
		 * @generated
		 */
		EClass ARC_PT = eINSTANCE.getArcPT();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PT__SOURCE = eINSTANCE.getArcPT_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PT__TARGET = eINSTANCE.getArcPT_Target();

		/**
		 * The meta object literal for the '<em><b>Inscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_PT__INSCRIPTION = eINSTANCE.getArcPT_Inscription();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl <em>Arc TP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getArcTP()
		 * @generated
		 */
		EClass ARC_TP = eINSTANCE.getArcTP();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TP__SOURCE = eINSTANCE.getArcTP_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TP__TARGET = eINSTANCE.getArcTP_Target();

		/**
		 * The meta object literal for the '<em><b>Inscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TP__INSCRIPTION = eINSTANCE.getArcTP_Inscription();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ContextVariableImpl <em>Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ContextVariableImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getContextVariable()
		 * @generated
		 */
		EClass CONTEXT_VARIABLE = eINSTANCE.getContextVariable();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_VARIABLE__VARIABLES = eINSTANCE.getContextVariable_Variables();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NET = eINSTANCE.getNode_Net();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcImpl
		 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.HLPNPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__NET = eINSTANCE.getArc_Net();

	}

} //HLPNPackage
