/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Synchronized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.TransitionSynchronizedImpl#getSynchronization <em>Synchronization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionSynchronizedImpl extends TransitionImpl implements TransitionSynchronized {
	/**
	 * The cached value of the '{@link #getSynchronization() <em>Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Synchronization synchronization;


/* eperzhand */


	/**
	 * ID's prefix  
	 * @generated
	 */
    protected static final String prefixUUID = "";


	/**
	 * ID's counter
	 * @generated
	 */
    protected static long counterUUID = 0;

	/**
    * Generate a unique UUID based on the current time
    * @generated
    */

	protected synchronized String generateUUIDByTime() {
	  short cur = (short)System.currentTimeMillis();
	  if (cur<0) cur = (short)-cur;
	  return prefixUUID + cur + counterUUID++;
	}

	protected synchronized String generateUUID() {
	  String res = "npn" + UUID.randomUUID().toString();
	  return res;
	}

	protected synchronized String generateID() {
	  String res = "npn" + UUID.randomUUID().toString();
	  return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionSynchronizedImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NPNetsPackage.Literals.TRANSITION_SYNCHRONIZED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization getSynchronization() {
		if (synchronization != null && synchronization.eIsProxy()) {
			InternalEObject oldSynchronization = (InternalEObject)synchronization;
			synchronization = (Synchronization)eResolveProxy(oldSynchronization);
			if (synchronization != oldSynchronization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION, oldSynchronization, synchronization));
			}
		}
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization basicGetSynchronization() {
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronization(Synchronization newSynchronization, NotificationChain msgs) {
		Synchronization oldSynchronization = synchronization;
		synchronization = newSynchronization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION, oldSynchronization, newSynchronization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronization(Synchronization newSynchronization) {
		if (newSynchronization != synchronization) {
			NotificationChain msgs = null;
			if (synchronization != null)
				msgs = ((InternalEObject)synchronization).eInverseRemove(this, NPNetsPackage.SYNCHRONIZATION__INVOLVED, Synchronization.class, msgs);
			if (newSynchronization != null)
				msgs = ((InternalEObject)newSynchronization).eInverseAdd(this, NPNetsPackage.SYNCHRONIZATION__INVOLVED, Synchronization.class, msgs);
			msgs = basicSetSynchronization(newSynchronization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION, newSynchronization, newSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION:
				if (synchronization != null)
					msgs = ((InternalEObject)synchronization).eInverseRemove(this, NPNetsPackage.SYNCHRONIZATION__INVOLVED, Synchronization.class, msgs);
				return basicSetSynchronization((Synchronization)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION:
				return basicSetSynchronization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION:
				if (resolve) return getSynchronization();
				return basicGetSynchronization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION:
				setSynchronization((Synchronization)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION:
				setSynchronization((Synchronization)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NPNetsPackage.TRANSITION_SYNCHRONIZED__SYNCHRONIZATION:
				return synchronization != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionSynchronizedImpl
