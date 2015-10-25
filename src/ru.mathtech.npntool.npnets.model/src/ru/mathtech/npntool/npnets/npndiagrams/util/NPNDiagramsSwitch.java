/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.npndiagrams.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.mathtech.npntool.npnets.highlevelnets.common.IEntityIdentifiable;

import ru.mathtech.npntool.npnets.npndiagrams.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsPackage
 * @generated
 */
public class NPNDiagramsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NPNDiagramsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNDiagramsSwitch() {
		if (modelPackage == null) {
			modelPackage = NPNDiagramsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NPNDiagramsPackage.NPN_DIAGRAM_NPN_MARKED: {
				NPNDiagramNPNMarked npnDiagramNPNMarked = (NPNDiagramNPNMarked)theEObject;
				T result = caseNPNDiagramNPNMarked(npnDiagramNPNMarked);
				if (result == null) result = caseIEntityIdentifiable(npnDiagramNPNMarked);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_DIAGRAM_NET_SYSTEM: {
				NPNDiagramNetSystem npnDiagramNetSystem = (NPNDiagramNetSystem)theEObject;
				T result = caseNPNDiagramNetSystem(npnDiagramNetSystem);
				if (result == null) result = caseIEntityIdentifiable(npnDiagramNetSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_PLACE_SN: {
				NPNSymbolPlaceSN npnSymbolPlaceSN = (NPNSymbolPlaceSN)theEObject;
				T result = caseNPNSymbolPlaceSN(npnSymbolPlaceSN);
				if (result == null) result = caseNPNSymbolNodeSN(npnSymbolPlaceSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolPlaceSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_TRANSITION_SN: {
				NPNSymbolTransitionSN npnSymbolTransitionSN = (NPNSymbolTransitionSN)theEObject;
				T result = caseNPNSymbolTransitionSN(npnSymbolTransitionSN);
				if (result == null) result = caseNPNSymbolNodeSN(npnSymbolTransitionSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolTransitionSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_PTSN: {
				NPNSymbolArcPTSN npnSymbolArcPTSN = (NPNSymbolArcPTSN)theEObject;
				T result = caseNPNSymbolArcPTSN(npnSymbolArcPTSN);
				if (result == null) result = caseNPNSymbolArcSN(npnSymbolArcPTSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolArcPTSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_TPSN: {
				NPNSymbolArcTPSN npnSymbolArcTPSN = (NPNSymbolArcTPSN)theEObject;
				T result = caseNPNSymbolArcTPSN(npnSymbolArcTPSN);
				if (result == null) result = caseNPNSymbolArcSN(npnSymbolArcTPSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolArcTPSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_NODE_SN: {
				NPNSymbolNodeSN npnSymbolNodeSN = (NPNSymbolNodeSN)theEObject;
				T result = caseNPNSymbolNodeSN(npnSymbolNodeSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolNodeSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_ARC_SN: {
				NPNSymbolArcSN npnSymbolArcSN = (NPNSymbolArcSN)theEObject;
				T result = caseNPNSymbolArcSN(npnSymbolArcSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolArcSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NPNDiagramsPackage.NPN_SYMBOL_TOKEN_SN: {
				NPNSymbolTokenSN npnSymbolTokenSN = (NPNSymbolTokenSN)theEObject;
				T result = caseNPNSymbolTokenSN(npnSymbolTokenSN);
				if (result == null) result = caseIEntityIdentifiable(npnSymbolTokenSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Diagram NPN Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Diagram NPN Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNDiagramNPNMarked(NPNDiagramNPNMarked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Diagram Net System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Diagram Net System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNDiagramNetSystem(NPNDiagramNetSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Place SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Place SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolPlaceSN(NPNSymbolPlaceSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Transition SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Transition SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolTransitionSN(NPNSymbolTransitionSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Arc PTSN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Arc PTSN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolArcPTSN(NPNSymbolArcPTSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Arc TPSN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Arc TPSN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolArcTPSN(NPNSymbolArcTPSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Node SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Node SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolNodeSN(NPNSymbolNodeSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Arc SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Arc SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolArcSN(NPNSymbolArcSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPN Symbol Token SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPN Symbol Token SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPNSymbolTokenSN(NPNSymbolTokenSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEntity Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEntity Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEntityIdentifiable(IEntityIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NPNDiagramsSwitch
