package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseRefPourGenererParClassesBean implements GenClasseRefPourGenererParClasses {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParClasse referenceGenGenererParClasse;
	
	public GenGenererParClasse getReferenceGenGenererParClasse() {
		return referenceGenGenererParClasse;
	}
	
	public void setReferenceGenGenererParClasse(GenGenererParClasse referenceGenGenererParClasse) {
		this.referenceGenGenererParClasse = referenceGenGenererParClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseRefPourGenererParClasse> genClasseRefPourGenererParClasses = new ArrayList<GenClasseRefPourGenererParClasse>();
	
    public GenClasseRefPourGenererParClasse getGenClasseRefPourGenererParClasseForClasseGenId(String classeGenId) {
        for(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse : genClasseRefPourGenererParClasses) {
            if(genClasseRefPourGenererParClasse.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseRefPourGenererParClasse;
            }
        }
        throw new IllegalStateException("La genClasseRefPourGenererParClasse n'est pas définie : classeGenId de genClasseRefPourGenererParClasse = "+classeGenId);
    }
    public void addGenClasseRefPourGenererParClasse(GenClasseRefPourGenererParClasse genClasseRefPourGenererParClasse) {
    	genClasseRefPourGenererParClasse.setReferenceGenClasseRefPourGenererParClasses(this);
        genClasseRefPourGenererParClasses.add(genClasseRefPourGenererParClasse);
    }
    public List<GenClasseRefPourGenererParClasse> getGenClasseRefPourGenererParClasses() {
        return genClasseRefPourGenererParClasses;
    }
    public void setGenClasseRefPourGenererParClasses(List<GenClasseRefPourGenererParClasse> genClasseRefPourGenererParClasses) {
        this.genClasseRefPourGenererParClasses = genClasseRefPourGenererParClasses;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genClasseRefPourGenererParClasses.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genClasseRefPourGenererParClasses.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genClasseRefPourGenererParClasses.contains(o);
	}

	@Override
	public Iterator<GenClasseRefPourGenererParClasse> iterator() {
		return this.genClasseRefPourGenererParClasses.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genClasseRefPourGenererParClasses.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genClasseRefPourGenererParClasses.toArray(a);
	}

	@Override
	public boolean add(final GenClasseRefPourGenererParClasse e) {
		return this.genClasseRefPourGenererParClasses.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genClasseRefPourGenererParClasses.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genClasseRefPourGenererParClasses.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenClasseRefPourGenererParClasse> c) {
		return this.genClasseRefPourGenererParClasses.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenClasseRefPourGenererParClasse> c) {
		return this.genClasseRefPourGenererParClasses.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genClasseRefPourGenererParClasses.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genClasseRefPourGenererParClasses.retainAll(c);
	}

	@Override
	public void clear() {
		this.genClasseRefPourGenererParClasses.clear();
	}

	@Override
	public GenClasseRefPourGenererParClasse get(final int index) {
		return this.genClasseRefPourGenererParClasses.get(index);
	}

	@Override
	public GenClasseRefPourGenererParClasse set(final int index, final GenClasseRefPourGenererParClasse element) {
		return this.genClasseRefPourGenererParClasses.set(index, element);
	}

	@Override
	public void add(final int index, final GenClasseRefPourGenererParClasse element) {
		this.genClasseRefPourGenererParClasses.add(index, element);
	}

	@Override
	public GenClasseRefPourGenererParClasse remove(final int index) {
		return this.genClasseRefPourGenererParClasses.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genClasseRefPourGenererParClasses.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genClasseRefPourGenererParClasses.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenClasseRefPourGenererParClasse> listIterator() {
		return this.genClasseRefPourGenererParClasses.listIterator();
	}

	@Override
	public ListIterator<GenClasseRefPourGenererParClasse> listIterator(final int index) {
		return this.genClasseRefPourGenererParClasses.listIterator(index);
	}

	@Override
	public List<GenClasseRefPourGenererParClasse> subList(final int fromIndex, final int toIndex) {
		return this.genClasseRefPourGenererParClasses.subList(fromIndex, toIndex);
	}
}
