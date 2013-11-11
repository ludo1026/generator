package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;

public class AbstractGenTemplatesBean implements GenTemplates {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen = null;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List listeGenTemplate = new ArrayList();
	
    public GenTemplate getGenTemplateByNom(String nom) {
        for(Iterator iter = listeGenTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateBean genTemplate = (GenTemplateBean) iter.next();
            if(genTemplate.getNom().equalsIgnoreCase(nom)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : nom de genTemplate = "+nom);
    }
    public GenTemplate getGenTemplateByFile(String file) {
        for(Iterator iter = listeGenTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateBean genTemplate = (GenTemplateBean) iter.next();
            if(genTemplate.getFile().equalsIgnoreCase(file)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : file de genTemplate = "+file);
    }
    public GenTemplate getGenTemplateByOutDir(String outDir) {
        for(Iterator iter = listeGenTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateBean genTemplate = (GenTemplateBean) iter.next();
            if(genTemplate.getOutDir().equalsIgnoreCase(outDir)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : outDir de genTemplate = "+outDir);
    }
    public GenTemplate getGenTemplateByOutFile(String outFile) {
        for(Iterator iter = listeGenTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateBean genTemplate = (GenTemplateBean) iter.next();
            if(genTemplate.getOutFile().equalsIgnoreCase(outFile)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : outFile de genTemplate = "+outFile);
    }
    public GenTemplate getGenTemplateByPackageJava(String packageJava) {
        for(Iterator iter = listeGenTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateBean genTemplate = (GenTemplateBean) iter.next();
            if(genTemplate.getPackageJava().equalsIgnoreCase(packageJava)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : packageJava de genTemplate = "+packageJava);
    }
    public GenTemplate getGenTemplateByNomElementGenere(String nomElementGenere) {
        for(Iterator iter = listeGenTemplate.iterator(); iter.hasNext(); ) {
            GenTemplateBean genTemplate = (GenTemplateBean) iter.next();
            if(genTemplate.getNomElementGenere().equalsIgnoreCase(nomElementGenere)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : nomElementGenere de genTemplate = "+nomElementGenere);
    }
    public void addGenTemplate(GenTemplate genTemplate) {
    	genTemplate.setReferenceGenTemplates(this);
        listeGenTemplate.add(genTemplate);
    }
    public List getListeGenTemplate() {
        return listeGenTemplate;
    }
    public void setListeGenTemplate(List listeGenTemplate) {
        this.listeGenTemplate = listeGenTemplate;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getInDirAsString() {
		return this.inDir;
	}
	public void setInDirAsString(String inDirAsString) {
		this.inDir = inDirAsString;
	}

	public String getOutDirAsString() {
		return this.outDir;
	}
	public void setOutDirAsString(String outDirAsString) {
		this.outDir = outDirAsString;
	}

	public String getPackageJavaBaseAsString() {
		return this.packageJavaBase;
	}
	public void setPackageJavaBaseAsString(String packageJavaBaseAsString) {
		this.packageJavaBase = packageJavaBaseAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String inDir = null;
	private String outDir = null;
	private String packageJavaBase = null;

	public String getInDir() {
		return this.inDir;
	}
	public void setInDir(String inDir) {
		this.inDir = inDir;
	}

	public String getOutDir() {
		return this.outDir;
	}
	public void setOutDir(String outDir) {
		this.outDir = outDir;
	}

	public String getPackageJavaBase() {
		return this.packageJavaBase;
	}
	public void setPackageJavaBase(String packageJavaBase) {
		this.packageJavaBase = packageJavaBase;
	}
}
