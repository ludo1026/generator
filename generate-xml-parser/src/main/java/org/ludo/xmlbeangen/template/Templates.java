/*
 * Projet   : Generator
 * Package  : generator.core.template
 * Source   : Templates.java
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
package org.ludo.xmlbeangen.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.ludo.utils.LoggerManager;





/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Templates {
    
    private static Logger log = LoggerManager.getLogger(Templates.class);
    
    private String repertoireEntree = null;
    private String repertoireSortie = null;
    private String packageBase = null;
    private List listeTemplates = new ArrayList();
    
    public void addTemplate(Template t) {
        listeTemplates.add(t);
    }
    
    public List getListeTemplates() {
        return listeTemplates;
    }
    
    public Template getTemplate(String nomTemplate) {
        log.debug("getTemplate : nomTemplate = "+nomTemplate);
        for(Iterator iter = listeTemplates.iterator(); iter.hasNext(); ) {
            Template template = (Template) iter.next();
            if(template.getNomTemplate().equals(nomTemplate)) {
                return template;
            }
        }
        throw new IllegalStateException("Le template n'est pas dÃ©fini : nom template = "+nomTemplate);
    }
    
    public String getRepertoireEntree() {
        return repertoireEntree;
    }
    public void setRepertoireEntree(String repertoireEntree) {
        this.repertoireEntree = repertoireEntree;
    }
    public String getRepertoireSortie() {
        return repertoireSortie;
    }
    public void setRepertoireSortie(String repertoireSortie) {
        this.repertoireSortie = repertoireSortie;
    }
    public String getPackageBase() {
        return packageBase;
    }
    public void setPackageBase(String packageBase) {
        this.packageBase = packageBase;
    }
}
