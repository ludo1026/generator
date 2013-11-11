package org.ludo.codegenerator.core.gen.manager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.ludo.codegenerator.core.gen.bean.IClasse;
import org.ludo.codegenerator.core.gen.bean.IStereotype;

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
	
	private Map mapStereotype = new HashMap();
	
	public void addStereotype(IStereotype stereotype) {
		mapStereotype.put(stereotype.getNom(),stereotype);
	}
	
	public Collection<IStereotype> getListeStereotype() {
		return mapStereotype.values();
	}
	
	public IStereotype getStereotypeByNom(String nom) {
		return (IStereotype) mapStereotype.get(nom);
	}
	
}
