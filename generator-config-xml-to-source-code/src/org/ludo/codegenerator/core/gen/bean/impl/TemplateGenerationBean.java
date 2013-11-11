/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : TemplateGenerationAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;

/**
 * <b>Description :</b>
 */
public class TemplateGenerationBean implements ITemplateGeneration, Serializable {

	private java.lang.String nom;
	private java.lang.String description;
	private java.lang.String nomPackage;
	private java.lang.String nomFichierTemplate;
	private java.lang.String nomRepertoireSortie;
	private java.lang.String nomFichierSortie;
	private int typeTemplateGeneration;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate genTemplate;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse;
	private org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype;
	private List listeStereotype = new ArrayList();

	public java.lang.String getPackage() {
		return this.nomPackage;
	}

	@Override
	public java.lang.String getNomPackage() {
		return this.nomPackage;
	}

	@Override
	public void setNomPackage(final java.lang.String nomPackage) {
		this.nomPackage = nomPackage;
	}

	@Override
	public java.lang.String getNomFichierTemplate() {
		return this.nomFichierTemplate;
	}

	@Override
	public void setNomFichierTemplate(final java.lang.String nomFichierTemplate) {
		this.nomFichierTemplate = nomFichierTemplate;
	}

	@Override
	public java.lang.String getNomRepertoireSortie() {
		return this.nomRepertoireSortie;
	}

	@Override
	public void setNomRepertoireSortie(final java.lang.String nomRepertoireSortie) {
		this.nomRepertoireSortie = nomRepertoireSortie;
	}

	@Override
	public java.lang.String getNomFichierSortie() {
		return this.nomFichierSortie;
	}

	@Override
	public void setNomFichierSortie(final java.lang.String nomFichierSortie) {
		this.nomFichierSortie = nomFichierSortie;
	}

	@Override
	public int getTypeTemplateGeneration() {
		return this.typeTemplateGeneration;
	}

	@Override
	public void setTypeTemplateGeneration(final int typeTemplateGeneration) {
		this.typeTemplateGeneration = typeTemplateGeneration;
	}

	@Override
	public org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate getGenTemplate() {
		return this.genTemplate;
	}

	@Override
	public void setGenTemplate(final org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate genTemplate) {
		this.genTemplate = genTemplate;
	}

	@Override
	public org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse getGenClasse() {
		return this.genClasse;
	}

	@Override
	public void setGenClasse(final org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse genClasse) {
		this.genClasse = genClasse;
	}

	@Override
	public org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype getGenStereotype() {
		return this.genStereotype;
	}

	@Override
	public void setGenStereotype(final org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype) {
		this.genStereotype = genStereotype;
	}

	private Map mapListeClasseParStereotype;

	@Override
	public Map getMapListeClasseParStereotype() {
		return this.mapListeClasseParStereotype;
	}

	@Override
	public void setMapListeClasseParStereotype(final Map mapListeClasseParStereotype) {
		this.mapListeClasseParStereotype = mapListeClasseParStereotype;
	}

	@Override
	public java.lang.String getNom() {
		return this.nom;
	}

	@Override
	public void setNom(final java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(final java.lang.String description) {
		this.description = description;
	}

}
