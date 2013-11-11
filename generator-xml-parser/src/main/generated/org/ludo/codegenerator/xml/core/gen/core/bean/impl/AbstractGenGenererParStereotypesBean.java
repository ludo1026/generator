package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenererParStereotypesBean implements GenGenererParStereotypes {
	
	/** Récupération de l'élément parent */
	
	private GenGenererGroupe referenceGenGenererGroupe;
	
	public GenGenererGroupe getReferenceGenGenererGroupe() {
		return referenceGenGenererGroupe;
	}
	
	public void setReferenceGenGenererGroupe(GenGenererGroupe referenceGenGenererGroupe) {
		this.referenceGenGenererGroupe = referenceGenGenererGroupe;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenererParStereotype> genGenererParStereotypes = new ArrayList<GenGenererParStereotype>();
	
    public void addGenGenererParStereotype(GenGenererParStereotype genGenererParStereotype) {
    	genGenererParStereotype.setReferenceGenGenererParStereotypes(this);
        genGenererParStereotypes.add(genGenererParStereotype);
    }
    public List<GenGenererParStereotype> getGenGenererParStereotypes() {
        return genGenererParStereotypes;
    }
    public void setGenGenererParStereotypes(List<GenGenererParStereotype> genGenererParStereotypes) {
        this.genGenererParStereotypes = genGenererParStereotypes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genGenererParStereotypes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenererParStereotypes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenererParStereotypes.contains(o);
	}

	@Override
	public Iterator<GenGenererParStereotype> iterator() {
		return this.genGenererParStereotypes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenererParStereotypes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenererParStereotypes.toArray(a);
	}

	@Override
	public boolean add(final GenGenererParStereotype e) {
		return this.genGenererParStereotypes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenererParStereotypes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenererParStereotypes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenererParStereotype> c) {
		return this.genGenererParStereotypes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenererParStereotype> c) {
		return this.genGenererParStereotypes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenererParStereotypes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenererParStereotypes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenererParStereotypes.clear();
	}

	@Override
	public GenGenererParStereotype get(final int index) {
		return this.genGenererParStereotypes.get(index);
	}

	@Override
	public GenGenererParStereotype set(final int index, final GenGenererParStereotype element) {
		return this.genGenererParStereotypes.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenererParStereotype element) {
		this.genGenererParStereotypes.add(index, element);
	}

	@Override
	public GenGenererParStereotype remove(final int index) {
		return this.genGenererParStereotypes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenererParStereotypes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenererParStereotypes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenererParStereotype> listIterator() {
		return this.genGenererParStereotypes.listIterator();
	}

	@Override
	public ListIterator<GenGenererParStereotype> listIterator(final int index) {
		return this.genGenererParStereotypes.listIterator(index);
	}

	@Override
	public List<GenGenererParStereotype> subList(final int fromIndex, final int toIndex) {
		return this.genGenererParStereotypes.subList(fromIndex, toIndex);
	}
}
