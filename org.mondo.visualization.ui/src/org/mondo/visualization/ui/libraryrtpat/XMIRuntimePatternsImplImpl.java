package org.mondo.visualization.ui.libraryrtpat;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import runtimePatterns.ClassRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;


public class XMIRuntimePatternsImplImpl {
	
	public static EList<ClassRoleInstance> GetUnits(Resource res) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		TreeIterator<EObject> allContents = res.getAllContents();
		EList<ClassRoleInstance> listClassRoleInstance = new BasicEList<ClassRoleInstance>();
		EObject eObject = null;
		
		try {
			res.load(null);
			while (allContents.hasNext()) {
				eObject = allContents.next();
				if(eObject instanceof PatternInstance)
				{
					if(((PatternInstance) eObject).getIdent().equals("Modularity"))
					{
						EList<ClassRoleInstance> eContentsRoleInstance = ((PatternInstance) eObject).getClassInstances();
						int count = eContentsRoleInstance.size();
						for (int i = 0; i < count; i++) {
							ClassRoleInstance eClass = eContentsRoleInstance.get(i);
							EList<EClass> list = eClass.getRole().getRef();
							if(list.size()>0){
								EClass e = list.get(0);
								if(e.getName().equals("Unit"))
									listClassRoleInstance.add(eClass);								
							}							
						}
						if(count>0)
							return listClassRoleInstance;
						System.out.println("Modularity");
					}
				}
				System.out.println("Start");			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return listClassRoleInstance;
	}
	
	public static PatternInstance getModularityPatternInstance(PatternInstances patternInstances)
	{
		Iterator<PatternInstance> iteratorPatterns = patternInstances.getAppliedPatterns().iterator();
		while (iteratorPatterns.hasNext()){
			PatternInstance eObject = iteratorPatterns.next();
			if(((PatternInstance) eObject).getIdent().equals("Modularity"))
				return eObject;			
		}		
		return null;
	}
	
	public static EList<ClassRoleInstance> GetUnitsPatternModularity(PatternInstance patternModularity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<ClassRoleInstance> listUnitClassRoleInstance = new BasicEList<ClassRoleInstance>();
		Iterator<ClassRoleInstance> eContentsRoleInstance = patternModularity.getClassInstances().iterator();
		
		while (eContentsRoleInstance.hasNext()) {
			ClassRoleInstance eClassRoleInstance =  eContentsRoleInstance.next();			
			Iterator<EClass> list = eClassRoleInstance.getRole().getRef().iterator();
			while(list.hasNext()){
				EClass e = list.next();
				if(e.getName().equals("Unit"))
					listUnitClassRoleInstance.add(eClassRoleInstance);								
			}
		}		
		return listUnitClassRoleInstance;
	}

}
