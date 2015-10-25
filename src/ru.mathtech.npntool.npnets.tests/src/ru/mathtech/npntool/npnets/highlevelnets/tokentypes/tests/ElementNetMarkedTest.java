/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Net Marked</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementNetMarkedTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementNetMarkedTest.class);
	}

	/**
	 * Constructs a new Element Net Marked test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementNetMarkedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Net Marked test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementNetMarked getFixture() {
		return (ElementNetMarked)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenTypesFactory.eINSTANCE.createElementNetMarked());
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

} //ElementNetMarkedTest
