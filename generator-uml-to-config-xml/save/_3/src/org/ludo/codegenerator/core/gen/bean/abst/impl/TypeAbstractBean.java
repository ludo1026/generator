/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst.impl
 * Source   : TypeAbstractBean.java
 */
package org.ludo.codegenerator.core.gen.bean.abst.impl;

import java.io.Serializable;
import java.util.Date;


import org.ludo.codegenerator.core.gen.bean.abst.ITypeAbstract;

/**
 * <b>Description :</b>
 */
public class TypeAbstractBean implements ITypeAbstract, Serializable {
    
	private java.lang.String nomComplet;

    public java.lang.String getNomComplet() {
        return nomComplet;
    }
    
    public void setNomComplet(java.lang.String nomComplet) {
        this.nomComplet = nomComplet;
    }
	

}
