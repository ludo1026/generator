/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : TemplateGenerationAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;

import org.ludo.codegenerator.core.gen.bean.abst.ITemplateGenerationAbstract;

/**
 * <b>Description :</b>
 */
public class TemplateGenerationAbstractBean implements ITemplateGenerationAbstract, Serializable {
    
	private java.lang.String nomElementGenere;
	private java.lang.String nomPackage;
	private java.lang.String nomFichierTemplate;
	private java.lang.String nomRepertoireSortie;
	private java.lang.String nomFichierSortie;
	private int typeTemplateGeneration;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate genTemplate;

    public java.lang.String getNomElementGenere() {
        return nomElementGenere;
    }
    
    public void setNomElementGenere(java.lang.String nomElementGenere) {
        this.nomElementGenere = nomElementGenere;
    }
	
    public java.lang.String getNomPackage() {
        return nomPackage;
    }
    
    public void setNomPackage(java.lang.String nomPackage) {
        this.nomPackage = nomPackage;
    }
	
    public java.lang.String getNomFichierTemplate() {
        return nomFichierTemplate;
    }
    
    public void setNomFichierTemplate(java.lang.String nomFichierTemplate) {
        this.nomFichierTemplate = nomFichierTemplate;
    }
	
    public java.lang.String getNomRepertoireSortie() {
        return nomRepertoireSortie;
    }
    
    public void setNomRepertoireSortie(java.lang.String nomRepertoireSortie) {
        this.nomRepertoireSortie = nomRepertoireSortie;
    }
	
    public java.lang.String getNomFichierSortie() {
        return nomFichierSortie;
    }
    
    public void setNomFichierSortie(java.lang.String nomFichierSortie) {
        this.nomFichierSortie = nomFichierSortie;
    }
	
    public int getTypeTemplateGeneration() {
        return typeTemplateGeneration;
    }
    
    public void setTypeTemplateGeneration(int typeTemplateGeneration) {
        this.typeTemplateGeneration = typeTemplateGeneration;
    }
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype getGenStereotype() {
        return genStereotype;
    }
    
    public void setGenStereotype(org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype) {
        this.genStereotype = genStereotype;
    }
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse getGenClasse() {
        return genClasse;
    }
    
    public void setGenClasse(org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse) {
        this.genClasse = genClasse;
    }
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate getGenTemplate() {
        return genTemplate;
    }
    
    public void setGenTemplate(org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate genTemplate) {
        this.genTemplate = genTemplate;
    }
	

}
