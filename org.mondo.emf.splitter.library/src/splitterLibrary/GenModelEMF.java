/**
 */
package splitterLibrary;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Model EMF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link splitterLibrary.GenModelEMF#getModel_code <em>Model code</em>}</li>
 *   <li>{@link splitterLibrary.GenModelEMF#getEdit_code <em>Edit code</em>}</li>
 *   <li>{@link splitterLibrary.GenModelEMF#getEditor_code <em>Editor code</em>}</li>
 *   <li>{@link splitterLibrary.GenModelEMF#getContain_proxies <em>Contain proxies</em>}</li>
 *   <li>{@link splitterLibrary.GenModelEMF#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link splitterLibrary.GenModelEMF#getNemf <em>Nemf</em>}</li>
 * </ul>
 * </p>
 *
 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF()
 * @model
 * @generated
 */
public interface GenModelEMF extends EObject {
	/**
	 * Returns the value of the '<em><b>Model code</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model code</em>' attribute.
	 * @see #setModel_code(Boolean)
	 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF_Model_code()
	 * @model default="true"
	 * @generated
	 */
	Boolean getModel_code();

	/**
	 * Sets the value of the '{@link splitterLibrary.GenModelEMF#getModel_code <em>Model code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model code</em>' attribute.
	 * @see #getModel_code()
	 * @generated
	 */
	void setModel_code(Boolean value);

	/**
	 * Returns the value of the '<em><b>Edit code</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit code</em>' attribute.
	 * @see #setEdit_code(Boolean)
	 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF_Edit_code()
	 * @model default="true"
	 * @generated
	 */
	Boolean getEdit_code();

	/**
	 * Sets the value of the '{@link splitterLibrary.GenModelEMF#getEdit_code <em>Edit code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit code</em>' attribute.
	 * @see #getEdit_code()
	 * @generated
	 */
	void setEdit_code(Boolean value);

	/**
	 * Returns the value of the '<em><b>Editor code</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor code</em>' attribute.
	 * @see #setEditor_code(Boolean)
	 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF_Editor_code()
	 * @model default="true"
	 * @generated
	 */
	Boolean getEditor_code();

	/**
	 * Sets the value of the '{@link splitterLibrary.GenModelEMF#getEditor_code <em>Editor code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor code</em>' attribute.
	 * @see #getEditor_code()
	 * @generated
	 */
	void setEditor_code(Boolean value);

	/**
	 * Returns the value of the '<em><b>Contain proxies</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain proxies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain proxies</em>' attribute.
	 * @see #setContain_proxies(Boolean)
	 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF_Contain_proxies()
	 * @model default="true"
	 * @generated
	 */
	Boolean getContain_proxies();

	/**
	 * Sets the value of the '{@link splitterLibrary.GenModelEMF#getContain_proxies <em>Contain proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contain proxies</em>' attribute.
	 * @see #getContain_proxies()
	 * @generated
	 */
	void setContain_proxies(Boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' attribute.
	 * @see #setGenModel(GenModel)
	 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF_GenModel()
	 * @model dataType="splitterLibrary.DTGenModel"
	 * @generated
	 */
	GenModel getGenModel();

	/**
	 * Sets the value of the '{@link splitterLibrary.GenModelEMF#getGenModel <em>Gen Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' attribute.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(GenModel value);

	/**
	 * Returns the value of the '<em><b>Nemf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nemf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nemf</em>' reference.
	 * @see #setNemf(EcoreEMF)
	 * @see splitterLibrary.SplitterLibraryPackage#getGenModelEMF_Nemf()
	 * @model
	 * @generated
	 */
	EcoreEMF getNemf();

	/**
	 * Sets the value of the '{@link splitterLibrary.GenModelEMF#getNemf <em>Nemf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nemf</em>' reference.
	 * @see #getNemf()
	 * @generated
	 */
	void setNemf(EcoreEMF value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean CreateGenModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFilepath();

} // GenModelEMF
