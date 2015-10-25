/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Type Atomic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeAtomicImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenTypeAtomicImpl#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenTypeAtomicImpl extends TokenTypeImpl implements TokenTypeAtomic {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Atom instance;

	/**
	 * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtom()
	 * @generated
	 * @ordered
	 */
	protected TokenAtomic atom;


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
	protected TokenTypeAtomicImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenTypesPackage.Literals.TOKEN_TYPE_ATOMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(Atom newInstance, NotificationChain msgs) {
		Atom oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Atom newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAtomic getAtom() {
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtom(TokenAtomic newAtom, NotificationChain msgs) {
		TokenAtomic oldAtom = atom;
		atom = newAtom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM, oldAtom, newAtom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtom(TokenAtomic newAtom) {
		if (newAtom != atom) {
			NotificationChain msgs = null;
			if (atom != null)
				msgs = ((InternalEObject)atom).eInverseRemove(this, TokenTypesPackage.TOKEN_ATOMIC__TYPE, TokenAtomic.class, msgs);
			if (newAtom != null)
				msgs = ((InternalEObject)newAtom).eInverseAdd(this, TokenTypesPackage.TOKEN_ATOMIC__TYPE, TokenAtomic.class, msgs);
			msgs = basicSetAtom(newAtom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM, newAtom, newAtom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM:
				if (atom != null)
					msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM, null, msgs);
				return basicSetAtom((TokenAtomic)otherEnd, msgs);
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
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE:
				return basicSetInstance(null, msgs);
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM:
				return basicSetAtom(null, msgs);
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
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE:
				return getInstance();
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM:
				return getAtom();
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
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE:
				setInstance((Atom)newValue);
				return;
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM:
				setAtom((TokenAtomic)newValue);
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
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE:
				setInstance((Atom)null);
				return;
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM:
				setAtom((TokenAtomic)null);
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
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__INSTANCE:
				return instance != null;
			case TokenTypesPackage.TOKEN_TYPE_ATOMIC__ATOM:
				return atom != null;
		}
		return super.eIsSet(featureID);
	}

} //TokenTypeAtomicImpl
