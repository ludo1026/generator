package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeTemplate;

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
	
    private List<GenTemplateGroupeTemplate> genTemplateGroupeTemplates = new ArrayList<GenTemplateGroupeTemplate>();
	
    public GenTemplateGroupeTemplate getGenTemplateGroupeTemplateForNom(String nom) {
        for(GenTemplateGroupeTemplate genTemplateGroupeTemplate : genTemplateGroupeTemplates) {
            if(genTemplateGroupeTemplate.getNom().equalsIgnoreCase(nom)) {
                return genTemplateGroupeTemplate;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeTemplate n'est pas définie : nom de genTemplateGroupeTemplate = "+nom);
    }

    public List<GenTemplateGroupeTemplate> getGenTemplateGroupeTemplatesByNom(String nom) {
        List<GenTemplateGroupeTemplate> result = new ArrayList<GenTemplateGroupeTemplate>();
        for(GenTemplateGroupeTemplate genTemplateGroupeTemplate : genTemplateGroupeTemplates) {
            if(genTemplateGroupeTemplate.getNom().equalsIgnoreCase(nom)) {
                result.add(genTemplateGroupeTemplate);
            }
        }
        return result;
    }

    public void addGenTemplateGroupeTemplate(GenTemplateGroupeTemplate genTemplateGroupeTemplate) {
    	genTemplateGroupeTemplate.setReferenceGenTemplateGroupe(this);
        genTemplateGroupeTemplates.add(genTemplateGroupeTemplate);
    }
    public List<GenTemplateGroupeTemplate> getGenTemplateGroupeTemplates() {
        return genTemplateGroupeTemplates;
    }
    public void setGenTemplateGroupeTemplates(List<GenTemplateGroupeTemplate> genTemplateGroupeTemplates) {
        this.genTemplateGroupeTemplates = genTemplateGroupeTemplates;
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
		return this.genTemplateGroupeTemplates.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplateGroupeTemplates.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplateGroupeTemplates.contains(o);
	}

	@Override
	public Iterator<GenTemplateGroupeTemplate> iterator() {
		return this.genTemplateGroupeTemplates.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplateGroupeTemplates.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplateGroupeTemplates.toArray(a);
	}

	@Override
	public boolean add(final GenTemplateGroupeTemplate e) {
		return this.genTemplateGroupeTemplates.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplateGroupeTemplates.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplateGroupeTemplates.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplateGroupeTemplate> c) {
		return this.genTemplateGroupeTemplates.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplateGroupeTemplate> c) {
		return this.genTemplateGroupeTemplates.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplateGroupeTemplates.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplateGroupeTemplates.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplateGroupeTemplates.clear();
	}

	@Override
	public GenTemplateGroupeTemplate get(final int index) {
		return this.genTemplateGroupeTemplates.get(index);
	}

	@Override
	public GenTemplateGroupeTemplate set(final int index, final GenTemplateGroupeTemplate element) {
		return this.genTemplateGroupeTemplates.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplateGroupeTemplate element) {
		this.genTemplateGroupeTemplates.add(index, element);
	}

	@Override
	public GenTemplateGroupeTemplate remove(final int index) {
		return this.genTemplateGroupeTemplates.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplateGroupeTemplates.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplateGroupeTemplates.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplateGroupeTemplate> listIterator() {
		return this.genTemplateGroupeTemplates.listIterator();
	}

	@Override
	public ListIterator<GenTemplateGroupeTemplate> listIterator(final int index) {
		return this.genTemplateGroupeTemplates.listIterator(index);
	}

	@Override
	public List<GenTemplateGroupeTemplate> subList(final int fromIndex, final int toIndex) {
		return this.genTemplateGroupeTemplates.subList(fromIndex, toIndex);
	}
}
