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

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.INetElementImpl;

import ru.mathtech.npntool.npnets.highlevelnets.marking.Marking;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPnet Marked</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl#getNet <em>Net</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl#getMarking <em>Marking</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl.NPnetMarkedImpl#getDiagramNetSystem <em>Diagram Net System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NPnetMarkedImpl extends INetElementImpl implements NPnetMarked {
	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected NPnet net;

	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking marking;

	/**
	 * The cached value of the '{@link #getDiagramNetSystem() <em>Diagram Net System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramNetSystem()
	 * @generated
	 * @ordered
	 */
	protected NPNDiagramNetSystem diagramNetSystem;


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
	protected NPnetMarkedImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NPNetsPackage.Literals.NPNET_MARKED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPnet getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(NPnet newNet, NotificationChain msgs) {
		NPnet oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NPNetsPackage.NPNET_MARKED__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(NPnet newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NPNetsPackage.NPNET_MARKED__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NPNetsPackage.NPNET_MARKED__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNetsPackage.NPNET_MARKED__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarking(Marking newMarking, NotificationChain msgs) {
		Marking oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NPNetsPackage.NPNET_MARKED__MARKING, oldMarking, newMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarking(Marking newMarking) {
		if (newMarking != marking) {
			NotificationChain msgs = null;
			if (marking != null)
				msgs = ((InternalEObject)marking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NPNetsPackage.NPNET_MARKED__MARKING, null, msgs);
			if (newMarking != null)
				msgs = ((InternalEObject)newMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NPNetsPackage.NPNET_MARKED__MARKING, null, msgs);
			msgs = basicSetMarking(newMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNetsPackage.NPNET_MARKED__MARKING, newMarking, newMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystem getDiagramNetSystem() {
		return diagramNetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramNetSystem(NPNDiagramNetSystem newDiagramNetSystem, NotificationChain msgs) {
		NPNDiagramNetSystem oldDiagramNetSystem = diagramNetSystem;
		diagramNetSystem = newDiagramNetSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM, oldDiagramNetSystem, newDiagramNetSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramNetSystem(NPNDiagramNetSystem newDiagramNetSystem) {
		if (newDiagramNetSystem != diagramNetSystem) {
			NotificationChain msgs = null;
			if (diagramNetSystem != null)
				msgs = ((InternalEObject)diagramNetSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM, null, msgs);
			if (newDiagramNetSystem != null)
				msgs = ((InternalEObject)newDiagramNetSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM, null, msgs);
			msgs = basicSetDiagramNetSystem(newDiagramNetSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM, newDiagramNetSystem, newDiagramNetSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NPNetsPackage.NPNET_MARKED__NET:
				return basicSetNet(null, msgs);
			case NPNetsPackage.NPNET_MARKED__MARKING:
				return basicSetMarking(null, msgs);
			case NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM:
				return basicSetDiagramNetSystem(null, msgs);
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
			case NPNetsPackage.NPNET_MARKED__NET:
				return getNet();
			case NPNetsPackage.NPNET_MARKED__MARKING:
				return getMarking();
			case NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM:
				return getDiagramNetSystem();
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
			case NPNetsPackage.NPNET_MARKED__NET:
				setNet((NPnet)newValue);
				return;
			case NPNetsPackage.NPNET_MARKED__MARKING:
				setMarking((Marking)newValue);
				return;
			case NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM:
				setDiagramNetSystem((NPNDiagramNetSystem)newValue);
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
			case NPNetsPackage.NPNET_MARKED__NET:
				setNet((NPnet)null);
				return;
			case NPNetsPackage.NPNET_MARKED__MARKING:
				setMarking((Marking)null);
				return;
			case NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM:
				setDiagramNetSystem((NPNDiagramNetSystem)null);
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
			case NPNetsPackage.NPNET_MARKED__NET:
				return net != null;
			case NPNetsPackage.NPNET_MARKED__MARKING:
				return marking != null;
			case NPNetsPackage.NPNET_MARKED__DIAGRAM_NET_SYSTEM:
				return diagramNetSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //NPnetMarkedImpl
