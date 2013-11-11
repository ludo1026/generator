package org.ludo.codegenerator.core.gen.manager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.ludo.codegenerator.core.gen.bean.IAttribut;
import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;

public class BeanTemplateReferentielManager {
	
	private Map mapClasse = new HashMap();
	
	public void addClasse(IClasse classe) {
		mapClasse.put(classe.getGenId(),classe);
	}
	
	public Collection<IClasse> getListeClasse() {
		return mapClasse.values();
	}
	
	public IClasse getClasseByGenId(String genId) {
		return (IClasse) mapClasse.get(genId);
	}
	
}
