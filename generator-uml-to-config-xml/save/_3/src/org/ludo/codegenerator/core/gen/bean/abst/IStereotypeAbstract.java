/*
 * Package  : org.ludo.codegenerator.core.gen.bean.abst
 * Source   : IStereotypeAbstract.java
 */
package org.ludo.codegenerator.core.gen.bean.abst;

import java.io.Serializable;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.ludo.codegenerator.core.gen.bean.IAttribut;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;

/**
 * <b>Description :</b>
 * @zone-debut:{#1}
 * @zone-fin:{#1}
 */
public interface IStereotypeAbstract extends Serializable {

    public java.lang.String getNom();
    
    public void setNom(java.lang.String nom);
	
    public org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype getGenStereotype();
    
    public void setGenStereotype(org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype genStereotype);
	

    public List getAttribut();
    
    public void addAttribut(IAttribut attribut);

    public List getClasse();
    
    public void addClasse(IClasse classe);

    /**
     * @zone-debut:{getTemplateGeneration}
     * @zone-fin:{getTemplateGeneration}
     */
    public ITemplateGeneration getTemplateGeneration();
    
    /**
     * @zone-debut:{setTemplateGeneration}
     * @zone-fin:{setTemplateGeneration}
     */
    public void setTemplateGeneration(ITemplateGeneration templateGeneration);

}
