package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateBean implements GenTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenTemplates referenceGenTemplates;
	
	public GenTemplates getReferenceGenTemplates() {
		return referenceGenTemplates;
	}
	
	public void setReferenceGenTemplates(GenTemplates referenceGenTemplates) {
		this.referenceGenTemplates = referenceGenTemplates;
	}
	
	/** Récupération des éléments fils */
	
	private String nom = null;
	private String file = null;
	private String outDir = null;
	private String outFile = null;
	private String packageJava = null;
	private String nomElementGenere = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFile() {
		return this.file;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getOutDir() {
		return this.outDir;
	}
	public void setOutDir(String outDir) {
		this.outDir = outDir;
	}

	public String getOutFile() {
		return this.outFile;
	}
	public void setOutFile(String outFile) {
		this.outFile = outFile;
	}

	public String getPackageJava() {
		return this.packageJava;
	}
	public void setPackageJava(String packageJava) {
		this.packageJava = packageJava;
	}

	public String getNomElementGenere() {
		return this.nomElementGenere;
	}
	public void setNomElementGenere(String nomElementGenere) {
		this.nomElementGenere = nomElementGenere;
	}

}
