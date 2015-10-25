/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.IEntityIdentifiableTest;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionBinding;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Expression Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenExpressionBindingTest extends IEntityIdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenExpressionBindingTest.class);
	}

	/**
	 * Constructs a new Token Expression Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenExpressionBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Token Expression Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TokenExpressionBinding getFixture() {
		return (TokenExpressionBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenExpressionsFactory.eINSTANCE.createTokenExpressionBinding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TokenExpressionBindingTest
