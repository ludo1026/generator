package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIOperation;
import org.ludo.umlgenerator.xml.core.bean.IXMIParametre;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIOperationBean implements IXMIOperation {
	
	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIClasse xmiClasse;
	private IXMIParametre parametreRetour;
	private final List listeParametre = new ArrayList();
	
	public XMIOperationBean(
						String nom, 
						String xmiId,
						IXMIClasse xmiClasse
					)
	{
		AssertHelper.assertDefined(nom,"nom de l'opération");
		this.nom = nom;
		AssertHelper.assertDefined(xmiId,"xmiId de l'opération");
		this.xmiId = xmiId;
		AssertHelper.assertDefined(xmiClasse,"classeGenId de l'opération");
		this.xmiClasse = xmiClasse;
		this.genId = IdGenerator.getNewId(xmiClasse.getGenId()+"."+nom);
		AssertHelper.assertDefined(this.genId,"genId de l'opération");
		Manager.addXMIOperationToMap(this);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getGenId() {
		return this.genId;
	}
	
	public String getXmiId() {
		return this.xmiId;
	}
	
	public IXMIClasse getXMIClasse() {
		return this.xmiClasse;
	}
	
	public IXMIParametre getParametreRetour() {
		AssertHelper.assertDefined(this.parametreRetour,"paramètre de retour de l'opération");
		return this.parametreRetour;
	}
	
	public void setParametreRetour(IXMIParametre parametreRetour) {
		AssertHelper.assertDefined(parametreRetour,"paramètre de retour de l'opération");
		this.parametreRetour = parametreRetour;
	}
	
	public List getListeParametre() {
		return this.listeParametre;
	}
	
	public void setListeParametre(List listeParametre) {
		this.listeParametre.clear();
		for(Iterator iterParametre = listeParametre.iterator(); iterParametre.hasNext(); ) {
			IXMIParametre parametre = (IXMIParametre) iterParametre.next();
			this.listeParametre.add(parametre);
		}
	}
	
	public void addParametre(IXMIParametre parametre) {
		listeParametre.add(parametre);
	}
	
	public IXMIParametre getParametreByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du parametre");
		IXMIParametre parametreTrouve = null;
		for(Iterator iterParametre = listeParametre.iterator(); iterParametre.hasNext() && parametreTrouve == null; ) {
			IXMIParametre parametre = (IXMIParametre) iterParametre.next();
			AssertHelper.assertDefined(parametre.getNom(), "nom du paramètre dans la liste");
			if( parametre.getNom().equals(nom) ) {
				parametreTrouve = parametre;
			}
		}
		AssertHelper.assertDefined(parametreTrouve, "le parametre recherché n'a pas été trouvé, nom = '"+nom+"'");
		return parametreTrouve;
	}
	/*
	public IXMIParametre getParametreByDatatypeXmiId(String datatypeXmiId) {
		AssertHelper.assertDefined(datatypeXmiId, "xmiId du datatype du paramètre");
		IXMIParametre parametreTrouve = null;
		for(Iterator iterParametre = listeParametre.iterator(); iterParametre.hasNext() && parametreTrouve == null; ) {
			IXMIParametre parametre = (IXMIParametre) iterParametre.next();
			AssertHelper.assertDefined(parametre.getDatatypeXmiId(), "xmiId du datatype du paramètre dans la liste");
			if( parametre.getDatatypeXmiId().equals(datatypeXmiId) ) {
				parametreTrouve = parametre;
			}
		}
		AssertHelper.assertDefined(parametreTrouve, "le parametre recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return parametreTrouve;
	}
	
	public IXMIParametre getParametreByDatatypeNom(String datatypeNom) {
		AssertHelper.assertDefined(datatypeNom, "nom du parametre");
		IXMIParametre parametreTrouve = null;
		for(Iterator iterParametre = listeParametre.iterator(); iterParametre.hasNext() && parametreTrouve == null; ) {
			IXMIParametre parametre = (IXMIParametre) iterParametre.next();
			AssertHelper.assertDefined(parametre.getDatatypeNom(), "nom du datatype du paramètre dans la liste");
			if( parametre.getDatatypeNom().equals(datatypeNom) ) {
				parametreTrouve = parametre;
			}
		}
		AssertHelper.assertDefined(parametreTrouve, "le parametre recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return parametreTrouve;
	}
	*/
}
