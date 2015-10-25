/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.INetElementImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc TP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getInscription <em>Inscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcTPImpl extends ArcImpl implements ArcTP {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Transition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Place target;

	/**
	 * The cached value of the '{@link #getInscription() <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscription()
	 * @generated
	 * @ordered
	 */
	protected TokenVariadicExpression inscription;


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
	protected ArcTPImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HLPNPackage.Literals.ARC_TP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Transition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLPNPackage.ARC_TP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Transition newSource, NotificationChain msgs) {
		Transition oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Transition newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, HLPNPackage.TRANSITION__OUT_ARCS, Transition.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, HLPNPackage.TRANSITION__OUT_ARCS, Transition.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Place)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLPNPackage.ARC_TP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Place newTarget, NotificationChain msgs) {
		Place oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Place newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, HLPNPackage.PLACE__IN_ARCS, Place.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, HLPNPackage.PLACE__IN_ARCS, Place.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVariadicExpression getInscription() {
		return inscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInscription(TokenVariadicExpression newInscription, NotificationChain msgs) {
		TokenVariadicExpression oldInscription = inscription;
		inscription = newInscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__INSCRIPTION, oldInscription, newInscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInscription(TokenVariadicExpression newInscription) {
		if (newInscription != inscription) {
			NotificationChain msgs = null;
			if (inscription != null)
				msgs = ((InternalEObject)inscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLPNPackage.ARC_TP__INSCRIPTION, null, msgs);
			if (newInscription != null)
				msgs = ((InternalEObject)newInscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLPNPackage.ARC_TP__INSCRIPTION, null, msgs);
			msgs = basicSetInscription(newInscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__INSCRIPTION, newInscription, newInscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLPNPackage.ARC_TP__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, HLPNPackage.TRANSITION__OUT_ARCS, Transition.class, msgs);
				return basicSetSource((Transition)otherEnd, msgs);
			case HLPNPackage.ARC_TP__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, HLPNPackage.PLACE__IN_ARCS, Place.class, msgs);
				return basicSetTarget((Place)otherEnd, msgs);
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
			case HLPNPackage.ARC_TP__SOURCE:
				return basicSetSource(null, msgs);
			case HLPNPackage.ARC_TP__TARGET:
				return basicSetTarget(null, msgs);
			case HLPNPackage.ARC_TP__INSCRIPTION:
				return basicSetInscription(null, msgs);
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
			case HLPNPackage.ARC_TP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case HLPNPackage.ARC_TP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case HLPNPackage.ARC_TP__INSCRIPTION:
				return getInscription();
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
			case HLPNPackage.ARC_TP__SOURCE:
				setSource((Transition)newValue);
				return;
			case HLPNPackage.ARC_TP__TARGET:
				setTarget((Place)newValue);
				return;
			case HLPNPackage.ARC_TP__INSCRIPTION:
				setInscription((TokenVariadicExpression)newValue);
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
			case HLPNPackage.ARC_TP__SOURCE:
				setSource((Transition)null);
				return;
			case HLPNPackage.ARC_TP__TARGET:
				setTarget((Place)null);
				return;
			case HLPNPackage.ARC_TP__INSCRIPTION:
				setInscription((TokenVariadicExpression)null);
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
			case HLPNPackage.ARC_TP__SOURCE:
				return source != null;
			case HLPNPackage.ARC_TP__TARGET:
				return target != null;
			case HLPNPackage.ARC_TP__INSCRIPTION:
				return inscription != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcTPImpl
