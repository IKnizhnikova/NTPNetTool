/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HLPNFactoryImpl extends EFactoryImpl implements HLPNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HLPNFactory init() {
		try {
			HLPNFactory theHLPNFactory = (HLPNFactory)EPackage.Registry.INSTANCE.getEFactory("mathtech.ru/npntool/hlpn"); //$NON-NLS-1$ 
			if (theHLPNFactory != null) {
				return theHLPNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HLPNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNFactoryImpl() {
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
			case HLPNPackage.HIGH_LEVEL_PETRI_NET: return createHighLevelPetriNet();
			case HLPNPackage.PLACE: return createPlace();
			case HLPNPackage.TRANSITION: return createTransition();
			case HLPNPackage.ARC_PT: return createArcPT();
			case HLPNPackage.ARC_TP: return createArcTP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNet createHighLevelPetriNet() {
		HighLevelPetriNetImpl highLevelPetriNet = new HighLevelPetriNetImpl();
		return highLevelPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcPT createArcPT() {
		ArcPTImpl arcPT = new ArcPTImpl();
		return arcPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcTP createArcTP() {
		ArcTPImpl arcTP = new ArcTPImpl();
		return arcTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNPackage getHLPNPackage() {
		return (HLPNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HLPNPackage getPackage() {
		return HLPNPackage.eINSTANCE;
	}

} //HLPNFactoryImpl
