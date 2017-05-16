/**
 */
package dslFilter.util;

import dslFilter.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dslFilter.DslFilterPackage
 * @generated
 */
public class DslFilterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslFilterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFilterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DslFilterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslFilterSwitch<Adapter> modelSwitch =
		new DslFilterSwitch<Adapter>() {
			@Override
			public Adapter caseAllFilters(AllFilters object) {
				return createAllFiltersAdapter();
			}
			@Override
			public Adapter caseFilterGroup(FilterGroup object) {
				return createFilterGroupAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseCNumberOperation(CNumberOperation object) {
				return createCNumberOperationAdapter();
			}
			@Override
			public Adapter caseCStringOperation(CStringOperation object) {
				return createCStringOperationAdapter();
			}
			@Override
			public Adapter caseCStructuralEObject(CStructuralEObject object) {
				return createCStructuralEObjectAdapter();
			}
			@Override
			public Adapter caseCLogicOperation(CLogicOperation object) {
				return createCLogicOperationAdapter();
			}
			@Override
			public Adapter caseIntToEObjectMap(Map.Entry<Integer, EList<EObject>> object) {
				return createIntToEObjectMapAdapter();
			}
			@Override
			public Adapter caseFilterContent(FilterContent object) {
				return createFilterContentAdapter();
			}
			@Override
			public Adapter caseFilterAttributes(FilterAttributes object) {
				return createFilterAttributesAdapter();
			}
			@Override
			public Adapter caseBasicCStringOperation(BasicCStringOperation object) {
				return createBasicCStringOperationAdapter();
			}
			@Override
			public Adapter caseBasicCNumberOperation(BasicCNumberOperation object) {
				return createBasicCNumberOperationAdapter();
			}
			@Override
			public Adapter caseBasicCLogicOperation(BasicCLogicOperation object) {
				return createBasicCLogicOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.AllFilters <em>All Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.AllFilters
	 * @generated
	 */
	public Adapter createAllFiltersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.FilterGroup <em>Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.FilterGroup
	 * @generated
	 */
	public Adapter createFilterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.CNumberOperation <em>CNumber Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.CNumberOperation
	 * @generated
	 */
	public Adapter createCNumberOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.CStringOperation <em>CString Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.CStringOperation
	 * @generated
	 */
	public Adapter createCStringOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.CStructuralEObject <em>CStructural EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.CStructuralEObject
	 * @generated
	 */
	public Adapter createCStructuralEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.CLogicOperation <em>CLogic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.CLogicOperation
	 * @generated
	 */
	public Adapter createCLogicOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Int To EObject Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createIntToEObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.FilterContent <em>Filter Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.FilterContent
	 * @generated
	 */
	public Adapter createFilterContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.FilterAttributes <em>Filter Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.FilterAttributes
	 * @generated
	 */
	public Adapter createFilterAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.BasicCStringOperation <em>Basic CString Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.BasicCStringOperation
	 * @generated
	 */
	public Adapter createBasicCStringOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.BasicCNumberOperation <em>Basic CNumber Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.BasicCNumberOperation
	 * @generated
	 */
	public Adapter createBasicCNumberOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslFilter.BasicCLogicOperation <em>Basic CLogic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslFilter.BasicCLogicOperation
	 * @generated
	 */
	public Adapter createBasicCLogicOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DslFilterAdapterFactory
