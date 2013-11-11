/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : ParametreAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;

import org.ludo.codegenerator.core.gen.bean.IMethode;
import org.ludo.codegenerator.core.gen.bean.IType;

import org.ludo.codegenerator.core.gen.bean.abst.IParametreAbstract;

/**
 * <b>Description :</b>
 */
public class ParametreAbstractBean implements IParametreAbstract, Serializable {
    
	private java.lang.String nom;
	private java.lang.String genId;
	private IMethode methode;
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
	

    public IMethode getMethode() {
        return methode;
    }
    
    public void setMethode(IMethode methode) {
        this.methode = methode;
    }

    public IType getType() {
        return type;
    }
    
    public void setType(IType type) {
        this.type = type;
    }

}
