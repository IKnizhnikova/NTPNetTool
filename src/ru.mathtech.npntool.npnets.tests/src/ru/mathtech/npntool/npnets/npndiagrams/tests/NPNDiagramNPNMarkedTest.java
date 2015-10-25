/**
 */
package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.IEntityIdentifiableTest;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNPNMarked;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Diagram NPN Marked</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNDiagramNPNMarkedTest extends IEntityIdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNDiagramNPNMarkedTest.class);
	}

	/**
	 * Constructs a new NPN Diagram NPN Marked test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramNPNMarkedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Diagram NPN Marked test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNDiagramNPNMarked getFixture() {
		return (NPNDiagramNPNMarked)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNDiagramNPNMarked());
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

} //NPNDiagramNPNMarkedTest
