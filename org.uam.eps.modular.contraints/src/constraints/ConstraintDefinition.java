/**
 */
package constraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see constraints.ConstraintsPackage#getConstraintDefinition()
 * @model
 * @generated
 */
public enum ConstraintDefinition implements Enumerator {
	/**
	 * The '<em><b>GLOBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_VALUE
	 * @generated
	 * @ordered
	 */
	GLOBAL(0, "GLOBAL", "GLOBAL"), /**
	 * The '<em><b>SAME ROOT PACKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_ROOT_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_ROOT_PACKAGE(1, "SAME_ROOT_PACKAGE", "SAME_ROOT_PACKAGE"), /**
	 * The '<em><b>SAME PACKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_PACKAGE(2, "SAME_PACKAGE", "SAME_PACKAGE"), /**
	 * The '<em><b>UNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(3, "UNIT", "UNIT");

	/**
	 * The '<em><b>GLOBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GLOBAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLOBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLOBAL_VALUE = 0;

	/**
	 * The '<em><b>SAME ROOT PACKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAME ROOT PACKAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAME_ROOT_PACKAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_ROOT_PACKAGE_VALUE = 1;

	/**
	 * The '<em><b>SAME PACKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAME PACKAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAME_PACKAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_PACKAGE_VALUE = 2;

	/**
	 * The '<em><b>UNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Constraint Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintDefinition[] VALUES_ARRAY =
		new ConstraintDefinition[] {
			GLOBAL,
			SAME_ROOT_PACKAGE,
			SAME_PACKAGE,
			UNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConstraintDefinition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintDefinition get(int value) {
		switch (value) {
			case GLOBAL_VALUE: return GLOBAL;
			case SAME_ROOT_PACKAGE_VALUE: return SAME_ROOT_PACKAGE;
			case SAME_PACKAGE_VALUE: return SAME_PACKAGE;
			case UNIT_VALUE: return UNIT;
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
	private ConstraintDefinition(int value, String name, String literal) {
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
	
} //ConstraintDefinition
