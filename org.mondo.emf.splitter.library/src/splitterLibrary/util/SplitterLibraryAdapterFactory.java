/**
 */
package splitterLibrary.util;

import java.util.Comparator;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import splitterLibrary.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see splitterLibrary.SplitterLibraryPackage
 * @generated
 */
public class SplitterLibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SplitterLibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitterLibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SplitterLibraryPackage.eINSTANCE;
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
	protected SplitterLibrarySwitch<Adapter> modelSwitch =
		new SplitterLibrarySwitch<Adapter>() {
			@Override
			public Adapter caseCreateEclipseProject(CreateEclipseProject object) {
				return createCreateEclipseProjectAdapter();
			}
			@Override
			public Adapter caseGenModelEMF(GenModelEMF object) {
				return createGenModelEMFAdapter();
			}
			@Override
			public Adapter caseEcoreEMF(EcoreEMF object) {
				return createEcoreEMFAdapter();
			}
			@Override
			public Adapter caseDTProjectDescription(IProjectDescription object) {
				return createDTProjectDescriptionAdapter();
			}
			@Override
			public Adapter caseArrayIndexComparator(ArrayIndexComparator object) {
				return createArrayIndexComparatorAdapter();
			}
			@Override
			public <Integer> Adapter caseComparator(Comparator<Integer> object) {
				return createComparatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link splitterLibrary.CreateEclipseProject <em>Create Eclipse Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see splitterLibrary.CreateEclipseProject
	 * @generated
	 */
	public Adapter createCreateEclipseProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link splitterLibrary.GenModelEMF <em>Gen Model EMF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see splitterLibrary.GenModelEMF
	 * @generated
	 */
	public Adapter createGenModelEMFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link splitterLibrary.EcoreEMF <em>Ecore EMF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see splitterLibrary.EcoreEMF
	 * @generated
	 */
	public Adapter createEcoreEMFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.core.resources.IProjectDescription <em>DT Project Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.core.resources.IProjectDescription
	 * @generated
	 */
	public Adapter createDTProjectDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link splitterLibrary.ArrayIndexComparator <em>Array Index Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see splitterLibrary.ArrayIndexComparator
	 * @generated
	 */
	public Adapter createArrayIndexComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Comparator
	 * @generated
	 */
	public Adapter createComparatorAdapter() {
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

} //SplitterLibraryAdapterFactory
