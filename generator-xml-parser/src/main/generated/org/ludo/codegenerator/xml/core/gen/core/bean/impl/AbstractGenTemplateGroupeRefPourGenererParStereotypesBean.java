package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenTemplateGroupeRefPourGenererParStereotypesBean implements GenTemplateGroupeRefPourGenererParStereotypes {
	
	/** Récupération de l'élément parent */
	
	private GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype;
	
	public GenStereotypeRefPourGenererParStereotype getReferenceGenStereotypeRefPourGenererParStereotype() {
		return referenceGenStereotypeRefPourGenererParStereotype;
	}
	
	public void setReferenceGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype referenceGenStereotypeRefPourGenererParStereotype) {
		this.referenceGenStereotypeRefPourGenererParStereotype = referenceGenStereotypeRefPourGenererParStereotype;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenTemplateGroupeRefPourGenererParStereotype> genTemplateGroupeRefPourGenererParStereotypes = new ArrayList<GenTemplateGroupeRefPourGenererParStereotype>();
	
    public GenTemplateGroupeRefPourGenererParStereotype getGenTemplateGroupeRefPourGenererParStereotypeForTemplateGroupeNom(String templateGroupeNom) {
        for(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype : genTemplateGroupeRefPourGenererParStereotypes) {
            if(genTemplateGroupeRefPourGenererParStereotype.getTemplateGroupeNom().equalsIgnoreCase(templateGroupeNom)) {
                return genTemplateGroupeRefPourGenererParStereotype;
            }
        }
        throw new IllegalStateException("La genTemplateGroupeRefPourGenererParStereotype n'est pas définie : templateGroupeNom de genTemplateGroupeRefPourGenererParStereotype = "+templateGroupeNom);
    }
    public void addGenTemplateGroupeRefPourGenererParStereotype(GenTemplateGroupeRefPourGenererParStereotype genTemplateGroupeRefPourGenererParStereotype) {
    	genTemplateGroupeRefPourGenererParStereotype.setReferenceGenTemplateGroupeRefPourGenererParStereotypes(this);
        genTemplateGroupeRefPourGenererParStereotypes.add(genTemplateGroupeRefPourGenererParStereotype);
    }
    public List<GenTemplateGroupeRefPourGenererParStereotype> getGenTemplateGroupeRefPourGenererParStereotypes() {
        return genTemplateGroupeRefPourGenererParStereotypes;
    }
    public void setGenTemplateGroupeRefPourGenererParStereotypes(List<GenTemplateGroupeRefPourGenererParStereotype> genTemplateGroupeRefPourGenererParStereotypes) {
        this.genTemplateGroupeRefPourGenererParStereotypes = genTemplateGroupeRefPourGenererParStereotypes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genTemplateGroupeRefPourGenererParStereotypes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genTemplateGroupeRefPourGenererParStereotypes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.contains(o);
	}

	@Override
	public Iterator<GenTemplateGroupeRefPourGenererParStereotype> iterator() {
		return this.genTemplateGroupeRefPourGenererParStereotypes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genTemplateGroupeRefPourGenererParStereotypes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.toArray(a);
	}

	@Override
	public boolean add(final GenTemplateGroupeRefPourGenererParStereotype e) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenTemplateGroupeRefPourGenererParStereotype> c) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenTemplateGroupeRefPourGenererParStereotype> c) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genTemplateGroupeRefPourGenererParStereotypes.clear();
	}

	@Override
	public GenTemplateGroupeRefPourGenererParStereotype get(final int index) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.get(index);
	}

	@Override
	public GenTemplateGroupeRefPourGenererParStereotype set(final int index, final GenTemplateGroupeRefPourGenererParStereotype element) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.set(index, element);
	}

	@Override
	public void add(final int index, final GenTemplateGroupeRefPourGenererParStereotype element) {
		this.genTemplateGroupeRefPourGenererParStereotypes.add(index, element);
	}

	@Override
	public GenTemplateGroupeRefPourGenererParStereotype remove(final int index) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenTemplateGroupeRefPourGenererParStereotype> listIterator() {
		return this.genTemplateGroupeRefPourGenererParStereotypes.listIterator();
	}

	@Override
	public ListIterator<GenTemplateGroupeRefPourGenererParStereotype> listIterator(final int index) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.listIterator(index);
	}

	@Override
	public List<GenTemplateGroupeRefPourGenererParStereotype> subList(final int fromIndex, final int toIndex) {
		return this.genTemplateGroupeRefPourGenererParStereotypes.subList(fromIndex, toIndex);
	}
}
