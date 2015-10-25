/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tokentypes</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TokenTypesTests("tokentypes Tests"); //$NON-NLS-1$
		suite.addTestSuite(TokenTypeElementNetTest.class);
		suite.addTestSuite(TokenAtomicTest.class);
		suite.addTestSuite(TokenNetTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypesTests(String name) {
		super(name);
	}

} //TokenTypesTests
