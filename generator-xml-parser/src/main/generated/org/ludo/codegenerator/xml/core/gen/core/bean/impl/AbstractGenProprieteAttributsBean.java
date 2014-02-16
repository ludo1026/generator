package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenProprieteAttribut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenProprieteAttributsBean implements GenProprieteAttributs {
	
	/** Récupération de l'élément parent */
	
	private GenAttribut referenceGenAttribut;
	
	public GenAttribut getReferenceGenAttribut() {
		return referenceGenAttribut;
	}
	
	public void setReferenceGenAttribut(GenAttribut referenceGenAttribut) {
		this.referenceGenAttribut = referenceGenAttribut;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenProprieteAttribut> genProprieteAttributs = new ArrayList<GenProprieteAttribut>();
	
    public GenProprieteAttribut getGenProprieteAttributForNom(String nom) {
        for(GenProprieteAttribut genProprieteAttribut : genProprieteAttributs) {
            if(genProprieteAttribut.getNom().equalsIgnoreCase(nom)) {
                return genProprieteAttribut;
            }
        }
        throw new IllegalStateException("La genProprieteAttribut n'est pas définie : nom de genProprieteAttribut = "+nom);
    }

    public List<GenProprieteAttribut> getGenProprieteAttributsByNom(String nom) {
        List<GenProprieteAttribut> result = new ArrayList<GenProprieteAttribut>();
        for(GenProprieteAttribut genProprieteAttribut : genProprieteAttributs) {
            if(genProprieteAttribut.getNom().equalsIgnoreCase(nom)) {
                result.add(genProprieteAttribut);
            }
        }
        return result;
    }

    public GenProprieteAttribut getGenProprieteAttributForValeur(String valeur) {
        for(GenProprieteAttribut genProprieteAttribut : genProprieteAttributs) {
            if(genProprieteAttribut.getValeur().equalsIgnoreCase(valeur)) {
                return genProprieteAttribut;
            }
        }
        throw new IllegalStateException("La genProprieteAttribut n'est pas définie : valeur de genProprieteAttribut = "+valeur);
    }

    public List<GenProprieteAttribut> getGenProprieteAttributsByValeur(String valeur) {
        List<GenProprieteAttribut> result = new ArrayList<GenProprieteAttribut>();
        for(GenProprieteAttribut genProprieteAttribut : genProprieteAttributs) {
            if(genProprieteAttribut.getValeur().equalsIgnoreCase(valeur)) {
                result.add(genProprieteAttribut);
            }
        }
        return result;
    }

    public void addGenProprieteAttribut(GenProprieteAttribut genProprieteAttribut) {
    	genProprieteAttribut.setReferenceGenProprieteAttributs(this);
        genProprieteAttributs.add(genProprieteAttribut);
    }
    public List<GenProprieteAttribut> getGenProprieteAttributs() {
        return genProprieteAttributs;
    }
    public void setGenProprieteAttributs(List<GenProprieteAttribut> genProprieteAttributs) {
        this.genProprieteAttributs = genProprieteAttributs;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genProprieteAttributs.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genProprieteAttributs.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genProprieteAttributs.contains(o);
	}

	@Override
	public Iterator<GenProprieteAttribut> iterator() {
		return this.genProprieteAttributs.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genProprieteAttributs.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genProprieteAttributs.toArray(a);
	}

	@Override
	public boolean add(final GenProprieteAttribut e) {
		return this.genProprieteAttributs.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genProprieteAttributs.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genProprieteAttributs.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenProprieteAttribut> c) {
		return this.genProprieteAttributs.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenProprieteAttribut> c) {
		return this.genProprieteAttributs.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genProprieteAttributs.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genProprieteAttributs.retainAll(c);
	}

	@Override
	public void clear() {
		this.genProprieteAttributs.clear();
	}

	@Override
	public GenProprieteAttribut get(final int index) {
		return this.genProprieteAttributs.get(index);
	}

	@Override
	public GenProprieteAttribut set(final int index, final GenProprieteAttribut element) {
		return this.genProprieteAttributs.set(index, element);
	}

	@Override
	public void add(final int index, final GenProprieteAttribut element) {
		this.genProprieteAttributs.add(index, element);
	}

	@Override
	public GenProprieteAttribut remove(final int index) {
		return this.genProprieteAttributs.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genProprieteAttributs.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genProprieteAttributs.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenProprieteAttribut> listIterator() {
		return this.genProprieteAttributs.listIterator();
	}

	@Override
	public ListIterator<GenProprieteAttribut> listIterator(final int index) {
		return this.genProprieteAttributs.listIterator(index);
	}

	@Override
	public List<GenProprieteAttribut> subList(final int fromIndex, final int toIndex) {
		return this.genProprieteAttributs.subList(fromIndex, toIndex);
	}
}
