package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateBean implements GenGenerate {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenerateByClasse> genGenerateByClasses = new ArrayList<GenGenerateByClasse>();
	
    public GenGenerateByClasse getGenGenerateByClasseForClasseGenId(String classeGenId) {
        for(GenGenerateByClasse genGenerateByClasse : genGenerateByClasses) {
            if(genGenerateByClasse.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genGenerateByClasse;
            }
        }
        throw new IllegalStateException("La genGenerateByClasse n'est pas définie : classeGenId de genGenerateByClasse = "+classeGenId);
    }

    public List<GenGenerateByClasse> getGenGenerateByClassesByClasseGenId(String classeGenId) {
        List<GenGenerateByClasse> result = new ArrayList<GenGenerateByClasse>();
        for(GenGenerateByClasse genGenerateByClasse : genGenerateByClasses) {
            if(genGenerateByClasse.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                result.add(genGenerateByClasse);
            }
        }
        return result;
    }

    public void addGenGenerateByClasse(GenGenerateByClasse genGenerateByClasse) {
    	genGenerateByClasse.setReferenceGenGenerate(this);
        genGenerateByClasses.add(genGenerateByClasse);
    }
    public List<GenGenerateByClasse> getGenGenerateByClasses() {
        return genGenerateByClasses;
    }
    public void setGenGenerateByClasses(List<GenGenerateByClasse> genGenerateByClasses) {
        this.genGenerateByClasses = genGenerateByClasses;
    }
	
    private List<GenGenerateByTemplateGroupe> genGenerateByTemplateGroupes = new ArrayList<GenGenerateByTemplateGroupe>();
	
    public GenGenerateByTemplateGroupe getGenGenerateByTemplateGroupeForTemplateGroupe(String templateGroupe) {
        for(GenGenerateByTemplateGroupe genGenerateByTemplateGroupe : genGenerateByTemplateGroupes) {
            if(genGenerateByTemplateGroupe.getTemplateGroupe().equalsIgnoreCase(templateGroupe)) {
                return genGenerateByTemplateGroupe;
            }
        }
        throw new IllegalStateException("La genGenerateByTemplateGroupe n'est pas définie : templateGroupe de genGenerateByTemplateGroupe = "+templateGroupe);
    }

    public List<GenGenerateByTemplateGroupe> getGenGenerateByTemplateGroupesByTemplateGroupe(String templateGroupe) {
        List<GenGenerateByTemplateGroupe> result = new ArrayList<GenGenerateByTemplateGroupe>();
        for(GenGenerateByTemplateGroupe genGenerateByTemplateGroupe : genGenerateByTemplateGroupes) {
            if(genGenerateByTemplateGroupe.getTemplateGroupe().equalsIgnoreCase(templateGroupe)) {
                result.add(genGenerateByTemplateGroupe);
            }
        }
        return result;
    }

    public void addGenGenerateByTemplateGroupe(GenGenerateByTemplateGroupe genGenerateByTemplateGroupe) {
    	genGenerateByTemplateGroupe.setReferenceGenGenerate(this);
        genGenerateByTemplateGroupes.add(genGenerateByTemplateGroupe);
    }
    public List<GenGenerateByTemplateGroupe> getGenGenerateByTemplateGroupes() {
        return genGenerateByTemplateGroupes;
    }
    public void setGenGenerateByTemplateGroupes(List<GenGenerateByTemplateGroupe> genGenerateByTemplateGroupes) {
        this.genGenerateByTemplateGroupes = genGenerateByTemplateGroupes;
    }
	
    private List<GenGenerateByStereotype> genGenerateByStereotypes = new ArrayList<GenGenerateByStereotype>();
	
    public GenGenerateByStereotype getGenGenerateByStereotypeForStereotype(String stereotype) {
        for(GenGenerateByStereotype genGenerateByStereotype : genGenerateByStereotypes) {
            if(genGenerateByStereotype.getStereotype().equalsIgnoreCase(stereotype)) {
                return genGenerateByStereotype;
            }
        }
        throw new IllegalStateException("La genGenerateByStereotype n'est pas définie : stereotype de genGenerateByStereotype = "+stereotype);
    }

    public List<GenGenerateByStereotype> getGenGenerateByStereotypesByStereotype(String stereotype) {
        List<GenGenerateByStereotype> result = new ArrayList<GenGenerateByStereotype>();
        for(GenGenerateByStereotype genGenerateByStereotype : genGenerateByStereotypes) {
            if(genGenerateByStereotype.getStereotype().equalsIgnoreCase(stereotype)) {
                result.add(genGenerateByStereotype);
            }
        }
        return result;
    }

    public void addGenGenerateByStereotype(GenGenerateByStereotype genGenerateByStereotype) {
    	genGenerateByStereotype.setReferenceGenGenerate(this);
        genGenerateByStereotypes.add(genGenerateByStereotype);
    }
    public List<GenGenerateByStereotype> getGenGenerateByStereotypes() {
        return genGenerateByStereotypes;
    }
    public void setGenGenerateByStereotypes(List<GenGenerateByStereotype> genGenerateByStereotypes) {
        this.genGenerateByStereotypes = genGenerateByStereotypes;
    }
	

}
