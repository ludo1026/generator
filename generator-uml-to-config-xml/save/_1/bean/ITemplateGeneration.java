package org.ludo.codegenerator.core.gen.bean;

import java.util.Map;

import org.ludo.codegenerator.core.gen.bean.abst.ITemplateGenerationAbstract;

public interface ITemplateGeneration extends ITemplateGenerationAbstract {
	
	int TYPE_GENERATION__PAR_TEMPLATE = 1;
	int TYPE_GENERATION__PAR_STEREOTYPE = 2;
	int TYPE_GENERATION__PAR_CLASSE = 3;
	int[] TYPE_GENERATION = {
			TYPE_GENERATION__PAR_TEMPLATE,
			TYPE_GENERATION__PAR_STEREOTYPE,
			TYPE_GENERATION__PAR_CLASSE
		};

	Map getMapListeClasseParStereotype();

	void setMapListeClasseParStereotype(Map mapListeClasseParStereotype);

}