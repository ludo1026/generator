/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : IParametreAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;
import java.util.Date;

import org.ludo.codegenerator.core.gen.bean.IMethode;
import org.ludo.codegenerator.core.gen.bean.IType;

/**
 * <b>Description :</b>
 * @zone-debut:{#1}
 * @zone-fin:{#1}
 */
public interface IParametreAbstract extends Serializable {

    public java.lang.String getNom();
    
    public void setNom(java.lang.String nom);
	
    public java.lang.String getGenId();
    
    public void setGenId(java.lang.String genId);
	

    /**
     * @zone-debut:{getMethode}
     * @zone-fin:{getMethode}
     */
    public IMethode getMethode();
    
    /**
     * @zone-debut:{setMethode}
     * @zone-fin:{setMethode}
     */
    public void setMethode(IMethode methode);

    /**
     * @zone-debut:{getType}
     * @zone-fin:{getType}
     */
    public IType getType();
    
    /**
     * @zone-debut:{setType}
     * @zone-fin:{setType}
     */
    public void setType(IType type);

}
