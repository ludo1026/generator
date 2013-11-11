/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : ClasseAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IAttribut;
import org.ludo.codegenerator.core.gen.bean.IMethode;
import org.ludo.codegenerator.core.gen.bean.IStereotype;
import org.ludo.codegenerator.core.gen.bean.IAssociation;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;

import org.ludo.codegenerator.core.gen.bean.abst.IClasseAbstract;

/**
 * <b>Description :</b>
 */
public class ClasseAbstractBean implements IClasseAbstract, Serializable {
    
	private java.lang.String nom;
	private java.lang.String genId;
	private java.lang.String nomPackage;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse;
	private List listeAttribut = new ArrayList();
	private List listeMethode = new ArrayList();
	private List listeStereotype = new ArrayList();
	private List listeAssociation = new ArrayList();
	private List listeTemplateGeneration = new ArrayList();

    public java.lang.String getNom() {
        return nom;
    }
    
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }
	
    public java.lang.String getGenId() {
        return genId;
    }
    
    public void setGenId(java.lang.String genId) {
        this.genId = genId;
    }
	
    public java.lang.String getNomPackage() {
        return nomPackage;
    }
    
    public void setNomPackage(java.lang.String nomPackage) {
        this.nomPackage = nomPackage;
    }
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse getGenClasse() {
        return genClasse;
    }
    
    public void setGenClasse(org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse) {
        this.genClasse = genClasse;
    }
	

    public List getAttribut() {
        return listeAttribut;
    }
    
    public void addAttribut(IAttribut attribut) {
        this.listeAttribut.add(attribut);
    }

    public List getMethode() {
        return listeMethode;
    }
    
    public void addMethode(IMethode methode) {
        this.listeMethode.add(methode);
    }

    public List getStereotype() {
        return listeStereotype;
    }
    
    public void addStereotype(IStereotype stereotype) {
        this.listeStereotype.add(stereotype);
    }

    public List getAssociation() {
        return listeAssociation;
    }
    
    public void addAssociation(IAssociation association) {
        this.listeAssociation.add(association);
    }

    public List getTemplateGeneration() {
        return listeTemplateGeneration;
    }
    
    public void addTemplateGeneration(ITemplateGeneration templateGeneration) {
        this.listeTemplateGeneration.add(templateGeneration);
    }

}
