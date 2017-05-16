/**
 */
package splitterLibrary.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import splitterLibrary.ArrayIndexComparator;
import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Index Comparator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link splitterLibrary.impl.ArrayIndexComparatorImpl#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayIndexComparatorImpl extends MinimalEObjectImpl.Container implements ArrayIndexComparator {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> array;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayIndexComparatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplitterLibraryPackage.Literals.ARRAY_INDEX_COMPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getArray() {
		if (array == null) {
			array = new EDataTypeUniqueEList<Integer>(Integer.class, this, SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR__ARRAY);
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Integer> createIndexArray(EList<Integer> array) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		this.array = array;
		EList<Integer> indexes = new BasicEList<Integer>(array.size());		
		for (int i = 0; i < array.size(); i++)
			 indexes.add(i, i);
	    return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR__ARRAY:
				return getArray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR__ARRAY:
				getArray().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR__ARRAY:
				return array != null && !array.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR___CREATE_INDEX_ARRAY__ELIST:
				return createIndexArray((EList<Integer>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (array: ");
		result.append(array);
		result.append(')');
		return result.toString();
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return array.get(o1).compareTo(array.get(o2));
	}	

} //ArrayIndexComparatorImpl
