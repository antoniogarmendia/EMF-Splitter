package org.mondo.generate.index.project.execute;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;

public class EvaluateExecuteIndexedAttributeContributor {

	private static final String ExecuteIndexAttribute_ID = "org.mondo.generate.index.project.executeindexattribute";
	
	public boolean ExecIndexAttribute(IExtensionRegistry registry)
	{
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(ExecuteIndexAttribute_ID);
		
		try{
			for (IConfigurationElement e : config)
			{
				System.out.println("Evaluating index attribute extension");
				final Object o =
			            e.createExecutableExtension("class");
				if(o instanceof IExecuteIndexedAttribute)
					return executeExtension((IExecuteIndexedAttribute)o);					
			}			
			
			}catch (CoreException ex) {
				System.out.println(ex.getMessage());
		    }
		
		return false;
	}

	private boolean executeExtension(IExecuteIndexedAttribute o) {
		// TODO Auto-generated method stub
		o.ExecuteIdxAttribute();
		return true;
	}
}
