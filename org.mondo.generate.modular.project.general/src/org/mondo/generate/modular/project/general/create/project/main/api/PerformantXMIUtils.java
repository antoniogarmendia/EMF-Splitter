package org.mondo.generate.modular.project.general.create.project.main.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class PerformantXMIUtils {
	
	// Constants
	public static boolean LOAD_ON_DEMAND = true; 
	
	/*
	 * Create XMI Resource using PerformantXMIResourceImpl
	 */	
	public static Resource createPerformantResource(URI uri){
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
											Resource.Factory.Registry.DEFAULT_EXTENSION, new PerformantXMIResourceFactoryImpl());
		
		return rs.createResource(uri);		
	}
	
	/*
	 * Get XMI Resource using PerformantXMIResourceImpl
	 */	
	public static Resource getPerformantResource(URI uri,boolean loadOnDemand){
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new PerformantXMIResourceFactoryImpl());
		
		
		return rs.getResource(uri, loadOnDemand);		
	}
	
	/*
	 * Get XMI Resource using PerformantXMIResourceImpl 
	 */	 
	public static Resource getPerformantResource(URI uri){
		return getPerformantResource(uri, LOAD_ON_DEMAND);
	}

	/*
	 *  Create XMI with root
	 */
	public static Resource createResourceRoot(URI uri, EObject root){
		
		Resource resource = createPerformantResource(uri); 
		resource.getContents().add(root);
		return resource;	
	}
	
}


