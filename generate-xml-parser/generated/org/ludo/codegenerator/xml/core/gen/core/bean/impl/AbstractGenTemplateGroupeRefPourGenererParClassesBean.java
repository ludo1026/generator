package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeRefPourGenererParClassesBean implements GenTemplateGroupeRefPourGenererParClasses {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParClasse referenceGenGenererParClasse;
	
	public GenGenererParClasse getReferenceGenGenererParClasse() {
		return referenceGenGenererParClasse;
	}
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse) {
		this.referenceGenGenererParClasse = referenceGenGenererParClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupeRefPourGenererParClasse> genTemplateGroupeRefPourGenererParClasses = new ArrayList<GenTemplateGroupeRefPourGenererParClasse>();
	
    public GenTemplateGroupeRefPourGenererParClasse getGenTemplateGroupeRefPourGenererParClasseForTemplateGroupeNom(String templateGroupeNom) {
        for(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse : genTemplateGroupeRefPourGenererParClasses) {
            if(genTemplateGroupeRefPourGenererParClasse.getTemplateGroupeNom().equalsIgnoreCase(templateGroupeNom)) {
                return genTemplateGroupeRefPourGenererParClasse;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeRefPourGenererParClasse n'est pas définie : templateGroupeNom de genTemplateGroupeRefPourGenererParClasse = "+templateGroupeNom);
    }
    public void addGenTemplateGroupeRefPourGenererParClasse(GenTemplateGroupeRefPourGenererParClasse genTemplateGroupeRefPourGenererParClasse) {
    	genTemplateGroupeRefPourGenererParClasse.setReferenceGenTemplateGroupeRefPourGenererParClasses(this);
        genTemplateGroupeRefPourGenererParClasses.add(genTemplateGroupeRefPourGenererParClasse);
    }
    public List<GenTemplateGroupeRefPourGenererParClasse> getGenTemplateGroupeRefPourGenererParClasses() {
        return genTemplateGroupeRefPourGenererParClasses;
    }
    public void setGenTemplateGroupeRefPourGenererParClasses(List<GenTemplateGroupeRefPourGenererParClasse> genTemplateGroupeRefPourGenererParClasses) {
        this.genTemplateGroupeRefPourGenererParClasses = genTemplateGroupeRefPourGenererParClasses;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genTemplateGroupeRefPourGenererParClasses.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplateGroupeRefPourGenererParClasses.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplateGroupeRefPourGenererParClasses.contains(o);
	}

	@Override
	public Iterator<GenTemplateGroupeRefPourGenererParClasse> iterator() {
		return this.genTemplateGroupeRefPourGenererParClasses.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplateGroupeRefPourGenererParClasses.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplateGroupeRefPourGenererParClasses.toArray(a);
	}

	@Override
	public boolean add(final GenTemplateGroupeRefPourGenererParClasse e) {
		return this.genTemplateGroupeRefPourGenererParClasses.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplateGroupeRefPourGenererParClasses.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParClasses.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplateGroupeRefPourGenererParClasse> c) {
		return this.genTemplateGroupeRefPourGenererParClasses.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplateGroupeRefPourGenererParClasse> c) {
		return this.genTemplateGroupeRefPourGenererParClasses.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParClasses.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParClasses.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplateGroupeRefPourGenererParClasses.clear();
	}

	@Override
	public GenTemplateGroupeRefPourGenererParClasse get(final int index) {
		return this.genTemplateGroupeRefPourGenererParClasses.get(index);
	}

	@Override
	public GenTemplateGroupeRefPourGenererParClasse set(final int index, final GenTemplateGroupeRefPourGenererParClasse element) {
		return this.genTemplateGroupeRefPourGenererParClasses.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplateGroupeRefPourGenererParClasse element) {
		this.genTemplateGroupeRefPourGenererParClasses.add(index, element);
	}

	@Override
	public GenTemplateGroupeRefPourGenererParClasse remove(final int index) {
		return this.genTemplateGroupeRefPourGenererParClasses.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplateGroupeRefPourGenererParClasses.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplateGroupeRefPourGenererParClasses.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplateGroupeRefPourGenererParClasse> listIterator() {
		return this.genTemplateGroupeRefPourGenererParClasses.listIterator();
	}

	@Override
	public ListIterator<GenTemplateGroupeRefPourGenererParClasse> listIterator(final int index) {
		return this.genTemplateGroupeRefPourGenererParClasses.listIterator(index);
	}

	@Override
	public List<GenTemplateGroupeRefPourGenererParClasse> subList(final int fromIndex, final int toIndex) {
		return this.genTemplateGroupeRefPourGenererParClasses.subList(fromIndex, toIndex);
	}
}
