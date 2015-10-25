/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.mathtech.npntool.npnets.npndiagrams.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNDiagramsFactoryImpl extends EFactoryImpl implements NPNDiagramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NPNDiagramsFactory init() {
		try {
			NPNDiagramsFactory theNPNDiagramsFactory = (NPNDiagramsFactory)EPackage.Registry.INSTANCE.getEFactory("http:/mathtech.ru/npntool/npndiagrams"); //$NON-NLS-1$ 
			if (theNPNDiagramsFactory != null) {
				return theNPNDiagramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NPNDiagramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED: return createNPNDiagramNPNMarked();
			case NPNDiagramsPackage.NPN_DIAGRAM_NET_SYSTEM: return createNPNDiagramNetSystem();
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN: return createNPNSymbolPlaceSN();
			case NPNDiagramsPackage.NPN_SYMBOL_TRANSITION_SN: return createNPNSymbolTransitionSN();
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN: return createNPNSymbolArcPTSN();
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_TPSN: return createNPNSymbolArcTPSN();
			case NPNDiagramsPackage.NPN_SYMBOL_TOKEN_SN: return createNPNSymbolTokenSN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNPNMarked createNPNDiagramNPNMarked() {
		NPNDiagramNPNMarkedImpl npnDiagramNPNMarked = new NPNDiagramNPNMarkedImpl();
		return npnDiagramNPNMarked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystem createNPNDiagramNetSystem() {
		NPNDiagramNetSystemImpl npnDiagramNetSystem = new NPNDiagramNetSystemImpl();
		return npnDiagramNetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolPlaceSN createNPNSymbolPlaceSN() {
		NPNSymbolPlaceSNImpl npnSymbolPlaceSN = new NPNSymbolPlaceSNImpl();
		return npnSymbolPlaceSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolTransitionSN createNPNSymbolTransitionSN() {
		NPNSymbolTransitionSNImpl npnSymbolTransitionSN = new NPNSymbolTransitionSNImpl();
		return npnSymbolTransitionSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolArcPTSN createNPNSymbolArcPTSN() {
		NPNSymbolArcPTSNImpl npnSymbolArcPTSN = new NPNSymbolArcPTSNImpl();
		return npnSymbolArcPTSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolArcTPSN createNPNSymbolArcTPSN() {
		NPNSymbolArcTPSNImpl npnSymbolArcTPSN = new NPNSymbolArcTPSNImpl();
		return npnSymbolArcTPSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolTokenSN createNPNSymbolTokenSN() {
		NPNSymbolTokenSNImpl npnSymbolTokenSN = new NPNSymbolTokenSNImpl();
		return npnSymbolTokenSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramsPackage getNPNDiagramsPackage() {
		return (NPNDiagramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NPNDiagramsPackage getPackage() {
		return NPNDiagramsPackage.eINSTANCE;
	}

} //NPNDiagramsFactoryImpl
