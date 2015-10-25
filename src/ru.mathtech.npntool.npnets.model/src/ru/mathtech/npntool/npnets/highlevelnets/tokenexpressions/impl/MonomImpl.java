/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl;

import java.math.BigInteger;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.IEntityIdentifiableImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Monom;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.MonomImpl#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonomImpl extends IEntityIdentifiableImpl implements Monom {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POWER_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected BigInteger power = POWER_EDEFAULT;


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
	protected MonomImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenExpressionsPackage.Literals.MONOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenExpressionsPackage.MONOM__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenExpressionsPackage.MONOM__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(BigInteger newPower) {
		BigInteger oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenExpressionsPackage.MONOM__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TokenExpressionsPackage.MONOM__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case TokenExpressionsPackage.MONOM__POWER:
				return getPower();
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
			case TokenExpressionsPackage.MONOM__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case TokenExpressionsPackage.MONOM__POWER:
				setPower((BigInteger)newValue);
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
			case TokenExpressionsPackage.MONOM__VARIABLE:
				setVariable((Variable)null);
				return;
			case TokenExpressionsPackage.MONOM__POWER:
				setPower(POWER_EDEFAULT);
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
			case TokenExpressionsPackage.MONOM__VARIABLE:
				return variable != null;
			case TokenExpressionsPackage.MONOM__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
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
		result.append(" (power: "); //$NON-NLS-1$
		result.append(power);
		result.append(')');
		return result.toString();
	}

} //MonomImpl
