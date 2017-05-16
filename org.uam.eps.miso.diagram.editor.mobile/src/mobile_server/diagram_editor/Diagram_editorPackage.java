/**
 */
package mobile_server.diagram_editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mobile_server.diagram_editor.Diagram_editorFactory
 * @model kind="package"
 * @generated
 */
public interface Diagram_editorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram_editor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.org/diagram_editor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Diagram_editorPackage eINSTANCE = mobile_server.diagram_editor.impl.Diagram_editorPackageImpl.init();

	/**
	 * The meta object id for the '{@link mobile_server.diagram_editor.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mobile_server.diagram_editor.impl.DiagramImpl
	 * @see mobile_server.diagram_editor.impl.Diagram_editorPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DATE = 1;

	/**
	 * The feature id for the '<em><b>Preview Image String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PREVIEW_IMAGE_STRING = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>An Palette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__AN_PALETTE = 5;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mobile_server.diagram_editor.impl.JSONDiagramImpl <em>JSON Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mobile_server.diagram_editor.impl.JSONDiagramImpl
	 * @see mobile_server.diagram_editor.impl.Diagram_editorPackageImpl#getJSONDiagram()
	 * @generated
	 */
	int JSON_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>List diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DIAGRAM__LIST_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>JSON Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JSON Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DIAGRAM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mobile_server.diagram_editor.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see mobile_server.diagram_editor.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.diagram_editor.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mobile_server.diagram_editor.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.diagram_editor.Diagram#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see mobile_server.diagram_editor.Diagram#getDate()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Date();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.diagram_editor.Diagram#getPreviewImageString <em>Preview Image String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preview Image String</em>'.
	 * @see mobile_server.diagram_editor.Diagram#getPreviewImageString()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_PreviewImageString();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.diagram_editor.Diagram#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see mobile_server.diagram_editor.Diagram#getContent()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Content();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.diagram_editor.Diagram#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see mobile_server.diagram_editor.Diagram#getExtension()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Extension();

	/**
	 * Returns the meta object for the reference '{@link mobile_server.diagram_editor.Diagram#getAnPalette <em>An Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An Palette</em>'.
	 * @see mobile_server.diagram_editor.Diagram#getAnPalette()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_AnPalette();

	/**
	 * Returns the meta object for class '{@link mobile_server.diagram_editor.JSONDiagram <em>JSON Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Diagram</em>'.
	 * @see mobile_server.diagram_editor.JSONDiagram
	 * @generated
	 */
	EClass getJSONDiagram();

	/**
	 * Returns the meta object for the reference list '{@link mobile_server.diagram_editor.JSONDiagram#getList_diagrams <em>List diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List diagrams</em>'.
	 * @see mobile_server.diagram_editor.JSONDiagram#getList_diagrams()
	 * @see #getJSONDiagram()
	 * @generated
	 */
	EReference getJSONDiagram_List_diagrams();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Diagram_editorFactory getDiagram_editorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mobile_server.diagram_editor.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mobile_server.diagram_editor.impl.DiagramImpl
		 * @see mobile_server.diagram_editor.impl.Diagram_editorPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DATE = eINSTANCE.getDiagram_Date();

		/**
		 * The meta object literal for the '<em><b>Preview Image String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__PREVIEW_IMAGE_STRING = eINSTANCE.getDiagram_PreviewImageString();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__CONTENT = eINSTANCE.getDiagram_Content();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__EXTENSION = eINSTANCE.getDiagram_Extension();

		/**
		 * The meta object literal for the '<em><b>An Palette</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__AN_PALETTE = eINSTANCE.getDiagram_AnPalette();

		/**
		 * The meta object literal for the '{@link mobile_server.diagram_editor.impl.JSONDiagramImpl <em>JSON Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mobile_server.diagram_editor.impl.JSONDiagramImpl
		 * @see mobile_server.diagram_editor.impl.Diagram_editorPackageImpl#getJSONDiagram()
		 * @generated
		 */
		EClass JSON_DIAGRAM = eINSTANCE.getJSONDiagram();

		/**
		 * The meta object literal for the '<em><b>List diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_DIAGRAM__LIST_DIAGRAMS = eINSTANCE.getJSONDiagram_List_diagrams();

	}

} //Diagram_editorPackage
