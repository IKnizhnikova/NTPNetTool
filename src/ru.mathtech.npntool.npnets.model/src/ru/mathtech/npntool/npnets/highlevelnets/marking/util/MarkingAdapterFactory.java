/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.marking.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;
import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.marking.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingPackage
 * @generated
 */
public class MarkingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarkingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MarkingPackage.eINSTANCE;
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
	protected MarkingSwitch<Adapter> modelSwitch =
		new MarkingSwitch<Adapter>() {
			@Override
			public Adapter caseMarking(Marking object) {
				return createMarkingAdapter();
			}
			@Override
			public Adapter casePlaceMarking(PlaceMarking object) {
				return createPlaceMarkingAdapter();
			}
			@Override
			public Adapter caseHighLevelPetriNetMarked(HighLevelPetriNetMarked object) {
				return createHighLevelPetriNetMarkedAdapter();
			}
			@Override
			public Adapter caseIEntityIdentifiable(IEntityIdentifiable object) {
				return createIEntityIdentifiableAdapter();
			}
			@Override
			public Adapter caseINetElement(INetElement object) {
				return createINetElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.Marking
	 * @generated
	 */
	public Adapter createMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking <em>Place Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.PlaceMarking
	 * @generated
	 */
	public Adapter createPlaceMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked <em>High Level Petri Net Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked
	 * @generated
	 */
	public Adapter createHighLevelPetriNetMarkedAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ru.mathtech.npntool.npnets.highlevelnets.common.INetElement <em>INet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.mathtech.npntool.npnets.highlevelnets.common.INetElement
	 * @generated
	 */
	public Adapter createINetElementAdapter() {
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

} //MarkingAdapterFactory
