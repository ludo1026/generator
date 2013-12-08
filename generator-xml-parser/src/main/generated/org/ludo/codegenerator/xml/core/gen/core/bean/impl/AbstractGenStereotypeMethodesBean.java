package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeMethode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeMethodesBean implements GenStereotypeMethodes {
	
	/** Récupération de l'élément parent */
	
	private GenMethode referenceGenMethode;
	
	public GenMethode getReferenceGenMethode() {
		return referenceGenMethode;
	}
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode) {
		this.referenceGenMethode = referenceGenMethode;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeMethode> genStereotypeMethodes = new ArrayList<GenStereotypeMethode>();
	
    public GenStereotypeMethode getGenStereotypeMethodeForNom(String nom) {
        for(GenStereotypeMethode genStereotypeMethode : genStereotypeMethodes) {
            if(genStereotypeMethode.getNom().equalsIgnoreCase(nom)) {
                return genStereotypeMethode;
            }
        }
        throw new IllegalStateException("La genStereotypeMethode n'est pas définie : nom de genStereotypeMethode = "+nom);
    }
    public void addGenStereotypeMethode(GenStereotypeMethode genStereotypeMethode) {
    	genStereotypeMethode.setReferenceGenStereotypeMethodes(this);
        genStereotypeMethodes.add(genStereotypeMethode);
    }
    public List<GenStereotypeMethode> getGenStereotypeMethodes() {
        return genStereotypeMethodes;
    }
    public void setGenStereotypeMethodes(List<GenStereotypeMethode> genStereotypeMethodes) {
        this.genStereotypeMethodes = genStereotypeMethodes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genStereotypeMethodes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genStereotypeMethodes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genStereotypeMethodes.contains(o);
	}

	@Override
	public Iterator<GenStereotypeMethode> iterator() {
		return this.genStereotypeMethodes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genStereotypeMethodes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genStereotypeMethodes.toArray(a);
	}

	@Override
	public boolean add(final GenStereotypeMethode e) {
		return this.genStereotypeMethodes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genStereotypeMethodes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genStereotypeMethodes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenStereotypeMethode> c) {
		return this.genStereotypeMethodes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenStereotypeMethode> c) {
		return this.genStereotypeMethodes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genStereotypeMethodes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genStereotypeMethodes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genStereotypeMethodes.clear();
	}

	@Override
	public GenStereotypeMethode get(final int index) {
		return this.genStereotypeMethodes.get(index);
	}

	@Override
	public GenStereotypeMethode set(final int index, final GenStereotypeMethode element) {
		return this.genStereotypeMethodes.set(index, element);
	}

	@Override
	public void add(final int index, final GenStereotypeMethode element) {
		this.genStereotypeMethodes.add(index, element);
	}

	@Override
	public GenStereotypeMethode remove(final int index) {
		return this.genStereotypeMethodes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genStereotypeMethodes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genStereotypeMethodes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenStereotypeMethode> listIterator() {
		return this.genStereotypeMethodes.listIterator();
	}

	@Override
	public ListIterator<GenStereotypeMethode> listIterator(final int index) {
		return this.genStereotypeMethodes.listIterator(index);
	}

	@Override
	public List<GenStereotypeMethode> subList(final int fromIndex, final int toIndex) {
		return this.genStereotypeMethodes.subList(fromIndex, toIndex);
	}
}
