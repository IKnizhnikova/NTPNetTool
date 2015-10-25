/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.tests;

import junit.textui.TestRunner;

import ru.mathtech.npntool.npnets.highlevelnets.common.tests.IEntityIdentifiableTest;

import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NPN Symbol Token SN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NPNSymbolTokenSNTest extends IEntityIdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NPNSymbolTokenSNTest.class);
	}

	/**
	 * Constructs a new NPN Symbol Token SN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNSymbolTokenSNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NPN Symbol Token SN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NPNSymbolTokenSN getFixture() {
		return (NPNSymbolTokenSN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NPNDiagramsFactory.eINSTANCE.createNPNSymbolTokenSN());
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

} //NPNSymbolTokenSNTest
