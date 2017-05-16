/**
 */
package splitterLibrary.util;

import java.util.Comparator;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import splitterLibrary.*;

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
 * @see splitterLibrary.SplitterLibraryPackage
 * @generated
 */
public class SplitterLibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SplitterLibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitterLibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = SplitterLibraryPackage.eINSTANCE;
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
			case SplitterLibraryPackage.CREATE_ECLIPSE_PROJECT: {
				CreateEclipseProject createEclipseProject = (CreateEclipseProject)theEObject;
				T result = caseCreateEclipseProject(createEclipseProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SplitterLibraryPackage.GEN_MODEL_EMF: {
				GenModelEMF genModelEMF = (GenModelEMF)theEObject;
				T result = caseGenModelEMF(genModelEMF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SplitterLibraryPackage.ECORE_EMF: {
				EcoreEMF ecoreEMF = (EcoreEMF)theEObject;
				T result = caseEcoreEMF(ecoreEMF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SplitterLibraryPackage.DT_PROJECT_DESCRIPTION: {
				IProjectDescription dtProjectDescription = (IProjectDescription)theEObject;
				T result = caseDTProjectDescription(dtProjectDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SplitterLibraryPackage.ARRAY_INDEX_COMPARATOR: {
				ArrayIndexComparator arrayIndexComparator = (ArrayIndexComparator)theEObject;
				T result = caseArrayIndexComparator(arrayIndexComparator);
				if (result == null) result = caseComparator(arrayIndexComparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SplitterLibraryPackage.COMPARATOR: {
				Comparator<?> comparator = (Comparator<?>)theEObject;
				T result = caseComparator(comparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Eclipse Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Eclipse Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateEclipseProject(CreateEclipseProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Model EMF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Model EMF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModelEMF(GenModelEMF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore EMF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore EMF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreEMF(EcoreEMF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Project Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Project Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTProjectDescription(IProjectDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Index Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Index Comparator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayIndexComparator(ArrayIndexComparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Integer> T caseComparator(Comparator<Integer> object) {
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

} //SplitterLibrarySwitch
