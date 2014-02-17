package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByClasseTemplateGroupe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByClasseBean implements GenGenerateByClasse {
	
	/** Récupération de l'élément parent */
	
	private GenGenerate referenceGenGenerate;
	
	public GenGenerate getReferenceGenGenerate() {
		return referenceGenGenerate;
	}
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate) {
		this.referenceGenGenerate = referenceGenGenerate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenerateByClasseTemplateGroupe> genGenerateByClasseTemplateGroupes = new ArrayList<GenGenerateByClasseTemplateGroupe>();
	
    public GenGenerateByClasseTemplateGroupe getGenGenerateByClasseTemplateGroupeForTemplateGroupe(String templateGroupe) {
        for(GenGenerateByClasseTemplateGroupe genGenerateByClasseTemplateGroupe : genGenerateByClasseTemplateGroupes) {
            if(genGenerateByClasseTemplateGroupe.getTemplateGroupe().equalsIgnoreCase(templateGroupe)) {
                return genGenerateByClasseTemplateGroupe;
            }
        }
        throw new IllegalStateException("La genGenerateByClasseTemplateGroupe n'est pas définie : templateGroupe de genGenerateByClasseTemplateGroupe = "+templateGroupe);
    }

    public List<GenGenerateByClasseTemplateGroupe> getGenGenerateByClasseTemplateGroupesByTemplateGroupe(String templateGroupe) {
        List<GenGenerateByClasseTemplateGroupe> result = new ArrayList<GenGenerateByClasseTemplateGroupe>();
        for(GenGenerateByClasseTemplateGroupe genGenerateByClasseTemplateGroupe : genGenerateByClasseTemplateGroupes) {
            if(genGenerateByClasseTemplateGroupe.getTemplateGroupe().equalsIgnoreCase(templateGroupe)) {
                result.add(genGenerateByClasseTemplateGroupe);
            }
        }
        return result;
    }

    public void addGenGenerateByClasseTemplateGroupe(GenGenerateByClasseTemplateGroupe genGenerateByClasseTemplateGroupe) {
    	genGenerateByClasseTemplateGroupe.setReferenceGenGenerateByClasse(this);
        genGenerateByClasseTemplateGroupes.add(genGenerateByClasseTemplateGroupe);
    }
    public List<GenGenerateByClasseTemplateGroupe> getGenGenerateByClasseTemplateGroupes() {
        return genGenerateByClasseTemplateGroupes;
    }
    public void setGenGenerateByClasseTemplateGroupes(List<GenGenerateByClasseTemplateGroupe> genGenerateByClasseTemplateGroupes) {
        this.genGenerateByClasseTemplateGroupes = genGenerateByClasseTemplateGroupes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getClasseGenIdAsString() {
		return this.classeGenId;
	}
	public void setClasseGenIdAsString(String classeGenIdAsString) {
		this.classeGenId = classeGenIdAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String classeGenId = null;

	public String getClasseGenId() {
		return this.classeGenId;
	}
	public void setClasseGenId(String classeGenId) {
		this.classeGenId = classeGenId;
	}

	@Override
	public int size() {
		return this.genGenerateByClasseTemplateGroupes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenerateByClasseTemplateGroupes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenerateByClasseTemplateGroupes.contains(o);
	}

	@Override
	public Iterator<GenGenerateByClasseTemplateGroupe> iterator() {
		return this.genGenerateByClasseTemplateGroupes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenerateByClasseTemplateGroupes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenerateByClasseTemplateGroupes.toArray(a);
	}

	@Override
	public boolean add(final GenGenerateByClasseTemplateGroupe e) {
		return this.genGenerateByClasseTemplateGroupes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenerateByClasseTemplateGroupes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenerateByClasseTemplateGroupes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenerateByClasseTemplateGroupe> c) {
		return this.genGenerateByClasseTemplateGroupes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenerateByClasseTemplateGroupe> c) {
		return this.genGenerateByClasseTemplateGroupes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenerateByClasseTemplateGroupes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenerateByClasseTemplateGroupes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenerateByClasseTemplateGroupes.clear();
	}

	@Override
	public GenGenerateByClasseTemplateGroupe get(final int index) {
		return this.genGenerateByClasseTemplateGroupes.get(index);
	}

	@Override
	public GenGenerateByClasseTemplateGroupe set(final int index, final GenGenerateByClasseTemplateGroupe element) {
		return this.genGenerateByClasseTemplateGroupes.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenerateByClasseTemplateGroupe element) {
		this.genGenerateByClasseTemplateGroupes.add(index, element);
	}

	@Override
	public GenGenerateByClasseTemplateGroupe remove(final int index) {
		return this.genGenerateByClasseTemplateGroupes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenerateByClasseTemplateGroupes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenerateByClasseTemplateGroupes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenerateByClasseTemplateGroupe> listIterator() {
		return this.genGenerateByClasseTemplateGroupes.listIterator();
	}

	@Override
	public ListIterator<GenGenerateByClasseTemplateGroupe> listIterator(final int index) {
		return this.genGenerateByClasseTemplateGroupes.listIterator(index);
	}

	@Override
	public List<GenGenerateByClasseTemplateGroupe> subList(final int fromIndex, final int toIndex) {
		return this.genGenerateByClasseTemplateGroupes.subList(fromIndex, toIndex);
	}
}
