/**
 */
package splitterLibrary.impl;

import java.net.URI;

import org.eclipse.core.resources.IBuildConfiguration;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import splitterLibrary.SplitterLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT Project Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DTProjectDescriptionImpl extends MinimalEObjectImpl.Container implements IProjectDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTProjectDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplitterLibraryPackage.Literals.DT_PROJECT_DESCRIPTION;
	}

	@Override
	public IBuildConfiguration[] getBuildConfigReferences(String configName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICommand[] getBuildSpec() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProject[] getDynamicReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPath getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getLocationURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getNatureIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProject[] getReferencedProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNature(String natureId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ICommand newCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActiveBuildConfig(String configName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBuildConfigs(String[] configNames) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBuildConfigReferences(String configName,
			IBuildConfiguration[] references) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBuildSpec(ICommand[] buildSpec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setComment(String comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDynamicReferences(IProject[] projects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLocation(IPath location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLocationURI(URI location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String projectName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNatureIds(String[] natures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReferencedProjects(IProject[] projects) {
		// TODO Auto-generated method stub
		
	}

} //DTProjectDescriptionImpl
