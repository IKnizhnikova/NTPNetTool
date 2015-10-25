/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>High Level Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelPetriNetTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HighLevelPetriNetTest.class);
	}

	/**
	 * Constructs a new High Level Petri Net test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this High Level Petri Net test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HighLevelPetriNet getFixture() {
		return (HighLevelPetriNet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HLPNFactory.eINSTANCE.createHighLevelPetriNet());
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

} //HighLevelPetriNetTest
