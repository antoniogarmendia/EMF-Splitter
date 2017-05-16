/**
 */
package mobile_server.diagram_editor.impl;

import mobile_server.diagram_editor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Diagram_editorFactoryImpl extends EFactoryImpl implements Diagram_editorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Diagram_editorFactory init() {
		try {
			Diagram_editorFactory theDiagram_editorFactory = (Diagram_editorFactory)EPackage.Registry.INSTANCE.getEFactory(Diagram_editorPackage.eNS_URI);
			if (theDiagram_editorFactory != null) {
				return theDiagram_editorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Diagram_editorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram_editorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Diagram_editorPackage.DIAGRAM: return createDiagram();
			case Diagram_editorPackage.JSON_DIAGRAM: return createJSONDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONDiagram createJSONDiagram() {
		JSONDiagramImpl jsonDiagram = new JSONDiagramImpl();
		return jsonDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram_editorPackage getDiagram_editorPackage() {
		return (Diagram_editorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Diagram_editorPackage getPackage() {
		return Diagram_editorPackage.eINSTANCE;
	}

} //Diagram_editorFactoryImpl
