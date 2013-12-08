package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupesBean implements GenTemplateGroupes {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupe> genTemplateGroupes = new ArrayList<GenTemplateGroupe>();
	
    public GenTemplateGroupe getGenTemplateGroupeForNom(String nom) {
        for(GenTemplateGroupe genTemplateGroupe : genTemplateGroupes) {
            if(genTemplateGroupe.getNom().equalsIgnoreCase(nom)) {
                return genTemplateGroupe;
            }
        }
        throw new IllegalStateException("La genTemplateGroupe n'est pas définie : nom de genTemplateGroupe = "+nom);
    }
    public void addGenTemplateGroupe(GenTemplateGroupe genTemplateGroupe) {
    	genTemplateGroupe.setReferenceGenTemplateGroupes(this);
        genTemplateGroupes.add(genTemplateGroupe);
    }
    public List<GenTemplateGroupe> getGenTemplateGroupes() {
        return genTemplateGroupes;
    }
    public void setGenTemplateGroupes(List<GenTemplateGroupe> genTemplateGroupes) {
        this.genTemplateGroupes = genTemplateGroupes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genTemplateGroupes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplateGroupes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplateGroupes.contains(o);
	}

	@Override
	public Iterator<GenTemplateGroupe> iterator() {
		return this.genTemplateGroupes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplateGroupes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplateGroupes.toArray(a);
	}

	@Override
	public boolean add(final GenTemplateGroupe e) {
		return this.genTemplateGroupes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplateGroupes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplateGroupes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplateGroupe> c) {
		return this.genTemplateGroupes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplateGroupe> c) {
		return this.genTemplateGroupes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplateGroupes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplateGroupes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplateGroupes.clear();
	}

	@Override
	public GenTemplateGroupe get(final int index) {
		return this.genTemplateGroupes.get(index);
	}

	@Override
	public GenTemplateGroupe set(final int index, final GenTemplateGroupe element) {
		return this.genTemplateGroupes.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplateGroupe element) {
		this.genTemplateGroupes.add(index, element);
	}

	@Override
	public GenTemplateGroupe remove(final int index) {
		return this.genTemplateGroupes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplateGroupes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplateGroupes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplateGroupe> listIterator() {
		return this.genTemplateGroupes.listIterator();
	}

	@Override
	public ListIterator<GenTemplateGroupe> listIterator(final int index) {
		return this.genTemplateGroupes.listIterator(index);
	}

	@Override
	public List<GenTemplateGroupe> subList(final int fromIndex, final int toIndex) {
		return this.genTemplateGroupes.subList(fromIndex, toIndex);
	}
}
