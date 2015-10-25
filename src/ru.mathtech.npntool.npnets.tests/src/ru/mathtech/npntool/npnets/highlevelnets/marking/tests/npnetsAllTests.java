/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.marking.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.tests.TokenTypesTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>npnets</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class npnetsAllTests extends TestSuite {

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
		TestSuite suite = new npnetsAllTests("npnets Tests"); //$NON-NLS-1$
		suite.addTest(TokenTypesTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public npnetsAllTests(String name) {
		super(name);
	}

} //npnetsAllTests
