/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.impl;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.IEntityIdentifiableImpl;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPN Diagram NPN Marked</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNPNMarkedImpl#getDiagramNetSystem <em>Diagram Net System</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramNPNMarkedImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NPNDiagramNPNMarkedImpl extends IEntityIdentifiableImpl implements NPNDiagramNPNMarked {
	/**
	 * The cached value of the '{@link #getDiagramNetSystem() <em>Diagram Net System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramNetSystem()
	 * @generated
	 * @ordered
	 */
	protected NPNDiagramNetSystem diagramNetSystem;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected NPnetMarked model;


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
	protected NPNDiagramNPNMarkedImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NPNDiagramsPackage.Literals.NPN_DIAGRAM_NPN_MARKED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystem getDiagramNetSystem() {
		if (diagramNetSystem != null && diagramNetSystem.eIsProxy()) {
			InternalEObject oldDiagramNetSystem = (InternalEObject)diagramNetSystem;
			diagramNetSystem = (NPNDiagramNetSystem)eResolveProxy(oldDiagramNetSystem);
			if (diagramNetSystem != oldDiagramNetSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM, oldDiagramNetSystem, diagramNetSystem));
			}
		}
		return diagramNetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystem basicGetDiagramNetSystem() {
		return diagramNetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramNetSystem(NPNDiagramNetSystem newDiagramNetSystem) {
		NPNDiagramNetSystem oldDiagramNetSystem = diagramNetSystem;
		diagramNetSystem = newDiagramNetSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM, oldDiagramNetSystem, diagramNetSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPnetMarked getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (NPnetMarked)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPnetMarked basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(NPnetMarked newModel) {
		NPnetMarked oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM:
				if (resolve) return getDiagramNetSystem();
				return basicGetDiagramNetSystem();
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM:
				setDiagramNetSystem((NPNDiagramNetSystem)newValue);
				return;
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__MODEL:
				setModel((NPnetMarked)newValue);
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
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM:
				setDiagramNetSystem((NPNDiagramNetSystem)null);
				return;
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__MODEL:
				setModel((NPnetMarked)null);
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
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__DIAGRAM_NET_SYSTEM:
				return diagramNetSystem != null;
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //NPNDiagramNPNMarkedImpl
