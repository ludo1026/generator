/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : AttributAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IStereotype;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IType;

import org.ludo.codegenerator.core.gen.bean.abst.IAttributAbstract;

/**
 * <b>Description :</b>
 */
public class AttributAbstractBean implements IAttributAbstract, Serializable {
    
	private java.lang.String nom;
	private java.lang.String genId;
	private int nombreMinimum;
	private int nombreMaximum;
	private boolean estClePrimaire;
	private List listeStereotype = new ArrayList();
	private IClasse classe;
	private IType type;

    public java.lang.String getNom() {
        return nom;
    }
    
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }
	
    public java.lang.String getGenId() {
        return genId;
    }
    
    public void setGenId(java.lang.String genId) {
        this.genId = genId;
    }
	
    public int getNombreMinimum() {
        return nombreMinimum;
    }
    
    public void setNombreMinimum(int nombreMinimum) {
        this.nombreMinimum = nombreMinimum;
    }
	
    public int getNombreMaximum() {
        return nombreMaximum;
    }
    
    public void setNombreMaximum(int nombreMaximum) {
        this.nombreMaximum = nombreMaximum;
    }
	
    public boolean getEstClePrimaire() {
        return estClePrimaire;
    }
    
    public void setEstClePrimaire(boolean estClePrimaire) {
        this.estClePrimaire = estClePrimaire;
    }
	

    public List getStereotype() {
        return listeStereotype;
    }
    
    public void addStereotype(IStereotype stereotype) {
        this.listeStereotype.add(stereotype);
    }

    public IClasse getClasse() {
        return classe;
    }
    
    public void setClasse(IClasse classe) {
        this.classe = classe;
    }

    public IType getType() {
        return type;
    }
    
    public void setType(IType type) {
        this.type = type;
    }

}
