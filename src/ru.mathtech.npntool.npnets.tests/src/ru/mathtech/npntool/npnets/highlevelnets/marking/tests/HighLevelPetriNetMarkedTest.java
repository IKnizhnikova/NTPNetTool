/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.marking.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.marking.HighLevelPetriNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.marking.MarkingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>High Level Petri Net Marked</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelPetriNetMarkedTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HighLevelPetriNetMarkedTest.class);
	}

	/**
	 * Constructs a new High Level Petri Net Marked test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNetMarkedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this High Level Petri Net Marked test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HighLevelPetriNetMarked getFixture() {
		return (HighLevelPetriNetMarked)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MarkingFactory.eINSTANCE.createHighLevelPetriNetMarked());
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

} //HighLevelPetriNetMarkedTest
