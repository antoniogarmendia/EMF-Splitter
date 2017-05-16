package org.uam.eps.miso.diagram.editor.mobile.rest;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.util.Iterator;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIConverter.WriteableOutputStream;
import org.glassfish.jersey.client.ClientConfig;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import graphic_representation.GraphicRepresentation;
import graphic_representation.Representation;
import graphic_representation.RepresentationDD;
import mobile_server.EcoreMD;
import mobile_server.JSONMobile;
import mobile_server.Palette;
import mobile_server.diagram_editor.Diagram;
import mobile_server.diagram_editor.JSONDiagram;
import mobile_server.diagram_editor.impl.Diagram_editorFactoryImpl;
import mobile_server.impl.Mobile_serverFactoryImpl;
import splitterLibrary.EcoreEMF;

public class DiagramEditorServer {
	
	public static String pathMM = "ecores";
	public static String pathGR = "palettes";
	public static String pathDiagrams = "diagrams";
	
	private JSONObject jsonMM;
	private JSONObject jsonGR;
	private JSONObject jsonDiagrams;
	
	public DiagramEditorServer()
	{	
		jsonMM = null;
		jsonGR = null;
		jsonDiagrams = null;
	}

	private URI getBaseURI(){
		return UriBuilder.fromUri("http://diagrameditorserver.herokuapp.com").build();		
	}

	public JSONObject getJsonMM() {
		
		if(jsonMM==null)
			jsonMM = getRestDiagram(pathMM);
		
		return jsonMM;
	}
	
	public JSONObject getJsonGR() {
			
		if(jsonGR==null)
			jsonGR = getRestDiagram(pathGR);
		
		return jsonGR;
	}

	public JSONObject getJsonDiagrams() {
		
		if(jsonDiagrams==null)
			jsonDiagrams = getRestDiagram(pathDiagrams);
		
		return jsonDiagrams;
	}
	
	private JSONObject getRestDiagram(String path)
	{
		JSONObject result = null;
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		
		Response response =  target.path(path).
						     queryParam("json", "true").
						     request().
						     accept(MediaType.TEXT_PLAIN).
						     get(Response.class);
		
		if(response.getStatus() == 200)
		{
			String mm = target.path(path).
					     queryParam("json", "true").
					     request().
					     accept(MediaType.APPLICATION_JSON).
					     get(String.class);
			
			 try {
				 result = (JSONObject) new JSONParser().parse(mm);	
				 client.close();
				 System.out.println("Json Meta-models");
				 return result;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		else
			System.out.println(response.toString());			
		
		return null;
	}
	
	public JSONMobile getJSONMobile()
	{
		getJsonMM();
		getJsonGR();
		//Map<String,String> listGR = GRMap();
		
		JSONMobile ecores = Mobile_serverFactoryImpl.eINSTANCE.createJSONMobile();
		Iterator<?> itObjects = jsonMM.keySet().iterator();
		while (itObjects.hasNext()) {
			Object key = itObjects.next();
			Object value = jsonMM.get(key);
			if(value instanceof JSONArray)
			{
				JSONArray json_value = (JSONArray)value;
				Iterator<?> itjson_value = json_value.iterator();
				while (itjson_value.hasNext()) {
					Object objectjsonEcore = (Object) itjson_value.next();
					if(objectjsonEcore instanceof JSONObject)
					{
						JSONObject jsonObjectEcore = (JSONObject)objectjsonEcore;
						Object objName = jsonObjectEcore.get("name");
						Object objContent = jsonObjectEcore.get("content");
						Object objnsURI = jsonObjectEcore.get("URI");
						EcoreMD ecoreMD = Mobile_serverFactoryImpl.eINSTANCE.createEcoreMD();
						ecoreMD.setName((String)objName);
						ecoreMD.setContent((String)objContent);
						ecoreMD.setUri((String)objnsURI);
						ecoreMD.getListPalette().addAll(getPalettesByEcore(ecoreMD.getUri()));
						ecores.getListEcores().add(ecoreMD);							
					}						
				}					
			}			
		}	
		
		return ecores;
	}
	
	public EList<Palette> getPalettesByEcore(String nsURI)
	{
		EList<Palette> listPalettes = new BasicEList<Palette>();
		Iterator<?> itObjects = getJsonGR().keySet().iterator();
		
		while (itObjects.hasNext()) {
			
			Object object = (Object) itObjects.next();
			Object value = getJsonGR().get(object);
			if(value instanceof JSONArray)
			{
				JSONArray json_value = (JSONArray)value;
				Iterator<?> itjson_value = json_value.iterator();
				while (itjson_value.hasNext()) {
					Object objectjsonGR = (Object) itjson_value.next();
					if(objectjsonGR instanceof JSONObject)
					{
						JSONObject jsonObjectGR = (JSONObject)objectjsonGR;
						Object objURI = jsonObjectGR.get("ecoreURI");
						if(((String)objURI).equals(nsURI))
						{
							Palette pal = new Mobile_serverFactoryImpl().createPalette();
							pal.setName((String)jsonObjectGR.get("name"));
							pal.setContent((String)jsonObjectGR.get("content"));
							pal.setEcoreURI((String)objURI);
							pal.setExtension((String)jsonObjectGR.get("extension"));
							pal.setVersion(((Long)jsonObjectGR.get("version")));
							listPalettes.add(pal);
						}
					}					
				}
			}			
		}		
		return listPalettes;
	}
	
	public JSONDiagram getJSONDiagram()
	{
		getJsonMM();
		getJsonGR();
		getJsonDiagrams();
		JSONDiagram diagram = Diagram_editorFactoryImpl.eINSTANCE.createJSONDiagram();
		Iterator<?> itObjects = jsonDiagrams.keySet().iterator();
		while (itObjects.hasNext()) {
			Object key = itObjects.next();
			Object value = jsonDiagrams.get(key);
			if(value instanceof JSONArray)
			{
				JSONArray json_value = (JSONArray)value;
				Iterator<?> itjson_value = json_value.iterator();
				while (itjson_value.hasNext()) {
					Object objectjsonDiagram = (Object) itjson_value.next();
					if(objectjsonDiagram instanceof JSONObject)
					{
						JSONObject jsonObjectDiagram = (JSONObject)objectjsonDiagram;
						Object objName = jsonObjectDiagram.get("name");
						Object objDate = jsonObjectDiagram.get("dateString");
						Object objPreview = jsonObjectDiagram.get("imageString");
						Object objContent = jsonObjectDiagram.get("content");
						Object objExtension = jsonObjectDiagram.get("paletteExtension");
						Diagram diag = Diagram_editorFactoryImpl.eINSTANCE.createDiagram();
						diag.setName((String)objName);
						diag.setDate((String)objDate);
						diag.setPreviewImageString((String)objPreview);
						diag.setContent((String)objContent);
						diag.setExtension((String)objExtension);
						diag.setAnPalette(getPaletteByExtension((String)objExtension));
						diagram.getList_diagrams().add(diag);
					}						
				}					
			}			
		}	
		
		return diagram;
	}
	
	public Palette getPaletteByExtension(String extension)
	{
		Iterator<EcoreMD> it = getJSONMobile().getListEcores().iterator();
		while (it.hasNext()) {
			EcoreMD ecoreMD = (EcoreMD) it.next();
			Iterator<Palette> palettes = ecoreMD.getListPalette().iterator();
			while (palettes.hasNext()) {
				Palette palette = (Palette) palettes.next();
				if(palette.getExtension().equals(extension))
					return palette;
			}
		}
		return null;
	}
	
	public boolean PostEcoreInit(EcoreEMF ecore)
	{
		if(PostEcore(ecore) == 200)
			return true;
		else
			return false;
	}
	
	public boolean PostGraphicRepresentationInit(Resource graph)
	{
		if(PostGraphicRepresentation(graph) == 200)
			return true;
		else
			return false;
	}	
	
	public int PostEcore(EcoreEMF ecore)
	{
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
					
		Form formEcore = PostEcoreForm(ecore);
		
		Response response =  target.path(pathMM).
						     queryParam("json", "true").request().post(Entity.form(formEcore));  
						     
		if (response.getStatus() == 200) {
			
			System.out.println("Success post Ecore");
		}
		else
		{
			System.out.println(response.getStatusInfo().toString());
		}
		
		return response.getStatus();
	}
	
	public int PostGraphicRepresentation(Resource graph) {
		
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		
		Form formGraphic = PostGraphicRepresentationForm(graph);
		
		Response response =  target.path(pathGR).
			     	queryParam("json", "true").request().post(Entity.form(formGraphic));
		
		if (response.getStatus() == 200) {
			
			System.out.println("Success Post Graphic Representation");
		}
		else
		{
			//To-DO
		}	
		
		return response.getStatus();
	}
	
	public boolean PostEcoreGraphicRepresentation(EcoreEMF ecore, Resource graphic)
	{
		PostEcoreInit(ecore);
		PostGraphicRepresentationInit(graphic);		
		return true;
	}
	
	public Form PostEcoreForm(EcoreEMF ecore)
	{
		StringWriter writer = new StringWriter();
		WriteableOutputStream writeable = new URIConverter.WriteableOutputStream(writer, "UTF-8");
		
		try {
			ecore.getRs().save(writeable, null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Form form = new Form();
		form.param("name", new Path(ecore.getRs().getURI().devicePath()).removeFileExtension().lastSegment());
		form.param("content", writer.getBuffer().toString());
		form.param("uri", ecore.GetRootPackage().getNsURI());
		
		return form;
	}
	
	public Form PostGraphicRepresentationForm(Resource graphic)
	{
		StringWriter writer = new StringWriter();
		WriteableOutputStream writeable = new URIConverter.WriteableOutputStream(writer, "UTF-8");
		
		try {
			graphic.save(writeable, null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Form form = new Form();
		form.param("name", new Path(graphic.getURI().devicePath()).removeFileExtension().lastSegment());
		form.param("content", writer.getBuffer().toString());
		form.param("version","2");
		form.param("ecoreURI", getEcoreUriFromGraphicR(graphic));
		form.param("extension", ((GraphicRepresentation)graphic.getContents().get(0)).getAllGraphicRepresentation().get(0).getExtension());
		
		return form;
	}

	private String getEcoreUriFromGraphicR(Resource graphic) {
		// TODO Auto-generated method stub
		Iterator<Representation> repre = ((GraphicRepresentation)graphic.getContents().get(0)).getAllGraphicRepresentation().get(0).
															getListRepresentations().iterator();
		while (repre.hasNext()) {
			Representation representation = (Representation) repre.next();
			if(representation instanceof RepresentationDD)
			{
				return ((RepresentationDD) representation).getRoot().getAnEClass().getEPackage().getNsURI();
			}
		}
		return "null";
	}
}
