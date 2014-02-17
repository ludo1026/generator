package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodePropriete;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeParametre;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseMethodeStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseMethodeBean implements GenClasseMethode {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseMethodePropriete> genClasseMethodeProprietes = new ArrayList<GenClasseMethodePropriete>();
	
    public GenClasseMethodePropriete getGenClasseMethodeProprieteForNom(String nom) {
        for(GenClasseMethodePropriete genClasseMethodePropriete : genClasseMethodeProprietes) {
            if(genClasseMethodePropriete.getNom().equalsIgnoreCase(nom)) {
                return genClasseMethodePropriete;
            }
        }
        throw new IllegalStateException("La genClasseMethodePropriete n'est pas définie : nom de genClasseMethodePropriete = "+nom);
    }

    public List<GenClasseMethodePropriete> getGenClasseMethodeProprietesByNom(String nom) {
        List<GenClasseMethodePropriete> result = new ArrayList<GenClasseMethodePropriete>();
        for(GenClasseMethodePropriete genClasseMethodePropriete : genClasseMethodeProprietes) {
            if(genClasseMethodePropriete.getNom().equalsIgnoreCase(nom)) {
                result.add(genClasseMethodePropriete);
            }
        }
        return result;
    }

    public GenClasseMethodePropriete getGenClasseMethodeProprieteForValeur(String valeur) {
        for(GenClasseMethodePropriete genClasseMethodePropriete : genClasseMethodeProprietes) {
            if(genClasseMethodePropriete.getValeur().equalsIgnoreCase(valeur)) {
                return genClasseMethodePropriete;
            }
        }
        throw new IllegalStateException("La genClasseMethodePropriete n'est pas définie : valeur de genClasseMethodePropriete = "+valeur);
    }

    public List<GenClasseMethodePropriete> getGenClasseMethodeProprietesByValeur(String valeur) {
        List<GenClasseMethodePropriete> result = new ArrayList<GenClasseMethodePropriete>();
        for(GenClasseMethodePropriete genClasseMethodePropriete : genClasseMethodeProprietes) {
            if(genClasseMethodePropriete.getValeur().equalsIgnoreCase(valeur)) {
                result.add(genClasseMethodePropriete);
            }
        }
        return result;
    }

    public void addGenClasseMethodePropriete(GenClasseMethodePropriete genClasseMethodePropriete) {
    	genClasseMethodePropriete.setReferenceGenClasseMethode(this);
        genClasseMethodeProprietes.add(genClasseMethodePropriete);
    }
    public List<GenClasseMethodePropriete> getGenClasseMethodeProprietes() {
        return genClasseMethodeProprietes;
    }
    public void setGenClasseMethodeProprietes(List<GenClasseMethodePropriete> genClasseMethodeProprietes) {
        this.genClasseMethodeProprietes = genClasseMethodeProprietes;
    }
	
    private List<GenClasseMethodeParametre> genClasseMethodeParametres = new ArrayList<GenClasseMethodeParametre>();
	
    public GenClasseMethodeParametre getGenClasseMethodeParametreForGenId(String genId) {
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getGenId().equalsIgnoreCase(genId)) {
                return genClasseMethodeParametre;
            }
        }
        throw new IllegalStateException("La genClasseMethodeParametre n'est pas définie : genId de genClasseMethodeParametre = "+genId);
    }

    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByGenId(String genId) {
        List<GenClasseMethodeParametre> result = new ArrayList<GenClasseMethodeParametre>();
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getGenId().equalsIgnoreCase(genId)) {
                result.add(genClasseMethodeParametre);
            }
        }
        return result;
    }

    public GenClasseMethodeParametre getGenClasseMethodeParametreForNomJava(String nomJava) {
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasseMethodeParametre;
            }
        }
        throw new IllegalStateException("La genClasseMethodeParametre n'est pas définie : nomJava de genClasseMethodeParametre = "+nomJava);
    }

    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByNomJava(String nomJava) {
        List<GenClasseMethodeParametre> result = new ArrayList<GenClasseMethodeParametre>();
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getNomJava().equalsIgnoreCase(nomJava)) {
                result.add(genClasseMethodeParametre);
            }
        }
        return result;
    }

    public GenClasseMethodeParametre getGenClasseMethodeParametreForType(String type) {
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getType().equalsIgnoreCase(type)) {
                return genClasseMethodeParametre;
            }
        }
        throw new IllegalStateException("La genClasseMethodeParametre n'est pas définie : type de genClasseMethodeParametre = "+type);
    }

    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByType(String type) {
        List<GenClasseMethodeParametre> result = new ArrayList<GenClasseMethodeParametre>();
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getType().equalsIgnoreCase(type)) {
                result.add(genClasseMethodeParametre);
            }
        }
        return result;
    }

    public GenClasseMethodeParametre getGenClasseMethodeParametreForDescription(String description) {
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getDescription().equalsIgnoreCase(description)) {
                return genClasseMethodeParametre;
            }
        }
        throw new IllegalStateException("La genClasseMethodeParametre n'est pas définie : description de genClasseMethodeParametre = "+description);
    }

    public List<GenClasseMethodeParametre> getGenClasseMethodeParametresByDescription(String description) {
        List<GenClasseMethodeParametre> result = new ArrayList<GenClasseMethodeParametre>();
        for(GenClasseMethodeParametre genClasseMethodeParametre : genClasseMethodeParametres) {
            if(genClasseMethodeParametre.getDescription().equalsIgnoreCase(description)) {
                result.add(genClasseMethodeParametre);
            }
        }
        return result;
    }

    public void addGenClasseMethodeParametre(GenClasseMethodeParametre genClasseMethodeParametre) {
    	genClasseMethodeParametre.setReferenceGenClasseMethode(this);
        genClasseMethodeParametres.add(genClasseMethodeParametre);
    }
    public List<GenClasseMethodeParametre> getGenClasseMethodeParametres() {
        return genClasseMethodeParametres;
    }
    public void setGenClasseMethodeParametres(List<GenClasseMethodeParametre> genClasseMethodeParametres) {
        this.genClasseMethodeParametres = genClasseMethodeParametres;
    }
	
    private List<GenClasseMethodeStereotype> genClasseMethodeStereotypes = new ArrayList<GenClasseMethodeStereotype>();
	
    public GenClasseMethodeStereotype getGenClasseMethodeStereotypeForNom(String nom) {
        for(GenClasseMethodeStereotype genClasseMethodeStereotype : genClasseMethodeStereotypes) {
            if(genClasseMethodeStereotype.getNom().equalsIgnoreCase(nom)) {
                return genClasseMethodeStereotype;
            }
        }
        throw new IllegalStateException("La genClasseMethodeStereotype n'est pas définie : nom de genClasseMethodeStereotype = "+nom);
    }

    public List<GenClasseMethodeStereotype> getGenClasseMethodeStereotypesByNom(String nom) {
        List<GenClasseMethodeStereotype> result = new ArrayList<GenClasseMethodeStereotype>();
        for(GenClasseMethodeStereotype genClasseMethodeStereotype : genClasseMethodeStereotypes) {
            if(genClasseMethodeStereotype.getNom().equalsIgnoreCase(nom)) {
                result.add(genClasseMethodeStereotype);
            }
        }
        return result;
    }

    public void addGenClasseMethodeStereotype(GenClasseMethodeStereotype genClasseMethodeStereotype) {
    	genClasseMethodeStereotype.setReferenceGenClasseMethode(this);
        genClasseMethodeStereotypes.add(genClasseMethodeStereotype);
    }
    public List<GenClasseMethodeStereotype> getGenClasseMethodeStereotypes() {
        return genClasseMethodeStereotypes;
    }
    public void setGenClasseMethodeStereotypes(List<GenClasseMethodeStereotype> genClasseMethodeStereotypes) {
        this.genClasseMethodeStereotypes = genClasseMethodeStereotypes;
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

	public String getRetourTypeAsString() {
		return this.retourType;
	}
	public void setRetourTypeAsString(String retourTypeAsString) {
		this.retourType = retourTypeAsString;
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
	private String retourType = null;
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

	public String getRetourType() {
		return this.retourType;
	}
	public void setRetourType(String retourType) {
		this.retourType = retourType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
