/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : ITemplateGenerationAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;

/**
 * <b>Description :</b>
 */
public interface ITemplateGenerationAbstract extends Serializable {

    public java.lang.String getNomElementGenere();
    
    public void setNomElementGenere(java.lang.String nomElementGenere);
	
    public java.lang.String getNomPackage();
    
    public void setNomPackage(java.lang.String nomPackage);
	
    public java.lang.String getNomFichierTemplate();
    
    public void setNomFichierTemplate(java.lang.String nomFichierTemplate);
	
    public java.lang.String getNomRepertoireSortie();
    
    public void setNomRepertoireSortie(java.lang.String nomRepertoireSortie);
	
    public java.lang.String getNomFichierSortie();
    
    public void setNomFichierSortie(java.lang.String nomFichierSortie);
	
    public int getTypeTemplateGeneration();
    
    public void setTypeTemplateGeneration(int typeTemplateGeneration);
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype getGenStereotype();
    
    public void setGenStereotype(org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype);
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse getGenClasse();
    
    public void setGenClasse(org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse);
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate getGenTemplate();
    
    public void setGenTemplate(org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate genTemplate);
	

}
