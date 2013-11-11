/*
 * Projet   : Generator
 * Package  : generator.model
 * Source   : Classe.java
 * Création : CHABOUD   Date : 28 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- Dernière mise à jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.xmlbeangen.xml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;


/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class Noeud {
    
	private Xml referenceXml = null;
	
	public Xml getReferenceXml() {
		return referenceXml;
	}
	public void setReferenceXml(Xml referenceXml) {
		this.referenceXml = referenceXml;
	}
    
	private Noeud referenceNoeud = null;
	
	public boolean hasReferenceNoeud() {
		return referenceNoeud != null;
	}
	public Noeud getReferenceNoeud() {
		return referenceNoeud;
	}
	public void setReferenceNoeud(Noeud referenceNoeud) {
		this.referenceNoeud = referenceNoeud;
	}
	
	
    
    private List listeNoeud = new ArrayList();
    
    public Noeud getNoeud(String nom) {
        for(Iterator iter = listeNoeud.iterator(); iter.hasNext(); ) {
            Noeud noeud = (Noeud) iter.next();
            if(noeud.getNomSansMajuscule().equalsIgnoreCase(nom)) {
                return noeud;
            }
        }
        throw new IllegalStateException("La noeud n'est pas définie : nom = "+nom);
    }
    public int getNombreNoeud(String nom) {
    	int i = 0;
        for(Iterator iter = listeNoeud.iterator(); iter.hasNext(); ) {
            Noeud noeud = (Noeud) iter.next();
            if(noeud.getNomSansMajuscule().equalsIgnoreCase(nom)) {
                i++;
            }
        }
        return i;
    }
    public void addNoeud(Noeud noeud) {
    	noeud.setReferenceNoeud(this);
        listeNoeud.add(noeud);
    }
    public List getListeNoeud() {
        return listeNoeud;
    }
    public void setListeNoeud(List listeNoeud) {
        this.listeNoeud = listeNoeud;
    }

    
    private List listeAttribut = new ArrayList();
    
    public Attribut getAttribut(String nom) {
        for(Iterator iter = listeAttribut.iterator(); iter.hasNext(); ) {
            Attribut attribut = (Attribut) iter.next();
            if(attribut.getNom().equals(nom)) {
                return attribut;
            }
        }
        throw new IllegalStateException("La attribut n'est pas définie : nom = "+nom);
    }
    public void addAttribut(Attribut attribut) {
    	attribut.setReferenceNoeud(this);
        listeAttribut.add(attribut);
    }
    public List getListeAttribut() {
        return listeAttribut;
    }
    public void setListeAttribut(List listeAttribut) {
        this.listeAttribut = listeAttribut;
    }

	
	
	private String nom = "";
    public String getNomToutMajuscule() {
        return StringUtils.upperCase(nom);
    }
    public String getNomToutMinuscule() {
        return StringUtils.lowerCase(nom);
    }
    public String getNomAvecMajuscule() {
        return StringUtils.capitalize(nom);
    }
    public String getNomSansMajuscule() {
        return StringUtils.uncapitalize(nom);
    }
    public String getNomBean() {
        return StringUtils.capitalize(nom)+"Bean";
    }
    public String getNomInterface() {
        return "I"+StringUtils.capitalize(nom);
    }
    public String getNomAbstract() {
        return "Abstract"+getNomBean();
    }
//	public String getNom() {
//		return nom;
//	}
	public void setNom(String nom) {
		this.nom = formatNom(nom);
	}
	
	private String nomXml = "";
	public void setNomXml(String nom) {
		this.nomXml = formatNomXml(nom);
	}
	public String getNomXml() {
		return this.nomXml;
	}
	
	private static String formatNomXml(String str) {
		String nom = "";
		String[] subNomTab = str.split("-");
		for(int i=0; i<subNomTab.length; i++) {
			if( i>0 ) {
				nom += "-";
			}
			nom += StringUtils.uncapitalize(subNomTab[i]);
		}
		return nom;
	}
	
	private static String formatNom(String str) {
		return NomHelper.formaterNomXmlEnNomJava(str);
	}
	
	public static final int NOMBRE_NOEUD_ILLIMITE = -1;
	public static final Integer NOMBRE_NOEUD_ILLIMITE_INTEGER = new Integer(NOMBRE_NOEUD_ILLIMITE);
	
	private int nombre = NOMBRE_NOEUD_ILLIMITE;

	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
