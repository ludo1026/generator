/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : IAssociationAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;
import java.util.Date;

import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IClasse;

/**
 * <b>Description :</b>
 * @zone-debut:{#1}
 * @zone-fin:{#1}
 */
public interface IAssociationAbstract extends Serializable {

    public java.lang.String getGenId();
    
    public void setGenId(java.lang.String genId);
	
    public int getNombreMinimum();
    
    public void setNombreMinimum(int nombreMinimum);
	
    public int getNombreMaximum();
    
    public void setNombreMaximum(int nombreMaximum);
	

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
     * @zone-debut:{getClasseReference}
     * @zone-fin:{getClasseReference}
     */
    public IClasse getClasseReference();
    
    /**
     * @zone-debut:{setClasseReference}
     * @zone-fin:{setClasseReference}
     */
    public void setClasseReference(IClasse classeReference);

}
