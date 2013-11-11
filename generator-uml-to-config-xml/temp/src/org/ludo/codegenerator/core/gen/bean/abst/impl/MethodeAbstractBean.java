/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : MethodeAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IParametre;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IType;

import org.ludo.codegenerator.core.gen.bean.abst.IMethodeAbstract;

/**
 * <b>Description :</b>
 */
public class MethodeAbstractBean implements IMethodeAbstract, Serializable {
    
	private java.lang.String nom;
	private java.lang.String genId;
	private List listeParametre = new ArrayList();
	private IClasse classe;
	private IType retourType;

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
	

    public List getParametre() {
        return listeParametre;
    }
    
    public void addParametre(IParametre parametre) {
        this.listeParametre.add(parametre);
    }

    public IClasse getClasse() {
        return classe;
    }
    
    public void setClasse(IClasse classe) {
        this.classe = classe;
    }

    public IType getRetourType() {
        return retourType;
    }
    
    public void setRetourType(IType retourType) {
        this.retourType = retourType;
    }

}
