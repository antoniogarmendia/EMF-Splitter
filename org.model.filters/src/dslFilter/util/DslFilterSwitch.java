/**
 */
package dslFilter.util;

import dslFilter.*;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see dslFilter.DslFilterPackage
 * @generated
 */
public class DslFilterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslFilterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFilterSwitch() {
		if (modelPackage == null) {
			modelPackage = DslFilterPackage.eINSTANCE;
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
			case DslFilterPackage.ALL_FILTERS: {
				AllFilters allFilters = (AllFilters)theEObject;
				T result = caseAllFilters(allFilters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.FILTER_GROUP: {
				FilterGroup filterGroup = (FilterGroup)theEObject;
				T result = caseFilterGroup(filterGroup);
				if (result == null) result = caseFilterContent(filterGroup);
				if (result == null) result = caseFilterAttributes(filterGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = caseFilterContent(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.CNUMBER_OPERATION: {
				CNumberOperation cNumberOperation = (CNumberOperation)theEObject;
				T result = caseCNumberOperation(cNumberOperation);
				if (result == null) result = caseRule(cNumberOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.CSTRING_OPERATION: {
				CStringOperation cStringOperation = (CStringOperation)theEObject;
				T result = caseCStringOperation(cStringOperation);
				if (result == null) result = caseRule(cStringOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.CSTRUCTURAL_EOBJECT: {
				CStructuralEObject cStructuralEObject = (CStructuralEObject)theEObject;
				T result = caseCStructuralEObject(cStructuralEObject);
				if (result == null) result = caseRule(cStructuralEObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.CLOGIC_OPERATION: {
				CLogicOperation cLogicOperation = (CLogicOperation)theEObject;
				T result = caseCLogicOperation(cLogicOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.INT_TO_EOBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<Integer, EList<EObject>> intToEObjectMap = (Map.Entry<Integer, EList<EObject>>)theEObject;
				T result = caseIntToEObjectMap(intToEObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.FILTER_CONTENT: {
				FilterContent filterContent = (FilterContent)theEObject;
				T result = caseFilterContent(filterContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.FILTER_ATTRIBUTES: {
				FilterAttributes filterAttributes = (FilterAttributes)theEObject;
				T result = caseFilterAttributes(filterAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.BASIC_CSTRING_OPERATION: {
				BasicCStringOperation basicCStringOperation = (BasicCStringOperation)theEObject;
				T result = caseBasicCStringOperation(basicCStringOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.BASIC_CNUMBER_OPERATION: {
				BasicCNumberOperation basicCNumberOperation = (BasicCNumberOperation)theEObject;
				T result = caseBasicCNumberOperation(basicCNumberOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslFilterPackage.BASIC_CLOGIC_OPERATION: {
				BasicCLogicOperation basicCLogicOperation = (BasicCLogicOperation)theEObject;
				T result = caseBasicCLogicOperation(basicCLogicOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Filters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Filters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllFilters(AllFilters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterGroup(FilterGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CNumber Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CNumber Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCNumberOperation(CNumberOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CString Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CString Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCStringOperation(CStringOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CStructural EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CStructural EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCStructuralEObject(CStructuralEObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLogic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLogic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLogicOperation(CLogicOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int To EObject Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int To EObject Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntToEObjectMap(Map.Entry<Integer, EList<EObject>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterContent(FilterContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAttributes(FilterAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic CString Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic CString Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCStringOperation(BasicCStringOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic CNumber Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic CNumber Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCNumberOperation(BasicCNumberOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic CLogic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic CLogic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCLogicOperation(BasicCLogicOperation object) {
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

} //DslFilterSwitch
