package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererParTemplatesBean implements GenGenererParTemplates {
	
	/** Récupération de l'élément parent */
	
	private GenGenererGroupe referenceGenGenererGroupe;
	
	public GenGenererGroupe getReferenceGenGenererGroupe() {
		return referenceGenGenererGroupe;
	}
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe) {
		this.referenceGenGenererGroupe = referenceGenGenererGroupe;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenererParTemplate> genGenererParTemplates = new ArrayList<GenGenererParTemplate>();
	
    public void addGenGenererParTemplate(GenGenererParTemplate genGenererParTemplate) {
    	genGenererParTemplate.setReferenceGenGenererParTemplates(this);
        genGenererParTemplates.add(genGenererParTemplate);
    }
    public List<GenGenererParTemplate> getGenGenererParTemplates() {
        return genGenererParTemplates;
    }
    public void setGenGenererParTemplates(List<GenGenererParTemplate> genGenererParTemplates) {
        this.genGenererParTemplates = genGenererParTemplates;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genGenererParTemplates.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenererParTemplates.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenererParTemplates.contains(o);
	}

	@Override
	public Iterator<GenGenererParTemplate> iterator() {
		return this.genGenererParTemplates.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenererParTemplates.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenererParTemplates.toArray(a);
	}

	@Override
	public boolean add(final GenGenererParTemplate e) {
		return this.genGenererParTemplates.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenererParTemplates.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenererParTemplates.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenererParTemplate> c) {
		return this.genGenererParTemplates.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenererParTemplate> c) {
		return this.genGenererParTemplates.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenererParTemplates.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenererParTemplates.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenererParTemplates.clear();
	}

	@Override
	public GenGenererParTemplate get(final int index) {
		return this.genGenererParTemplates.get(index);
	}

	@Override
	public GenGenererParTemplate set(final int index, final GenGenererParTemplate element) {
		return this.genGenererParTemplates.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenererParTemplate element) {
		this.genGenererParTemplates.add(index, element);
	}

	@Override
	public GenGenererParTemplate remove(final int index) {
		return this.genGenererParTemplates.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenererParTemplates.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenererParTemplates.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenererParTemplate> listIterator() {
		return this.genGenererParTemplates.listIterator();
	}

	@Override
	public ListIterator<GenGenererParTemplate> listIterator(final int index) {
		return this.genGenererParTemplates.listIterator(index);
	}

	@Override
	public List<GenGenererParTemplate> subList(final int fromIndex, final int toIndex) {
		return this.genGenererParTemplates.subList(fromIndex, toIndex);
	}
}
