package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;

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
	
    private List listeGenClasse = new ArrayList();
	
    public GenClasse getGenClasseByGenId(String genId) {
        for(Iterator iter = listeGenClasse.iterator(); iter.hasNext(); ) {
            GenClasseBean genClasse = (GenClasseBean) iter.next();
            if(genClasse.getGenId().equalsIgnoreCase(genId)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : genId de genClasse = "+genId);
    }
    public GenClasse getGenClasseByNomJava(String nomJava) {
        for(Iterator iter = listeGenClasse.iterator(); iter.hasNext(); ) {
            GenClasseBean genClasse = (GenClasseBean) iter.next();
            if(genClasse.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomJava de genClasse = "+nomJava);
    }
    public GenClasse getGenClasseByPackageJava(String packageJava) {
        for(Iterator iter = listeGenClasse.iterator(); iter.hasNext(); ) {
            GenClasseBean genClasse = (GenClasseBean) iter.next();
            if(genClasse.getPackageJava().equalsIgnoreCase(packageJava)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : packageJava de genClasse = "+packageJava);
    }
    public GenClasse getGenClasseByNomTable(String nomTable) {
        for(Iterator iter = listeGenClasse.iterator(); iter.hasNext(); ) {
            GenClasseBean genClasse = (GenClasseBean) iter.next();
            if(genClasse.getNomTable().equalsIgnoreCase(nomTable)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomTable de genClasse = "+nomTable);
    }
    public GenClasse getGenClasseByNomVue(String nomVue) {
        for(Iterator iter = listeGenClasse.iterator(); iter.hasNext(); ) {
            GenClasseBean genClasse = (GenClasseBean) iter.next();
            if(genClasse.getNomVue().equalsIgnoreCase(nomVue)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomVue de genClasse = "+nomVue);
    }
    public void addGenClasse(GenClasse genClasse) {
    	genClasse.setReferenceGenClasses(this);
        listeGenClasse.add(genClasse);
    }
    public List getListeGenClasse() {
        return listeGenClasse;
    }
    public void setListeGenClasse(List listeGenClasse) {
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
