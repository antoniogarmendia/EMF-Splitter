/**
 */
package RepresentationGraph.impl;

import RepresentationGraph.*;

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
public class RepresentationGraphFactoryImpl extends EFactoryImpl implements RepresentationGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepresentationGraphFactory init() {
		try {
			RepresentationGraphFactory theRepresentationGraphFactory = (RepresentationGraphFactory)EPackage.Registry.INSTANCE.getEFactory(RepresentationGraphPackage.eNS_URI);
			if (theRepresentationGraphFactory != null) {
				return theRepresentationGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepresentationGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationGraphFactoryImpl() {
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
			case RepresentationGraphPackage.DIAGRAM: return createDiagram();
			case RepresentationGraphPackage.EDGE_ELEMENT: return createEdgeElement();
			case RepresentationGraphPackage.ICON_ELEMENT: return createIconElement();
			case RepresentationGraphPackage.CIRCLE: return createCircle();
			case RepresentationGraphPackage.RECTANGLE: return createRectangle();
			case RepresentationGraphPackage.RHOMBUS: return createRhombus();
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
	public EdgeElement createEdgeElement() {
		EdgeElementImpl edgeElement = new EdgeElementImpl();
		return edgeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconElement createIconElement() {
		IconElementImpl iconElement = new IconElementImpl();
		return iconElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rhombus createRhombus() {
		RhombusImpl rhombus = new RhombusImpl();
		return rhombus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationGraphPackage getRepresentationGraphPackage() {
		return (RepresentationGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepresentationGraphPackage getPackage() {
		return RepresentationGraphPackage.eINSTANCE;
	}

} //RepresentationGraphFactoryImpl
