/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.IEntityIdentifiableTest;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultisetExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Multiset Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenMultisetExpressionTest extends IEntityIdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenMultisetExpressionTest.class);
	}

	/**
	 * Constructs a new Token Multiset Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenMultisetExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Token Multiset Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TokenMultisetExpression getFixture() {
		return (TokenMultisetExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenExpressionsFactory.eINSTANCE.createTokenMultisetExpression());
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

} //TokenMultisetExpressionTest
