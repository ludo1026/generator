/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : StereotypeAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IAttribut;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;

import org.ludo.codegenerator.core.gen.bean.abst.IStereotypeAbstract;

/**
 * <b>Description :</b>
 */
public class StereotypeAbstractBean implements IStereotypeAbstract, Serializable {
    
	private java.lang.String nom;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype;
	private List listeAttribut = new ArrayList();
	private List listeClasse = new ArrayList();
	private ITemplateGeneration templateGeneration;

    public java.lang.String getNom() {
        return nom;
    }
    
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype getGenStereotype() {
        return genStereotype;
    }
    
    public void setGenStereotype(org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype) {
        this.genStereotype = genStereotype;
    }
	

    public List getAttribut() {
        return listeAttribut;
    }
    
    public void addAttribut(IAttribut attribut) {
        this.listeAttribut.add(attribut);
    }

    public List getClasse() {
        return listeClasse;
    }
    
    public void addClasse(IClasse classe) {
        this.listeClasse.add(classe);
    }

    public ITemplateGeneration getTemplateGeneration() {
        return templateGeneration;
    }
    
    public void setTemplateGeneration(ITemplateGeneration templateGeneration) {
        this.templateGeneration = templateGeneration;
    }

}
