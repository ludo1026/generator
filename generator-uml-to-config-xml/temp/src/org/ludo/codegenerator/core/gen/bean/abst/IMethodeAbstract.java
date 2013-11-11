/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : IMethodeAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IParametre;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IType;

/**
 * <b>Description :</b>
 * @zone-debut:{#1}
 * @zone-fin:{#1}
 */
public interface IMethodeAbstract extends Serializable {

    public java.lang.String getNom();
    
    public void setNom(java.lang.String nom);
	
    public java.lang.String getGenId();
    
    public void setGenId(java.lang.String genId);
	

    public List getParametre();
    
    public void addParametre(IParametre parametre);

    /**
     * @zone-debut:{getClasse}
     * @zone-fin:{getClasse}
     */
    public IClasse getClasse();
    
    /**
     * @zone-debut:{setClasse}
     * @zone-fin:{setClasse}
     */
    public void setClasse(IClasse classe);

    /**
     * @zone-debut:{getRetourType}
     * @zone-fin:{getRetourType}
     */
    public IType getRetourType();
    
    /**
     * @zone-debut:{setRetourType}
     * @zone-fin:{setRetourType}
     */
    public void setRetourType(IType retourType);

}
