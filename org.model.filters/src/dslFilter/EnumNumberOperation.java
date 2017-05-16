/**
 */
package dslFilter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Number Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dslFilter.DslFilterPackage#getEnumNumberOperation()
 * @model
 * @generated
 */
public enum EnumNumberOperation implements Enumerator {
	/**
	 * The '<em><b>EQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALTO(0, "EQUALTO", "SIZE.EQUALTO"),

	/**
	 * The '<em><b>NOTEQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEQUALTO(0, "NOTEQUALTO", "SIZE.NOTEQUALTO"),

	/**
	 * The '<em><b>LESSTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHAN(0, "LESSTHAN", "SIZE.LESSTHAN"),

	/**
	 * The '<em><b>GREATERTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHAN(0, "GREATERTHAN", "SIZE.GREATERTHAN"),

	/**
	 * The '<em><b>LESSTHANOREQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHANOREQUALTO(0, "LESSTHANOREQUALTO", "SIZE.LESSTHANOREQUALTO"),

	/**
	 * The '<em><b>GREATERTHANOREQUALTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUALTO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHANOREQUALTO(0, "GREATERTHANOREQUALTO", "SIZE.GREATERTHANOREQUALTO");

	/**
	 * The '<em><b>EQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALTO
	 * @model literal="SIZE.EQUALTO"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALTO_VALUE = 0;

	/**
	 * The '<em><b>NOTEQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTEQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALTO
	 * @model literal="SIZE.NOTEQUALTO"
	 * @generated
	 * @ordered
	 */
	public static final int NOTEQUALTO_VALUE = 0;

	/**
	 * The '<em><b>LESSTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSTHAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN
	 * @model literal="SIZE.LESSTHAN"
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHAN_VALUE = 0;

	/**
	 * The '<em><b>GREATERTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATERTHAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN
	 * @model literal="SIZE.GREATERTHAN"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHAN_VALUE = 0;

	/**
	 * The '<em><b>LESSTHANOREQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESSTHANOREQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUALTO
	 * @model literal="SIZE.LESSTHANOREQUALTO"
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHANOREQUALTO_VALUE = 0;

	/**
	 * The '<em><b>GREATERTHANOREQUALTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATERTHANOREQUALTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUALTO
	 * @model literal="SIZE.GREATERTHANOREQUALTO"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHANOREQUALTO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Enum Number Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumNumberOperation[] VALUES_ARRAY =
		new EnumNumberOperation[] {
			EQUALTO,
			NOTEQUALTO,
			LESSTHAN,
			GREATERTHAN,
			LESSTHANOREQUALTO,
			GREATERTHANOREQUALTO,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Number Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumNumberOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Number Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumNumberOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumNumberOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Number Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumNumberOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumNumberOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Number Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumNumberOperation get(int value) {
		switch (value) {
			case EQUALTO_VALUE: return EQUALTO;
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
	private EnumNumberOperation(int value, String name, String literal) {
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
	
} //EnumNumberOperation
