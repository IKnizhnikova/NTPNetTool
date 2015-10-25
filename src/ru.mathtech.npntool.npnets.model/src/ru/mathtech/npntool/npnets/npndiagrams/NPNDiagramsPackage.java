/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory
 * @model kind="package"
 * @generated
 */
public interface NPNDiagramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "npndiagrams";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/mathtech.ru/npntool/npndiagrams";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "npndiagrams";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NPNDiagramsPackage eINSTANCE = ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNPNMarkedImpl <em>NPN Diagram NPN Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNPNMarkedImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNDiagramNPNMarked()
	 * @generated
	 */
	int NPN_DIAGRAM_NPN_MARKED = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NPN_MARKED__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Diagram Net System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NPN_MARKED__MODEL = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NPN Diagram NPN Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NPN_MARKED_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NPN Diagram NPN Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NPN_MARKED_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNetSystemImpl <em>NPN Diagram Net System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNetSystemImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNDiagramNetSystem()
	 * @generated
	 */
	int NPN_DIAGRAM_NET_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NET_SYSTEM__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NET_SYSTEM__MODEL = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NET_SYSTEM__NODES = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NET_SYSTEM__ARCS = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NPN Diagram Net System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NET_SYSTEM_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NPN Diagram Net System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_DIAGRAM_NET_SYSTEM_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolNodeSNImpl <em>NPN Symbol Node SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolNodeSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolNodeSN()
	 * @generated
	 */
	int NPN_SYMBOL_NODE_SN = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_NODE_SN__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_NODE_SN__DIAGRAM = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_NODE_SN__CONSTRAINTS = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_NODE_SN__MODEL = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NPN Symbol Node SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_NODE_SN_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NPN Symbol Node SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_NODE_SN_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl <em>NPN Symbol Place SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolPlaceSN()
	 * @generated
	 */
	int NPN_SYMBOL_PLACE_SN = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__UUID = NPN_SYMBOL_NODE_SN__UUID;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__DIAGRAM = NPN_SYMBOL_NODE_SN__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__CONSTRAINTS = NPN_SYMBOL_NODE_SN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__MODEL = NPN_SYMBOL_NODE_SN__MODEL;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__OUT_ARCS = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__IN_ARCS = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN__TOKENS = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NPN Symbol Place SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN_FEATURE_COUNT = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NPN Symbol Place SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_PLACE_SN_OPERATION_COUNT = NPN_SYMBOL_NODE_SN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTransitionSNImpl <em>NPN Symbol Transition SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTransitionSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolTransitionSN()
	 * @generated
	 */
	int NPN_SYMBOL_TRANSITION_SN = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN__UUID = NPN_SYMBOL_NODE_SN__UUID;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN__DIAGRAM = NPN_SYMBOL_NODE_SN__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN__CONSTRAINTS = NPN_SYMBOL_NODE_SN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN__MODEL = NPN_SYMBOL_NODE_SN__MODEL;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN__OUT_ARCS = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN__IN_ARCS = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NPN Symbol Transition SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN_FEATURE_COUNT = NPN_SYMBOL_NODE_SN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NPN Symbol Transition SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TRANSITION_SN_OPERATION_COUNT = NPN_SYMBOL_NODE_SN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl <em>NPN Symbol Arc SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolArcSN()
	 * @generated
	 */
	int NPN_SYMBOL_ARC_SN = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_SN__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_SN__DIAGRAM = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_SN__MODEL = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_SN__BENDPOINTS = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NPN Symbol Arc SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_SN_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NPN Symbol Arc SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_SN_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl <em>NPN Symbol Arc PTSN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolArcPTSN()
	 * @generated
	 */
	int NPN_SYMBOL_ARC_PTSN = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN__UUID = NPN_SYMBOL_ARC_SN__UUID;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN__DIAGRAM = NPN_SYMBOL_ARC_SN__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN__MODEL = NPN_SYMBOL_ARC_SN__MODEL;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN__BENDPOINTS = NPN_SYMBOL_ARC_SN__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN__TARGET = NPN_SYMBOL_ARC_SN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN__SOURCE = NPN_SYMBOL_ARC_SN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NPN Symbol Arc PTSN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN_FEATURE_COUNT = NPN_SYMBOL_ARC_SN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NPN Symbol Arc PTSN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_PTSN_OPERATION_COUNT = NPN_SYMBOL_ARC_SN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcTPSNImpl <em>NPN Symbol Arc TPSN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcTPSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolArcTPSN()
	 * @generated
	 */
	int NPN_SYMBOL_ARC_TPSN = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN__UUID = NPN_SYMBOL_ARC_SN__UUID;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN__DIAGRAM = NPN_SYMBOL_ARC_SN__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN__MODEL = NPN_SYMBOL_ARC_SN__MODEL;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN__BENDPOINTS = NPN_SYMBOL_ARC_SN__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN__TARGET = NPN_SYMBOL_ARC_SN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN__SOURCE = NPN_SYMBOL_ARC_SN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NPN Symbol Arc TPSN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN_FEATURE_COUNT = NPN_SYMBOL_ARC_SN_FEATURE_COUNT + 2;


	/**
	 * The number of operations of the '<em>NPN Symbol Arc TPSN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_ARC_TPSN_OPERATION_COUNT = NPN_SYMBOL_ARC_SN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTokenSNImpl <em>NPN Symbol Token SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTokenSNImpl
	 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolTokenSN()
	 * @generated
	 */
	int NPN_SYMBOL_TOKEN_SN = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TOKEN_SN__UUID = CommonPackage.IENTITY_IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Place</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TOKEN_SN__PLACE = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TOKEN_SN__CONSTRAINTS = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NPN Symbol Token SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TOKEN_SN_FEATURE_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NPN Symbol Token SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPN_SYMBOL_TOKEN_SN_OPERATION_COUNT = CommonPackage.IENTITY_IDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked <em>NPN Diagram NPN Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Diagram NPN Marked</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked
	 * @generated
	 */
	EClass getNPNDiagramNPNMarked();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getDiagramNetSystem <em>Diagram Net System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Net System</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getDiagramNetSystem()
	 * @see #getNPNDiagramNPNMarked()
	 * @generated
	 */
	EReference getNPNDiagramNPNMarked_DiagramNetSystem();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked#getModel()
	 * @see #getNPNDiagramNPNMarked()
	 * @generated
	 */
	EReference getNPNDiagramNPNMarked_Model();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem <em>NPN Diagram Net System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Diagram Net System</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem
	 * @generated
	 */
	EClass getNPNDiagramNetSystem();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getModel()
	 * @see #getNPNDiagramNetSystem()
	 * @generated
	 */
	EReference getNPNDiagramNetSystem_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getNodes()
	 * @see #getNPNDiagramNetSystem()
	 * @generated
	 */
	EReference getNPNDiagramNetSystem_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem#getArcs()
	 * @see #getNPNDiagramNetSystem()
	 * @generated
	 */
	EReference getNPNDiagramNetSystem_Arcs();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN <em>NPN Symbol Place SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Place SN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN
	 * @generated
	 */
	EClass getNPNSymbolPlaceSN();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getOutArcs()
	 * @see #getNPNSymbolPlaceSN()
	 * @generated
	 */
	EReference getNPNSymbolPlaceSN_OutArcs();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getInArcs()
	 * @see #getNPNSymbolPlaceSN()
	 * @generated
	 */
	EReference getNPNSymbolPlaceSN_InArcs();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN#getTokens()
	 * @see #getNPNSymbolPlaceSN()
	 * @generated
	 */
	EReference getNPNSymbolPlaceSN_Tokens();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN <em>NPN Symbol Transition SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Transition SN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN
	 * @generated
	 */
	EClass getNPNSymbolTransitionSN();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getOutArcs()
	 * @see #getNPNSymbolTransitionSN()
	 * @generated
	 */
	EReference getNPNSymbolTransitionSN_OutArcs();

	/**
	 * Returns the meta object for the reference list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN#getInArcs()
	 * @see #getNPNSymbolTransitionSN()
	 * @generated
	 */
	EReference getNPNSymbolTransitionSN_InArcs();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN <em>NPN Symbol Arc PTSN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Arc PTSN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN
	 * @generated
	 */
	EClass getNPNSymbolArcPTSN();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getTarget()
	 * @see #getNPNSymbolArcPTSN()
	 * @generated
	 */
	EReference getNPNSymbolArcPTSN_Target();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN#getSource()
	 * @see #getNPNSymbolArcPTSN()
	 * @generated
	 */
	EReference getNPNSymbolArcPTSN_Source();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN <em>NPN Symbol Arc TPSN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Arc TPSN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN
	 * @generated
	 */
	EClass getNPNSymbolArcTPSN();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN#getTarget()
	 * @see #getNPNSymbolArcTPSN()
	 * @generated
	 */
	EReference getNPNSymbolArcTPSN_Target();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN#getSource()
	 * @see #getNPNSymbolArcTPSN()
	 * @generated
	 */
	EReference getNPNSymbolArcTPSN_Source();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN <em>NPN Symbol Node SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Node SN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN
	 * @generated
	 */
	EClass getNPNSymbolNodeSN();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getDiagram()
	 * @see #getNPNSymbolNodeSN()
	 * @generated
	 */
	EReference getNPNSymbolNodeSN_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getConstraints()
	 * @see #getNPNSymbolNodeSN()
	 * @generated
	 */
	EAttribute getNPNSymbolNodeSN_Constraints();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN#getModel()
	 * @see #getNPNSymbolNodeSN()
	 * @generated
	 */
	EReference getNPNSymbolNodeSN_Model();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN <em>NPN Symbol Arc SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Arc SN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN
	 * @generated
	 */
	EClass getNPNSymbolArcSN();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getDiagram()
	 * @see #getNPNSymbolArcSN()
	 * @generated
	 */
	EReference getNPNSymbolArcSN_Diagram();

	/**
	 * Returns the meta object for the reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getModel()
	 * @see #getNPNSymbolArcSN()
	 * @generated
	 */
	EReference getNPNSymbolArcSN_Model();

	/**
	 * Returns the meta object for the attribute list '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN#getBendpoints()
	 * @see #getNPNSymbolArcSN()
	 * @generated
	 */
	EAttribute getNPNSymbolArcSN_Bendpoints();

	/**
	 * Returns the meta object for class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN <em>NPN Symbol Token SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPN Symbol Token SN</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN
	 * @generated
	 */
	EClass getNPNSymbolTokenSN();

	/**
	 * Returns the meta object for the container reference '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Place</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN#getPlace()
	 * @see #getNPNSymbolTokenSN()
	 * @generated
	 */
	EReference getNPNSymbolTokenSN_Place();

	/**
	 * Returns the meta object for the attribute '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN#getConstraints()
	 * @see #getNPNSymbolTokenSN()
	 * @generated
	 */
	EAttribute getNPNSymbolTokenSN_Constraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NPNDiagramsFactory getNPNDiagramsFactory();

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
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNPNMarkedImpl <em>NPN Diagram NPN Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNPNMarkedImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNDiagramNPNMarked()
		 * @generated
		 */
		EClass NPN_DIAGRAM_NPN_MARKED = eINSTANCE.getNPNDiagramNPNMarked();

		/**
		 * The meta object literal for the '<em><b>Diagram Net System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM = eINSTANCE.getNPNDiagramNPNMarked_DiagramNetSystem();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_DIAGRAM_NPN_MARKED__MODEL = eINSTANCE.getNPNDiagramNPNMarked_Model();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNetSystemImpl <em>NPN Diagram Net System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNetSystemImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNDiagramNetSystem()
		 * @generated
		 */
		EClass NPN_DIAGRAM_NET_SYSTEM = eINSTANCE.getNPNDiagramNetSystem();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_DIAGRAM_NET_SYSTEM__MODEL = eINSTANCE.getNPNDiagramNetSystem_Model();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_DIAGRAM_NET_SYSTEM__NODES = eINSTANCE.getNPNDiagramNetSystem_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_DIAGRAM_NET_SYSTEM__ARCS = eINSTANCE.getNPNDiagramNetSystem_Arcs();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl <em>NPN Symbol Place SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolPlaceSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_PLACE_SN = eINSTANCE.getNPNSymbolPlaceSN();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_PLACE_SN__OUT_ARCS = eINSTANCE.getNPNSymbolPlaceSN_OutArcs();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_PLACE_SN__IN_ARCS = eINSTANCE.getNPNSymbolPlaceSN_InArcs();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_PLACE_SN__TOKENS = eINSTANCE.getNPNSymbolPlaceSN_Tokens();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTransitionSNImpl <em>NPN Symbol Transition SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTransitionSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolTransitionSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_TRANSITION_SN = eINSTANCE.getNPNSymbolTransitionSN();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_TRANSITION_SN__OUT_ARCS = eINSTANCE.getNPNSymbolTransitionSN_OutArcs();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_TRANSITION_SN__IN_ARCS = eINSTANCE.getNPNSymbolTransitionSN_InArcs();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl <em>NPN Symbol Arc PTSN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolArcPTSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_ARC_PTSN = eINSTANCE.getNPNSymbolArcPTSN();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_ARC_PTSN__TARGET = eINSTANCE.getNPNSymbolArcPTSN_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_ARC_PTSN__SOURCE = eINSTANCE.getNPNSymbolArcPTSN_Source();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcTPSNImpl <em>NPN Symbol Arc TPSN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcTPSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolArcTPSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_ARC_TPSN = eINSTANCE.getNPNSymbolArcTPSN();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_ARC_TPSN__TARGET = eINSTANCE.getNPNSymbolArcTPSN_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_ARC_TPSN__SOURCE = eINSTANCE.getNPNSymbolArcTPSN_Source();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolNodeSNImpl <em>NPN Symbol Node SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolNodeSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolNodeSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_NODE_SN = eINSTANCE.getNPNSymbolNodeSN();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_NODE_SN__DIAGRAM = eINSTANCE.getNPNSymbolNodeSN_Diagram();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPN_SYMBOL_NODE_SN__CONSTRAINTS = eINSTANCE.getNPNSymbolNodeSN_Constraints();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_NODE_SN__MODEL = eINSTANCE.getNPNSymbolNodeSN_Model();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl <em>NPN Symbol Arc SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolArcSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_ARC_SN = eINSTANCE.getNPNSymbolArcSN();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_ARC_SN__DIAGRAM = eINSTANCE.getNPNSymbolArcSN_Diagram();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_ARC_SN__MODEL = eINSTANCE.getNPNSymbolArcSN_Model();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPN_SYMBOL_ARC_SN__BENDPOINTS = eINSTANCE.getNPNSymbolArcSN_Bendpoints();

		/**
		 * The meta object literal for the '{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTokenSNImpl <em>NPN Symbol Token SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolTokenSNImpl
		 * @see ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsPackageImpl#getNPNSymbolTokenSN()
		 * @generated
		 */
		EClass NPN_SYMBOL_TOKEN_SN = eINSTANCE.getNPNSymbolTokenSN();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPN_SYMBOL_TOKEN_SN__PLACE = eINSTANCE.getNPNSymbolTokenSN_Place();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPN_SYMBOL_TOKEN_SN__CONSTRAINTS = eINSTANCE.getNPNSymbolTokenSN_Constraints();

	}

} //NPNDiagramsPackage
