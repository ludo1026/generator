package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateRef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeBean implements GenTemplateGroupe {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupes referenceGenTemplateGroupes;
	
	public GenTemplateGroupes getReferenceGenTemplateGroupes() {
		return referenceGenTemplateGroupes;
	}
	
	public void setReferenceGenTemplateGroupes(GenTemplateGroupes referenceGenTemplateGroupes) {
		this.referenceGenTemplateGroupes = referenceGenTemplateGroupes;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateRef> genTemplateRefs = new ArrayList<GenTemplateRef>();
	
    public GenTemplateRef getGenTemplateRefForNom(String nom) {
        for(GenTemplateRef genTemplateRef : genTemplateRefs) {
            if(genTemplateRef.getNom().equalsIgnoreCase(nom)) {
                return genTemplateRef;
            }
        }
        throw new IllegalStateException("La genTemplateRef n'est pas définie : nom de genTemplateRef = "+nom);
    }

    public List<GenTemplateRef> getGenTemplateRefsByNom(String nom) {
        List<GenTemplateRef> result = new ArrayList<GenTemplateRef>();
        for(GenTemplateRef genTemplateRef : genTemplateRefs) {
            if(genTemplateRef.getNom().equalsIgnoreCase(nom)) {
                result.add(genTemplateRef);
            }
        }
        return result;
    }

    public void addGenTemplateRef(GenTemplateRef genTemplateRef) {
    	genTemplateRef.setReferenceGenTemplateGroupe(this);
        genTemplateRefs.add(genTemplateRef);
    }
    public List<GenTemplateRef> getGenTemplateRefs() {
        return genTemplateRefs;
    }
    public void setGenTemplateRefs(List<GenTemplateRef> genTemplateRefs) {
        this.genTemplateRefs = genTemplateRefs;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getNomAsString() {
		return this.nom;
	}
	public void setNomAsString(String nomAsString) {
		this.nom = nomAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String nom = null;

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int size() {
		return this.genTemplateRefs.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplateRefs.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplateRefs.contains(o);
	}

	@Override
	public Iterator<GenTemplateRef> iterator() {
		return this.genTemplateRefs.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplateRefs.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplateRefs.toArray(a);
	}

	@Override
	public boolean add(final GenTemplateRef e) {
		return this.genTemplateRefs.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplateRefs.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplateRefs.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplateRef> c) {
		return this.genTemplateRefs.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplateRef> c) {
		return this.genTemplateRefs.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplateRefs.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplateRefs.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplateRefs.clear();
	}

	@Override
	public GenTemplateRef get(final int index) {
		return this.genTemplateRefs.get(index);
	}

	@Override
	public GenTemplateRef set(final int index, final GenTemplateRef element) {
		return this.genTemplateRefs.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplateRef element) {
		this.genTemplateRefs.add(index, element);
	}

	@Override
	public GenTemplateRef remove(final int index) {
		return this.genTemplateRefs.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplateRefs.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplateRefs.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplateRef> listIterator() {
		return this.genTemplateRefs.listIterator();
	}

	@Override
	public ListIterator<GenTemplateRef> listIterator(final int index) {
		return this.genTemplateRefs.listIterator(index);
	}

	@Override
	public List<GenTemplateRef> subList(final int fromIndex, final int toIndex) {
		return this.genTemplateRefs.subList(fromIndex, toIndex);
	}
}
