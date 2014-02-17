package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByStereotypeTemplateGroup;

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
	
    private List<GenGenerateByStereotypeTemplateGroup> genGenerateByStereotypeTemplateGroups = new ArrayList<GenGenerateByStereotypeTemplateGroup>();
	
    public GenGenerateByStereotypeTemplateGroup getGenGenerateByStereotypeTemplateGroupForTemplateGroup(String templateGroup) {
        for(GenGenerateByStereotypeTemplateGroup genGenerateByStereotypeTemplateGroup : genGenerateByStereotypeTemplateGroups) {
            if(genGenerateByStereotypeTemplateGroup.getTemplateGroup().equalsIgnoreCase(templateGroup)) {
                return genGenerateByStereotypeTemplateGroup;
            }
        }
        throw new IllegalStateException("La genGenerateByStereotypeTemplateGroup n'est pas définie : templateGroup de genGenerateByStereotypeTemplateGroup = "+templateGroup);
    }

    public List<GenGenerateByStereotypeTemplateGroup> getGenGenerateByStereotypeTemplateGroupsByTemplateGroup(String templateGroup) {
        List<GenGenerateByStereotypeTemplateGroup> result = new ArrayList<GenGenerateByStereotypeTemplateGroup>();
        for(GenGenerateByStereotypeTemplateGroup genGenerateByStereotypeTemplateGroup : genGenerateByStereotypeTemplateGroups) {
            if(genGenerateByStereotypeTemplateGroup.getTemplateGroup().equalsIgnoreCase(templateGroup)) {
                result.add(genGenerateByStereotypeTemplateGroup);
            }
        }
        return result;
    }

    public void addGenGenerateByStereotypeTemplateGroup(GenGenerateByStereotypeTemplateGroup genGenerateByStereotypeTemplateGroup) {
    	genGenerateByStereotypeTemplateGroup.setReferenceGenGenerateByStereotype(this);
        genGenerateByStereotypeTemplateGroups.add(genGenerateByStereotypeTemplateGroup);
    }
    public List<GenGenerateByStereotypeTemplateGroup> getGenGenerateByStereotypeTemplateGroups() {
        return genGenerateByStereotypeTemplateGroups;
    }
    public void setGenGenerateByStereotypeTemplateGroups(List<GenGenerateByStereotypeTemplateGroup> genGenerateByStereotypeTemplateGroups) {
        this.genGenerateByStereotypeTemplateGroups = genGenerateByStereotypeTemplateGroups;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getStereotypeAsString() {
		return this.stereotype;
	}
	public void setStereotypeAsString(String stereotypeAsString) {
		this.stereotype = stereotypeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String stereotype = null;

	public String getStereotype() {
		return this.stereotype;
	}
	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

	@Override
	public int size() {
		return this.genGenerateByStereotypeTemplateGroups.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenerateByStereotypeTemplateGroups.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenerateByStereotypeTemplateGroups.contains(o);
	}

	@Override
	public Iterator<GenGenerateByStereotypeTemplateGroup> iterator() {
		return this.genGenerateByStereotypeTemplateGroups.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenerateByStereotypeTemplateGroups.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenerateByStereotypeTemplateGroups.toArray(a);
	}

	@Override
	public boolean add(final GenGenerateByStereotypeTemplateGroup e) {
		return this.genGenerateByStereotypeTemplateGroups.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenerateByStereotypeTemplateGroups.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenerateByStereotypeTemplateGroups.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenerateByStereotypeTemplateGroup> c) {
		return this.genGenerateByStereotypeTemplateGroups.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenerateByStereotypeTemplateGroup> c) {
		return this.genGenerateByStereotypeTemplateGroups.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenerateByStereotypeTemplateGroups.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenerateByStereotypeTemplateGroups.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenerateByStereotypeTemplateGroups.clear();
	}

	@Override
	public GenGenerateByStereotypeTemplateGroup get(final int index) {
		return this.genGenerateByStereotypeTemplateGroups.get(index);
	}

	@Override
	public GenGenerateByStereotypeTemplateGroup set(final int index, final GenGenerateByStereotypeTemplateGroup element) {
		return this.genGenerateByStereotypeTemplateGroups.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenerateByStereotypeTemplateGroup element) {
		this.genGenerateByStereotypeTemplateGroups.add(index, element);
	}

	@Override
	public GenGenerateByStereotypeTemplateGroup remove(final int index) {
		return this.genGenerateByStereotypeTemplateGroups.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenerateByStereotypeTemplateGroups.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenerateByStereotypeTemplateGroups.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenerateByStereotypeTemplateGroup> listIterator() {
		return this.genGenerateByStereotypeTemplateGroups.listIterator();
	}

	@Override
	public ListIterator<GenGenerateByStereotypeTemplateGroup> listIterator(final int index) {
		return this.genGenerateByStereotypeTemplateGroups.listIterator(index);
	}

	@Override
	public List<GenGenerateByStereotypeTemplateGroup> subList(final int fromIndex, final int toIndex) {
		return this.genGenerateByStereotypeTemplateGroups.subList(fromIndex, toIndex);
	}
}
