package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;

public class AbstractGenAssociationsBean implements GenAssociations {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse = null;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenAssociation = new ArrayList();
	
    public GenAssociation getGenAssociationByGenId(String genId) {
        for(Iterator iter = listeGenAssociation.iterator(); iter.hasNext(); ) {
            GenAssociationBean genAssociation = (GenAssociationBean) iter.next();
            if(genAssociation.getGenId().equalsIgnoreCase(genId)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : genId de genAssociation = "+genId);
    }
    public GenAssociation getGenAssociationByNomJavaChamp(String nomJavaChamp) {
        for(Iterator iter = listeGenAssociation.iterator(); iter.hasNext(); ) {
            GenAssociationBean genAssociation = (GenAssociationBean) iter.next();
            if(genAssociation.getNomJavaChamp().equalsIgnoreCase(nomJavaChamp)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nomJavaChamp de genAssociation = "+nomJavaChamp);
    }
    public GenAssociation getGenAssociationByClasseGenId(String classeGenId) {
        for(Iterator iter = listeGenAssociation.iterator(); iter.hasNext(); ) {
            GenAssociationBean genAssociation = (GenAssociationBean) iter.next();
            if(genAssociation.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : classeGenId de genAssociation = "+classeGenId);
    }
    public GenAssociation getGenAssociationByNombreMinimum(String nombreMinimum) {
        for(Iterator iter = listeGenAssociation.iterator(); iter.hasNext(); ) {
            GenAssociationBean genAssociation = (GenAssociationBean) iter.next();
            if(genAssociation.getNombreMinimum().equalsIgnoreCase(nombreMinimum)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nombreMinimum de genAssociation = "+nombreMinimum);
    }
    public GenAssociation getGenAssociationByNombreMaximum(String nombreMaximum) {
        for(Iterator iter = listeGenAssociation.iterator(); iter.hasNext(); ) {
            GenAssociationBean genAssociation = (GenAssociationBean) iter.next();
            if(genAssociation.getNombreMaximum().equalsIgnoreCase(nombreMaximum)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nombreMaximum de genAssociation = "+nombreMaximum);
    }
    public void addGenAssociation(GenAssociation genAssociation) {
    	genAssociation.setReferenceGenAssociations(this);
        listeGenAssociation.add(genAssociation);
    }
    public List getListeGenAssociation() {
        return listeGenAssociation;
    }
    public void setListeGenAssociation(List listeGenAssociation) {
        this.listeGenAssociation = listeGenAssociation;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
