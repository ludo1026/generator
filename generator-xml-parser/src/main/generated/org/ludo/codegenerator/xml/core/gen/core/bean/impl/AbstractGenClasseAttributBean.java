package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributPropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttributStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseAttributBean implements GenClasseAttribut {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseAttributPropriete> genClasseAttributProprietes = new ArrayList<GenClasseAttributPropriete>();
	
    public GenClasseAttributPropriete getGenClasseAttributProprieteForNom(String nom) {
        for(GenClasseAttributPropriete genClasseAttributPropriete : genClasseAttributProprietes) {
            if(genClasseAttributPropriete.getNom().equalsIgnoreCase(nom)) {
                return genClasseAttributPropriete;
            }
        }
        throw new IllegalStateException("La genClasseAttributPropriete n'est pas définie : nom de genClasseAttributPropriete = "+nom);
    }

    public List<GenClasseAttributPropriete> getGenClasseAttributProprietesByNom(String nom) {
        List<GenClasseAttributPropriete> result = new ArrayList<GenClasseAttributPropriete>();
        for(GenClasseAttributPropriete genClasseAttributPropriete : genClasseAttributProprietes) {
            if(genClasseAttributPropriete.getNom().equalsIgnoreCase(nom)) {
                result.add(genClasseAttributPropriete);
            }
        }
        return result;
    }

    public GenClasseAttributPropriete getGenClasseAttributProprieteForValeur(String valeur) {
        for(GenClasseAttributPropriete genClasseAttributPropriete : genClasseAttributProprietes) {
            if(genClasseAttributPropriete.getValeur().equalsIgnoreCase(valeur)) {
                return genClasseAttributPropriete;
            }
        }
        throw new IllegalStateException("La genClasseAttributPropriete n'est pas définie : valeur de genClasseAttributPropriete = "+valeur);
    }

    public List<GenClasseAttributPropriete> getGenClasseAttributProprietesByValeur(String valeur) {
        List<GenClasseAttributPropriete> result = new ArrayList<GenClasseAttributPropriete>();
        for(GenClasseAttributPropriete genClasseAttributPropriete : genClasseAttributProprietes) {
            if(genClasseAttributPropriete.getValeur().equalsIgnoreCase(valeur)) {
                result.add(genClasseAttributPropriete);
            }
        }
        return result;
    }

    public void addGenClasseAttributPropriete(GenClasseAttributPropriete genClasseAttributPropriete) {
    	genClasseAttributPropriete.setReferenceGenClasseAttribut(this);
        genClasseAttributProprietes.add(genClasseAttributPropriete);
    }
    public List<GenClasseAttributPropriete> getGenClasseAttributProprietes() {
        return genClasseAttributProprietes;
    }
    public void setGenClasseAttributProprietes(List<GenClasseAttributPropriete> genClasseAttributProprietes) {
        this.genClasseAttributProprietes = genClasseAttributProprietes;
    }
	
    private List<GenClasseAttributStereotype> genClasseAttributStereotypes = new ArrayList<GenClasseAttributStereotype>();
	
    public GenClasseAttributStereotype getGenClasseAttributStereotypeForNom(String nom) {
        for(GenClasseAttributStereotype genClasseAttributStereotype : genClasseAttributStereotypes) {
            if(genClasseAttributStereotype.getNom().equalsIgnoreCase(nom)) {
                return genClasseAttributStereotype;
            }
        }
        throw new IllegalStateException("La genClasseAttributStereotype n'est pas définie : nom de genClasseAttributStereotype = "+nom);
    }

    public List<GenClasseAttributStereotype> getGenClasseAttributStereotypesByNom(String nom) {
        List<GenClasseAttributStereotype> result = new ArrayList<GenClasseAttributStereotype>();
        for(GenClasseAttributStereotype genClasseAttributStereotype : genClasseAttributStereotypes) {
            if(genClasseAttributStereotype.getNom().equalsIgnoreCase(nom)) {
                result.add(genClasseAttributStereotype);
            }
        }
        return result;
    }

    public void addGenClasseAttributStereotype(GenClasseAttributStereotype genClasseAttributStereotype) {
    	genClasseAttributStereotype.setReferenceGenClasseAttribut(this);
        genClasseAttributStereotypes.add(genClasseAttributStereotype);
    }
    public List<GenClasseAttributStereotype> getGenClasseAttributStereotypes() {
        return genClasseAttributStereotypes;
    }
    public void setGenClasseAttributStereotypes(List<GenClasseAttributStereotype> genClasseAttributStereotypes) {
        this.genClasseAttributStereotypes = genClasseAttributStereotypes;
    }
	
	private String genId = null;
	private String nomJava = null;
	private String type = null;
	private String nbMin = null;
	private String nbMax = null;
	private String nomSQL = null;
	private String typeSQL = null;
	private String estDansTable = null;
	private String size = null;
	private String estClePrimaire = null;
	private String estCleIncrementee = null;
	private String associationId = null;
	private String description = null;

	public String getGenId() {
		return this.genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getNomJava() {
		return this.nomJava;
	}
	public void setNomJava(String nomJava) {
		this.nomJava = nomJava;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getNbMin() {
		return this.nbMin;
	}
	public void setNbMin(String nbMin) {
		this.nbMin = nbMin;
	}

	public String getNbMax() {
		return this.nbMax;
	}
	public void setNbMax(String nbMax) {
		this.nbMax = nbMax;
	}

	public String getNomSQL() {
		return this.nomSQL;
	}
	public void setNomSQL(String nomSQL) {
		this.nomSQL = nomSQL;
	}

	public String getTypeSQL() {
		return this.typeSQL;
	}
	public void setTypeSQL(String typeSQL) {
		this.typeSQL = typeSQL;
	}

	public String getEstDansTable() {
		return this.estDansTable;
	}
	public void setEstDansTable(String estDansTable) {
		this.estDansTable = estDansTable;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getEstClePrimaire() {
		return this.estClePrimaire;
	}
	public void setEstClePrimaire(String estClePrimaire) {
		this.estClePrimaire = estClePrimaire;
	}

	public String getEstCleIncrementee() {
		return this.estCleIncrementee;
	}
	public void setEstCleIncrementee(String estCleIncrementee) {
		this.estCleIncrementee = estCleIncrementee;
	}

	public String getAssociationId() {
		return this.associationId;
	}
	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
