/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.IEntityIdentifiableTest;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Diagram Net System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNDiagramNetSystemTest extends IEntityIdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNDiagramNetSystemTest.class);
	}

	/**
	 * Constructs a new NPN Diagram Net System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNetSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Diagram Net System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNDiagramNetSystem getFixture() {
		return (NPNDiagramNetSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNDiagramNetSystem());
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

} //NPNDiagramNetSystemTest
