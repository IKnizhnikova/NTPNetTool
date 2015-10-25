/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.impl;

import java.util.Collection;
import java.util.UUID;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.IEntityIdentifiableImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Arc;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPN Symbol Arc SN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolArcSNImpl#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NPNSymbolArcSNImpl extends IEntityIdentifiableImpl implements NPNSymbolArcSN {

/* eperzhand */


	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Arc model;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

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
	protected NPNSymbolArcSNImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NPNDiagramsPackage.Literals.NPN_SYMBOL_ARC_SN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystem getDiagram() {
		if (eContainerFeatureID() != NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM) return null;
		return (NPNDiagramNetSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(NPNDiagramNetSystem newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(NPNDiagramNetSystem newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, NPNDiagramsPackage.NPN_DIAGRAM_NET_SYSTEM__ARCS, NPNDiagramNetSystem.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Arc)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Arc newModel) {
		Arc oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((NPNDiagramNetSystem)otherEnd, msgs);
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				return basicSetDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, NPNDiagramsPackage.NPN_DIAGRAM_NET_SYSTEM__ARCS, NPNDiagramNetSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				return getDiagram();
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__BENDPOINTS:
				return getBendpoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				setDiagram((NPNDiagramNetSystem)newValue);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__MODEL:
				setModel((Arc)newValue);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				setDiagram((NPNDiagramNetSystem)null);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__MODEL:
				setModel((Arc)null);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__BENDPOINTS:
				getBendpoints().clear();
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
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__DIAGRAM:
				return getDiagram() != null;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__MODEL:
				return model != null;
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bendpoints: "); //$NON-NLS-1$
		result.append(bendpoints);
		result.append(')');
		return result.toString();
	}

} //NPNSymbolArcSNImpl
