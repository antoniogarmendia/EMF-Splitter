package org.mondo.modular.sirius.ext;

import org.eclipse.emf.common.util.URI;

public interface ISiriusCreation {
	
	//Methods
	public void ExecuteAfterCreateProject(String anProjectName);	
	public void ExecuteAfterCreateFile(URI anfileURI);
}
