/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPnet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPnetTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPnetTest.class);
	}

	/**
	 * Constructs a new NPnet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPnetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPnet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPnet getFixture() {
		return (NPnet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNetsFactory.eINSTANCE.createNPnet());
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

} //NPnetTest
