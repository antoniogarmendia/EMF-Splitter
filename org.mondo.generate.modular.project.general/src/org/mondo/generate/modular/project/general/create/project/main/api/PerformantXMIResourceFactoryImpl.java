package org.mondo.generate.modular.project.general.create.project.main.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

public class PerformantXMIResourceFactoryImpl extends XMIResourceFactoryImpl {
	
	private List<Object> lookupTable = new ArrayList<Object>();
	private XMLParserPool parserPool = new XMLParserPoolImpl();
	private Map<Object,Object> nameToFeatureMap = new HashMap<Object,Object>();
	
	@Override
	public Resource createResource(URI uri)
	{
		
		PerformantXMIResourceImpl resource = new PerformantXMIResourceImpl(uri);
		
		/*Save Options*/
		Map<Object,Object> saveOptions = resource.getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, lookupTable);
		
		
		/*Load Options*/		
		Map<Object,Object> loadOptions = resource.getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);
					
		return resource;		
	}
	
	public Resource Get_Create_XMI(URI uri, EObject root) throws IOException{
		
		PerformantXMIResourceImpl resource  = new PerformantXMIResourceImpl(uri);
		resource.getContents().add(root);
		resource.save(null);
		return resource;		
	}
	
	public Resource Create_XMI(URI uri, EObject root, String id) throws IOException{
		
		PerformantXMIResourceImpl resource  = new PerformantXMIResourceImpl(uri);
		resource.getContents().add(root);
		resource.setID(root,id);
		resource.save(null);
		return resource;		
	}
	
	//To share the same ResourceSetImpl(Important for Cross-document References)
	public Resource createResourceResourceSet(URI fileURI, ResourceSet rs)
	{
		Resource resource = null;
		if(rs!=null)
		 resource = rs.createResource(fileURI);	
		else{
			rs = new ResourceSetImpl();
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				      Resource.Factory.Registry.DEFAULT_EXTENSION,
				      new PerformantXMIResourceFactoryImpl());
			resource = rs.createResource(fileURI);
		}
		return resource;		
	}
	
}

