package org.mondo.modular.filterui.ext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;

public class EvaluateFilterUIContributor {

	private static final String IFILTERUI_ID = "org.model.filterui.definition.ext";
	
	@Execute
	public void execute(IExtensionRegistry registry,FilterAttribute anFilterAttribute) {
	    evaluate(registry,anFilterAttribute);
	}	
	
	private void evaluate(IExtensionRegistry registry,FilterAttribute anFilterAttribute) {
		 
	IConfigurationElement[] config = registry.getConfigurationElementsFor(IFILTERUI_ID);
	
	try {
		
	      for (IConfigurationElement e : config) {
	        final Object o = e.createExecutableExtension("class");
	        if (o instanceof IFilterPage) {
	           executeExtension(o,anFilterAttribute);
	        }
	      }
	    } catch (CoreException ex) {
	      System.out.println(ex.getMessage());
	    }
		 
	}	
	
	private void executeExtension(Object o, FilterAttribute anFilterAttribute) {
		// TODO Auto-generated method stub
		ISafeRunnable runnable = new ISafeRunnable() {
		      @Override
		      public void handleException(Throwable e) {
		        System.out.println("Exception in client");
		      }

		      @Override
		      public void run() throws Exception {
		    	((IFilterPage) o).setFilterAttribute(anFilterAttribute); 
		    	((IFilterPage) o).CreateControl();
		      }
		    };
		    
		    SafeRunner.run(runnable);
		
	}
}
