package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIPackage;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIPackageBean implements IXMIPackage {
	
	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIPackage packageParent;
	private final String nomPackageComplet;
	private final List listePackageFils = new ArrayList();
	private final List listeClasse = new ArrayList();
	
	public XMIPackageBean(String nom, String xmiId, IXMIPackage packageParent) {
		AssertHelper.assertDefined(nom,"nom du package");
		this.nom = nom;
		this.genId = IdGenerator.getNewId(nom);
		AssertHelper.assertDefined(this.genId,"genId du package");
		AssertHelper.assertDefined(xmiId,"xmiId du package");
		this.xmiId = xmiId;
		//AssertHelper.assertDefined(packageParent,"package parent");
		this.packageParent = packageParent;
		if(this.packageParent == null) {
			this.nomPackageComplet = this.nom;
		} else {
			this.nomPackageComplet = this.packageParent.getNomPackageComplet() + "." + this.nom;
		}
		Manager.addXMIPackageToMap(this);
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
	
	public IXMIPackage getPackageParent() {
		return this.packageParent;
	}
	
	public String getNomPackageComplet() {
		return this.nomPackageComplet;
	}
	
	public List getListePackageFils() {
		return this.listePackageFils;
	}
	
	public void setListePackageFils(List listePackageFils) {
		this.listePackageFils.clear();
		for(Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext(); ) {
			IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			this.listePackageFils.add(packageFils);
		}
	}
	
	public void addPackage(IXMIPackage packageFils) {
		listePackageFils.add(packageFils);
	}
	
	public IXMIPackage getPackageByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du package");
		IXMIPackage packageFilsTrouve = null;
		for(Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext() && packageFilsTrouve == null; ) {
			IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			AssertHelper.assertDefined(packageFils.getNom(), "nom du package dans la liste");
			if( packageFils.getNom().equals(nom) ) {
				packageFilsTrouve = packageFils;
			}
		}
		AssertHelper.assertDefined(packageFilsTrouve, "le package recherché n'a pas été trouvé, nom = '"+nom+"'");
		return packageFilsTrouve;
	}
	
	public IXMIPackage getPackageByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du package");
		IXMIPackage packageFilsTrouve = null;
		for(Iterator iterPackageFils = listePackageFils.iterator(); iterPackageFils.hasNext() && packageFilsTrouve == null; ) {
			IXMIPackage packageFils = (IXMIPackage) iterPackageFils.next();
			AssertHelper.assertDefined(packageFils.getXmiId(), "xmiId du package dans la liste");
			if( packageFils.getXmiId().equals(xmiId) ) {
				packageFilsTrouve = packageFils;
			}
		}
		AssertHelper.assertDefined(packageFilsTrouve, "le package recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return packageFilsTrouve;
	}

	
	public List getListeClasse() {
		return this.listeClasse;
	}
	
	public void setListeClasse(List listeClasse) {
		this.listeClasse.clear();
		for(Iterator iterClasse = listeClasse.iterator(); iterClasse.hasNext(); ) {
			IXMIClasse classe = (IXMIClasse) iterClasse.next();
			this.listeClasse.add(classe);
		}
	}
	
	public void addClasse(IXMIClasse classe) {
		listeClasse.add(classe);
	}
	
	public IXMIClasse getClasseByNom(String nom) {
		AssertHelper.assertDefined(nom, "nom du classe");
		IXMIClasse classeTrouve = null;
		for(Iterator iterClasse = listeClasse.iterator(); iterClasse.hasNext() && classeTrouve == null; ) {
			IXMIClasse classe = (IXMIClasse) iterClasse.next();
			AssertHelper.assertDefined(classe.getNom(), "nom de la classe dans la liste");
			if( classe.getNom().equals(nom) ) {
				classeTrouve = classe;
			}
		}
		AssertHelper.assertDefined(classeTrouve, "le classe recherché n'a pas été trouvé, nom = '"+nom+"'");
		return classeTrouve;
	}
	
	public IXMIClasse getClasseByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId du classe");
		IXMIClasse classeTrouve = null;
		for(Iterator iterClasse = listeClasse.iterator(); iterClasse.hasNext() && classeTrouve == null; ) {
			IXMIClasse classe = (IXMIClasse) iterClasse.next();
			AssertHelper.assertDefined(classe.getXmiId(), "xmiId de la classe dans la liste");
			if( classe.getXmiId().equals(xmiId) ) {
				classeTrouve = classe;
			}
		}
		AssertHelper.assertDefined(classeTrouve, "le classe recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
		return classeTrouve;
	}
	
}
