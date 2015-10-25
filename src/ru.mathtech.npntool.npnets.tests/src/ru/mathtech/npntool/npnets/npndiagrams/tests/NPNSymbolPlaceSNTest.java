/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Symbol Place SN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNSymbolPlaceSNTest extends NPNSymbolNodeSNTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNSymbolPlaceSNTest.class);
	}

	/**
	 * Constructs a new NPN Symbol Place SN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolPlaceSNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Symbol Place SN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNSymbolPlaceSN getFixture() {
		return (NPNSymbolPlaceSN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNSymbolPlaceSN());
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

} //NPNSymbolPlaceSNTest
