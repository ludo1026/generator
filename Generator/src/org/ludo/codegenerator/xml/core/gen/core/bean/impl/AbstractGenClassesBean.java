package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractGenClassesBean implements GenClasses {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen = null;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasse> listeGenClasse = new ArrayList<GenClasse>();
	
    public GenClasse getGenClasseByGenId(String genId) {
        for(GenClasse genClasse : listeGenClasse) {
            if(genClasse.getGenId().equalsIgnoreCase(genId)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : genId de genClasse = "+genId);
    }
    public GenClasse getGenClasseByNomJava(String nomJava) {
        for(GenClasse genClasse : listeGenClasse) {
            if(genClasse.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomJava de genClasse = "+nomJava);
    }
    public GenClasse getGenClasseByPackageJava(String packageJava) {
        for(GenClasse genClasse : listeGenClasse) {
            if(genClasse.getPackageJava().equalsIgnoreCase(packageJava)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : packageJava de genClasse = "+packageJava);
    }
    public GenClasse getGenClasseByNomTable(String nomTable) {
        for(GenClasse genClasse : listeGenClasse) {
            if(genClasse.getNomTable().equalsIgnoreCase(nomTable)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomTable de genClasse = "+nomTable);
    }
    public GenClasse getGenClasseByNomVue(String nomVue) {
        for(GenClasse genClasse : listeGenClasse) {
            if(genClasse.getNomVue().equalsIgnoreCase(nomVue)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomVue de genClasse = "+nomVue);
    }
    public GenClasse getGenClasseByDescription(String description) {
        for(GenClasse genClasse : listeGenClasse) {
            if(genClasse.getDescription().equalsIgnoreCase(description)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : description de genClasse = "+description);
    }
    public void addGenClasse(GenClasse genClasse) {
    	genClasse.setReferenceGenClasses(this);
        listeGenClasse.add(genClasse);
    }
    public List<GenClasse> getListeGenClasse() {
        return listeGenClasse;
    }
    public void setListeGenClasse(List<GenClasse> listeGenClasse) {
        this.listeGenClasse = listeGenClasse;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getPackageBaseAsString() {
		return this.packageBase;
	}
	public void setPackageBaseAsString(String packageBaseAsString) {
		this.packageBase = packageBaseAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String packageBase = null;

	public String getPackageBase() {
		return this.packageBase;
	}
	public void setPackageBase(String packageBase) {
		this.packageBase = packageBase;
	}
}
