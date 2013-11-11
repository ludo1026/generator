package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeRefPourGenererParTemplatesBean implements GenStereotypeRefPourGenererParTemplates {
	
	/** Récupération de l'élément parent */
	
	private GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate;
	
	public GenTemplateGroupeRefPourGenererParTemplate getReferenceGenTemplateGroupeRefPourGenererParTemplate() {
		return referenceGenTemplateGroupeRefPourGenererParTemplate;
	}
	
	public void setReferenceGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate referenceGenTemplateGroupeRefPourGenererParTemplate) {
		this.referenceGenTemplateGroupeRefPourGenererParTemplate = referenceGenTemplateGroupeRefPourGenererParTemplate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeRefPourGenererParTemplate> genStereotypeRefPourGenererParTemplates = new ArrayList<GenStereotypeRefPourGenererParTemplate>();
	
    public GenStereotypeRefPourGenererParTemplate getGenStereotypeRefPourGenererParTemplateForStereotypeNom(String stereotypeNom) {
        for(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate : genStereotypeRefPourGenererParTemplates) {
            if(genStereotypeRefPourGenererParTemplate.getStereotypeNom().equalsIgnoreCase(stereotypeNom)) {
                return genStereotypeRefPourGenererParTemplate;
            }
        }
        throw new IllegalStateException("La genStereotypeRefPourGenererParTemplate n'est pas définie : stereotypeNom de genStereotypeRefPourGenererParTemplate = "+stereotypeNom);
    }
    public void addGenStereotypeRefPourGenererParTemplate(GenStereotypeRefPourGenererParTemplate genStereotypeRefPourGenererParTemplate) {
    	genStereotypeRefPourGenererParTemplate.setReferenceGenStereotypeRefPourGenererParTemplates(this);
        genStereotypeRefPourGenererParTemplates.add(genStereotypeRefPourGenererParTemplate);
    }
    public List<GenStereotypeRefPourGenererParTemplate> getGenStereotypeRefPourGenererParTemplates() {
        return genStereotypeRefPourGenererParTemplates;
    }
    public void setGenStereotypeRefPourGenererParTemplates(List<GenStereotypeRefPourGenererParTemplate> genStereotypeRefPourGenererParTemplates) {
        this.genStereotypeRefPourGenererParTemplates = genStereotypeRefPourGenererParTemplates;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genStereotypeRefPourGenererParTemplates.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genStereotypeRefPourGenererParTemplates.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genStereotypeRefPourGenererParTemplates.contains(o);
	}

	@Override
	public Iterator<GenStereotypeRefPourGenererParTemplate> iterator() {
		return this.genStereotypeRefPourGenererParTemplates.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genStereotypeRefPourGenererParTemplates.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genStereotypeRefPourGenererParTemplates.toArray(a);
	}

	@Override
	public boolean add(final GenStereotypeRefPourGenererParTemplate e) {
		return this.genStereotypeRefPourGenererParTemplates.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genStereotypeRefPourGenererParTemplates.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genStereotypeRefPourGenererParTemplates.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenStereotypeRefPourGenererParTemplate> c) {
		return this.genStereotypeRefPourGenererParTemplates.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenStereotypeRefPourGenererParTemplate> c) {
		return this.genStereotypeRefPourGenererParTemplates.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genStereotypeRefPourGenererParTemplates.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genStereotypeRefPourGenererParTemplates.retainAll(c);
	}

	@Override
	public void clear() {
		this.genStereotypeRefPourGenererParTemplates.clear();
	}

	@Override
	public GenStereotypeRefPourGenererParTemplate get(final int index) {
		return this.genStereotypeRefPourGenererParTemplates.get(index);
	}

	@Override
	public GenStereotypeRefPourGenererParTemplate set(final int index, final GenStereotypeRefPourGenererParTemplate element) {
		return this.genStereotypeRefPourGenererParTemplates.set(index, element);
	}

	@Override
	public void add(final int index, final GenStereotypeRefPourGenererParTemplate element) {
		this.genStereotypeRefPourGenererParTemplates.add(index, element);
	}

	@Override
	public GenStereotypeRefPourGenererParTemplate remove(final int index) {
		return this.genStereotypeRefPourGenererParTemplates.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genStereotypeRefPourGenererParTemplates.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genStereotypeRefPourGenererParTemplates.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenStereotypeRefPourGenererParTemplate> listIterator() {
		return this.genStereotypeRefPourGenererParTemplates.listIterator();
	}

	@Override
	public ListIterator<GenStereotypeRefPourGenererParTemplate> listIterator(final int index) {
		return this.genStereotypeRefPourGenererParTemplates.listIterator(index);
	}

	@Override
	public List<GenStereotypeRefPourGenererParTemplate> subList(final int fromIndex, final int toIndex) {
		return this.genStereotypeRefPourGenererParTemplates.subList(fromIndex, toIndex);
	}
}
