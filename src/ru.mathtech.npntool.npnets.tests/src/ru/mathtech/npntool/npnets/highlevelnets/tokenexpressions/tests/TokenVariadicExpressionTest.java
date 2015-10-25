/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Variadic Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenVariadicExpressionTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenVariadicExpressionTest.class);
	}

	/**
	 * Constructs a new Token Variadic Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVariadicExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Token Variadic Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TokenVariadicExpression getFixture() {
		return (TokenVariadicExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenExpressionsFactory.eINSTANCE.createTokenVariadicExpression());
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

} //TokenVariadicExpressionTest
