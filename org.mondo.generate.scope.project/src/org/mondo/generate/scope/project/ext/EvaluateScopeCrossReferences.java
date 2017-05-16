package org.mondo.generate.scope.project.ext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.ecore.EReference;

import ScopeDefinition.ScopeDefinitionEnum;

public class EvaluateScopeCrossReferences {
	
	private static final String SCOPE_DEFINITION = "org.mondo.generate.scope.project.scope_definition";
	private ScopeDefinitionEnum def;
	
	@Execute
	public ScopeDefinitionEnum execute(IExtensionRegistry registry,EReference eReference)
	{	
		def = null;
		IConfigurationElement[] config =
		        registry.getConfigurationElementsFor(SCOPE_DEFINITION);
		    try {
		      for (IConfigurationElement e : config) {
		        System.out.println("Evaluating scope extension");
		        final Object o =
		            e.createExecutableExtension("class");
		        if (o instanceof IScopeCrossReferences) {
		          return executeExtension(o,eReference);
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }
		    return null;
	}

	private ScopeDefinitionEnum executeExtension(Object o,EReference eReference) {
		
		ISafeRunnable runnable = new ISafeRunnable() {
			
			@Override
			public void handleException(Throwable e) {
			       System.out.println("Exception in client");
			}

			@Override
			public void run() throws Exception {
				 def = ((IScopeCrossReferences) o).getScopebyReference(eReference);
				}
			};
			
			SafeRunner.run(runnable);
			
			return def;		
	}

}
