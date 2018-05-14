/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.EcoreMatrixContainment;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Matrix Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.EcoreMatrixContainmentImpl#getDirect_MatrixContainment <em>Direct Matrix Containment</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.EcoreMatrixContainmentImpl#getPathMatrix <em>Path Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcoreMatrixContainmentImpl extends MinimalEObjectImpl.Container implements EcoreMatrixContainment {
	/**
	 * The cached value of the '{@link #getDirect_MatrixContainment() <em>Direct Matrix Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirect_MatrixContainment()
	 * @generated
	 * @ordered
	 */
	protected EList<EList<Boolean>> direct_MatrixContainment;

	/**
	 * The cached value of the '{@link #getPathMatrix() <em>Path Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<EList<Boolean>> pathMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EcoreMatrixContainmentImpl() {
		super();
		direct_MatrixContainment = null;
		pathMatrix = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.ECORE_MATRIX_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EList<Boolean>> getDirect_MatrixContainment() {
		return direct_MatrixContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirect_MatrixContainment(EList<EList<Boolean>> newDirect_MatrixContainment) {
		EList<EList<Boolean>> oldDirect_MatrixContainment = direct_MatrixContainment;
		direct_MatrixContainment = newDirect_MatrixContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT, oldDirect_MatrixContainment, direct_MatrixContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EList<Boolean>> getPathMatrix() {
		return pathMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathMatrix(EList<EList<Boolean>> newPathMatrix) {
		EList<EList<Boolean>> oldPathMatrix = pathMatrix;
		pathMatrix = newPathMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__PATH_MATRIX, oldPathMatrix, pathMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer GetParent(Integer index) {

		for (int i = 0; i < direct_MatrixContainment.size(); i++) {
			if(direct_MatrixContainment.get(i).get(index).equals(true))
				return i;
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean GetDirectMatrixContainment(EList<EClass> listEClass) {
				
		EList<EReference> current_containments = null;
		//Number of classes
		int list_count = listEClass.size();
		//Boolean matrix that represent the link between classes
		direct_MatrixContainment = new BasicEList<EList<Boolean>>(list_count);
		for (int i = 0; i < list_count; i++){
			direct_MatrixContainment.add(new BasicEList<Boolean>(list_count));
			for (int j = 0; j < list_count; j++)
				direct_MatrixContainment.get(i).add(false);
		}		
		//List of Child Classes
		EList<EClass> listChilds = null;
		EClass obj = null;
		int index=-1;
		int indexSuperType = -1;
		//Containments
		for (int i = 0; i < list_count;i++) {
			obj = listEClass.get(i);
			current_containments = obj.getEAllContainments();
			if(current_containments.size()>0){
				 for (int j = 0; j < current_containments.size(); j++) {
					 
					EClassifier eClassifier = current_containments.get(j).getEType();
					if (eClassifier instanceof EClass) {					 
						 EClass objEClass = (EClass) current_containments.get(j).getEType();
						 index = listEClass.indexOf(objEClass);
						 /*
						  * Maybe the object is not defined in this meta-model
						  * I ignored, maybe in the future...
						  * */
						 if(index!=-1)
							 direct_MatrixContainment.get(i).set(index,true);
						 listChilds = getEAllChilds(objEClass, listEClass);
						 int countSuperTypes = listChilds.size();
						 for (int k = 0; k < countSuperTypes; k++) {
							indexSuperType = listEClass.indexOf(listChilds.get(k));
							direct_MatrixContainment.get(i).set(indexSuperType, true);
						}
					}
				}
			}
		}		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean GetPathMatrix() {//Floyd-Warshall Algorithm
		
		if(direct_MatrixContainment!=null)
		{
			 CopyMatrix();
			 int count = direct_MatrixContainment.size();
			 for (int k = 0; k < count; k++) {//Nodes
					for (int i = 0; i < count; i++) {//Rows
						for (int j = 0; j < count; j++) {//Columns
							if(pathMatrix.get(i).get(k).equals(true) && pathMatrix.get(k).get(j).equals(true))
								pathMatrix.get(i).set(j,true);
						}
					}			
				}
			 return true;
		}			
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void CopyMatrix() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int count = direct_MatrixContainment.size();
		pathMatrix  = new BasicEList<EList<Boolean>>(count);
		for (int i = 0; i < count; i++) {
			pathMatrix.add(new BasicEList<Boolean>(count));
			for (int j = 0; j < count; j++) {	
				pathMatrix.get(i).add(j,direct_MatrixContainment.get(i).get(j).booleanValue());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void PrintDirectMatrixContainment(EList<EClass> listEClass) {
		
		
		System.out.print("EClass Name,");
		
		for (int i = 0; i < listEClass.size(); i++) {
			System.out.print(listEClass.get(i).getName());
			if(i + 1 < listEClass.size())
				System.out.print(",");	
		}		
		
		System.out.println();
		
		for (int i = 0; i < this.direct_MatrixContainment.size(); i++) {
			System.out.print(listEClass.get(i).getName() + ",");			
			for (int j = 0; j < this.direct_MatrixContainment.size(); j++) {
				System.out.print(this.direct_MatrixContainment.get(i).get(j).toString());
				if(j+1 < this.direct_MatrixContainment.size())
					System.out.print(",");	
			}
			System.out.println();
		}		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EClass> getEAllChilds(EClass eClass, EList<EClass> listEClass) {
		
		//List of Child Classes
		EList<EClass> listChilds = new BasicEList<EClass>();
		EList<EClass> listSuperTypes = null;
		int pos = -1;
		Iterator<EClass> itListEClass = listEClass.iterator();
		while (itListEClass.hasNext()) {
			EClass eCurrentClass = (EClass) itListEClass.next();
			listSuperTypes = eCurrentClass.getEAllSuperTypes();
			pos = listSuperTypes.indexOf(eClass);
			if(pos!=-1)
				listChilds.add(eCurrentClass);
		}
		
		return listChilds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Integer> getAllParents(Integer index) {
		
		EList<Integer> listOfParent = new BasicEList<Integer>();		
		for (int i = 0; i < direct_MatrixContainment.size(); i++) {
			if(direct_MatrixContainment.get(i).get(index).equals(true))
				listOfParent.add(i);
		}
		return listOfParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT:
				return getDirect_MatrixContainment();
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__PATH_MATRIX:
				return getPathMatrix();
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
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT:
				setDirect_MatrixContainment((EList<EList<Boolean>>)newValue);
				return;
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__PATH_MATRIX:
				setPathMatrix((EList<EList<Boolean>>)newValue);
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
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT:
				setDirect_MatrixContainment((EList<EList<Boolean>>)null);
				return;
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__PATH_MATRIX:
				setPathMatrix((EList<EList<Boolean>>)null);
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
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__DIRECT_MATRIX_CONTAINMENT:
				return direct_MatrixContainment != null;
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT__PATH_MATRIX:
				return pathMatrix != null;
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
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___GET_PARENT__INTEGER:
				return GetParent((Integer)arguments.get(0));
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___GET_DIRECT_MATRIX_CONTAINMENT__ELIST:
				return GetDirectMatrixContainment((EList<EClass>)arguments.get(0));
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___GET_PATH_MATRIX:
				return GetPathMatrix();
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___COPY_MATRIX:
				CopyMatrix();
				return null;
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___PRINT_DIRECT_MATRIX_CONTAINMENT__ELIST:
				PrintDirectMatrixContainment((EList<EClass>)arguments.get(0));
				return null;
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___GET_EALL_CHILDS__ECLASS_ELIST:
				return getEAllChilds((EClass)arguments.get(0), (EList<EClass>)arguments.get(1));
			case DslHeuristicVisualizationPackage.ECORE_MATRIX_CONTAINMENT___GET_ALL_PARENTS__INTEGER:
				return getAllParents((Integer)arguments.get(0));
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
		result.append(" (direct_MatrixContainment: ");
		result.append(direct_MatrixContainment);
		result.append(", pathMatrix: ");
		result.append(pathMatrix);
		result.append(')');
		return result.toString();
	}

} //EcoreMatrixContainmentImpl
