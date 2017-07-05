package org.miso.wizard.instantiate.modular.pattern.utils;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.Graph;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;
import MetaModelGraph.SubGraph;
import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInterface;
import dslPatterns.FeatureType;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.ReferenceInterface;
import dslPatterns.Variant;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.TypeFeatureRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;

public class GraphToModularityPattern {
	
	private Pattern eModularPattern;
	
	//Modular Pattern Notations
	private ClassInterface project;
	private ClassInterface pack;
	private ClassInterface unit;	
	
	//FeatureInterface
	private FeatureInterface iconInstance;
	private FeatureInterface extInstance;
	private FeatureInterface nameInstance;
	
	//ReferenceInterface
	private ReferenceInterface containmentReference;
	
	public GraphToModularityPattern(Pattern modularPattern) {
		
		this.eModularPattern = modularPattern;
		init();
	}	
	
	private void init() {
		
		ComplexFeatureMain rootPattern = this.eModularPattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant modularVariant = patternVariants.get(0);
		
		if(modularVariant instanceof ComplexFeatureMain){
			
			//Modularity Pattern
			ComplexFeatureMain defaultMainModularPattern = (ComplexFeatureMain) modularVariant; 
			PatternMetaModel mainModularPattern = defaultMainModularPattern.getMetaModel();
			
			//Modular Pattern Notations
			project = getClassInterfaceByName(mainModularPattern, "Project");
			pack = getClassInterfaceByName(mainModularPattern, "Package");
			unit = getClassInterfaceByName(mainModularPattern, "Unit");	
			
			//FeatureInterface
			iconInstance = getFeatureTypeByName(mainModularPattern,"icon");
			extInstance = getFeatureTypeByName(mainModularPattern,"extension");
			nameInstance = getFeatureTypeByName(mainModularPattern,"name");
			
			//ReferenceInterface
			containmentReference = getReferenceInterfaceByName(mainModularPattern,"containees");			
		}
		
	}

	public void tranformGraphToModularityPattern(Graph iGraph, PatternInstances patternInstances){
		
		
		Iterator<SubGraph> itSubgraph = iGraph.getSubgraph().iterator();
		while (itSubgraph.hasNext()) {
			SubGraph subGraph = (SubGraph) itSubgraph.next();
			Node rootNode = subGraph.getRoot();
			//Create Modular Pattern
			PatternInstance modularInstance = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catModularity, this.eModularPattern);
								
			//Add Project Class Role Instance
			ClassRoleInstance rootInstance = addClassRoleInstance(rootNode, modularInstance, project);
						
			//Add Modular Pattern to Applied Patterns
			patternInstances.getAppliedPatterns().add(modularInstance);			
			
			// list for packages and units
			EList<Node> visitedNodes = new BasicEList<Node>();
			visitedNodes.add(rootNode);
			
			//set packages and units
			setPackagesAndUnits(subGraph,modularInstance, rootNode,rootInstance,visitedNodes);			
								
			System.out.println("Transformation Graph to Runtime Patterns");
		}	
	}
			
	
	private void setPackagesAndUnits(SubGraph subGraph, PatternInstance patternInstance, Node rootNode, ClassRoleInstance rootInstance, EList<Node> visitedNodes) {
		
		Iterator<Composition> itComposition = rootNode.getCompositions().iterator();
		boolean pack = false;
		boolean unit = false;	
		Node currentNode = null;
		ClassRoleInstance parentRoleInstance = null;
				
		while (itComposition.hasNext()) {
			
			//Composition
			Composition composition = (Composition) itComposition.next();
			currentNode = composition.getTarget();
						
			if(visitedNodes.indexOf(currentNode)==-1){			
			
				//Package
				pack = isPackage(currentNode);
				if(pack == true){
					
					parentRoleInstance = addClassRoleInstance(currentNode,patternInstance,this.pack);
					addReferenceInstance(composition, rootInstance);
					
					visitedNodes.add(currentNode);
					// recursive
					setPackagesAndUnits(subGraph, patternInstance, currentNode, parentRoleInstance, visitedNodes);
				}
				
				//Unit
				unit = isUnit(currentNode);
				if(unit == true){
					
					addClassRoleInstance(currentNode,patternInstance,this.unit);
					addReferenceInstance(composition, rootInstance);				
				}
				
				//SubClasses
				/*
				 * if the class inherits from the root does not belong in the containment tree
				 */
				if(subGraph.getRoot().equals(currentNode) == false){				
					Iterator<SubClass> itSubClasses = composition.getTarget().getSubClasses().iterator();
					while (itSubClasses.hasNext()) {
						SubClass subClass = (SubClass) itSubClasses.next();
						currentNode = subClass.getTarget();
						
						if(visitedNodes.indexOf(currentNode)==-1){	
							
							visitedNodes.add(currentNode);
							//Package
							pack = isPackage(currentNode);
							if(pack == true){
								
								parentRoleInstance = addClassRoleInstance(currentNode,patternInstance,this.pack);
								addReferenceInstance(composition, rootInstance);
								
								// recursive
								setPackagesAndUnits(subGraph, patternInstance, currentNode, parentRoleInstance, visitedNodes);
							}
							
							//Unit
							unit = isUnit(currentNode);
							if(unit == true){
								
								addClassRoleInstance(currentNode,patternInstance,this.unit);
								addReferenceInstance(composition, rootInstance);				
							}							
						}
						else{
							// the node has been visited, so only the containment reference must be added
							//if the node is unit or package
							if(isUnitPackage(currentNode)==true)
								addReferenceInstance(composition, rootInstance);
						}
					}
				}
				
			}
			else{
				// the node has been visited, so only the containment reference must be added
				//if the node is unit or package
				if(isUnitPackage(currentNode)==true)
					addReferenceInstance(composition, rootInstance);
			}
		}
		
	}
	
	private boolean isUnitPackage(Node node){
		
		boolean result = isPackage(node);
		
		if(result==true)
			return result;
		else
			return isUnit(node);
	}
	
	private ClassRoleInstance addClassRoleInstance(Node node, PatternInstance patternInstance, ClassInterface classInterface) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(classInterface);
		classInstance.setElement(node.getEClass());
		
		// set icon
		InstanceFeatureRoleInstance feat = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		feat.setRole(iconInstance);
		feat.setValue(node.getIcon());
		classInstance.getFeatureInstances().add(feat);
		
		// set name
		TypeFeatureRoleInstance typeFeat = RuntimePatternsFactoryImpl.eINSTANCE.createTypeFeatureRoleInstance();
		typeFeat.setElement(node.getName());
		typeFeat.setRole((FeatureType) nameInstance);
		classInstance.getFeatureInstances().add(typeFeat);
		
		if(classInterface.equals(unit)){
			
			// set extension
			InstanceFeatureRoleInstance extFeat = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
			extFeat.setRole(extInstance);
			extFeat.setValue(node.getExtension());
			classInstance.getFeatureInstances().add(extFeat);
		}	
		
		patternInstance.getClassInstances().add(classInstance);
		
		return classInstance;
	}	
	
	private void addReferenceInstance(Composition composition, ClassRoleInstance rootInstance){
		
		// add containment reference
		ReferenceRoleInstance referenceContainee = RuntimePatternsFactoryImpl.eINSTANCE.createReferenceRoleInstance();
		referenceContainee.setRole(this.containmentReference);
		referenceContainee.setElement(composition.getEReference());
				
		rootInstance.getReferenceInstances().add(referenceContainee);		
		
	}
	
	private boolean isPackage(Node node){
		
		int index = node.getEnumModularNotation().indexOf(EnumModular.PACKAGE);
		
		if(index!=-1)
			return true;
		return false;
	}	
	
	private boolean isUnit(Node node){
	
		int index = node.getEnumModularNotation().indexOf(EnumModular.UNIT);
		
		if(index!=-1)
			return true;
		return false;
		
	}	

	private ClassInterface getClassInterfaceByName(PatternMetaModel mainModularPattern, String name){
		
		Iterator<ClassInterface> itClassInstances = mainModularPattern.getClassInterfaces().iterator();
		
		while (itClassInstances.hasNext()) {
			
			ClassInterface classRoleInstance = itClassInstances.next();
			EClass eClass = ((ClassInterface) classRoleInstance).getRef().get(0);
			
			if(eClass.getName().equals(name))
				return ((ClassInterface) classRoleInstance);						
		}
		
		return null;
	}
	
	
	private FeatureInterface getFeatureTypeByName(PatternMetaModel modularPattern, String name){
		
		Iterator<FeatureInterface> itFeatInstances = modularPattern.getAttrInterfaces().iterator();
		while (itFeatInstances.hasNext()) {
			FeatureInterface featureInterface = (FeatureInterface) itFeatInstances.next();
			
			EAttribute eAttribute = featureInterface.getRef().get(0);
				if(eAttribute.getName().equals(name))
					return featureInterface;	
		}	
		
		return null;
	} 
	
	
	private ReferenceInterface getReferenceInterfaceByName(PatternMetaModel modularPattern, String name){
		
		Iterator<ReferenceInterface> itRefInterfaces = modularPattern.getRefInterfaces().iterator();
		while (itRefInterfaces.hasNext()) {
			
			ReferenceInterface refInterface = itRefInterfaces.next();
			EReference eReference = refInterface.getRef();
			
				if(eReference.getName().equals(name))
					return refInterface;			
		}		
		
		return null;
	}	
	
}
