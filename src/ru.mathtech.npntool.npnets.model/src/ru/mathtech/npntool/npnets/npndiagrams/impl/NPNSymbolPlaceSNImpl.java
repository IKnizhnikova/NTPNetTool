/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.impl;

import java.util.Collection;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPN Symbol Place SN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.npndiagrams.impl.NPNSymbolPlaceSNImpl#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NPNSymbolPlaceSNImpl extends NPNSymbolNodeSNImpl implements NPNSymbolPlaceSN {
	/**
	 * The cached value of the '{@link #getOutArcs() <em>Out Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<NPNSymbolArcPTSN> outArcs;

	/**
	 * The cached value of the '{@link #getInArcs() <em>In Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<NPNSymbolArcTPSN> inArcs;


/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<NPNSymbolTokenSN> tokens;

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
	protected NPNSymbolPlaceSNImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NPNDiagramsPackage.Literals.NPN_SYMBOL_PLACE_SN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NPNSymbolArcPTSN> getOutArcs() {
		if (outArcs == null) {
			outArcs = new EObjectWithInverseResolvingEList<NPNSymbolArcPTSN>(NPNSymbolArcPTSN.class, this, NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS, NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN__SOURCE);
		}
		return outArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NPNSymbolArcTPSN> getInArcs() {
		if (inArcs == null) {
			inArcs = new EObjectWithInverseResolvingEList<NPNSymbolArcTPSN>(NPNSymbolArcTPSN.class, this, NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS, NPNDiagramsPackage.NPN_SYMBOL_ARC_TPSN__TARGET);
		}
		return inArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NPNSymbolTokenSN> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentWithInverseEList<NPNSymbolTokenSN>(NPNSymbolTokenSN.class, this, NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS, NPNDiagramsPackage.NPN_SYMBOL_TOKEN_SN__PLACE);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutArcs()).basicAdd(otherEnd, msgs);
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInArcs()).basicAdd(otherEnd, msgs);
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTokens()).basicAdd(otherEnd, msgs);
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
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS:
				return ((InternalEList<?>)getOutArcs()).basicRemove(otherEnd, msgs);
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS:
				return ((InternalEList<?>)getInArcs()).basicRemove(otherEnd, msgs);
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
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
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS:
				return getOutArcs();
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS:
				return getInArcs();
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS:
				return getTokens();
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
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS:
				getOutArcs().clear();
				getOutArcs().addAll((Collection<? extends NPNSymbolArcPTSN>)newValue);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS:
				getInArcs().clear();
				getInArcs().addAll((Collection<? extends NPNSymbolArcTPSN>)newValue);
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends NPNSymbolTokenSN>)newValue);
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
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS:
				getOutArcs().clear();
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS:
				getInArcs().clear();
				return;
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS:
				getTokens().clear();
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
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__OUT_ARCS:
				return outArcs != null && !outArcs.isEmpty();
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__IN_ARCS:
				return inArcs != null && !inArcs.isEmpty();
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN__TOKENS:
				return tokens != null && !tokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NPNSymbolPlaceSNImpl
