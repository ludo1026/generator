package org.ludo.codegenerator.core.gen.bean.impl;

import java.util.Map;

import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;
import org.ludo.codegenerator.core.gen.bean.abst.impl.TemplateGenerationAbstractBean;
import org.ludo.utils.AssertHelper;

public class TemplateGenerationBean extends TemplateGenerationAbstractBean implements ITemplateGeneration {
	
	public void setTypeTemplateGeneration(int typeTemplateGeneration) {
		AssertHelper.assertBoolean(estValideTypeTemplateGeneration(), "le type de génération de template n'est pas valide");
		super.setTypeTemplateGeneration(typeTemplateGeneration);
	}
	
	private final boolean estValideTypeTemplateGeneration() {
		boolean estValideTypeTemplateGeneration = false;
		int typeTemplateGeneration = getTypeTemplateGeneration();
		for(int i=0; i<TYPE_GENERATION.length && !estValideTypeTemplateGeneration; i++) {
			estValideTypeTemplateGeneration =
				estValideTypeTemplateGeneration
			 || typeTemplateGeneration == TYPE_GENERATION[i];
		}
		return estValideTypeTemplateGeneration;
	}
	
	
	private Map mapListeClasseParStereotype;

	public Map getMapListeClasseParStereotype() {
		return mapListeClasseParStereotype;
	}

	public void setMapListeClasseParStereotype(Map mapListeClasseParStereotype) {
		this.mapListeClasseParStereotype = mapListeClasseParStereotype;
	}
	
	
}
