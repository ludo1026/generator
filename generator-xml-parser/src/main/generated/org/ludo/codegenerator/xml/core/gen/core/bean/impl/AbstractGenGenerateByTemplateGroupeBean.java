package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenerateByTemplateGroupeStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenGenerateByTemplateGroupeBean implements GenGenerateByTemplateGroupe {
	
	/** Récupération de l'élément parent */
	
	private GenGenerate referenceGenGenerate;
	
	public GenGenerate getReferenceGenGenerate() {
		return referenceGenGenerate;
	}
	
	public void setReferenceGenGenerate(GenGenerate referenceGenGenerate) {
		this.referenceGenGenerate = referenceGenGenerate;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenGenerateByTemplateGroupeStereotype> genGenerateByTemplateGroupeStereotypes = new ArrayList<GenGenerateByTemplateGroupeStereotype>();
	
    public GenGenerateByTemplateGroupeStereotype getGenGenerateByTemplateGroupeStereotypeForStereotype(String stereotype) {
        for(GenGenerateByTemplateGroupeStereotype genGenerateByTemplateGroupeStereotype : genGenerateByTemplateGroupeStereotypes) {
            if(genGenerateByTemplateGroupeStereotype.getStereotype().equalsIgnoreCase(stereotype)) {
                return genGenerateByTemplateGroupeStereotype;
            }
        }
        throw new IllegalStateException("La genGenerateByTemplateGroupeStereotype n'est pas définie : stereotype de genGenerateByTemplateGroupeStereotype = "+stereotype);
    }

    public List<GenGenerateByTemplateGroupeStereotype> getGenGenerateByTemplateGroupeStereotypesByStereotype(String stereotype) {
        List<GenGenerateByTemplateGroupeStereotype> result = new ArrayList<GenGenerateByTemplateGroupeStereotype>();
        for(GenGenerateByTemplateGroupeStereotype genGenerateByTemplateGroupeStereotype : genGenerateByTemplateGroupeStereotypes) {
            if(genGenerateByTemplateGroupeStereotype.getStereotype().equalsIgnoreCase(stereotype)) {
                result.add(genGenerateByTemplateGroupeStereotype);
            }
        }
        return result;
    }

    public void addGenGenerateByTemplateGroupeStereotype(GenGenerateByTemplateGroupeStereotype genGenerateByTemplateGroupeStereotype) {
    	genGenerateByTemplateGroupeStereotype.setReferenceGenGenerateByTemplateGroupe(this);
        genGenerateByTemplateGroupeStereotypes.add(genGenerateByTemplateGroupeStereotype);
    }
    public List<GenGenerateByTemplateGroupeStereotype> getGenGenerateByTemplateGroupeStereotypes() {
        return genGenerateByTemplateGroupeStereotypes;
    }
    public void setGenGenerateByTemplateGroupeStereotypes(List<GenGenerateByTemplateGroupeStereotype> genGenerateByTemplateGroupeStereotypes) {
        this.genGenerateByTemplateGroupeStereotypes = genGenerateByTemplateGroupeStereotypes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getTemplateGroupeAsString() {
		return this.templateGroupe;
	}
	public void setTemplateGroupeAsString(String templateGroupeAsString) {
		this.templateGroupe = templateGroupeAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String templateGroupe = null;

	public String getTemplateGroupe() {
		return this.templateGroupe;
	}
	public void setTemplateGroupe(String templateGroupe) {
		this.templateGroupe = templateGroupe;
	}

	@Override
	public int size() {
		return this.genGenerateByTemplateGroupeStereotypes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genGenerateByTemplateGroupeStereotypes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genGenerateByTemplateGroupeStereotypes.contains(o);
	}

	@Override
	public Iterator<GenGenerateByTemplateGroupeStereotype> iterator() {
		return this.genGenerateByTemplateGroupeStereotypes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genGenerateByTemplateGroupeStereotypes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genGenerateByTemplateGroupeStereotypes.toArray(a);
	}

	@Override
	public boolean add(final GenGenerateByTemplateGroupeStereotype e) {
		return this.genGenerateByTemplateGroupeStereotypes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genGenerateByTemplateGroupeStereotypes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genGenerateByTemplateGroupeStereotypes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenGenerateByTemplateGroupeStereotype> c) {
		return this.genGenerateByTemplateGroupeStereotypes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenGenerateByTemplateGroupeStereotype> c) {
		return this.genGenerateByTemplateGroupeStereotypes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genGenerateByTemplateGroupeStereotypes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genGenerateByTemplateGroupeStereotypes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genGenerateByTemplateGroupeStereotypes.clear();
	}

	@Override
	public GenGenerateByTemplateGroupeStereotype get(final int index) {
		return this.genGenerateByTemplateGroupeStereotypes.get(index);
	}

	@Override
	public GenGenerateByTemplateGroupeStereotype set(final int index, final GenGenerateByTemplateGroupeStereotype element) {
		return this.genGenerateByTemplateGroupeStereotypes.set(index, element);
	}

	@Override
	public void add(final int index, final GenGenerateByTemplateGroupeStereotype element) {
		this.genGenerateByTemplateGroupeStereotypes.add(index, element);
	}

	@Override
	public GenGenerateByTemplateGroupeStereotype remove(final int index) {
		return this.genGenerateByTemplateGroupeStereotypes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genGenerateByTemplateGroupeStereotypes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genGenerateByTemplateGroupeStereotypes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenGenerateByTemplateGroupeStereotype> listIterator() {
		return this.genGenerateByTemplateGroupeStereotypes.listIterator();
	}

	@Override
	public ListIterator<GenGenerateByTemplateGroupeStereotype> listIterator(final int index) {
		return this.genGenerateByTemplateGroupeStereotypes.listIterator(index);
	}

	@Override
	public List<GenGenerateByTemplateGroupeStereotype> subList(final int fromIndex, final int toIndex) {
		return this.genGenerateByTemplateGroupeStereotypes.subList(fromIndex, toIndex);
	}
}
