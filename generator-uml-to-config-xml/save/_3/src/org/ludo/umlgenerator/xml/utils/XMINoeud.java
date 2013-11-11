package org.ludo.umlgenerator.xml.utils;

import org.ludo.utils.AssertHelper;

public class XMINoeud {
	
	private final String nomNoeud;
	private final String attributNom;
	private final String xmiId;
	private final String xmiIdRef;
	
	public XMINoeud(
						String nomNoeud, 
						String attributNom, 
						String xmiId,
						String xmiIdRef
					)
	{
		AssertHelper.assertDefined(nomNoeud,"nom du noeud");
		this.nomNoeud = nomNoeud;
		//AssertHelper.assertDefined(attributNom,"nom de l'attribut");
		this.attributNom = attributNom;
		//AssertHelper.assertDefined((xmiId!=null)?xmiId:xmiIdRef,"xmiId et xmiIdRef");
		this.xmiId = xmiId;
		this.xmiIdRef = xmiIdRef;
	}

	public String getNomNoeud() {
		return nomNoeud;
	}

	public String getAttributNom() {
		return attributNom;
	}

	public String getXmiId() {
		return xmiId;
	}

	public String getXmiIdRef() {
		return xmiIdRef;
	}
	
}
