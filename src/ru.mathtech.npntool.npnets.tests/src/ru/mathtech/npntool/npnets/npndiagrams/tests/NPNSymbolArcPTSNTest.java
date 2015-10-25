/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Symbol Arc PTSN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNSymbolArcPTSNTest extends NPNSymbolArcSNTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNSymbolArcPTSNTest.class);
	}

	/**
	 * Constructs a new NPN Symbol Arc PTSN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolArcPTSNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Symbol Arc PTSN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNSymbolArcPTSN getFixture() {
		return (NPNSymbolArcPTSN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNSymbolArcPTSN());
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

} //NPNSymbolArcPTSNTest
