package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenTemplateBean implements GenTemplate {
	
	/** Récupération de l'élément parent */
	
	private GenTemplates referenceGenTemplates = null;
	
	public GenTemplates getReferenceGenTemplates() {
		return referenceGenTemplates;
	}
	
	public void setReferenceGenTemplates(GenTemplates referenceGenTemplates) {
		this.referenceGenTemplates = referenceGenTemplates;
	}
	
	/** Récupération des éléments fils */
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.nom;
	}
	public void setNomAsString(String nomAsString) {
		this.nom = nomAsString;
	}

	public String getFileAsString() {
		return this.file;
	}
	public void setFileAsString(String fileAsString) {
		this.file = fileAsString;
	}

	public String getOutDirAsString() {
		return this.outDir;
	}
	public void setOutDirAsString(String outDirAsString) {
		this.outDir = outDirAsString;
	}

	public String getOutFileAsString() {
		return this.outFile;
	}
	public void setOutFileAsString(String outFileAsString) {
		this.outFile = outFileAsString;
	}

	public String getPackageJavaAsString() {
		return this.packageJava;
	}
	public void setPackageJavaAsString(String packageJavaAsString) {
		this.packageJava = packageJavaAsString;
	}

	public String getNomElementGenereAsString() {
		return this.nomElementGenere;
	}
	public void setNomElementGenereAsString(String nomElementGenereAsString) {
		this.nomElementGenere = nomElementGenereAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
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
