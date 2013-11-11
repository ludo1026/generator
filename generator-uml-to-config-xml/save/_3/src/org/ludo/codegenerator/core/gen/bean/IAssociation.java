/*
 * Package  : org.ludo.codegenerator.core.gen.bean
 * Source   : IAssociation.java
 */
package org.ludo.codegenerator.core.gen.bean;

import java.io.Serializable;
import java.util.Date;


import org.ludo.codegenerator.core.gen.bean.abst.IAssociationAbstract;
import org.ludo.codegenerator.core.gen.manager.TemplateGenerationManager;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;

/**
 * <b>Description :</b>
 * IAssociation
 *
 */
public interface IAssociation extends IAssociationAbstract, Serializable {
	
	public void setClasseReferenceFromClasseGenIdOfGenAssociation(String classeGenId);
	
	public void setNombreMinimumFromNombreMinimumOfGenAssociation(String nombreMinimum);
	
	public void setNombreMaximumFromNombreMaximumOfGenAssociation(String nombreMaximum);

}
