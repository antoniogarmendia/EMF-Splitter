/**
 */
package graphic_representation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Children Presentation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see graphic_representation.Graphic_representationPackage#getChildrenPresentation()
 * @model
 * @generated
 */
public enum ChildrenPresentation implements Enumerator {
	/**
	 * The '<em><b>FREEFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEFORM_VALUE
	 * @generated
	 * @ordered
	 */
	FREEFORM(0, "FREEFORM", "FREEFORM"),

	/**
	 * The '<em><b>LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(1, "LIST", "LIST"),

	/**
	 * The '<em><b>HORIZONTALSTACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTALSTACK_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTALSTACK(2, "HORIZONTALSTACK", "HORIZONTALSTACK"),

	/**
	 * The '<em><b>VERTICALSTACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICALSTACK_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICALSTACK(3, "VERTICALSTACK", "VERTICALSTACK");

	/**
	 * The '<em><b>FREEFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREEFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREEFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREEFORM_VALUE = 0;

	/**
	 * The '<em><b>LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 1;

	/**
	 * The '<em><b>HORIZONTALSTACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HORIZONTALSTACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTALSTACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTALSTACK_VALUE = 2;

	/**
	 * The '<em><b>VERTICALSTACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTICALSTACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICALSTACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERTICALSTACK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Children Presentation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChildrenPresentation[] VALUES_ARRAY =
		new ChildrenPresentation[] {
			FREEFORM,
			LIST,
			HORIZONTALSTACK,
			VERTICALSTACK,
		};

	/**
	 * A public read-only list of all the '<em><b>Children Presentation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChildrenPresentation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Children Presentation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChildrenPresentation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChildrenPresentation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Children Presentation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChildrenPresentation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChildrenPresentation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Children Presentation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChildrenPresentation get(int value) {
		switch (value) {
			case FREEFORM_VALUE: return FREEFORM;
			case LIST_VALUE: return LIST;
			case HORIZONTALSTACK_VALUE: return HORIZONTALSTACK;
			case VERTICALSTACK_VALUE: return VERTICALSTACK;
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
	private ChildrenPresentation(int value, String name, String literal) {
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
	
} //ChildrenPresentation
