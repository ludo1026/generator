/*
 * Package  : org.ludo.codegenerator.core.gen.bean.impl
 * Source   : TypeBean.java
 */
package org.ludo.codegenerator.core.gen.bean.impl;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;
import org.ludo.codegenerator.core.gen.bean.IType;
import org.ludo.codegenerator.core.gen.bean.abst.impl.TypeAbstractBean;
import org.ludo.codegenerator.core.gen.manager.BeanTemplateManager;
import org.ludo.codegenerator.core.gen.manager.TemplateGenerationManager;
import org.ludo.codegenerator.core.gen.manager.TemplateGenerationMap;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.utils.AssertHelper;

/**
 * <b>Description :</b>
 */
public class TypeBean extends TypeAbstractBean implements IType, Serializable {
	
	private String nomCourt;
	
	public String getNomCourt() {
		return nomCourt;
	}
	
	// @override
	public void setNomComplet(String nomComplet) {
		AssertHelper.assertDefined(nomComplet, "nom complet du type");
		super.setNomComplet(defineNomComplet(nomComplet));
		this.nomCourt = defineNomCourt(nomComplet);
	}
	
	private String defineNomComplet(String nomComplet) {
		AssertHelper.assertDefined(nomComplet, "nom complet du type");
		String defineNomComplet;
		if(nomComplet.charAt(0) != '@') {
			defineNomComplet = nomComplet;
		} else {
			// récupère le nom complet de l'objet référencé
			Gen gen = TemplateGenerationManager.getInstance().getGen();
			GenClasses classes = gen.getGenClasses();
			GenClasse classe = classes.getGenClasseByGenId("nomComplet");
			defineNomComplet = classe.getPackageJava() + "." + classe.getNomJava();
		}
		return defineNomComplet;
	}
	
	private String defineNomCourt(String nomComplet) {
		if(StringUtils.contains(nomComplet,'.')) {
			return nomComplet;
		}
		String[] splitNomComplet = StringUtils.split(nomComplet,'.');
		String nomCourt = null;
		for(int i=0; i<splitNomComplet.length; i++) {
			if(splitNomComplet[i].charAt(0) == StringUtils.capitalize(splitNomComplet[i]).charAt(0)) {
				if( nomCourt == null ) {
					nomCourt = splitNomComplet[i];
				} else {
					nomCourt += "." + splitNomComplet[i];
				}
			}
		}
		if( nomCourt == null ) {
			nomCourt = "";
		}
		return nomCourt;
	}
	
	public String getNomCompletPourTemplate(String nomTemplate) {
		AssertHelper.assertDefined(nomTemplate, "nom de la template");
		TemplateGenerationMap templateGenerationMap = TemplateGenerationManager.getInstance().getTemplateGenerationMap();
		ITemplateGeneration templateGeneration = templateGenerationMap.getByClasseGenId(nomTemplate, getNomComplet());
		return templateGeneration.getNomPackage() + "." + templateGeneration.getNomElementGenere();
	}
	
	public String getNomCourtPourTemplate(String nomTemplate) {
		AssertHelper.assertDefined(nomTemplate, "nom de la template");
		TemplateGenerationMap templateGenerationMap = TemplateGenerationManager.getInstance().getTemplateGenerationMap();
		ITemplateGeneration templateGeneration = templateGenerationMap.getByClasseGenId(nomTemplate, getNomComplet());
		return templateGeneration.getNomElementGenere();
	}
	
}
