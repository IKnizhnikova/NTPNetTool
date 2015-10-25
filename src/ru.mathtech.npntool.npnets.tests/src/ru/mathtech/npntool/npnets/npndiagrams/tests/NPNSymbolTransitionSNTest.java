/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Symbol Transition SN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNSymbolTransitionSNTest extends NPNSymbolNodeSNTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNSymbolTransitionSNTest.class);
	}

	/**
	 * Constructs a new NPN Symbol Transition SN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolTransitionSNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Symbol Transition SN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNSymbolTransitionSN getFixture() {
		return (NPNSymbolTransitionSN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNSymbolTransitionSN());
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

} //NPNSymbolTransitionSNTest
