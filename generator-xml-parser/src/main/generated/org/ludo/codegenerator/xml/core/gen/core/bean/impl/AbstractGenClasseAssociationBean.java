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
