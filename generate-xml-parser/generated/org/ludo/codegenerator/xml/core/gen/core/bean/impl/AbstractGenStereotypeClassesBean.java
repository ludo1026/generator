package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeClassesBean implements GenStereotypeClasses {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeClasse> genStereotypeClasses = new ArrayList<GenStereotypeClasse>();
	
    public GenStereotypeClasse getGenStereotypeClasseForNom(String nom) {
        for(GenStereotypeClasse genStereotypeClasse : genStereotypeClasses) {
            if(genStereotypeClasse.getNom().equalsIgnoreCase(nom)) {
                return genStereotypeClasse;
            }
        }
        throw new IllegalStateException("La genStereotypeClasse n'est pas définie : nom de genStereotypeClasse = "+nom);
    }
    public void addGenStereotypeClasse(GenStereotypeClasse genStereotypeClasse) {
    	genStereotypeClasse.setReferenceGenStereotypeClasses(this);
        genStereotypeClasses.add(genStereotypeClasse);
    }
    public List<GenStereotypeClasse> getGenStereotypeClasses() {
        return genStereotypeClasses;
    }
    public void setGenStereotypeClasses(List<GenStereotypeClasse> genStereotypeClasses) {
        this.genStereotypeClasses = genStereotypeClasses;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genStereotypeClasses.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genStereotypeClasses.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genStereotypeClasses.contains(o);
	}

	@Override
	public Iterator<GenStereotypeClasse> iterator() {
		return this.genStereotypeClasses.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genStereotypeClasses.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genStereotypeClasses.toArray(a);
	}

	@Override
	public boolean add(final GenStereotypeClasse e) {
		return this.genStereotypeClasses.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genStereotypeClasses.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genStereotypeClasses.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenStereotypeClasse> c) {
		return this.genStereotypeClasses.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenStereotypeClasse> c) {
		return this.genStereotypeClasses.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genStereotypeClasses.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genStereotypeClasses.retainAll(c);
	}

	@Override
	public void clear() {
		this.genStereotypeClasses.clear();
	}

	@Override
	public GenStereotypeClasse get(final int index) {
		return this.genStereotypeClasses.get(index);
	}

	@Override
	public GenStereotypeClasse set(final int index, final GenStereotypeClasse element) {
		return this.genStereotypeClasses.set(index, element);
	}

	@Override
	public void add(final int index, final GenStereotypeClasse element) {
		this.genStereotypeClasses.add(index, element);
	}

	@Override
	public GenStereotypeClasse remove(final int index) {
		return this.genStereotypeClasses.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genStereotypeClasses.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genStereotypeClasses.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenStereotypeClasse> listIterator() {
		return this.genStereotypeClasses.listIterator();
	}

	@Override
	public ListIterator<GenStereotypeClasse> listIterator(final int index) {
		return this.genStereotypeClasses.listIterator(index);
	}

	@Override
	public List<GenStereotypeClasse> subList(final int fromIndex, final int toIndex) {
		return this.genStereotypeClasses.subList(fromIndex, toIndex);
	}
}
