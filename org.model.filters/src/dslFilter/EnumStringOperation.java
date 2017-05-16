/**
 */
package dslFilter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum String Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dslFilter.DslFilterPackage#getEnumStringOperation()
 * @model
 * @generated
 */
public enum EnumStringOperation implements Enumerator {
	/**
	 * The '<em><b>CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(0, "CONTAINS", "CONTAINS"),

	/**
	 * The '<em><b>STARTSWITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTSWITH_VALUE
	 * @generated
	 * @ordered
	 */
	STARTSWITH(0, "STARTSWITH", "STARTSWITH"),

	/**
	 * The '<em><b>ENDSWITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDSWITH_VALUE
	 * @generated
	 * @ordered
	 */
	ENDSWITH(0, "ENDSWITH", "ENDSWITH"),

	/**
	 * The '<em><b>REGULAREXPRESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAREXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAREXPRESSION(0, "REGULAREXPRESSION", "REGULAREXPRESSION");

	/**
	 * The '<em><b>CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTAINS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>STARTSWITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTSWITH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTSWITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTSWITH_VALUE = 0;

	/**
	 * The '<em><b>ENDSWITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENDSWITH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDSWITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDSWITH_VALUE = 0;

	/**
	 * The '<em><b>REGULAREXPRESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGULAREXPRESSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULAREXPRESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGULAREXPRESSION_VALUE = 0;

	/**
	 * An array of all the '<em><b>Enum String Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumStringOperation[] VALUES_ARRAY =
		new EnumStringOperation[] {
			CONTAINS,
			STARTSWITH,
			ENDSWITH,
			REGULAREXPRESSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum String Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumStringOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum String Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumStringOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumStringOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum String Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumStringOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumStringOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum String Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumStringOperation get(int value) {
		switch (value) {
			case CONTAINS_VALUE: return CONTAINS;
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
	private EnumStringOperation(int value, String name, String literal) {
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
	
} //EnumStringOperation
