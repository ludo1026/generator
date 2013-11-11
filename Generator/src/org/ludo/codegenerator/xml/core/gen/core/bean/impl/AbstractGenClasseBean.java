package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprietesClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesClasseRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenClasseBean implements GenClasse {
	
	/** Récupération de l'élément parent */
	
	private GenClasses referenceGenClasses = null;
	
	public GenClasses getReferenceGenClasses() {
		return referenceGenClasses;
	}
	
	public void setReferenceGenClasses(GenClasses referenceGenClasses) {
		this.referenceGenClasses = referenceGenClasses;
	}
	
	/** Récupération des éléments fils */

    private GenProprietesClasse genProprietesClasse = null;
    
    public GenProprietesClasse getGenProprietesClasse() {
    	return this.genProprietesClasse;
    }
    
    public void setGenProprietesClasse(GenProprietesClasse genProprietesClasse) {
    	genProprietesClasse.setReferenceGenClasse(this);
    	this.genProprietesClasse = genProprietesClasse;
    }
	

    private GenAttributs genAttributs = null;
    
    public GenAttributs getGenAttributs() {
    	return this.genAttributs;
    }
    
    public void setGenAttributs(GenAttributs genAttributs) {
    	genAttributs.setReferenceGenClasse(this);
    	this.genAttributs = genAttributs;
    }
	

    private GenMethodes genMethodes = null;
    
    public GenMethodes getGenMethodes() {
    	return this.genMethodes;
    }
    
    public void setGenMethodes(GenMethodes genMethodes) {
    	genMethodes.setReferenceGenClasse(this);
    	this.genMethodes = genMethodes;
    }
	

    private GenStereotypesClasseRef genStereotypesClasseRef = null;
    
    public GenStereotypesClasseRef getGenStereotypesClasseRef() {
    	return this.genStereotypesClasseRef;
    }
    
    public void setGenStereotypesClasseRef(GenStereotypesClasseRef genStereotypesClasseRef) {
    	genStereotypesClasseRef.setReferenceGenClasse(this);
    	this.genStereotypesClasseRef = genStereotypesClasseRef;
    }
	

    private GenAssociations genAssociations = null;
    
    public GenAssociations getGenAssociations() {
    	return this.genAssociations;
    }
    
    public void setGenAssociations(GenAssociations genAssociations) {
    	genAssociations.setReferenceGenClasse(this);
    	this.genAssociations = genAssociations;
    }
	

    private GenClasseParents genClasseParents = null;
    
    public GenClasseParents getGenClasseParents() {
    	return this.genClasseParents;
    }
    
    public void setGenClasseParents(GenClasseParents genClasseParents) {
    	genClasseParents.setReferenceGenClasse(this);
    	this.genClasseParents = genClasseParents;
    }
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getGenIdAsString() {
		return this.genId;
	}
	public void setGenIdAsString(String genIdAsString) {
		this.genId = genIdAsString;
	}

	public String getNomJavaAsString() {
		return this.nomJava;
	}
	public void setNomJavaAsString(String nomJavaAsString) {
		this.nomJava = nomJavaAsString;
	}

	public String getPackageJavaAsString() {
		return this.packageJava;
	}
	public void setPackageJavaAsString(String packageJavaAsString) {
		this.packageJava = packageJavaAsString;
	}

	public String getNomTableAsString() {
		return this.nomTable;
	}
	public void setNomTableAsString(String nomTableAsString) {
		this.nomTable = nomTableAsString;
	}

	public String getNomVueAsString() {
		return this.nomVue;
	}
	public void setNomVueAsString(String nomVueAsString) {
		this.nomVue = nomVueAsString;
	}

	public String getDescriptionAsString() {
		return this.description;
	}
	public void setDescriptionAsString(String descriptionAsString) {
		this.description = descriptionAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String packageJava = null;
	private String nomTable = null;
	private String nomVue = null;
	private String description = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getNomJava() {
		return this.nomJava;
	}
	public void setNomJava(String nomJava) {
		this.nomJava = nomJava;
	}

	public String getPackageJava() {
		return this.packageJava;
	}
	public void setPackageJava(String packageJava) {
		this.packageJava = packageJava;
	}

	public String getNomTable() {
		return this.nomTable;
	}
	public void setNomTable(String nomTable) {
		this.nomTable = nomTable;
	}

	public String getNomVue() {
		return this.nomVue;
	}
	public void setNomVue(String nomVue) {
		this.nomVue = nomVue;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
