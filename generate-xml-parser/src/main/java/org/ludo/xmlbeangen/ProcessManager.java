/*
 * Projet   : Generator
 * Package  : generator.core
 * Source   : GenerationManager.java
 * CrÃ©ation : CHABOUD   Date : 29 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- DerniÃ¨re mise Ã  jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.xmlbeangen;


import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;
import org.ludo.xmlbeangen.generer.Generer;
import org.ludo.xmlbeangen.generer.GenererManager;
import org.ludo.xmlbeangen.template.Template;
import org.ludo.xmlbeangen.template.TemplateManager;
import org.ludo.xmlbeangen.xml.Noeud;
import org.ludo.xmlbeangen.xml.Xml;
import org.ludo.xmlbeangen.xml.config.XmlManager;
import org.ludo.xmlbeangen.xmlmodele.XmlModele;
import org.ludo.xmlbeangen.xmlmodele.XmlModeleManager;
import org.ludo.xmlbeangen.xmlmodele.XmlModeles;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class ProcessManager {
    
    private static Logger log = LoggerManager.getLogger(ProcessManager.class);
    
    private String nomFichierConfiguration = null;
    private XmlModeleManager xmlModeleManager = null;
    private TemplateManager templateManager = null;
    private GenererManager genererManager = null;
    
    public ProcessManager(String nomFichierConfiguration) {
        this.nomFichierConfiguration = nomFichierConfiguration;
        xmlModeleManager = XmlModeleManager.getXmlModeleManager(nomFichierConfiguration);
        log.debug("xmlModeleManager = "+xmlModeleManager);
        templateManager = TemplateManager.getTemplateManager(nomFichierConfiguration);
        log.debug("templateManager = "+templateManager);
        genererManager = GenererManager.getGenererManager(nomFichierConfiguration);
        log.debug("genererManager = "+genererManager);
    }
    
    public void process() throws Exception {
        try {
            Velocity.init();
            XmlModeleManager xmlModeleManager = XmlModeleManager.getXmlModeleManager(nomFichierConfiguration);
            XmlModeles xmlModeles = xmlModeleManager.getXmlModeles();
            for( Iterator iterXmlModele = xmlModeles.getListeXmlModele().iterator(); iterXmlModele.hasNext(); ) {
            	XmlModele xmlModele = (XmlModele) iterXmlModele.next();
            	String nomFichierComplet = 
            		xmlModeles.getPath() + "/" + xmlModele.getFichier();
            	process(xmlModele, nomFichierComplet);
            }
        } catch(Exception e) {
            log.debug(this,e);
            throw e;
        }
    }
    
    public void process(XmlModele xmlModele, String nomFichierCompletXmlModele) throws Exception {
        try {
	    	XmlManager xmlManager = XmlManager.getXmlManager(nomFichierCompletXmlModele);
	    	genererFichier(xmlModele, xmlManager.getXml());
	    } catch(Exception e) {
	        log.debug(this,e);
	        throw e;
	    }
    }
    
    public void genererFichier(XmlModele xmlModele, Xml xml) throws Exception {
    	AssertHelper.assertNotNullArgument(xmlModele, "xmlModele", "genererFichier");
    	AssertHelper.assertNotNullArgument(xml, "xml", "genererFichier");
    	if( xml.getNoeud() == null ) {
    		return;
    	}
    	Noeud noeud = xml.getNoeud();
    	xmlModele.setNom(noeud.getNomToutMinuscule());
    	// GÃ©nÃ©rer les fichiers liÃ©s au xml
        Generer generer = genererManager.getGenerer("Xml");
        for(Iterator iterNomTemplate = generer.getListeNomTemplate().iterator(); iterNomTemplate.hasNext(); ) {
            String nomTemplate = (String) iterNomTemplate.next(); 
            Template template = templateManager.getTemplates().getTemplate(nomTemplate);
            genererFichier(xmlModele, template, noeud);
        }
    	// Appel rÃ©cursif pour gÃ©nÃ©rer les fichiers des noeuds fils
   		genererFichiers(xmlModele, noeud.getListeNoeud());
    }
    
    public void genererFichiers(XmlModele xmlModele, Noeud noeud) throws Exception {
    	// GÃ©nÃ©rer les fichiers liÃ©s au noeud
        Generer generer = genererManager.getGenerer("Noeud");
        for(Iterator iterNomTemplate = generer.getListeNomTemplate().iterator(); iterNomTemplate.hasNext(); ) {
            String nomTemplate = (String) iterNomTemplate.next(); 
            Template template = templateManager.getTemplates().getTemplate(nomTemplate);
            genererFichier(xmlModele, template, noeud);
        }
    	// Appel rÃ©cursif pour gÃ©nÃ©rer les fichiers des noeuds fils
   		genererFichiers(xmlModele, noeud.getListeNoeud());
    }
    
    public void genererFichiers(XmlModele xmlModele, List listeNoeud) throws Exception {
    	// Appel rÃ©cursif pour gÃ©nÃ©rer les fichiers des noeuds fils
    	for( Iterator iterNoeud = listeNoeud.iterator(); iterNoeud.hasNext(); ) {
    		Noeud noeud = (Noeud) iterNoeud.next();
    		genererFichiers(xmlModele, noeud);
    	}
    }
    
    private void genererFichier(XmlModele xmlModele, Template template, Noeud noeud) throws ResourceNotFoundException, ParseErrorException, MethodInvocationException, Exception {
        String nomFichierTemplate = 
		            templateManager.getTemplates().getRepertoireEntree()
		    + "/" + template.getNomFichierTemplate();
		log.debug("nomFichierTemplate = "+nomFichierTemplate);
		String nomRepertoireSortie =
		            templateManager.getTemplates().getRepertoireSortie()
		    + "/" + templateManager.getTemplates().getPackageBase().replaceAll("\\.", "/")
		    + "/" + xmlModele.getNom().replaceAll("\\.", "/")
		    + "/" + template.getNomSousRepertoireSortie();
		String nomFichierSortie = 
		            nomRepertoireSortie
		    + "/" + template.getNomFichierSortie().replaceAll("XXX", noeud.getNomAvecMajuscule());
		log.debug("nomFichierSortie = "+nomFichierSortie);
		String nomPackage =
		            templateManager.getTemplates().getPackageBase()
		    + "." + xmlModele.getNom()
		    + "." + template.getNomSousPackage();
		log.debug("nomPackage = "+nomPackage);
		
		VelocityContext context = new VelocityContext();
        context.put("noeud", noeud);
        context.put("template", template);
        context.put("xmlModele", xmlModele);
        context.put("package", templateManager.getTemplates().getPackageBase());
        context.put("NOMBRE_NOEUD_ILLIMITE", Noeud.NOMBRE_NOEUD_ILLIMITE_INTEGER);
        
        StringWriter w = new StringWriter();
        Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, w );
        System.out.println("out = "+w);
        
        File repSortie = new File(nomRepertoireSortie);
        repSortie.mkdirs();
        FileWriter file = new FileWriter(new File(nomFichierSortie));
        Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, file );
        file.flush();
        file.close();
        
    }


}
