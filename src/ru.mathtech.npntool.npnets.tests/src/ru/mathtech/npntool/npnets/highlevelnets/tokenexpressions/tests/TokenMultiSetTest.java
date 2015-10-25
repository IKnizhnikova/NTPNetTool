/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.IEntityIdentifiableTest;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenMultiSet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Multi Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenMultiSetTest extends IEntityIdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenMultiSetTest.class);
	}

	/**
	 * Constructs a new Token Multi Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenMultiSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Token Multi Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TokenMultiSet getFixture() {
		return (TokenMultiSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenExpressionsFactory.eINSTANCE.createTokenMultiSet());
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

} //TokenMultiSetTest
