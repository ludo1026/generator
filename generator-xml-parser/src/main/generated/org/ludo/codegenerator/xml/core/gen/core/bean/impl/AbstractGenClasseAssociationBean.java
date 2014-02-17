package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociationClasseDeAssociation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseAssociationBean implements GenClasseAssociation {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseAssociationAttribut> genClasseAssociationAttributs = new ArrayList<GenClasseAssociationAttribut>();
	
    public GenClasseAssociationAttribut getGenClasseAssociationAttributForGenId(String genId) {
        for(GenClasseAssociationAttribut genClasseAssociationAttribut : genClasseAssociationAttributs) {
            if(genClasseAssociationAttribut.getGenId().equalsIgnoreCase(genId)) {
                return genClasseAssociationAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAssociationAttribut n'est pas définie : genId de genClasseAssociationAttribut = "+genId);
    }

    public List<GenClasseAssociationAttribut> getGenClasseAssociationAttributsByGenId(String genId) {
        List<GenClasseAssociationAttribut> result = new ArrayList<GenClasseAssociationAttribut>();
        for(GenClasseAssociationAttribut genClasseAssociationAttribut : genClasseAssociationAttributs) {
            if(genClasseAssociationAttribut.getGenId().equalsIgnoreCase(genId)) {
                result.add(genClasseAssociationAttribut);
            }
        }
        return result;
    }

    public void addGenClasseAssociationAttribut(GenClasseAssociationAttribut genClasseAssociationAttribut) {
    	genClasseAssociationAttribut.setReferenceGenClasseAssociation(this);
        genClasseAssociationAttributs.add(genClasseAssociationAttribut);
    }
    public List<GenClasseAssociationAttribut> getGenClasseAssociationAttributs() {
        return genClasseAssociationAttributs;
    }
    public void setGenClasseAssociationAttributs(List<GenClasseAssociationAttribut> genClasseAssociationAttributs) {
        this.genClasseAssociationAttributs = genClasseAssociationAttributs;
    }

    private GenClasseAssociationClasseDeAssociation genClasseAssociationClasseDeAssociation = new GenClasseAssociationClasseDeAssociationBean();
    
    public GenClasseAssociationClasseDeAssociation getGenClasseAssociationClasseDeAssociation() {
    	return this.genClasseAssociationClasseDeAssociation;
    }
    
    public void setGenClasseAssociationClasseDeAssociation(GenClasseAssociationClasseDeAssociation genClasseAssociationClasseDeAssociation) {
    	genClasseAssociationClasseDeAssociation.setReferenceGenClasseAssociation(this);
    	this.genClasseAssociationClasseDeAssociation = genClasseAssociationClasseDeAssociation;
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

	public String getClasseGenIdAsString() {
		return this.classeGenId;
	}
	public void setClasseGenIdAsString(String classeGenIdAsString) {
		this.classeGenId = classeGenIdAsString;
	}

	public String getNbMinAsString() {
		return this.nbMin;
	}
	public void setNbMinAsString(String nbMinAsString) {
		this.nbMin = nbMinAsString;
	}

	public String getNbMaxAsString() {
		return this.nbMax;
	}
	public void setNbMaxAsString(String nbMaxAsString) {
		this.nbMax = nbMaxAsString;
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
	private String classeGenId = null;
	private String nbMin = null;
	private String nbMax = null;
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

	public String getClasseGenId() {
		return this.classeGenId;
	}
	public void setClasseGenId(String classeGenId) {
		this.classeGenId = classeGenId;
	}

	public String getNbMin() {
		return this.nbMin;
	}
	public void setNbMin(String nbMin) {
		this.nbMin = nbMin;
	}

	public String getNbMax() {
		return this.nbMax;
	}
	public void setNbMax(String nbMax) {
		this.nbMax = nbMax;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
