package org.ludo.codegenerator.core.gen.bean.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;
import org.ludo.codegenerator.core.gen.bean.IType;
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
	
	
	private Map mapTypeAImporterByNomComplet = new HashMap();
	
	public Collection getListeTypeAImporter() {
		return mapTypeAImporterByNomComplet.values();
	}
	
	public void addTypeAImporter(IType type) {
		AssertHelper.assertNotNullArgument(type, "type à importer", "addTypeAImporter");
		mapTypeAImporterByNomComplet.put(type.getNomComplet(), type);
	}
	
}
