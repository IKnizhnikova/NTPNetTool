/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.INetElementTest;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Atom;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomTest extends INetElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomTest.class);
	}

	/**
	 * Constructs a new Atom test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Atom getFixture() {
		return (Atom)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TokenTypesFactory.eINSTANCE.createAtom());
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

} //AtomTest
