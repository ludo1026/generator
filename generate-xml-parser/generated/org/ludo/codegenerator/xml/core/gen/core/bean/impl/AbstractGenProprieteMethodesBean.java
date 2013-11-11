package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteMethode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenProprieteMethodesBean implements GenProprieteMethodes {
	
	/** Récupération de l'élément parent */
	
	private GenMethode referenceGenMethode;
	
	public GenMethode getReferenceGenMethode() {
		return referenceGenMethode;
	}
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode) {
		this.referenceGenMethode = referenceGenMethode;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenProprieteMethode> genProprieteMethodes = new ArrayList<GenProprieteMethode>();
	
    public GenProprieteMethode getGenProprieteMethodeForNom(String nom) {
        for(GenProprieteMethode genProprieteMethode : genProprieteMethodes) {
            if(genProprieteMethode.getNom().equalsIgnoreCase(nom)) {
                return genProprieteMethode;
            }
        }
        throw new IllegalStateException("La genProprieteMethode n'est pas définie : nom de genProprieteMethode = "+nom);
    }
    public GenProprieteMethode getGenProprieteMethodeForValeur(String valeur) {
        for(GenProprieteMethode genProprieteMethode : genProprieteMethodes) {
            if(genProprieteMethode.getValeur().equalsIgnoreCase(valeur)) {
                return genProprieteMethode;
            }
        }
        throw new IllegalStateException("La genProprieteMethode n'est pas définie : valeur de genProprieteMethode = "+valeur);
    }
    public void addGenProprieteMethode(GenProprieteMethode genProprieteMethode) {
    	genProprieteMethode.setReferenceGenProprieteMethodes(this);
        genProprieteMethodes.add(genProprieteMethode);
    }
    public List<GenProprieteMethode> getGenProprieteMethodes() {
        return genProprieteMethodes;
    }
    public void setGenProprieteMethodes(List<GenProprieteMethode> genProprieteMethodes) {
        this.genProprieteMethodes = genProprieteMethodes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genProprieteMethodes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genProprieteMethodes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genProprieteMethodes.contains(o);
	}

	@Override
	public Iterator<GenProprieteMethode> iterator() {
		return this.genProprieteMethodes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genProprieteMethodes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genProprieteMethodes.toArray(a);
	}

	@Override
	public boolean add(final GenProprieteMethode e) {
		return this.genProprieteMethodes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genProprieteMethodes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genProprieteMethodes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenProprieteMethode> c) {
		return this.genProprieteMethodes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenProprieteMethode> c) {
		return this.genProprieteMethodes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genProprieteMethodes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genProprieteMethodes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genProprieteMethodes.clear();
	}

	@Override
	public GenProprieteMethode get(final int index) {
		return this.genProprieteMethodes.get(index);
	}

	@Override
	public GenProprieteMethode set(final int index, final GenProprieteMethode element) {
		return this.genProprieteMethodes.set(index, element);
	}

	@Override
	public void add(final int index, final GenProprieteMethode element) {
		this.genProprieteMethodes.add(index, element);
	}

	@Override
	public GenProprieteMethode remove(final int index) {
		return this.genProprieteMethodes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genProprieteMethodes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genProprieteMethodes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenProprieteMethode> listIterator() {
		return this.genProprieteMethodes.listIterator();
	}

	@Override
	public ListIterator<GenProprieteMethode> listIterator(final int index) {
		return this.genProprieteMethodes.listIterator(index);
	}

	@Override
	public List<GenProprieteMethode> subList(final int fromIndex, final int toIndex) {
		return this.genProprieteMethodes.subList(fromIndex, toIndex);
	}
}
