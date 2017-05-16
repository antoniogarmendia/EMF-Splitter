package org.mondo.modular.references.ext;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

public interface IEditorCrossReferences {
	
	public boolean init(List<String> listMetamodelURI,String modularNature);
	public EList<?> getChoicesOfValues(String modularNature, Resource res, boolean searchWS, EClass anEClass, String eolExpression);
	public boolean finish(String modularNature);
	public boolean isGlobal();
	public boolean isNature(String modularNature);
}
