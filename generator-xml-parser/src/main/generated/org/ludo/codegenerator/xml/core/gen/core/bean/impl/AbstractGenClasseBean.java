package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseBean implements GenClasse {
	
	/** Récupération de l'élément parent */
	
	private GenClasses referenceGenClasses;
	
	public GenClasses getReferenceGenClasses() {
		return referenceGenClasses;
	}
	
	public void setReferenceGenClasses(GenClasses referenceGenClasses) {
		this.referenceGenClasses = referenceGenClasses;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClassePropriete> genClasseProprietes = new ArrayList<GenClassePropriete>();
	
    public GenClassePropriete getGenClasseProprieteForNom(String nom) {
        for(GenClassePropriete genClassePropriete : genClasseProprietes) {
            if(genClassePropriete.getNom().equalsIgnoreCase(nom)) {
                return genClassePropriete;
            }
        }
        throw new IllegalStateException("La genClassePropriete n'est pas définie : nom de genClassePropriete = "+nom);
    }

    public List<GenClassePropriete> getGenClasseProprietesByNom(String nom) {
        List<GenClassePropriete> result = new ArrayList<GenClassePropriete>();
        for(GenClassePropriete genClassePropriete : genClasseProprietes) {
            if(genClassePropriete.getNom().equalsIgnoreCase(nom)) {
                result.add(genClassePropriete);
            }
        }
        return result;
    }

    public GenClassePropriete getGenClasseProprieteForValeur(String valeur) {
        for(GenClassePropriete genClassePropriete : genClasseProprietes) {
            if(genClassePropriete.getValeur().equalsIgnoreCase(valeur)) {
                return genClassePropriete;
            }
        }
        throw new IllegalStateException("La genClassePropriete n'est pas définie : valeur de genClassePropriete = "+valeur);
    }

    public List<GenClassePropriete> getGenClasseProprietesByValeur(String valeur) {
        List<GenClassePropriete> result = new ArrayList<GenClassePropriete>();
        for(GenClassePropriete genClassePropriete : genClasseProprietes) {
            if(genClassePropriete.getValeur().equalsIgnoreCase(valeur)) {
                result.add(genClassePropriete);
            }
        }
        return result;
    }

    public void addGenClassePropriete(GenClassePropriete genClassePropriete) {
    	genClassePropriete.setReferenceGenClasse(this);
        genClasseProprietes.add(genClassePropriete);
    }
    public List<GenClassePropriete> getGenClasseProprietes() {
        return genClasseProprietes;
    }
    public void setGenClasseProprietes(List<GenClassePropriete> genClasseProprietes) {
        this.genClasseProprietes = genClasseProprietes;
    }
	
    private List<GenClasseAttribut> genClasseAttributs = new ArrayList<GenClasseAttribut>();
	
    public GenClasseAttribut getGenClasseAttributForGenId(String genId) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getGenId().equalsIgnoreCase(genId)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : genId de genClasseAttribut = "+genId);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByGenId(String genId) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getGenId().equalsIgnoreCase(genId)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForNomJava(String nomJava) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : nomJava de genClasseAttribut = "+nomJava);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByNomJava(String nomJava) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNomJava().equalsIgnoreCase(nomJava)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForType(String type) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getType().equalsIgnoreCase(type)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : type de genClasseAttribut = "+type);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByType(String type) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getType().equalsIgnoreCase(type)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForNbMin(String nbMin) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNbMin().equalsIgnoreCase(nbMin)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : nbMin de genClasseAttribut = "+nbMin);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByNbMin(String nbMin) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNbMin().equalsIgnoreCase(nbMin)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForNbMax(String nbMax) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNbMax().equalsIgnoreCase(nbMax)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : nbMax de genClasseAttribut = "+nbMax);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByNbMax(String nbMax) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNbMax().equalsIgnoreCase(nbMax)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForNomSQL(String nomSQL) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNomSQL().equalsIgnoreCase(nomSQL)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : nomSQL de genClasseAttribut = "+nomSQL);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByNomSQL(String nomSQL) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getNomSQL().equalsIgnoreCase(nomSQL)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForTypeSQL(String typeSQL) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getTypeSQL().equalsIgnoreCase(typeSQL)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : typeSQL de genClasseAttribut = "+typeSQL);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByTypeSQL(String typeSQL) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getTypeSQL().equalsIgnoreCase(typeSQL)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForEstDansTable(String estDansTable) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getEstDansTable().equalsIgnoreCase(estDansTable)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : estDansTable de genClasseAttribut = "+estDansTable);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByEstDansTable(String estDansTable) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getEstDansTable().equalsIgnoreCase(estDansTable)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForSize(String size) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getSize().equalsIgnoreCase(size)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : size de genClasseAttribut = "+size);
    }

    public List<GenClasseAttribut> getGenClasseAttributsBySize(String size) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getSize().equalsIgnoreCase(size)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForEstClePrimaire(String estClePrimaire) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getEstClePrimaire().equalsIgnoreCase(estClePrimaire)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : estClePrimaire de genClasseAttribut = "+estClePrimaire);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByEstClePrimaire(String estClePrimaire) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getEstClePrimaire().equalsIgnoreCase(estClePrimaire)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForEstCleIncrementee(String estCleIncrementee) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getEstCleIncrementee().equalsIgnoreCase(estCleIncrementee)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : estCleIncrementee de genClasseAttribut = "+estCleIncrementee);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByEstCleIncrementee(String estCleIncrementee) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getEstCleIncrementee().equalsIgnoreCase(estCleIncrementee)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForAssociationId(String associationId) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getAssociationId().equalsIgnoreCase(associationId)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : associationId de genClasseAttribut = "+associationId);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByAssociationId(String associationId) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getAssociationId().equalsIgnoreCase(associationId)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public GenClasseAttribut getGenClasseAttributForDescription(String description) {
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getDescription().equalsIgnoreCase(description)) {
                return genClasseAttribut;
            }
        }
        throw new IllegalStateException("La genClasseAttribut n'est pas définie : description de genClasseAttribut = "+description);
    }

    public List<GenClasseAttribut> getGenClasseAttributsByDescription(String description) {
        List<GenClasseAttribut> result = new ArrayList<GenClasseAttribut>();
        for(GenClasseAttribut genClasseAttribut : genClasseAttributs) {
            if(genClasseAttribut.getDescription().equalsIgnoreCase(description)) {
                result.add(genClasseAttribut);
            }
        }
        return result;
    }

    public void addGenClasseAttribut(GenClasseAttribut genClasseAttribut) {
    	genClasseAttribut.setReferenceGenClasse(this);
        genClasseAttributs.add(genClasseAttribut);
    }
    public List<GenClasseAttribut> getGenClasseAttributs() {
        return genClasseAttributs;
    }
    public void setGenClasseAttributs(List<GenClasseAttribut> genClasseAttributs) {
        this.genClasseAttributs = genClasseAttributs;
    }
	
    private List<GenClasseMethode> genClasseMethodes = new ArrayList<GenClasseMethode>();
	
    public GenClasseMethode getGenClasseMethodeForGenId(String genId) {
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getGenId().equalsIgnoreCase(genId)) {
                return genClasseMethode;
            }
        }
        throw new IllegalStateException("La genClasseMethode n'est pas définie : genId de genClasseMethode = "+genId);
    }

    public List<GenClasseMethode> getGenClasseMethodesByGenId(String genId) {
        List<GenClasseMethode> result = new ArrayList<GenClasseMethode>();
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getGenId().equalsIgnoreCase(genId)) {
                result.add(genClasseMethode);
            }
        }
        return result;
    }

    public GenClasseMethode getGenClasseMethodeForNomJava(String nomJava) {
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasseMethode;
            }
        }
        throw new IllegalStateException("La genClasseMethode n'est pas définie : nomJava de genClasseMethode = "+nomJava);
    }

    public List<GenClasseMethode> getGenClasseMethodesByNomJava(String nomJava) {
        List<GenClasseMethode> result = new ArrayList<GenClasseMethode>();
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getNomJava().equalsIgnoreCase(nomJava)) {
                result.add(genClasseMethode);
            }
        }
        return result;
    }

    public GenClasseMethode getGenClasseMethodeForRetourType(String retourType) {
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getRetourType().equalsIgnoreCase(retourType)) {
                return genClasseMethode;
            }
        }
        throw new IllegalStateException("La genClasseMethode n'est pas définie : retourType de genClasseMethode = "+retourType);
    }

    public List<GenClasseMethode> getGenClasseMethodesByRetourType(String retourType) {
        List<GenClasseMethode> result = new ArrayList<GenClasseMethode>();
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getRetourType().equalsIgnoreCase(retourType)) {
                result.add(genClasseMethode);
            }
        }
        return result;
    }

    public GenClasseMethode getGenClasseMethodeForDescription(String description) {
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getDescription().equalsIgnoreCase(description)) {
                return genClasseMethode;
            }
        }
        throw new IllegalStateException("La genClasseMethode n'est pas définie : description de genClasseMethode = "+description);
    }

    public List<GenClasseMethode> getGenClasseMethodesByDescription(String description) {
        List<GenClasseMethode> result = new ArrayList<GenClasseMethode>();
        for(GenClasseMethode genClasseMethode : genClasseMethodes) {
            if(genClasseMethode.getDescription().equalsIgnoreCase(description)) {
                result.add(genClasseMethode);
            }
        }
        return result;
    }

    public void addGenClasseMethode(GenClasseMethode genClasseMethode) {
    	genClasseMethode.setReferenceGenClasse(this);
        genClasseMethodes.add(genClasseMethode);
    }
    public List<GenClasseMethode> getGenClasseMethodes() {
        return genClasseMethodes;
    }
    public void setGenClasseMethodes(List<GenClasseMethode> genClasseMethodes) {
        this.genClasseMethodes = genClasseMethodes;
    }
	
    private List<GenClasseStereotype> genClasseStereotypes = new ArrayList<GenClasseStereotype>();
	
    public GenClasseStereotype getGenClasseStereotypeForNom(String nom) {
        for(GenClasseStereotype genClasseStereotype : genClasseStereotypes) {
            if(genClasseStereotype.getNom().equalsIgnoreCase(nom)) {
                return genClasseStereotype;
            }
        }
        throw new IllegalStateException("La genClasseStereotype n'est pas définie : nom de genClasseStereotype = "+nom);
    }

    public List<GenClasseStereotype> getGenClasseStereotypesByNom(String nom) {
        List<GenClasseStereotype> result = new ArrayList<GenClasseStereotype>();
        for(GenClasseStereotype genClasseStereotype : genClasseStereotypes) {
            if(genClasseStereotype.getNom().equalsIgnoreCase(nom)) {
                result.add(genClasseStereotype);
            }
        }
        return result;
    }

    public void addGenClasseStereotype(GenClasseStereotype genClasseStereotype) {
    	genClasseStereotype.setReferenceGenClasse(this);
        genClasseStereotypes.add(genClasseStereotype);
    }
    public List<GenClasseStereotype> getGenClasseStereotypes() {
        return genClasseStereotypes;
    }
    public void setGenClasseStereotypes(List<GenClasseStereotype> genClasseStereotypes) {
        this.genClasseStereotypes = genClasseStereotypes;
    }
	
    private List<GenClasseAssociation> genClasseAssociations = new ArrayList<GenClasseAssociation>();
	
    public GenClasseAssociation getGenClasseAssociationForGenId(String genId) {
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getGenId().equalsIgnoreCase(genId)) {
                return genClasseAssociation;
            }
        }
        throw new IllegalStateException("La genClasseAssociation n'est pas définie : genId de genClasseAssociation = "+genId);
    }

    public List<GenClasseAssociation> getGenClasseAssociationsByGenId(String genId) {
        List<GenClasseAssociation> result = new ArrayList<GenClasseAssociation>();
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getGenId().equalsIgnoreCase(genId)) {
                result.add(genClasseAssociation);
            }
        }
        return result;
    }

    public GenClasseAssociation getGenClasseAssociationForNomJava(String nomJava) {
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasseAssociation;
            }
        }
        throw new IllegalStateException("La genClasseAssociation n'est pas définie : nomJava de genClasseAssociation = "+nomJava);
    }

    public List<GenClasseAssociation> getGenClasseAssociationsByNomJava(String nomJava) {
        List<GenClasseAssociation> result = new ArrayList<GenClasseAssociation>();
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getNomJava().equalsIgnoreCase(nomJava)) {
                result.add(genClasseAssociation);
            }
        }
        return result;
    }

    public GenClasseAssociation getGenClasseAssociationForClasseGenId(String classeGenId) {
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseAssociation;
            }
        }
        throw new IllegalStateException("La genClasseAssociation n'est pas définie : classeGenId de genClasseAssociation = "+classeGenId);
    }

    public List<GenClasseAssociation> getGenClasseAssociationsByClasseGenId(String classeGenId) {
        List<GenClasseAssociation> result = new ArrayList<GenClasseAssociation>();
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                result.add(genClasseAssociation);
            }
        }
        return result;
    }

    public GenClasseAssociation getGenClasseAssociationForNbMin(String nbMin) {
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getNbMin().equalsIgnoreCase(nbMin)) {
                return genClasseAssociation;
            }
        }
        throw new IllegalStateException("La genClasseAssociation n'est pas définie : nbMin de genClasseAssociation = "+nbMin);
    }

    public List<GenClasseAssociation> getGenClasseAssociationsByNbMin(String nbMin) {
        List<GenClasseAssociation> result = new ArrayList<GenClasseAssociation>();
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getNbMin().equalsIgnoreCase(nbMin)) {
                result.add(genClasseAssociation);
            }
        }
        return result;
    }

    public GenClasseAssociation getGenClasseAssociationForNbMax(String nbMax) {
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getNbMax().equalsIgnoreCase(nbMax)) {
                return genClasseAssociation;
            }
        }
        throw new IllegalStateException("La genClasseAssociation n'est pas définie : nbMax de genClasseAssociation = "+nbMax);
    }

    public List<GenClasseAssociation> getGenClasseAssociationsByNbMax(String nbMax) {
        List<GenClasseAssociation> result = new ArrayList<GenClasseAssociation>();
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getNbMax().equalsIgnoreCase(nbMax)) {
                result.add(genClasseAssociation);
            }
        }
        return result;
    }

    public GenClasseAssociation getGenClasseAssociationForDescription(String description) {
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getDescription().equalsIgnoreCase(description)) {
                return genClasseAssociation;
            }
        }
        throw new IllegalStateException("La genClasseAssociation n'est pas définie : description de genClasseAssociation = "+description);
    }

    public List<GenClasseAssociation> getGenClasseAssociationsByDescription(String description) {
        List<GenClasseAssociation> result = new ArrayList<GenClasseAssociation>();
        for(GenClasseAssociation genClasseAssociation : genClasseAssociations) {
            if(genClasseAssociation.getDescription().equalsIgnoreCase(description)) {
                result.add(genClasseAssociation);
            }
        }
        return result;
    }

    public void addGenClasseAssociation(GenClasseAssociation genClasseAssociation) {
    	genClasseAssociation.setReferenceGenClasse(this);
        genClasseAssociations.add(genClasseAssociation);
    }
    public List<GenClasseAssociation> getGenClasseAssociations() {
        return genClasseAssociations;
    }
    public void setGenClasseAssociations(List<GenClasseAssociation> genClasseAssociations) {
        this.genClasseAssociations = genClasseAssociations;
    }
	
    private List<GenClasseParent> genClasseParents = new ArrayList<GenClasseParent>();
	
    public GenClasseParent getGenClasseParentForClasseGenId(String classeGenId) {
        for(GenClasseParent genClasseParent : genClasseParents) {
            if(genClasseParent.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseParent;
            }
        }
        throw new IllegalStateException("La genClasseParent n'est pas définie : classeGenId de genClasseParent = "+classeGenId);
    }

    public List<GenClasseParent> getGenClasseParentsByClasseGenId(String classeGenId) {
        List<GenClasseParent> result = new ArrayList<GenClasseParent>();
        for(GenClasseParent genClasseParent : genClasseParents) {
            if(genClasseParent.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                result.add(genClasseParent);
            }
        }
        return result;
    }

    public void addGenClasseParent(GenClasseParent genClasseParent) {
    	genClasseParent.setReferenceGenClasse(this);
        genClasseParents.add(genClasseParent);
    }
    public List<GenClasseParent> getGenClasseParents() {
        return genClasseParents;
    }
    public void setGenClasseParents(List<GenClasseParent> genClasseParents) {
        this.genClasseParents = genClasseParents;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getGenIdAsString() {
		return this.genId;
	}
	public void setGenIdAsString(String genIdAsString) {
		this.genId = genIdAsString;
	}

	public String getNomJavaAsString() {
		return this.nomJava;
	}
	public void setNomJavaAsString(String nomJavaAsString) {
		this.nomJava = nomJavaAsString;
	}

	public String getPackageJavaAsString() {
		return this.packageJava;
	}
	public void setPackageJavaAsString(String packageJavaAsString) {
		this.packageJava = packageJavaAsString;
	}

	public String getNomTableAsString() {
		return this.nomTable;
	}
	public void setNomTableAsString(String nomTableAsString) {
		this.nomTable = nomTableAsString;
	}

	public String getNomVueAsString() {
		return this.nomVue;
	}
	public void setNomVueAsString(String nomVueAsString) {
		this.nomVue = nomVueAsString;
	}

	public String getDescriptionAsString() {
		return this.description;
	}
	public void setDescriptionAsString(String descriptionAsString) {
		this.description = descriptionAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String genId = null;
	private String nomJava = null;
	private String packageJava = null;
	private String nomTable = null;
	private String nomVue = null;
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

	public String getPackageJava() {
		return this.packageJava;
	}
	public void setPackageJava(String packageJava) {
		this.packageJava = packageJava;
	}

	public String getNomTable() {
		return this.nomTable;
	}
	public void setNomTable(String nomTable) {
		this.nomTable = nomTable;
	}

	public String getNomVue() {
		return this.nomVue;
	}
	public void setNomVue(String nomVue) {
		this.nomVue = nomVue;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
