package org.mondo.modular.sirius.ext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;


public class EvaluateSiriusProjectCreation {
	
	private static final String ISIRIUS_ID = "org.modular.sirius.definition.ext";
	
	@Execute
	public void executeProject(IExtensionRegistry registry,String anProjectName) {
	    evaluateProject(registry, anProjectName);
	}
	
	private void evaluateProject(IExtensionRegistry registry,String anProjectName) {
		 
		IConfigurationElement[] config = registry.getConfigurationElementsFor(ISIRIUS_ID);
		
		try {
			
		      for (IConfigurationElement e : config) {
		        final Object o = e.createExecutableExtension("class");
		        if (o instanceof ISiriusCreation) {
		           executeExtension(o,anProjectName);
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }
			 
		}	
		
		private void executeExtension(Object o,String anProjectName) {
			// TODO Auto-generated method stub
			ISafeRunnable runnable = new ISafeRunnable() {
			      @Override
			      public void handleException(Throwable e) {
			        System.out.println("Exception in client");
			      }

			      @Override
			      public void run() throws Exception {
			    	((ISiriusCreation) o).ExecuteAfterCreateProject(anProjectName);
			      }
			    };
			    
			    SafeRunner.run(runnable);
			
		}
		
		@Execute
		public void executeFile(IExtensionRegistry registry,URI anfileURI){
			evaluateFile(registry, anfileURI);
		}
		
		private void evaluateFile(IExtensionRegistry registry,URI anfileURI) {
			 
			IConfigurationElement[] config = registry.getConfigurationElementsFor(ISIRIUS_ID);
			
			try {
				
			      for (IConfigurationElement e : config) {
			        final Object o = e.createExecutableExtension("class");
			        if (o instanceof ISiriusCreation) {
			           executeExtensionFile(o,anfileURI);
			        }
			      }
			    } catch (CoreException ex) {
			      System.out.println(ex.getMessage());
			    }
				 
			}	
			
			private void executeExtensionFile(Object o,URI anfileURI) {
				// TODO Auto-generated method stub
				ISafeRunnable runnable = new ISafeRunnable() {
				      @Override
				      public void handleException(Throwable e) {
				        System.out.println("Exception in client");
				      }

				      @Override
				      public void run() throws Exception {
				    	((ISiriusCreation) o).ExecuteAfterCreateFile(anfileURI);
				      }
				    };
				    SafeRunner.run(runnable);				
			}	
		

}
