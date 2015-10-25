/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESynchronization Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsPackage#getESynchronizationKind()
 * @model
 * @generated
 */
public enum ESynchronizationKind implements Enumerator {
	/**
	 * The '<em><b>Vertical Synchronization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_SYNCHRONIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_SYNCHRONIZATION(1, "VerticalSynchronization", "VerticalSynchronization"),

	/**
	 * The '<em><b>Horizontal Synchronization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_SYNCHRONIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_SYNCHRONIZATION(2, "HorizontalSynchronization", "HorizontalSynchronization");

	/**
	 * The '<em><b>Vertical Synchronization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical Synchronization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_SYNCHRONIZATION
	 * @model name="VerticalSynchronization"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_SYNCHRONIZATION_VALUE = 1;

	/**
	 * The '<em><b>Horizontal Synchronization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal Synchronization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_SYNCHRONIZATION
	 * @model name="HorizontalSynchronization"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_SYNCHRONIZATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>ESynchronization Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESynchronizationKind[] VALUES_ARRAY =
		new ESynchronizationKind[] {
			VERTICAL_SYNCHRONIZATION,
			HORIZONTAL_SYNCHRONIZATION,
		};

	/**
	 * A public read-only list of all the '<em><b>ESynchronization Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESynchronizationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESynchronization Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESynchronizationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESynchronizationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESynchronization Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESynchronizationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESynchronizationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESynchronization Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESynchronizationKind get(int value) {
		switch (value) {
			case VERTICAL_SYNCHRONIZATION_VALUE: return VERTICAL_SYNCHRONIZATION;
			case HORIZONTAL_SYNCHRONIZATION_VALUE: return HORIZONTAL_SYNCHRONIZATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ESynchronizationKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ESynchronizationKind
