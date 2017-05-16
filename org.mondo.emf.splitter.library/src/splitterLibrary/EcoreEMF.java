/**
 */
package splitterLibrary;



import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecore EMF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link splitterLibrary.EcoreEMF#getFileuri <em>Fileuri</em>}</li>
 *   <li>{@link splitterLibrary.EcoreEMF#getList_classes <em>List classes</em>}</li>
 *   <li>{@link splitterLibrary.EcoreEMF#getPackMetamodel <em>Pack Metamodel</em>}</li>
 *   <li>{@link splitterLibrary.EcoreEMF#getRes <em>Res</em>}</li>
 *   <li>{@link splitterLibrary.EcoreEMF#getRs <em>Rs</em>}</li>
 * </ul>
 * </p>
 *
 * @see splitterLibrary.SplitterLibraryPackage#getEcoreEMF()
 * @model
 * @generated
 */
public interface EcoreEMF extends EObject {
	/**
	 * Returns the value of the '<em><b>Fileuri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fileuri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileuri</em>' attribute.
	 * @see #setFileuri(String)
	 * @see splitterLibrary.SplitterLibraryPackage#getEcoreEMF_Fileuri()
	 * @model
	 * @generated
	 */
	String getFileuri();

	/**
	 * Sets the value of the '{@link splitterLibrary.EcoreEMF#getFileuri <em>Fileuri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileuri</em>' attribute.
	 * @see #getFileuri()
	 * @generated
	 */
	void setFileuri(String value);

	/**
	 * Returns the value of the '<em><b>List classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List classes</em>' reference list.
	 * @see splitterLibrary.SplitterLibraryPackage#getEcoreEMF_List_classes()
	 * @model
	 * @generated
	 */
	EList<EClass> getList_classes();

	/**
	 * Returns the value of the '<em><b>Pack Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pack Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pack Metamodel</em>' reference.
	 * @see #setPackMetamodel(EPackage)
	 * @see splitterLibrary.SplitterLibraryPackage#getEcoreEMF_PackMetamodel()
	 * @model
	 * @generated
	 */
	EPackage getPackMetamodel();

	/**
	 * Sets the value of the '{@link splitterLibrary.EcoreEMF#getPackMetamodel <em>Pack Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack Metamodel</em>' reference.
	 * @see #getPackMetamodel()
	 * @generated
	 */
	void setPackMetamodel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' attribute.
	 * @see #setRes(ResourceSet)
	 * @see splitterLibrary.SplitterLibraryPackage#getEcoreEMF_Res()
	 * @model dataType="splitterLibrary.DTResourceSet"
	 * @generated
	 */
	ResourceSet getRes();

	/**
	 * Sets the value of the '{@link splitterLibrary.EcoreEMF#getRes <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' attribute.
	 * @see #getRes()
	 * @generated
	 */
	void setRes(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Rs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rs</em>' attribute.
	 * @see #setRs(Resource)
	 * @see splitterLibrary.SplitterLibraryPackage#getEcoreEMF_Rs()
	 * @model dataType="splitterLibrary.DTResource"
	 * @generated
	 */
	Resource getRs();

	/**
	 * Sets the value of the '{@link splitterLibrary.EcoreEMF#getRs <em>Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs</em>' attribute.
	 * @see #getRs()
	 * @generated
	 */
	void setRs(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void GetRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="splitterLibrary.DTIFile"
	 * @generated
	 */
	IFile GetIFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EPackage GetRootPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<EClassifier> GetClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean setPackagebyName(String anpackname);

} // EcoreEMF
