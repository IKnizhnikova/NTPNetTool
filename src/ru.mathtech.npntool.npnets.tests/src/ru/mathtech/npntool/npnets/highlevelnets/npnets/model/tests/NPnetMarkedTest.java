/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPnet Marked</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPnetMarkedTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPnetMarkedTest.class);
	}

	/**
	 * Constructs a new NPnet Marked test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPnetMarkedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPnet Marked test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPnetMarked getFixture() {
		return (NPnetMarked)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNetsFactory.eINSTANCE.createNPnetMarked());
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

} //NPnetMarkedTest
