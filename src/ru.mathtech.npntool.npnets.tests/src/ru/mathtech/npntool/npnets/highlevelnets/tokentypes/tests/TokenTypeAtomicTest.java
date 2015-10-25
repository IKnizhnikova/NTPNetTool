/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Type Atomic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypeAtomicTest extends TokenTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenTypeAtomicTest.class);
	}

	/**
	 * Constructs a new Token Type Atomic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypeAtomicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Token Type Atomic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TokenTypeAtomic getFixture() {
		return (TokenTypeAtomic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenTypesFactory.eINSTANCE.createTokenTypeAtomic());
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

} //TokenTypeAtomicTest
