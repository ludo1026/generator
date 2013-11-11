/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : IAttributAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IStereotype;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IType;

/**
 * <b>Description :</b>
 * @zone-debut:{#1}
 * @zone-fin:{#1}
 */
public interface IAttributAbstract extends Serializable {

    public java.lang.String getNom();
    
    public void setNom(java.lang.String nom);
	
    public java.lang.String getGenId();
    
    public void setGenId(java.lang.String genId);
	
    public int getNombreMinimum();
    
    public void setNombreMinimum(int nombreMinimum);
	
    public int getNombreMaximum();
    
    public void setNombreMaximum(int nombreMaximum);
	
    public boolean getEstClePrimaire();
    
    public void setEstClePrimaire(boolean estClePrimaire);
	

    public List getStereotype();
    
    public void addStereotype(IStereotype stereotype);

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
