package org.ludo.codegenerator.core;

import java.util.ArrayList;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.utils.AssertHelper;

public class ListeClasseParStereotype {
	private final String stereotypeNom;
	private final GenStereotype stereotype;
	private final List listeClasse;
	public ListeClasseParStereotype(GenStereotype stereotype) {
		AssertHelper.assertNotNullArgument(stereotype, "stereotype");
		this.stereotype = stereotype;
		AssertHelper.assertDefined(stereotype.getNom(), "nom du stereotype");
		this.stereotypeNom = stereotype.getNom();
		this.listeClasse = new ArrayList();
	}
	public String getStereotypeNom() {
		return this.stereotype.getNom();
	}
	public GenStereotype getStereotype() {
		return this.stereotype;
	}
	public void addClasse(GenClasse classe) {
		AssertHelper.assertNotNullArgument(classe, "classe");
		this.listeClasse.add(classe);
	}
	public List getListeClasse() {
		return this.listeClasse;
	}
}
