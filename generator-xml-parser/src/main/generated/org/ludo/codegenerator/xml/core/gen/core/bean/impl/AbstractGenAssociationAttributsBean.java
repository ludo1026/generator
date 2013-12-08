package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociationAttribut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenAssociationAttributsBean implements GenAssociationAttributs {
	
	/** Récupération de l'élément parent */
	
	private GenAssociation referenceGenAssociation;
	
	public GenAssociation getReferenceGenAssociation() {
		return referenceGenAssociation;
	}
	
	public void setReferenceGenAssociation(GenAssociation referenceGenAssociation) {
		this.referenceGenAssociation = referenceGenAssociation;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenAssociationAttribut> genAssociationAttributs = new ArrayList<GenAssociationAttribut>();
	
    public GenAssociationAttribut getGenAssociationAttributForGenId(String genId) {
        for(GenAssociationAttribut genAssociationAttribut : genAssociationAttributs) {
            if(genAssociationAttribut.getGenId().equalsIgnoreCase(genId)) {
                return genAssociationAttribut;
            }
        }
        throw new IllegalStateException("La genAssociationAttribut n'est pas définie : genId de genAssociationAttribut = "+genId);
    }
    public void addGenAssociationAttribut(GenAssociationAttribut genAssociationAttribut) {
    	genAssociationAttribut.setReferenceGenAssociationAttributs(this);
        genAssociationAttributs.add(genAssociationAttribut);
    }
    public List<GenAssociationAttribut> getGenAssociationAttributs() {
        return genAssociationAttributs;
    }
    public void setGenAssociationAttributs(List<GenAssociationAttribut> genAssociationAttributs) {
        this.genAssociationAttributs = genAssociationAttributs;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genAssociationAttributs.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genAssociationAttributs.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genAssociationAttributs.contains(o);
	}

	@Override
	public Iterator<GenAssociationAttribut> iterator() {
		return this.genAssociationAttributs.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genAssociationAttributs.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genAssociationAttributs.toArray(a);
	}

	@Override
	public boolean add(final GenAssociationAttribut e) {
		return this.genAssociationAttributs.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genAssociationAttributs.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genAssociationAttributs.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenAssociationAttribut> c) {
		return this.genAssociationAttributs.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenAssociationAttribut> c) {
		return this.genAssociationAttributs.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genAssociationAttributs.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genAssociationAttributs.retainAll(c);
	}

	@Override
	public void clear() {
		this.genAssociationAttributs.clear();
	}

	@Override
	public GenAssociationAttribut get(final int index) {
		return this.genAssociationAttributs.get(index);
	}

	@Override
	public GenAssociationAttribut set(final int index, final GenAssociationAttribut element) {
		return this.genAssociationAttributs.set(index, element);
	}

	@Override
	public void add(final int index, final GenAssociationAttribut element) {
		this.genAssociationAttributs.add(index, element);
	}

	@Override
	public GenAssociationAttribut remove(final int index) {
		return this.genAssociationAttributs.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genAssociationAttributs.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genAssociationAttributs.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenAssociationAttribut> listIterator() {
		return this.genAssociationAttributs.listIterator();
	}

	@Override
	public ListIterator<GenAssociationAttribut> listIterator(final int index) {
		return this.genAssociationAttributs.listIterator(index);
	}

	@Override
	public List<GenAssociationAttribut> subList(final int fromIndex, final int toIndex) {
		return this.genAssociationAttributs.subList(fromIndex, toIndex);
	}
}
