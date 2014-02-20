package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotypeTemplateGroupe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByStereotypeBean implements GenGenerateByStereotype {
	
	/** Récupération de l'élément parent */
	
	private GenGenerate referenceGenGenerate;
	
	public GenGenerate getReferenceGenGenerate() {
		return referenceGenGenerate;
	}
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate) {
		this.referenceGenGenerate = referenceGenGenerate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenerateByStereotypeTemplateGroupe> genGenerateByStereotypeTemplateGroupes = new ArrayList<GenGenerateByStereotypeTemplateGroupe>();
	
    public GenGenerateByStereotypeTemplateGroupe getGenGenerateByStereotypeTemplateGroupeForTemplateGroupe(String templateGroupe) {
        for(GenGenerateByStereotypeTemplateGroupe genGenerateByStereotypeTemplateGroupe : genGenerateByStereotypeTemplateGroupes) {
            if(genGenerateByStereotypeTemplateGroupe.getTemplateGroupe().equalsIgnoreCase(templateGroupe)) {
                return genGenerateByStereotypeTemplateGroupe;
            }
        }
        throw new IllegalStateException("La genGenerateByStereotypeTemplateGroupe n'est pas définie : templateGroupe de genGenerateByStereotypeTemplateGroupe = "+templateGroupe);
    }

    public List<GenGenerateByStereotypeTemplateGroupe> getGenGenerateByStereotypeTemplateGroupesByTemplateGroupe(String templateGroupe) {
        List<GenGenerateByStereotypeTemplateGroupe> result = new ArrayList<GenGenerateByStereotypeTemplateGroupe>();
        for(GenGenerateByStereotypeTemplateGroupe genGenerateByStereotypeTemplateGroupe : genGenerateByStereotypeTemplateGroupes) {
            if(genGenerateByStereotypeTemplateGroupe.getTemplateGroupe().equalsIgnoreCase(templateGroupe)) {
                result.add(genGenerateByStereotypeTemplateGroupe);
            }
        }
        return result;
    }

    public void addGenGenerateByStereotypeTemplateGroupe(GenGenerateByStereotypeTemplateGroupe genGenerateByStereotypeTemplateGroupe) {
    	genGenerateByStereotypeTemplateGroupe.setReferenceGenGenerateByStereotype(this);
        genGenerateByStereotypeTemplateGroupes.add(genGenerateByStereotypeTemplateGroupe);
    }
    public List<GenGenerateByStereotypeTemplateGroupe> getGenGenerateByStereotypeTemplateGroupes() {
        return genGenerateByStereotypeTemplateGroupes;
    }
    public void setGenGenerateByStereotypeTemplateGroupes(List<GenGenerateByStereotypeTemplateGroupe> genGenerateByStereotypeTemplateGroupes) {
        this.genGenerateByStereotypeTemplateGroupes = genGenerateByStereotypeTemplateGroupes;
    }
	
	private String stereotype = null;

	public String getStereotype() {
		return this.stereotype;
	}
	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

	@Override
	public int size() {
		return this.genGenerateByStereotypeTemplateGroupes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenerateByStereotypeTemplateGroupes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenerateByStereotypeTemplateGroupes.contains(o);
	}

	@Override
	public Iterator<GenGenerateByStereotypeTemplateGroupe> iterator() {
		return this.genGenerateByStereotypeTemplateGroupes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenerateByStereotypeTemplateGroupes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenerateByStereotypeTemplateGroupes.toArray(a);
	}

	@Override
	public boolean add(final GenGenerateByStereotypeTemplateGroupe e) {
		return this.genGenerateByStereotypeTemplateGroupes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenerateByStereotypeTemplateGroupes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenerateByStereotypeTemplateGroupes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenerateByStereotypeTemplateGroupe> c) {
		return this.genGenerateByStereotypeTemplateGroupes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenerateByStereotypeTemplateGroupe> c) {
		return this.genGenerateByStereotypeTemplateGroupes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenerateByStereotypeTemplateGroupes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenerateByStereotypeTemplateGroupes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenerateByStereotypeTemplateGroupes.clear();
	}

	@Override
	public GenGenerateByStereotypeTemplateGroupe get(final int index) {
		return this.genGenerateByStereotypeTemplateGroupes.get(index);
	}

	@Override
	public GenGenerateByStereotypeTemplateGroupe set(final int index, final GenGenerateByStereotypeTemplateGroupe element) {
		return this.genGenerateByStereotypeTemplateGroupes.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenerateByStereotypeTemplateGroupe element) {
		this.genGenerateByStereotypeTemplateGroupes.add(index, element);
	}

	@Override
	public GenGenerateByStereotypeTemplateGroupe remove(final int index) {
		return this.genGenerateByStereotypeTemplateGroupes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenerateByStereotypeTemplateGroupes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenerateByStereotypeTemplateGroupes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenerateByStereotypeTemplateGroupe> listIterator() {
		return this.genGenerateByStereotypeTemplateGroupes.listIterator();
	}

	@Override
	public ListIterator<GenGenerateByStereotypeTemplateGroupe> listIterator(final int index) {
		return this.genGenerateByStereotypeTemplateGroupes.listIterator(index);
	}

	@Override
	public List<GenGenerateByStereotypeTemplateGroupe> subList(final int fromIndex, final int toIndex) {
		return this.genGenerateByStereotypeTemplateGroupes.subList(fromIndex, toIndex);
	}
}
