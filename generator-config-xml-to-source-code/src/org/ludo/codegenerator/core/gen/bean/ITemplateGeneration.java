/*
 * Package  : ${classe.getNomPackage()}
 * Source   : ITemplateGenerationAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * <b>Description :</b>
 * 
 * @zone-debut:{#1
 * @zone-fin:{#1
 */
public interface ITemplateGeneration extends Serializable {

	public java.lang.String getNom();

	public void setNom(final java.lang.String nom);

	public java.lang.String getDescription();

	public void setDescription(final java.lang.String description);

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

	public org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate getGenTemplate();

	public void setGenTemplate(org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate genTemplate);

	public org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse getGenClasse();

	public void setGenClasse(org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse);

	public org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype getGenStereotype();

	public void setGenStereotype(org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype);

	public Map getMapListeClasseParStereotype();

	public void setMapListeClasseParStereotype(Map mapListeClasseParStereotype);

}
