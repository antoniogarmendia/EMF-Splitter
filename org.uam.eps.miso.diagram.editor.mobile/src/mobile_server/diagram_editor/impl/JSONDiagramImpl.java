/**
 */
package mobile_server.diagram_editor.impl;

import java.util.Collection;

import mobile_server.diagram_editor.Diagram;
import mobile_server.diagram_editor.Diagram_editorPackage;
import mobile_server.diagram_editor.JSONDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.diagram_editor.impl.JSONDiagramImpl#getList_diagrams <em>List diagrams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JSONDiagramImpl extends MinimalEObjectImpl.Container implements JSONDiagram {
	/**
	 * The cached value of the '{@link #getList_diagrams() <em>List diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList_diagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> list_diagrams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagram_editorPackage.Literals.JSON_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getList_diagrams() {
		if (list_diagrams == null) {
			list_diagrams = new EObjectResolvingEList<Diagram>(Diagram.class, this, Diagram_editorPackage.JSON_DIAGRAM__LIST_DIAGRAMS);
		}
		return list_diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Diagram_editorPackage.JSON_DIAGRAM__LIST_DIAGRAMS:
				return getList_diagrams();
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
			case Diagram_editorPackage.JSON_DIAGRAM__LIST_DIAGRAMS:
				getList_diagrams().clear();
				getList_diagrams().addAll((Collection<? extends Diagram>)newValue);
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
			case Diagram_editorPackage.JSON_DIAGRAM__LIST_DIAGRAMS:
				getList_diagrams().clear();
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
			case Diagram_editorPackage.JSON_DIAGRAM__LIST_DIAGRAMS:
				return list_diagrams != null && !list_diagrams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JSONDiagramImpl
