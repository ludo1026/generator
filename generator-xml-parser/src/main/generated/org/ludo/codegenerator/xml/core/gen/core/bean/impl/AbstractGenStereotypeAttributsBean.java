package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeAttribut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeAttributsBean implements GenStereotypeAttributs {
	
	/** Récupération de l'élément parent */
	
	private GenAttribut referenceGenAttribut;
	
	public GenAttribut getReferenceGenAttribut() {
		return referenceGenAttribut;
	}
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut) {
		this.referenceGenAttribut = referenceGenAttribut;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeAttribut> genStereotypeAttributs = new ArrayList<GenStereotypeAttribut>();
	
    public GenStereotypeAttribut getGenStereotypeAttributForNom(String nom) {
        for(GenStereotypeAttribut genStereotypeAttribut : genStereotypeAttributs) {
            if(genStereotypeAttribut.getNom().equalsIgnoreCase(nom)) {
                return genStereotypeAttribut;
            }
        }
        throw new IllegalStateException("La genStereotypeAttribut n'est pas définie : nom de genStereotypeAttribut = "+nom);
    }

    public List<GenStereotypeAttribut> getGenStereotypeAttributsByNom(String nom) {
        List<GenStereotypeAttribut> result = new ArrayList<GenStereotypeAttribut>();
        for(GenStereotypeAttribut genStereotypeAttribut : genStereotypeAttributs) {
            if(genStereotypeAttribut.getNom().equalsIgnoreCase(nom)) {
                result.add(genStereotypeAttribut);
            }
        }
        return result;
    }

    public void addGenStereotypeAttribut(GenStereotypeAttribut genStereotypeAttribut) {
    	genStereotypeAttribut.setReferenceGenStereotypeAttributs(this);
        genStereotypeAttributs.add(genStereotypeAttribut);
    }
    public List<GenStereotypeAttribut> getGenStereotypeAttributs() {
        return genStereotypeAttributs;
    }
    public void setGenStereotypeAttributs(List<GenStereotypeAttribut> genStereotypeAttributs) {
        this.genStereotypeAttributs = genStereotypeAttributs;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genStereotypeAttributs.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genStereotypeAttributs.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genStereotypeAttributs.contains(o);
	}

	@Override
	public Iterator<GenStereotypeAttribut> iterator() {
		return this.genStereotypeAttributs.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genStereotypeAttributs.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genStereotypeAttributs.toArray(a);
	}

	@Override
	public boolean add(final GenStereotypeAttribut e) {
		return this.genStereotypeAttributs.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genStereotypeAttributs.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genStereotypeAttributs.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenStereotypeAttribut> c) {
		return this.genStereotypeAttributs.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenStereotypeAttribut> c) {
		return this.genStereotypeAttributs.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genStereotypeAttributs.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genStereotypeAttributs.retainAll(c);
	}

	@Override
	public void clear() {
		this.genStereotypeAttributs.clear();
	}

	@Override
	public GenStereotypeAttribut get(final int index) {
		return this.genStereotypeAttributs.get(index);
	}

	@Override
	public GenStereotypeAttribut set(final int index, final GenStereotypeAttribut element) {
		return this.genStereotypeAttributs.set(index, element);
	}

	@Override
	public void add(final int index, final GenStereotypeAttribut element) {
		this.genStereotypeAttributs.add(index, element);
	}

	@Override
	public GenStereotypeAttribut remove(final int index) {
		return this.genStereotypeAttributs.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genStereotypeAttributs.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genStereotypeAttributs.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenStereotypeAttribut> listIterator() {
		return this.genStereotypeAttributs.listIterator();
	}

	@Override
	public ListIterator<GenStereotypeAttribut> listIterator(final int index) {
		return this.genStereotypeAttributs.listIterator(index);
	}

	@Override
	public List<GenStereotypeAttribut> subList(final int fromIndex, final int toIndex) {
		return this.genStereotypeAttributs.subList(fromIndex, toIndex);
	}
}
