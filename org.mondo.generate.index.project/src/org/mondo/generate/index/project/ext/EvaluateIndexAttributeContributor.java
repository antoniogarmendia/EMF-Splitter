package org.mondo.generate.index.project.ext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.di.annotations.Execute;

public class EvaluateIndexAttributeContributor {
	
	private static final String IndexAttribute_ID = "org.mondo.generate.index.project.indexattribute";
	
	@Execute
	public boolean ExecuteIndexAttribute(IExtensionRegistry registry,String metamodel, String anEClass, String attribute)
	{
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(IndexAttribute_ID);
		try{
			for (IConfigurationElement e : config)
			{
				System.out.println("Evaluating index attribute extension");
				final Object o =
			            e.createExecutableExtension("class");
				if(o instanceof IIndexAttribute)
					return executeExtension((IIndexAttribute)o,metamodel,anEClass,attribute);					
			}			
			
			}catch (CoreException ex) {
				System.out.println(ex.getMessage());
		    }
		
		return false;
	}

	private boolean executeExtension(IIndexAttribute o, String metamodel, String anEClass, String attribute) {
		// TODO Auto-generated method stub
		
		return o.addIndexedAttribute(metamodel, anEClass, attribute);
		
	}

}
