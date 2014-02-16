package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParents;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseParent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClasseParentsBean implements GenClasseParents {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasseParent> genClasseParents = new ArrayList<GenClasseParent>();
	
    public GenClasseParent getGenClasseParentForClasseGenId(String classeGenId) {
        for(GenClasseParent genClasseParent : genClasseParents) {
            if(genClasseParent.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genClasseParent;
            }
        }
        throw new IllegalStateException("La genClasseParent n'est pas définie : classeGenId de genClasseParent = "+classeGenId);
    }

    public List<GenClasseParent> getGenClasseParentsByClasseGenId(String classeGenId) {
        List<GenClasseParent> result = new ArrayList<GenClasseParent>();
        for(GenClasseParent genClasseParent : genClasseParents) {
            if(genClasseParent.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                result.add(genClasseParent);
            }
        }
        return result;
    }

    public void addGenClasseParent(GenClasseParent genClasseParent) {
    	genClasseParent.setReferenceGenClasseParents(this);
        genClasseParents.add(genClasseParent);
    }
    public List<GenClasseParent> getGenClasseParents() {
        return genClasseParents;
    }
    public void setGenClasseParents(List<GenClasseParent> genClasseParents) {
        this.genClasseParents = genClasseParents;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genClasseParents.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genClasseParents.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genClasseParents.contains(o);
	}

	@Override
	public Iterator<GenClasseParent> iterator() {
		return this.genClasseParents.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genClasseParents.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genClasseParents.toArray(a);
	}

	@Override
	public boolean add(final GenClasseParent e) {
		return this.genClasseParents.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genClasseParents.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genClasseParents.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenClasseParent> c) {
		return this.genClasseParents.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenClasseParent> c) {
		return this.genClasseParents.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genClasseParents.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genClasseParents.retainAll(c);
	}

	@Override
	public void clear() {
		this.genClasseParents.clear();
	}

	@Override
	public GenClasseParent get(final int index) {
		return this.genClasseParents.get(index);
	}

	@Override
	public GenClasseParent set(final int index, final GenClasseParent element) {
		return this.genClasseParents.set(index, element);
	}

	@Override
	public void add(final int index, final GenClasseParent element) {
		this.genClasseParents.add(index, element);
	}

	@Override
	public GenClasseParent remove(final int index) {
		return this.genClasseParents.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genClasseParents.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genClasseParents.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenClasseParent> listIterator() {
		return this.genClasseParents.listIterator();
	}

	@Override
	public ListIterator<GenClasseParent> listIterator(final int index) {
		return this.genClasseParents.listIterator(index);
	}

	@Override
	public List<GenClasseParent> subList(final int fromIndex, final int toIndex) {
		return this.genClasseParents.subList(fromIndex, toIndex);
	}
}
