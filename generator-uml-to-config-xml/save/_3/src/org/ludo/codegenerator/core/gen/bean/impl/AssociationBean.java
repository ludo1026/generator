/*
 * Package  : org.ludo.codegenerator.core.gen.bean.impl
 * Source   : AssociationBean.java
 */
package org.ludo.codegenerator.core.gen.bean.impl;

import java.io.Serializable;

import org.ludo.codegenerator.core.gen.bean.IAssociation;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.abst.impl.AssociationAbstractBean;
import org.ludo.codegenerator.core.gen.manager.BeanTemplateReferentielManager;
import org.ludo.codegenerator.core.gen.manager.TemplateGenerationManager;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;

/**
 * <b>Description :</b>
 */
public class AssociationBean extends AssociationAbstractBean implements IAssociation, Serializable {
	
	public void setClasseReferenceFromClasseGenIdOfGenAssociation(String classeGenId) {
	}
	
	public void setNombreMinimumFromNombreMinimumOfGenAssociation(String nombreMinimum) {
		
		//if( nombreMinimum )
	}
	
	public void setNombreMaximumFromNombreMaximumOfGenAssociation(String nombreMaximum) {
		
	}


}
