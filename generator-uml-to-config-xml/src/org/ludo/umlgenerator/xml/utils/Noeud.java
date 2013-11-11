package org.ludo.umlgenerator.xml.utils;

import org.ludo.utils.AssertHelper;

public class Noeud {
	
	private final String nomNoeud;
	private final String attributNom;
	
	public Noeud(String nomNoeud, String attributNom) {
		AssertHelper.assertDefined(nomNoeud, "nom du noeud");
		this.nomNoeud = nomNoeud;
		this.attributNom = attributNom;
	}
	
	public String getNomNoeud() {
		return nomNoeud;
	}
	
	public String getAttributNom() {
		return attributNom;
	}
	
}
