/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Type Element Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl#getElementNetMarkeds <em>Element Net Markeds</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl#getNet <em>Net</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeElementNetImpl#getTokenNets <em>Token Nets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenTypeElementNetImpl extends TokenTypeImpl implements TokenTypeElementNet {
	/**
	 * The cached value of the '{@link #getElementNetMarkeds() <em>Element Net Markeds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNetMarkeds()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementNetMarked> elementNetMarkeds;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected HighLevelPetriNet net;

	/**
	 * The cached value of the '{@link #getTokenNets() <em>Token Nets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNets()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenNet> tokenNets;


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
	protected TokenTypeElementNetImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementNetMarked> getElementNetMarkeds() {
		if (elementNetMarkeds == null) {
			elementNetMarkeds = new EObjectContainmentWithInverseEList<ElementNetMarked>(ElementNetMarked.class, this, TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS, TokenTypesPackage.ELEMENT_NET_MARKED__TYPE);
		}
		return elementNetMarkeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNet getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(HighLevelPetriNet newNet, NotificationChain msgs) {
		HighLevelPetriNet oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(HighLevelPetriNet newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenNet> getTokenNets() {
		if (tokenNets == null) {
			tokenNets = new EObjectContainmentWithInverseEList<TokenNet>(TokenNet.class, this, TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS, TokenTypesPackage.TOKEN_NET__TYPE);
		}
		return tokenNets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getInstanceByID(int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createInstance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementNetMarkeds()).basicAdd(otherEnd, msgs);
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTokenNets()).basicAdd(otherEnd, msgs);
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
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
				return ((InternalEList<?>)getElementNetMarkeds()).basicRemove(otherEnd, msgs);
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET:
				return basicSetNet(null, msgs);
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
				return ((InternalEList<?>)getTokenNets()).basicRemove(otherEnd, msgs);
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
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
				return getElementNetMarkeds();
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET:
				return getNet();
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
				return getTokenNets();
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
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
				getElementNetMarkeds().clear();
				getElementNetMarkeds().addAll((Collection<? extends ElementNetMarked>)newValue);
				return;
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET:
				setNet((HighLevelPetriNet)newValue);
				return;
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
				getTokenNets().clear();
				getTokenNets().addAll((Collection<? extends TokenNet>)newValue);
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
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
				getElementNetMarkeds().clear();
				return;
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET:
				setNet((HighLevelPetriNet)null);
				return;
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
				getTokenNets().clear();
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
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
				return elementNetMarkeds != null && !elementNetMarkeds.isEmpty();
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET:
				return net != null;
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
				return tokenNets != null && !tokenNets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET___GET_INSTANCE_BY_ID__INT:
				getInstanceByID((Integer)arguments.get(0));
				return null;
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET___CREATE_INSTANCE:
				createInstance();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TokenTypeElementNetImpl
