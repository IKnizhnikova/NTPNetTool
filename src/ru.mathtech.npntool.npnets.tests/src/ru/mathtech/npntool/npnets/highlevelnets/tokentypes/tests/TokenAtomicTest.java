/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAtomic;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Atomic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenAtomicTest extends TokenTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenAtomicTest.class);
	}

	/**
	 * Constructs a new Token Atomic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAtomicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Token Atomic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TokenAtomic getFixture() {
		return (TokenAtomic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenTypesFactory.eINSTANCE.createTokenAtomic());
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

} //TokenAtomicTest
