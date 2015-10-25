/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage
 * @generated
 */
public interface NPNDiagramsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NPNDiagramsFactory eINSTANCE = ru.mathtech.npntool.npnets.npndiagrams.impl.NPNDiagramsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NPN Diagram NPN Marked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Diagram NPN Marked</em>'.
	 * @generated
	 */
	NPNDiagramNPNMarked createNPNDiagramNPNMarked();

	/**
	 * Returns a new object of class '<em>NPN Diagram Net System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Diagram Net System</em>'.
	 * @generated
	 */
	NPNDiagramNetSystem createNPNDiagramNetSystem();

	/**
	 * Returns a new object of class '<em>NPN Symbol Place SN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Symbol Place SN</em>'.
	 * @generated
	 */
	NPNSymbolPlaceSN createNPNSymbolPlaceSN();

	/**
	 * Returns a new object of class '<em>NPN Symbol Transition SN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Symbol Transition SN</em>'.
	 * @generated
	 */
	NPNSymbolTransitionSN createNPNSymbolTransitionSN();

	/**
	 * Returns a new object of class '<em>NPN Symbol Arc PTSN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Symbol Arc PTSN</em>'.
	 * @generated
	 */
	NPNSymbolArcPTSN createNPNSymbolArcPTSN();

	/**
	 * Returns a new object of class '<em>NPN Symbol Arc TPSN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Symbol Arc TPSN</em>'.
	 * @generated
	 */
	NPNSymbolArcTPSN createNPNSymbolArcTPSN();

	/**
	 * Returns a new object of class '<em>NPN Symbol Token SN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPN Symbol Token SN</em>'.
	 * @generated
	 */
	NPNSymbolTokenSN createNPNSymbolTokenSN();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NPNDiagramsPackage getNPNDiagramsPackage();

} //NPNDiagramsFactory
