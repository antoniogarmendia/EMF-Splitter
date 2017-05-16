/**
 */
package ScopeDefinition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ScopeDefinition.ScopeDefinitionPackage#getScopeDefinitionEnum()
 * @model
 * @generated
 */
public enum ScopeDefinitionEnum implements Enumerator {
	/**
	 * The '<em><b>RSame Work Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSAME_WORK_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	RSAME_WORK_SPACE(3, "rSameWorkSpace", "rSameWorkSpace"),

	/**
	 * The '<em><b>RSame Project</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSAME_PROJECT_VALUE
	 * @generated
	 * @ordered
	 */
	RSAME_PROJECT(2, "rSameProject", "rSameProject"),

	/**
	 * The '<em><b>RSame Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSAME_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RSAME_PACKAGE(1, "rSamePackage", "rSamePackage"),

	/**
	 * The '<em><b>RSame Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSAME_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	RSAME_UNIT(0, "rSameUnit", "rSameUnit");

	/**
	 * The '<em><b>RSame Work Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSame Work Space</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSAME_WORK_SPACE
	 * @model name="rSameWorkSpace"
	 * @generated
	 * @ordered
	 */
	public static final int RSAME_WORK_SPACE_VALUE = 3;

	/**
	 * The '<em><b>RSame Project</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSame Project</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSAME_PROJECT
	 * @model name="rSameProject"
	 * @generated
	 * @ordered
	 */
	public static final int RSAME_PROJECT_VALUE = 2;

	/**
	 * The '<em><b>RSame Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSame Package</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSAME_PACKAGE
	 * @model name="rSamePackage"
	 * @generated
	 * @ordered
	 */
	public static final int RSAME_PACKAGE_VALUE = 1;

	/**
	 * The '<em><b>RSame Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSame Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSAME_UNIT
	 * @model name="rSameUnit"
	 * @generated
	 * @ordered
	 */
	public static final int RSAME_UNIT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScopeDefinitionEnum[] VALUES_ARRAY =
		new ScopeDefinitionEnum[] {
			RSAME_WORK_SPACE,
			RSAME_PROJECT,
			RSAME_PACKAGE,
			RSAME_UNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScopeDefinitionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScopeDefinitionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScopeDefinitionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScopeDefinitionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScopeDefinitionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScopeDefinitionEnum get(int value) {
		switch (value) {
			case RSAME_WORK_SPACE_VALUE: return RSAME_WORK_SPACE;
			case RSAME_PROJECT_VALUE: return RSAME_PROJECT;
			case RSAME_PACKAGE_VALUE: return RSAME_PACKAGE;
			case RSAME_UNIT_VALUE: return RSAME_UNIT;
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
	private ScopeDefinitionEnum(int value, String name, String literal) {
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
	
} //ScopeDefinitionEnum
