package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplatesBean implements GenTemplates {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplate> genTemplates = new ArrayList<GenTemplate>();
	
    public GenTemplate getGenTemplateForNom(String nom) {
        for(GenTemplate genTemplate : genTemplates) {
            if(genTemplate.getNom().equalsIgnoreCase(nom)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : nom de genTemplate = "+nom);
    }
    public GenTemplate getGenTemplateForFile(String file) {
        for(GenTemplate genTemplate : genTemplates) {
            if(genTemplate.getFile().equalsIgnoreCase(file)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : file de genTemplate = "+file);
    }
    public GenTemplate getGenTemplateForOutDir(String outDir) {
        for(GenTemplate genTemplate : genTemplates) {
            if(genTemplate.getOutDir().equalsIgnoreCase(outDir)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : outDir de genTemplate = "+outDir);
    }
    public GenTemplate getGenTemplateForOutFile(String outFile) {
        for(GenTemplate genTemplate : genTemplates) {
            if(genTemplate.getOutFile().equalsIgnoreCase(outFile)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : outFile de genTemplate = "+outFile);
    }
    public GenTemplate getGenTemplateForPackageJava(String packageJava) {
        for(GenTemplate genTemplate : genTemplates) {
            if(genTemplate.getPackageJava().equalsIgnoreCase(packageJava)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : packageJava de genTemplate = "+packageJava);
    }
    public GenTemplate getGenTemplateForNomElementGenere(String nomElementGenere) {
        for(GenTemplate genTemplate : genTemplates) {
            if(genTemplate.getNomElementGenere().equalsIgnoreCase(nomElementGenere)) {
                return genTemplate;
            }
        }
        throw new IllegalStateException("La genTemplate n'est pas définie : nomElementGenere de genTemplate = "+nomElementGenere);
    }
    public void addGenTemplate(GenTemplate genTemplate) {
    	genTemplate.setReferenceGenTemplates(this);
        genTemplates.add(genTemplate);
    }
    public List<GenTemplate> getGenTemplates() {
        return genTemplates;
    }
    public void setGenTemplates(List<GenTemplate> genTemplates) {
        this.genTemplates = genTemplates;
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

	@Override
	public int size() {
		return this.genTemplates.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplates.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplates.contains(o);
	}

	@Override
	public Iterator<GenTemplate> iterator() {
		return this.genTemplates.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplates.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplates.toArray(a);
	}

	@Override
	public boolean add(final GenTemplate e) {
		return this.genTemplates.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplates.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplates.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplate> c) {
		return this.genTemplates.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplate> c) {
		return this.genTemplates.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplates.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplates.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplates.clear();
	}

	@Override
	public GenTemplate get(final int index) {
		return this.genTemplates.get(index);
	}

	@Override
	public GenTemplate set(final int index, final GenTemplate element) {
		return this.genTemplates.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplate element) {
		this.genTemplates.add(index, element);
	}

	@Override
	public GenTemplate remove(final int index) {
		return this.genTemplates.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplates.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplates.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplate> listIterator() {
		return this.genTemplates.listIterator();
	}

	@Override
	public ListIterator<GenTemplate> listIterator(final int index) {
		return this.genTemplates.listIterator(index);
	}

	@Override
	public List<GenTemplate> subList(final int fromIndex, final int toIndex) {
		return this.genTemplates.subList(fromIndex, toIndex);
	}
}
