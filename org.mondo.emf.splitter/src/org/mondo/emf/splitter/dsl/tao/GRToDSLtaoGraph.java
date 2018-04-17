package org.mondo.emf.splitter.dsl.tao;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import MetaModelGraph.Graph;
import MetaModelGraph.Node;
import MetaModelGraph.SubGraph;
import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInterface;
import dslPatterns.FeatureType;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.Variant;
import graphic_representation.GraphicRepresentation;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.TypeFeatureRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;

public class GRToDSLtaoGraph {
	
	private Pattern eGraphBasedPattern;
	
	//Modular Pattern Notations
	private ClassInterface diagram;
	private ClassInterface node;
	private ClassInterface edge;	
	
	//FeatureInterface
	private FeatureInterface source;
	private FeatureInterface target;
	private FeatureInterface label;
	
	
	public GRToDSLtaoGraph(Pattern eGraphBasedPattern) {
		
		this.eGraphBasedPattern = eGraphBasedPattern;
		init();
	}


	private void init() {
		ComplexFeatureMain rootPattern = this.eGraphBasedPattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant modularVariant = patternVariants.get(0);
		
		if(modularVariant instanceof ComplexFeatureMain) {
			//Graph-Representation Pattern
			ComplexFeatureMain defaultMainGbPattern = (ComplexFeatureMain) modularVariant; 
			PatternMetaModel mainGbPattern = defaultMainGbPattern.getMetaModel();
			
			//Graph Based Pattern Notations
			diagram = getClassInterfaceByName(mainGbPattern, "Diagram");
			
		}
	}
	
	public void tranformGRToGraphBasedPattern(GraphicRepresentation graph, PatternInstances patternInstances){
		
		
		Iterator<MMGraphic_Representation> itMMGraphic_Representation = graph.getAllGraphicRepresentation().iterator();
		while (itMMGraphic_Representation.hasNext()) {
			MMGraphic_Representation gR = (MMGraphic_Representation) itMMGraphic_Representation.next();
			Iterator<Representation> itRepresentations = gR.getListRepresentations().iterator();
			
			while (itRepresentations.hasNext()) {
				Representation representation = (Representation) itRepresentations.next();
				if (representation instanceof RepresentationDD) {
					Root root = ((RepresentationDD) representation).getRoot();
					//Create Graph Based Pattern
					PatternInstance gbInstance = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catGraphRepresentation, this.eGraphBasedPattern);									
					//Add Project Class Role Instance
					ClassRoleInstance rootInstance = addClassRoleInstance(root, gbInstance, diagram);
					
					//Add Modular Pattern to Applied Patterns
					patternInstances.getAppliedPatterns().add(gbInstance);	
				}
			}					
								
			System.out.println("Transformation Graph to Runtime Patterns");
		}	
	}
	
	private ClassRoleInstance addClassRoleInstance(Root root, PatternInstance patternInstance, ClassInterface classInterface) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(classInterface);
		classInstance.setElement(root.getAnEClass());
			
		patternInstance.getClassInstances().add(classInstance);
		
		return classInstance;		
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
	

}
