/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Symbol Arc TPSN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNSymbolArcTPSNTest extends NPNSymbolArcSNTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNSymbolArcTPSNTest.class);
	}

	/**
	 * Constructs a new NPN Symbol Arc TPSN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolArcTPSNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Symbol Arc TPSN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNSymbolArcTPSN getFixture() {
		return (NPNSymbolArcTPSN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcTPSN());
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

} //NPNSymbolArcTPSNTest
