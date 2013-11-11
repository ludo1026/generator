package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypesBean implements GenStereotypes {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotype> genStereotypes = new ArrayList<GenStereotype>();
	
    public GenStereotype getGenStereotypeForNom(String nom) {
        for(GenStereotype genStereotype : genStereotypes) {
            if(genStereotype.getNom().equalsIgnoreCase(nom)) {
                return genStereotype;
            }
        }
        throw new IllegalStateException("La genStereotype n'est pas définie : nom de genStereotype = "+nom);
    }
    public void addGenStereotype(GenStereotype genStereotype) {
    	genStereotype.setReferenceGenStereotypes(this);
        genStereotypes.add(genStereotype);
    }
    public List<GenStereotype> getGenStereotypes() {
        return genStereotypes;
    }
    public void setGenStereotypes(List<GenStereotype> genStereotypes) {
        this.genStereotypes = genStereotypes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genStereotypes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genStereotypes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genStereotypes.contains(o);
	}

	@Override
	public Iterator<GenStereotype> iterator() {
		return this.genStereotypes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genStereotypes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genStereotypes.toArray(a);
	}

	@Override
	public boolean add(final GenStereotype e) {
		return this.genStereotypes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genStereotypes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genStereotypes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenStereotype> c) {
		return this.genStereotypes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenStereotype> c) {
		return this.genStereotypes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genStereotypes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genStereotypes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genStereotypes.clear();
	}

	@Override
	public GenStereotype get(final int index) {
		return this.genStereotypes.get(index);
	}

	@Override
	public GenStereotype set(final int index, final GenStereotype element) {
		return this.genStereotypes.set(index, element);
	}

	@Override
	public void add(final int index, final GenStereotype element) {
		this.genStereotypes.add(index, element);
	}

	@Override
	public GenStereotype remove(final int index) {
		return this.genStereotypes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genStereotypes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genStereotypes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenStereotype> listIterator() {
		return this.genStereotypes.listIterator();
	}

	@Override
	public ListIterator<GenStereotype> listIterator(final int index) {
		return this.genStereotypes.listIterator(index);
	}

	@Override
	public List<GenStereotype> subList(final int fromIndex, final int toIndex) {
		return this.genStereotypes.subList(fromIndex, toIndex);
	}
}
