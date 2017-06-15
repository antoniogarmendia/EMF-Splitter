package org.mondo.generate.modular.project.general.create.project.main.api;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class CopierReverseEngineering extends Copier{

	private static final long serialVersionUID = 1L;
	
	public CopierReverseEngineering(boolean resolveProxies, boolean useOriginalReferences) {

		super(resolveProxies, useOriginalReferences);		
	}

	public EObject copyFolder(EObject eObject)
	{
		if (eObject == null)
	      {
	        return null;
	      }
	      else
	      {
	        EObject copyEObject = createCopy(eObject);
	        if (copyEObject != null)
	        {
	          put(eObject, copyEObject);
	          Iterator<EAttribute> itEAttributes = eObject.eClass().getEAllAttributes().iterator();
	          while (itEAttributes.hasNext()) {
	        	  EAttribute eAttribute = itEAttributes.next();
	        	  if (eAttribute.isChangeable() && !eAttribute.isDerived())
	        		  copyAttribute(eAttribute, eObject, copyEObject);
	          	}
			}
	        return copyEObject;
	      } 
	}

	public void copyIds()
	{
		for (Map.Entry<EObject, EObject> entry  : entrySet())
		{
	        EObject eObject = entry.getKey();
	        EObject copyEObject = entry.getValue();
	        XMIResourceImpl src = (XMIResourceImpl) eObject.eResource();   
	        String Id = src.getID(eObject);
	          if(Id!=null)
	          {
	        	  XMIResource trg = (XMIResource) copyEObject.eResource();	        	  
	        	  trg.setID(copyEObject, Id);	        	  
	          }
		}
	}

}

