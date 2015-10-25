/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.impl;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPN Symbol Arc PTSN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcPTSNImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NPNSymbolArcPTSNImpl extends NPNSymbolArcSNImpl implements NPNSymbolArcPTSN {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected NPNSymbolTransitionSN target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected NPNSymbolPlaceSN source;

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
	protected NPNSymbolArcPTSNImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NPNDiagramsPackage.Literals.NPN_SYMBOL_ARC_PTSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolTransitionSN getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (NPNSymbolTransitionSN)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolTransitionSN basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(NPNSymbolTransitionSN newTarget, NotificationChain msgs) {
		NPNSymbolTransitionSN oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(NPNSymbolTransitionSN newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, NPNDiagramsPackage.NPN_SYMBOL_TRANSITION_SN__IN_ARCS, NPNSymbolTransitionSN.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, NPNDiagramsPackage.NPN_SYMBOL_TRANSITION_SN__IN_ARCS, NPNSymbolTransitionSN.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolPlaceSN getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (NPNSymbolPlaceSN)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolPlaceSN basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(NPNSymbolPlaceSN newSource, NotificationChain msgs) {
		NPNSymbolPlaceSN oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(NPNSymbolPlaceSN newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS, NPNSymbolPlaceSN.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS, NPNSymbolPlaceSN.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, NPNDiagramsPackage.NPN_SYMBOL_TRANSITION_SN__IN_ARCS, NPNSymbolTransitionSN.class, msgs);
				return basicSetTarget((NPNSymbolTransitionSN)otherEnd, msgs);
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS, NPNSymbolPlaceSN.class, msgs);
				return basicSetSource((NPNSymbolPlaceSN)otherEnd, msgs);
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET:
				return basicSetTarget(null, msgs);
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE:
				return basicSetSource(null, msgs);
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET:
				setTarget((NPNSymbolTransitionSN)newValue);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE:
				setSource((NPNSymbolPlaceSN)newValue);
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET:
				setTarget((NPNSymbolTransitionSN)null);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE:
				setSource((NPNSymbolPlaceSN)null);
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__TARGET:
				return target != null;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //NPNSymbolArcPTSNImpl
