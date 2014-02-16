package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererParClassesBean implements GenGenererParClasses {
	
	/** Récupération de l'élément parent */
	
	private GenGenerate referenceGenGenerate;
	
	public GenGenerate getReferenceGenGenerate() {
		return referenceGenGenerate;
	}
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate) {
		this.referenceGenGenerate = referenceGenGenerate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenererParClasse> genGenererParClasses = new ArrayList<GenGenererParClasse>();
	
    public void addGenGenererParClasse(GenGenererParClasse genGenererParClasse) {
    	genGenererParClasse.setReferenceGenGenererParClasses(this);
        genGenererParClasses.add(genGenererParClasse);
    }
    public List<GenGenererParClasse> getGenGenererParClasses() {
        return genGenererParClasses;
    }
    public void setGenGenererParClasses(List<GenGenererParClasse> genGenererParClasses) {
        this.genGenererParClasses = genGenererParClasses;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genGenererParClasses.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenererParClasses.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenererParClasses.contains(o);
	}

	@Override
	public Iterator<GenGenererParClasse> iterator() {
		return this.genGenererParClasses.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenererParClasses.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenererParClasses.toArray(a);
	}

	@Override
	public boolean add(final GenGenererParClasse e) {
		return this.genGenererParClasses.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenererParClasses.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenererParClasses.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenererParClasse> c) {
		return this.genGenererParClasses.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenererParClasse> c) {
		return this.genGenererParClasses.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenererParClasses.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenererParClasses.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenererParClasses.clear();
	}

	@Override
	public GenGenererParClasse get(final int index) {
		return this.genGenererParClasses.get(index);
	}

	@Override
	public GenGenererParClasse set(final int index, final GenGenererParClasse element) {
		return this.genGenererParClasses.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenererParClasse element) {
		this.genGenererParClasses.add(index, element);
	}

	@Override
	public GenGenererParClasse remove(final int index) {
		return this.genGenererParClasses.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenererParClasses.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenererParClasses.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenererParClasse> listIterator() {
		return this.genGenererParClasses.listIterator();
	}

	@Override
	public ListIterator<GenGenererParClasse> listIterator(final int index) {
		return this.genGenererParClasses.listIterator(index);
	}

	@Override
	public List<GenGenererParClasse> subList(final int fromIndex, final int toIndex) {
		return this.genGenererParClasses.subList(fromIndex, toIndex);
	}
}
