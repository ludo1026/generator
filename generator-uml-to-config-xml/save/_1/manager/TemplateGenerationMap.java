package org.ludo.codegenerator.core.gen.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.utils.AssertHelper;

public class TemplateGenerationMap {
	
	public static class Manager {
		
		private List listeTemplateGeneration = null;
		private TemplateGenerationMap templateGenerationMap = null;
		
		public static TemplateGenerationMap getNewTemplateGenerationMap(List listeTemplateGeneration) {
			AssertHelper.assertNotNullArgument(listeTemplateGeneration, "liste des objets TemplateGeneration");
			for(Iterator iterTemplateGeneration = listeTemplateGeneration.iterator(); iterTemplateGeneration.hasNext(); ) {
				Object object = iterTemplateGeneration.next();
				AssertHelper.assertDefined(object, "objet TemplateGeneration");
				AssertHelper.assertInstanceOf(object, ITemplateGeneration.class, "objet TemplateGeneration");
			}
			TemplateGenerationMap templateGenerationMap = buildTemplateGenerationMap(listeTemplateGeneration);
			return templateGenerationMap;
		}
		
		private static TemplateGenerationMap buildTemplateGenerationMap(List listeTemplateGeneration) {
			TemplateGenerationMap templateGenerationMap = new TemplateGenerationMap();
			buildNomElementGenereParNomTemplateEtClasse(templateGenerationMap, listeTemplateGeneration);
			buildNomElementGenereParNomTemplateEtStereotype(templateGenerationMap, listeTemplateGeneration);
			return templateGenerationMap;
		}
	    
		private static void buildNomElementGenereParNomTemplateEtClasse(TemplateGenerationMap templateGenerationMap, List listeTemplateGeneration) {
	    	for(Iterator iterTemplateGeneration = listeTemplateGeneration.iterator(); iterTemplateGeneration.hasNext(); ) {
	    		ITemplateGeneration templateGeneration = (ITemplateGeneration) iterTemplateGeneration.next();
	    		if( templateGeneration.getGenClasse() != null ) {
	    			templateGenerationMap
	    				.putByClasse(
	    					templateGeneration.getGenTemplate().getNom(),
	    					templateGeneration.getGenClasse(),
	    					templateGeneration
	    				);
	    		}
	    	}
	    }

		private static void buildNomElementGenereParNomTemplateEtStereotype(TemplateGenerationMap templateGenerationMap, List listeTemplateGeneration) {
	    	for(Iterator iterTemplateGeneration = listeTemplateGeneration.iterator(); iterTemplateGeneration.hasNext(); ) {
	    		ITemplateGeneration templateGeneration = (ITemplateGeneration) iterTemplateGeneration.next();
	    		if( templateGeneration.getGenStereotype() != null ) {
	    			templateGenerationMap
						.putByStereotype(
	    					templateGeneration.getGenTemplate().getNom(),
	    					templateGeneration.getGenStereotype(),
	    					templateGeneration
	    				);
	    		}
	    	}
	    }
	}
	
	private static final String SEPARATOR = "²";
	
	private static class Cle {
		private final String cle;
		public String getCle() { return cle; }
		private final String nomTemplate;
		private final String classeGenId;
		private final String stereotypeNom;
		private String buildCle() {
			return nomTemplate + SEPARATOR + classeGenId + SEPARATOR + stereotypeNom;
		}
		public String toString() {
			return this.cle;
		}
		private Cle(String nomTemplate, String classeGenId, String stereotypeNom) {
			this.nomTemplate = nomTemplate;
			this.classeGenId = classeGenId;
			this.stereotypeNom = stereotypeNom;
			this.cle = buildCle();
		}
		public static Cle getNewCleByClasseGenId(String nomTemplate, String classeGenId) {
			return new Cle(nomTemplate, classeGenId, "");
		}
		public static Cle getNewCleByClasse(String nomTemplate, GenClasse classe) {
			return new Cle(nomTemplate, classe.getGenId(), "");
		}
		public static Cle getNewCleByStereotypeNom(String nomTemplate, String stereotypeNom) {
			return new Cle(nomTemplate, "", stereotypeNom);
		}
		public static Cle getNewCleByStereotype(String nomTemplate, GenStereotype stereotype) {
			return new Cle(nomTemplate, "", stereotype.getNom());
		}
	}
	
	private java.util.Map mapNomElementGenere = new HashMap();
		
	public void putByClasseGenId(String nomTemplate, String classeGenId, ITemplateGeneration templateGeneration) {
		String cle = Cle.getNewCleByClasseGenId(nomTemplate, classeGenId).toString();
		mapNomElementGenere.put(cle, templateGeneration);
	}
	
	public void putByClasse(String nomTemplate, GenClasse classe, ITemplateGeneration templateGeneration) {
		String cle = Cle.getNewCleByClasse(nomTemplate, classe).toString();
		mapNomElementGenere.put(cle, templateGeneration);
	}
	
	public void putByNomStereotype(String nomTemplate, String stereotypeNom, ITemplateGeneration templateGeneration) {
		List listeTemplateGeneration = getByStereotypeNom(nomTemplate, stereotypeNom);
		if( listeTemplateGeneration == null ) {
			listeTemplateGeneration = new ArrayList();
		}
		listeTemplateGeneration.add(templateGeneration);
		String cle = Cle.getNewCleByStereotypeNom(nomTemplate, stereotypeNom).toString();
		mapNomElementGenere.put(cle, listeTemplateGeneration);
	}
	
	public void putByStereotype(String nomTemplate, GenStereotype stereotype, ITemplateGeneration templateGeneration) {
		List listeTemplateGeneration = getByStereotype(nomTemplate, stereotype);
		if( listeTemplateGeneration == null ) {
			listeTemplateGeneration = new ArrayList();
		}
		listeTemplateGeneration.add(templateGeneration);
		String cle = Cle.getNewCleByStereotype(nomTemplate, stereotype).toString();
		mapNomElementGenere.put(cle, listeTemplateGeneration);
	}
	
	public ITemplateGeneration getByClasseGenId(String nomTemplate, String classeGenId) {
		String cle = Cle.getNewCleByClasseGenId(nomTemplate, classeGenId).toString();
		return (ITemplateGeneration) mapNomElementGenere.get(cle);
	}
	
	public ITemplateGeneration getByClasse(String nomTemplate, GenClasse classe) {
		String cle = Cle.getNewCleByClasse(nomTemplate, classe).toString();
		return (ITemplateGeneration) mapNomElementGenere.get(cle);
	}
	
	public List getByStereotypeNom(String nomTemplate, String stereotypeNom) {
		String cle = Cle.getNewCleByStereotypeNom(nomTemplate, stereotypeNom).toString();
		return (List) mapNomElementGenere.get(cle);
	}
	
	public List getByStereotype(String nomTemplate, GenStereotype stereotype) {
		String cle = Cle.getNewCleByStereotype(nomTemplate, stereotype).toString();
		return (List) mapNomElementGenere.get(cle);
	}
	
}
