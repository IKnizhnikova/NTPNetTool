/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.Synchronization;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizationTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronizationTest.class);
	}

	/**
	 * Constructs a new Synchronization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Synchronization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Synchronization getFixture() {
		return (Synchronization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNetsFactory.eINSTANCE.createSynchronization());
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

} //SynchronizationTest
