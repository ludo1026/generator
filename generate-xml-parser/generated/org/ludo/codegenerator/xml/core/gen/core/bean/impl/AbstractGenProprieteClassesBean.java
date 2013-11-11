package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenProprieteClassesBean implements GenProprieteClasses {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenProprieteClasse> genProprieteClasses = new ArrayList<GenProprieteClasse>();
	
    public GenProprieteClasse getGenProprieteClasseForNom(String nom) {
        for(GenProprieteClasse genProprieteClasse : genProprieteClasses) {
            if(genProprieteClasse.getNom().equalsIgnoreCase(nom)) {
                return genProprieteClasse;
            }
        }
        throw new IllegalStateException("La genProprieteClasse n'est pas définie : nom de genProprieteClasse = "+nom);
    }
    public GenProprieteClasse getGenProprieteClasseForValeur(String valeur) {
        for(GenProprieteClasse genProprieteClasse : genProprieteClasses) {
            if(genProprieteClasse.getValeur().equalsIgnoreCase(valeur)) {
                return genProprieteClasse;
            }
        }
        throw new IllegalStateException("La genProprieteClasse n'est pas définie : valeur de genProprieteClasse = "+valeur);
    }
    public void addGenProprieteClasse(GenProprieteClasse genProprieteClasse) {
    	genProprieteClasse.setReferenceGenProprieteClasses(this);
        genProprieteClasses.add(genProprieteClasse);
    }
    public List<GenProprieteClasse> getGenProprieteClasses() {
        return genProprieteClasses;
    }
    public void setGenProprieteClasses(List<GenProprieteClasse> genProprieteClasses) {
        this.genProprieteClasses = genProprieteClasses;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genProprieteClasses.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genProprieteClasses.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genProprieteClasses.contains(o);
	}

	@Override
	public Iterator<GenProprieteClasse> iterator() {
		return this.genProprieteClasses.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genProprieteClasses.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genProprieteClasses.toArray(a);
	}

	@Override
	public boolean add(final GenProprieteClasse e) {
		return this.genProprieteClasses.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genProprieteClasses.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genProprieteClasses.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenProprieteClasse> c) {
		return this.genProprieteClasses.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenProprieteClasse> c) {
		return this.genProprieteClasses.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genProprieteClasses.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genProprieteClasses.retainAll(c);
	}

	@Override
	public void clear() {
		this.genProprieteClasses.clear();
	}

	@Override
	public GenProprieteClasse get(final int index) {
		return this.genProprieteClasses.get(index);
	}

	@Override
	public GenProprieteClasse set(final int index, final GenProprieteClasse element) {
		return this.genProprieteClasses.set(index, element);
	}

	@Override
	public void add(final int index, final GenProprieteClasse element) {
		this.genProprieteClasses.add(index, element);
	}

	@Override
	public GenProprieteClasse remove(final int index) {
		return this.genProprieteClasses.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genProprieteClasses.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genProprieteClasses.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenProprieteClasse> listIterator() {
		return this.genProprieteClasses.listIterator();
	}

	@Override
	public ListIterator<GenProprieteClasse> listIterator(final int index) {
		return this.genProprieteClasses.listIterator(index);
	}

	@Override
	public List<GenProprieteClasse> subList(final int fromIndex, final int toIndex) {
		return this.genProprieteClasses.subList(fromIndex, toIndex);
	}
}
