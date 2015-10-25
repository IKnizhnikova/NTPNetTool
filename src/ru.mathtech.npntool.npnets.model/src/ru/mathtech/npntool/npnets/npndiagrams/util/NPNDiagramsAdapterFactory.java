/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.npndiagrams.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage
 * @generated
 */
public class NPNDiagramsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NPNDiagramsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NPNDiagramsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NPNDiagramsSwitch<Adapter> modelSwitch =
		new NPNDiagramsSwitch<Adapter>() {
			@Override
			public Adapter caseNPNDiagramNPNMarked(NPNDiagramNPNMarked object) {
				return createNPNDiagramNPNMarkedAdapter();
			}
			@Override
			public Adapter caseNPNDiagramNetSystem(NPNDiagramNetSystem object) {
				return createNPNDiagramNetSystemAdapter();
			}
			@Override
			public Adapter caseNPNSymbolPlaceSN(NPNSymbolPlaceSN object) {
				return createNPNSymbolPlaceSNAdapter();
			}
			@Override
			public Adapter caseNPNSymbolTransitionSN(NPNSymbolTransitionSN object) {
				return createNPNSymbolTransitionSNAdapter();
			}
			@Override
			public Adapter caseNPNSymbolArcPTSN(NPNSymbolArcPTSN object) {
				return createNPNSymbolArcPTSNAdapter();
			}
			@Override
			public Adapter caseNPNSymbolArcTPSN(NPNSymbolArcTPSN object) {
				return createNPNSymbolArcTPSNAdapter();
			}
			@Override
			public Adapter caseNPNSymbolNodeSN(NPNSymbolNodeSN object) {
				return createNPNSymbolNodeSNAdapter();
			}
			@Override
			public Adapter caseNPNSymbolArcSN(NPNSymbolArcSN object) {
				return createNPNSymbolArcSNAdapter();
			}
			@Override
			public Adapter caseNPNSymbolTokenSN(NPNSymbolTokenSN object) {
				return createNPNSymbolTokenSNAdapter();
			}
			@Override
			public Adapter caseIEntityIdentifiable(IEntityIdentifiable object) {
				return createIEntityIdentifiableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked <em>NPN Diagram NPN Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked
	 * @generated
	 */
	public Adapter createNPNDiagramNPNMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem <em>NPN Diagram Net System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem
	 * @generated
	 */
	public Adapter createNPNDiagramNetSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN <em>NPN Symbol Place SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN
	 * @generated
	 */
	public Adapter createNPNSymbolPlaceSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN <em>NPN Symbol Transition SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN
	 * @generated
	 */
	public Adapter createNPNSymbolTransitionSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN <em>NPN Symbol Arc PTSN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN
	 * @generated
	 */
	public Adapter createNPNSymbolArcPTSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN <em>NPN Symbol Arc TPSN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN
	 * @generated
	 */
	public Adapter createNPNSymbolArcTPSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN <em>NPN Symbol Node SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN
	 * @generated
	 */
	public Adapter createNPNSymbolNodeSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN <em>NPN Symbol Arc SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN
	 * @generated
	 */
	public Adapter createNPNSymbolArcSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN <em>NPN Symbol Token SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN
	 * @generated
	 */
	public Adapter createNPNSymbolTokenSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable <em>IEntity Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable
	 * @generated
	 */
	public Adapter createIEntityIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NPNDiagramsAdapterFactory
