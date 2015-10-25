/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl;

import java.util.Collection;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.IEntityIdentifiableImpl;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenBinding;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsPackage;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Expression Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionBindingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.impl.TokenExpressionBindingImpl#getBindingTokens <em>Binding Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenExpressionBindingImpl extends IEntityIdentifiableImpl implements TokenExpressionBinding {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected TokenVariadicExpression expression;

	/**
	 * The cached value of the '{@link #getBindingTokens() <em>Binding Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenBinding> bindingTokens;


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
	protected TokenExpressionBindingImpl() {
		super();
  
  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenExpressionsPackage.Literals.TOKEN_EXPRESSION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVariadicExpression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (TokenVariadicExpression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVariadicExpression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(TokenVariadicExpression newExpression) {
		TokenVariadicExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenBinding> getBindingTokens() {
		if (bindingTokens == null) {
			bindingTokens = new EObjectContainmentEList<TokenBinding>(TokenBinding.class, this, TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__BINDING_TOKENS);
		}
		return bindingTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__BINDING_TOKENS:
				return ((InternalEList<?>)getBindingTokens()).basicRemove(otherEnd, msgs);
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
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__BINDING_TOKENS:
				return getBindingTokens();
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
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__EXPRESSION:
				setExpression((TokenVariadicExpression)newValue);
				return;
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__BINDING_TOKENS:
				getBindingTokens().clear();
				getBindingTokens().addAll((Collection<? extends TokenBinding>)newValue);
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
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__EXPRESSION:
				setExpression((TokenVariadicExpression)null);
				return;
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__BINDING_TOKENS:
				getBindingTokens().clear();
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
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__EXPRESSION:
				return expression != null;
			case TokenExpressionsPackage.TOKEN_EXPRESSION_BINDING__BINDING_TOKENS:
				return bindingTokens != null && !bindingTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TokenExpressionBindingImpl
