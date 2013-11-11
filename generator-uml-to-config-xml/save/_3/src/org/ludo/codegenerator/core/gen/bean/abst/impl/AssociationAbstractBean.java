/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : AssociationAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;

import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IClasse;

import org.ludo.codegenerator.core.gen.bean.abst.IAssociationAbstract;

/**
 * <b>Description :</b>
 */
public class AssociationAbstractBean implements IAssociationAbstract, Serializable {
    
	private java.lang.String genId;
	private int nombreMinimum;
	private int nombreMaximum;
	private IClasse classe;
	private IClasse classeReference;

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
	

    public IClasse getClasse() {
        return classe;
    }
    
    public void setClasse(IClasse classe) {
        this.classe = classe;
    }

    public IClasse getClasseReference() {
        return classeReference;
    }
    
    public void setClasseReference(IClasse classeReference) {
        this.classeReference = classeReference;
    }

}
