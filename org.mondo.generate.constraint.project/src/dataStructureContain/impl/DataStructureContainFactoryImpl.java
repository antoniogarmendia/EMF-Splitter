/**
 */
package dataStructureContain.impl;

import dataStructureContain.*;

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
public class DataStructureContainFactoryImpl extends EFactoryImpl implements DataStructureContainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataStructureContainFactory init() {
		try {
			DataStructureContainFactory theDataStructureContainFactory = (DataStructureContainFactory)EPackage.Registry.INSTANCE.getEFactory(DataStructureContainPackage.eNS_URI);
			if (theDataStructureContainFactory != null) {
				return theDataStructureContainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataStructureContainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructureContainFactoryImpl() {
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
			case DataStructureContainPackage.CONTAIN_STRUCTURE: return createContainStructure();
			case DataStructureContainPackage.PACKAGE_UNIT: return createPackageUnit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainStructure createContainStructure() {
		ContainStructureImpl containStructure = new ContainStructureImpl();
		return containStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageUnit createPackageUnit() {
		PackageUnitImpl packageUnit = new PackageUnitImpl();
		return packageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructureContainPackage getDataStructureContainPackage() {
		return (DataStructureContainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataStructureContainPackage getPackage() {
		return DataStructureContainPackage.eINSTANCE;
	}

} //DataStructureContainFactoryImpl
