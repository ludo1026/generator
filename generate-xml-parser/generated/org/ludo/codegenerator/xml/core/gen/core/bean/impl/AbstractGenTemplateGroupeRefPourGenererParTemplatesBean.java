package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeRefPourGenererParTemplatesBean implements GenTemplateGroupeRefPourGenererParTemplates {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParTemplate referenceGenGenererParTemplate;
	
	public GenGenererParTemplate getReferenceGenGenererParTemplate() {
		return referenceGenGenererParTemplate;
	}
	
	public void setReferenceGenGenererParTemplate(GenGenererParTemplate referenceGenGenererParTemplate) {
		this.referenceGenGenererParTemplate = referenceGenGenererParTemplate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupeRefPourGenererParTemplate> genTemplateGroupeRefPourGenererParTemplates = new ArrayList<GenTemplateGroupeRefPourGenererParTemplate>();
	
    public GenTemplateGroupeRefPourGenererParTemplate getGenTemplateGroupeRefPourGenererParTemplateForTemplateGroupeNom(String templateGroupeNom) {
        for(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate : genTemplateGroupeRefPourGenererParTemplates) {
            if(genTemplateGroupeRefPourGenererParTemplate.getTemplateGroupeNom().equalsIgnoreCase(templateGroupeNom)) {
                return genTemplateGroupeRefPourGenererParTemplate;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeRefPourGenererParTemplate n'est pas définie : templateGroupeNom de genTemplateGroupeRefPourGenererParTemplate = "+templateGroupeNom);
    }
    public void addGenTemplateGroupeRefPourGenererParTemplate(GenTemplateGroupeRefPourGenererParTemplate genTemplateGroupeRefPourGenererParTemplate) {
    	genTemplateGroupeRefPourGenererParTemplate.setReferenceGenTemplateGroupeRefPourGenererParTemplates(this);
        genTemplateGroupeRefPourGenererParTemplates.add(genTemplateGroupeRefPourGenererParTemplate);
    }
    public List<GenTemplateGroupeRefPourGenererParTemplate> getGenTemplateGroupeRefPourGenererParTemplates() {
        return genTemplateGroupeRefPourGenererParTemplates;
    }
    public void setGenTemplateGroupeRefPourGenererParTemplates(List<GenTemplateGroupeRefPourGenererParTemplate> genTemplateGroupeRefPourGenererParTemplates) {
        this.genTemplateGroupeRefPourGenererParTemplates = genTemplateGroupeRefPourGenererParTemplates;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genTemplateGroupeRefPourGenererParTemplates.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplateGroupeRefPourGenererParTemplates.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplateGroupeRefPourGenererParTemplates.contains(o);
	}

	@Override
	public Iterator<GenTemplateGroupeRefPourGenererParTemplate> iterator() {
		return this.genTemplateGroupeRefPourGenererParTemplates.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplateGroupeRefPourGenererParTemplates.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplateGroupeRefPourGenererParTemplates.toArray(a);
	}

	@Override
	public boolean add(final GenTemplateGroupeRefPourGenererParTemplate e) {
		return this.genTemplateGroupeRefPourGenererParTemplates.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplateGroupeRefPourGenererParTemplates.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParTemplates.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplateGroupeRefPourGenererParTemplate> c) {
		return this.genTemplateGroupeRefPourGenererParTemplates.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplateGroupeRefPourGenererParTemplate> c) {
		return this.genTemplateGroupeRefPourGenererParTemplates.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParTemplates.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParTemplates.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplateGroupeRefPourGenererParTemplates.clear();
	}

	@Override
	public GenTemplateGroupeRefPourGenererParTemplate get(final int index) {
		return this.genTemplateGroupeRefPourGenererParTemplates.get(index);
	}

	@Override
	public GenTemplateGroupeRefPourGenererParTemplate set(final int index, final GenTemplateGroupeRefPourGenererParTemplate element) {
		return this.genTemplateGroupeRefPourGenererParTemplates.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplateGroupeRefPourGenererParTemplate element) {
		this.genTemplateGroupeRefPourGenererParTemplates.add(index, element);
	}

	@Override
	public GenTemplateGroupeRefPourGenererParTemplate remove(final int index) {
		return this.genTemplateGroupeRefPourGenererParTemplates.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplateGroupeRefPourGenererParTemplates.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplateGroupeRefPourGenererParTemplates.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplateGroupeRefPourGenererParTemplate> listIterator() {
		return this.genTemplateGroupeRefPourGenererParTemplates.listIterator();
	}

	@Override
	public ListIterator<GenTemplateGroupeRefPourGenererParTemplate> listIterator(final int index) {
		return this.genTemplateGroupeRefPourGenererParTemplates.listIterator(index);
	}

	@Override
	public List<GenTemplateGroupeRefPourGenererParTemplate> subList(final int fromIndex, final int toIndex) {
		return this.genTemplateGroupeRefPourGenererParTemplates.subList(fromIndex, toIndex);
	}
}
