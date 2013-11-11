package org.ludo.umlgenerator.xml.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIOperation;
import org.ludo.umlgenerator.xml.core.bean.IXMIParametre;
import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.umlgenerator.xml.core.bean.IXMITaggedValue;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.IdGenerator;

public class XMIOperationBean implements IXMIOperation {

	private final String nom;
	private final String genId;
	private final String xmiId;
	private final IXMIClasse xmiClasse;
	private IXMIParametre parametreRetour;
	private final List listeParametre = new ArrayList();
    private final List listeStereotype = new ArrayList();
    private final List listeTaggedValue = new ArrayList();

	public XMIOperationBean(
						final String nom,
						final String xmiId,
						final IXMIClasse xmiClasse
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

    public List getListeStereotype() {
        return this.listeStereotype;
    }

    public void setListeStereotype(final List listeStereotype) {
        this.listeStereotype.clear();
        for(final Iterator iterStereotype = listeStereotype.iterator(); iterStereotype.hasNext(); ) {
            final IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
            this.listeStereotype.add(stereotype);
        }
    }

    public void addStereotype(final IXMIStereotype stereotype) {
        this.listeStereotype.add(stereotype);
    }

    public IXMIStereotype getStereotypeByNom(final String nom) {
        AssertHelper.assertDefined(nom, "nom du stereotype");
        IXMIStereotype stereotypeTrouve = null;
        for(final Iterator iterStereotype = this.listeStereotype.iterator(); iterStereotype.hasNext() && (stereotypeTrouve == null); ) {
            final IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
            AssertHelper.assertDefined(stereotype.getNom(), "nom du stéréotype dans la liste");
            if( stereotype.getNom().equals(nom) ) {
                stereotypeTrouve = stereotype;
            }
        }
        AssertHelper.assertDefined(stereotypeTrouve, "le stereotype recherché n'a pas été trouvé, nom = '"+nom+"'");
        return stereotypeTrouve;
    }

    public IXMIStereotype getStereotypeByXmiId(final String xmiId) {
        AssertHelper.assertDefined(xmiId, "xmiId du stereotype");
        IXMIStereotype stereotypeTrouve = null;
        for(final Iterator iterStereotype = this.listeStereotype.iterator(); iterStereotype.hasNext() && (stereotypeTrouve == null); ) {
            final IXMIStereotype stereotype = (IXMIStereotype) iterStereotype.next();
            AssertHelper.assertDefined(stereotype.getXmiId(), "xmiId du stéréotype dans la liste");
            if( stereotype.getXmiId().equals(xmiId) ) {
                stereotypeTrouve = stereotype;
            }
        }
        AssertHelper.assertDefined(stereotypeTrouve, "le stereotype recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
        return stereotypeTrouve;
    }

    public List getListeTaggedValue() {
        return this.listeTaggedValue;
    }

    public void setListeTaggedValue(final List listeTaggedValue) {
        this.listeTaggedValue.clear();
        for(final Iterator iterTaggedValue = listeTaggedValue.iterator(); iterTaggedValue.hasNext(); ) {
            final IXMITaggedValue taggedValue = (IXMITaggedValue) iterTaggedValue.next();
            this.listeTaggedValue.add(taggedValue);
        }
    }

    public void addTaggedValue(final IXMITaggedValue taggedValue) {
        this.listeTaggedValue.add(taggedValue);
    }

    public IXMITaggedValue getTaggedValueByValeur(final String valeur) {
        AssertHelper.assertDefined(valeur, "valeur du taggedValue");
        IXMITaggedValue taggedValueTrouve = null;
        for(final Iterator iterTaggedValue = this.listeTaggedValue.iterator(); iterTaggedValue.hasNext() && (taggedValueTrouve == null); ) {
            final IXMITaggedValue taggedValue = (IXMITaggedValue) iterTaggedValue.next();
            AssertHelper.assertDefined(taggedValue.getValeur(), "valeur du taggedValue dans la liste");
            if( taggedValue.getValeur().equals(valeur) ) {
                taggedValueTrouve = taggedValue;
            }
        }
        AssertHelper.assertDefined(taggedValueTrouve, "le taggedValue recherché n'a pas été trouvé, valeur = '"+valeur+"'");
        return taggedValueTrouve;
    }

    public IXMITaggedValue getTaggedValueByXmiId(final String xmiId) {
        AssertHelper.assertDefined(xmiId, "xmiId du taggedValue");
        IXMITaggedValue taggedValueTrouve = null;
        for(final Iterator iterTaggedValue = this.listeTaggedValue.iterator(); iterTaggedValue.hasNext() && (taggedValueTrouve == null); ) {
            final IXMITaggedValue taggedValue = (IXMITaggedValue) iterTaggedValue.next();
            AssertHelper.assertDefined(taggedValue.getXmiId(), "xmiId du stéréotype dans la liste");
            if( taggedValue.getXmiId().equals(xmiId) ) {
                taggedValueTrouve = taggedValue;
            }
        }
        AssertHelper.assertDefined(taggedValueTrouve, "le taggedValue recherché n'a pas été trouvé, xmiId = '"+xmiId+"'");
        return taggedValueTrouve;
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

	public void setParametreRetour(final IXMIParametre parametreRetour) {
		AssertHelper.assertDefined(parametreRetour,"paramètre de retour de l'opération");
		this.parametreRetour = parametreRetour;
	}

	public List getListeParametre() {
		return this.listeParametre;
	}

	public void setListeParametre(final List listeParametre) {
		this.listeParametre.clear();
		for(final Iterator iterParametre = listeParametre.iterator(); iterParametre.hasNext(); ) {
			final IXMIParametre parametre = (IXMIParametre) iterParametre.next();
			this.listeParametre.add(parametre);
		}
	}

	public void addParametre(final IXMIParametre parametre) {
		this.listeParametre.add(parametre);
	}

	public IXMIParametre getParametreByNom(final String nom) {
		AssertHelper.assertDefined(nom, "nom du parametre");
		IXMIParametre parametreTrouve = null;
		for(final Iterator iterParametre = this.listeParametre.iterator(); iterParametre.hasNext() && (parametreTrouve == null); ) {
			final IXMIParametre parametre = (IXMIParametre) iterParametre.next();
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
