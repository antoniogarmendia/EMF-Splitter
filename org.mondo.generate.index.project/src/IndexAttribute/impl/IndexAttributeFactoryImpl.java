/**
 */
package IndexAttribute.impl;

import IndexAttribute.*;

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
public class IndexAttributeFactoryImpl extends EFactoryImpl implements IndexAttributeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IndexAttributeFactory init() {
		try {
			IndexAttributeFactory theIndexAttributeFactory = (IndexAttributeFactory)EPackage.Registry.INSTANCE.getEFactory(IndexAttributePackage.eNS_URI);
			if (theIndexAttributeFactory != null) {
				return theIndexAttributeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IndexAttributeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexAttributeFactoryImpl() {
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
			case IndexAttributePackage.INDEX_CLASS: return createIndexClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexClass createIndexClass() {
		IndexClassImpl indexClass = new IndexClassImpl();
		return indexClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexAttributePackage getIndexAttributePackage() {
		return (IndexAttributePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IndexAttributePackage getPackage() {
		return IndexAttributePackage.eINSTANCE;
	}

} //IndexAttributeFactoryImpl
