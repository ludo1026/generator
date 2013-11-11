/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : IClasseAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IAttribut;
import org.ludo.codegenerator.core.gen.bean.IMethode;
import org.ludo.codegenerator.core.gen.bean.IStereotype;
import org.ludo.codegenerator.core.gen.bean.IAssociation;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;

/**
 * <b>Description :</b>
 * @zone-debut:{#1}
 * @zone-fin:{#1}
 */
public interface IClasseAbstract extends Serializable {

    public java.lang.String getNom();
    
    public void setNom(java.lang.String nom);
	
    public java.lang.String getGenId();
    
    public void setGenId(java.lang.String genId);
	
    public java.lang.String getNomPackage();
    
    public void setNomPackage(java.lang.String nomPackage);
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse getGenClasse();
    
    public void setGenClasse(org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse);
	

    public List getAttribut();
    
    public void addAttribut(IAttribut attribut);

    public List getMethode();
    
    public void addMethode(IMethode methode);

    public List getStereotype();
    
    public void addStereotype(IStereotype stereotype);

    public List getAssociation();
    
    public void addAssociation(IAssociation association);

    public List getTemplateGeneration();
    
    public void addTemplateGeneration(ITemplateGeneration templateGeneration);

}
