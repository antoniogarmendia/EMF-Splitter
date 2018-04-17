package splitterLibrary.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.mondo.editor.ui.utils.patterns.MMInterfaceRelDiagram;

import dslPatterns.Category;
import dslPatterns.ClassInterface;
import dslPatterns.FeatureInterface;
import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.PatternSet;
import dslPatterns.ReferenceInterface;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.RuntimePatternsFactory;
import runtimePatterns.TypeFeatureRoleInstance;

public class DSLtaoUtils {
	
	/*
	 * Attributes
	 */
	
	public static final String catInfrastructureFunctionality = "Infrastructure Functionality";
	public static final String catLanguageFragmentation = "Language Fragmentation";
	public static final String catConcreteSyntax = "Concrete Syntax";
	
	
	// Patterns
	public static final String catModularity = "Modularity";
	public static final String catScope = "Scope";	
	public static final String catVisibility = "Visibility";
	public static final String catConstraint = "Constraint";
	public static final String catIndex = "IndexAttribute";
	public static final String catGraphRepresentation = "Graph-based Representation";
	
	/*
	 * Get Modular Pattern from the pattern set
	 * */	
	
	public static Pattern getModularPattern(PatternSet iPatternModel) {
		
		return getPatternInSubCategory(iPatternModel, catInfrastructureFunctionality, catLanguageFragmentation, catModularity);	
	}
	
	/*
	 * Get Graph Representation Pattern from the pattern set
	 * */
	
	public static Pattern getGraphRepresentation(PatternSet iPatternModel) {
		return getPatternInSubCategory(iPatternModel, catConcreteSyntax, null, catGraphRepresentation);	
	}
	
	/*
	 * Get Scope Pattern from the pattern set
	 * 
	 */
	
	public static Pattern getScopePattern(PatternSet iPatternModel) {
		
		return getPatternInSubCategory(iPatternModel, catInfrastructureFunctionality, catLanguageFragmentation, catScope);		
	}
	
	/*
	 * Get Visibility Pattern from pattern set 
	 * */
	
	public static Pattern getVisibilityPattern(PatternSet iPatternModel) {
		
		return getPatternInSubCategory(iPatternModel, catInfrastructureFunctionality, catLanguageFragmentation, catVisibility);		
	}
	
	/*
	 * Get Constraint Pattern from pattern set 
	 */
		
	public static Pattern getConstraintPattern(PatternSet iPatternModel){
		
		return getPatternInSubCategory(iPatternModel, catInfrastructureFunctionality, catLanguageFragmentation, catConstraint);
	}
	
	/*
	 *  Get Index Pattern from pattern set
	 * */
	
	public static Pattern getIndexPattern(PatternSet iPatternModel) {
		
		return getPatternInSubCategory(iPatternModel, catInfrastructureFunctionality, catLanguageFragmentation, catIndex);
	}
	
	public static Pattern getPatternInSubCategory(PatternSet iPatternModel, String patternCategory, String patternSubCategory, String patternName) {
		
		Iterator<Category> itCategories = iPatternModel.getCategories().iterator();
		while (itCategories.hasNext()) {
			
			Category category = (Category) itCategories.next();
			if(category.getName().equals(patternCategory)){
				
				if (patternSubCategory == null) { //Search the pattern in the category
					Iterator<Pattern> itPatterns = category.getPatterns().iterator();
					while (itPatterns.hasNext()) {
						Pattern pattern = (Pattern) itPatterns.next();
						if(pattern.getName().equals(patternName))
							return pattern; 
					}
				}				
				Iterator<Category> itSubCategories = category.getSubcategories().iterator();
				while (itSubCategories.hasNext()) {
					Category subCategory = (Category) itSubCategories.next();
					if(subCategory.getName().equals(patternSubCategory)){
						Iterator<Pattern> itPatterns = subCategory.getPatterns().iterator();
						while (itPatterns.hasNext()) {
							Pattern pattern = (Pattern) itPatterns.next();
							if(pattern.getName().equals(patternName))
								return pattern; 
						}
					}
				}
			}			
		}
		return null;		
	}	
	
	/*
	 * Get Project
	 * */
	
	public static IProject getProjectFromURI(URI resourceURI) {
		
		if (resourceURI.isPlatform() == true) {
		
			String platformString = resourceURI.toPlatformString(false);
			String projectName = platformString.substring(1, platformString.indexOf("/", 1));		
					
			IProject pro = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);		
			
			return pro;
		} else {
			
			IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(resourceURI.toFileString()));			
			return ifile.getProject();
		}		
	}	
	
	/*
	 *Find the ecore metamodel 
	 */
	
	public static Resource findEcoreMM(URI resourceURI) {
				
		// find ecore file
		URI metaM = resourceURI.trimFileExtension().appendFileExtension("ecore");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resourceMM = resourceSet.getResource(metaM, true);	
		
		return resourceMM;		
	}
	
	/*
	 * Patterns
	 * */
	
	/*
	 * Create Pattern Instances 
	 * */
	
	public static PatternInstances createPatternInstances(){
		
		PatternInstances patternInstances = RuntimePatternsFactory.eINSTANCE.createPatternInstances();
		return patternInstances;
	}
	
	/*
	 * Create Pattern Instance
	 * */
	
	public static PatternInstance createPatternInstance(String ident, Pattern pattern){
		
		PatternInstance pi = RuntimePatternsFactory.eINSTANCE.createPatternInstance();
		pi.setIdent(ident);
		pi.setPattern(pattern);
		return pi;
	}
		
	public static DiagramBehavior getDiagramDSLtao() {
		
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IDiagramContainerUI editor = (IDiagramContainerUI)activePage.getActiveEditor();
			
		return editor.getDiagramBehavior();		
	}
	
	public static ClassInterface getClassInterfaceByName(PatternMetaModel mainPattern, String name){
		
		Iterator<ClassInterface> itClassInstances = mainPattern.getClassInterfaces().iterator();
		
		while (itClassInstances.hasNext()) {
			
			ClassInterface classRoleInstance = itClassInstances.next();
			EClass eClass = ((ClassInterface) classRoleInstance).getRef().get(0);
			
			if(eClass.getName().equals(name))
				return ((ClassInterface) classRoleInstance);						
		}
		
		return null;
	}
	
	public static FeatureInterface getFeatureTypeByName(PatternMetaModel modularPattern, String name){
		
		Iterator<FeatureInterface> itFeatInstances = modularPattern.getAttrInterfaces().iterator();
		while (itFeatInstances.hasNext()) {
			FeatureInterface featureInterface = (FeatureInterface) itFeatInstances.next();
			
			EAttribute eAttribute = featureInterface.getRef().get(0);
				if(eAttribute.getName().equals(name))
					return featureInterface;	
		}	
		
		return null;
	} 
	
	public static ReferenceInterface getReferenceInterfaceByName(PatternMetaModel pattern, String name){
		
		Iterator<ReferenceInterface> itRefInterfaces = pattern.getRefInterfaces().iterator();
		while (itRefInterfaces.hasNext()) {
			
			ReferenceInterface refInterface = itRefInterfaces.next();
			EReference eReference = refInterface.getRef();
			
				if(eReference.getName().equals(name))
					return refInterface;			
		}		
		
		return null;
	}	
	
	/*
	 * End Patterns
	 * */
	
	/*
	 * Convert relative to absolute. 
	 * This is because DSLtao do the inverse.
	 * @param resource
	 * */
	
	public static void setPatternAbsoluteUri(IProject eProject, Resource resource){
		
		URI absoluteUri = URI.createPlatformResourceURI(eProject.getName() + "/" + resource.getURI().toString(), true);
		resource.setURI(absoluteUri);
	}
	
	/*
	 * Transform from Applied Patterns to MMInterface 
	 * 
	 * */
	
	public static List<MMInterfaceRelDiagram> transformFromAppliedPatternsToMMInterfaceRelDiagram(PatternInstance modularInstance, Pattern pattern) {
		
		List<MMInterfaceRelDiagram> modularityMM = new LinkedList<MMInterfaceRelDiagram>();
		Iterator<ClassRoleInstance> itClassRoleInstance = modularInstance.getClassInstances().iterator();
		
		int order = 0;
		// add classes
		while (itClassRoleInstance.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoleInstance.next();
			MMInterface interfaceClassRoleInstance = classRoleInstance.getRole();
			String elementDiagram = classRoleInstance.getElement().getName();
			// add ClassRoleInstance
			MMInterfaceRelDiagram parentClassRoleInstance = new MMInterfaceRelDiagram
					(interfaceClassRoleInstance, elementDiagram, order, modularityMM);
			modularityMM.add(parentClassRoleInstance);		
			
			// add reference instances (composition)	
			Iterator<ReferenceRoleInstance> itReferenceInstances = classRoleInstance.getReferenceInstances().iterator();
			while (itReferenceInstances.hasNext()) {
				ReferenceRoleInstance referenceRoleInstance = (ReferenceRoleInstance) itReferenceInstances.next();
				String value = elementDiagram + "/" + referenceRoleInstance.getElement().getName();
				MMInterfaceRelDiagram mmReferenceRoleInstance = new MMInterfaceRelDiagram
						(referenceRoleInstance.getRole(), value, order, modularityMM);
				mmReferenceRoleInstance.setParent(parentClassRoleInstance);
				modularityMM.add(mmReferenceRoleInstance);
			}			
			
			// add FeatureType
			Iterator<FeatureRoleInstance> itFeatureInstances = classRoleInstance.getFeatureInstances().iterator();
			while (itFeatureInstances.hasNext()) {
				FeatureRoleInstance featureRoleInstance = (FeatureRoleInstance) itFeatureInstances.next();
				// add name feature
				if (featureRoleInstance instanceof TypeFeatureRoleInstance) {
					TypeFeatureRoleInstance type = (TypeFeatureRoleInstance) featureRoleInstance;
					String value = elementDiagram + "/" + type.getElement().getName(); 
					if (value != null) {
						MMInterfaceRelDiagram mmFeatureType = new MMInterfaceRelDiagram
								(type.getRole(), value, order, modularityMM);
						mmFeatureType.setParent(parentClassRoleInstance);						
						modularityMM.add(mmFeatureType);
					}
				}
				// add extension & icon
				else if (featureRoleInstance instanceof InstanceFeatureRoleInstance) {
					InstanceFeatureRoleInstance feat = (InstanceFeatureRoleInstance) featureRoleInstance;
					String value = feat.getValue();
					if (value != null) {						
						MMInterfaceRelDiagram mmFeatureRole = new MMInterfaceRelDiagram
								(feat.getRole(), value, order, modularityMM);	
						mmFeatureRole.setParent(parentClassRoleInstance);
						if(feat.getRole().getRef().get(0).getName().contains("icon"))
								parentClassRoleInstance.getChildren().add(mmFeatureRole);
						modularityMM.add(mmFeatureRole);
					}
				}
				
			}
			order++;
		}	
		
		return modularityMM;
	}
	
	public static boolean existRuntimePatterns(URI uri) {
		
		URI rtpatURI = uri.trimFileExtension().appendFileExtension("rtpat");
		return new ExtensibleURIConverterImpl().exists(rtpatURI, null);		
	}	

}
