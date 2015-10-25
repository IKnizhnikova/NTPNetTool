/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.tests.TransitionTest;

import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.TransitionSynchronized;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition Synchronized</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionSynchronizedTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionSynchronizedTest.class);
	}

	/**
	 * Constructs a new Transition Synchronized test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionSynchronizedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transition Synchronized test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransitionSynchronized getFixture() {
		return (TransitionSynchronized)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNetsFactory.eINSTANCE.createTransitionSynchronized());
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

} //TransitionSynchronizedTest
