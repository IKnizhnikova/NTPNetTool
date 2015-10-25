/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl;

import java.util.Collection;

import java.util.UUID;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.INetElementImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.MonomConstant;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Variadic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenVariadicExpressionImpl#getMonoms <em>Monoms</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenVariadicExpressionImpl#getMonomConstants <em>Monom Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenVariadicExpressionImpl extends INetElementImpl implements TokenVariadicExpression {
	/**
	 * The cached value of the '{@link #getMonoms() <em>Monoms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonoms()
	 * @generated
	 * @ordered
	 */
	protected EList<Monom> monoms;

	/**
	 * The cached value of the '{@link #getMonomConstants() <em>Monom Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonomConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<MonomConstant> monomConstants;


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
	protected TokenVariadicExpressionImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenExpressionsPackage.Literals.TOKEN_VARIADIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Monom> getMonoms() {
		if (monoms == null) {
			monoms = new EObjectContainmentEList<Monom>(Monom.class, this, TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOMS);
		}
		return monoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonomConstant> getMonomConstants() {
		if (monomConstants == null) {
			monomConstants = new EObjectContainmentEList<MonomConstant>(MonomConstant.class, this, TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS);
		}
		return monomConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOMS:
				return ((InternalEList<?>)getMonoms()).basicRemove(otherEnd, msgs);
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS:
				return ((InternalEList<?>)getMonomConstants()).basicRemove(otherEnd, msgs);
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
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOMS:
				return getMonoms();
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS:
				return getMonomConstants();
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
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOMS:
				getMonoms().clear();
				getMonoms().addAll((Collection<? extends Monom>)newValue);
				return;
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS:
				getMonomConstants().clear();
				getMonomConstants().addAll((Collection<? extends MonomConstant>)newValue);
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
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOMS:
				getMonoms().clear();
				return;
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS:
				getMonomConstants().clear();
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
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOMS:
				return monoms != null && !monoms.isEmpty();
			case TokenExpressionsPackage.TOKEN_VARIADIC_EXPRESSION__MONOM_CONSTANTS:
				return monomConstants != null && !monomConstants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TokenVariadicExpressionImpl
