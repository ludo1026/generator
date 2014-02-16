package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenStereotypeRefPourGenererParStereotypesBean implements GenStereotypeRefPourGenererParStereotypes {
	
	/** Récupération de l'élément parent */
	
	private GenGenererParStereotype referenceGenGenererParStereotype;
	
	public GenGenererParStereotype getReferenceGenGenererParStereotype() {
		return referenceGenGenererParStereotype;
	}
	
	public void setReferenceGenGenererParStereotype(GenGenererParStereotype referenceGenGenererParStereotype) {
		this.referenceGenGenererParStereotype = referenceGenGenererParStereotype;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenStereotypeRefPourGenererParStereotype> genStereotypeRefPourGenererParStereotypes = new ArrayList<GenStereotypeRefPourGenererParStereotype>();
	
    public GenStereotypeRefPourGenererParStereotype getGenStereotypeRefPourGenererParStereotypeForStereotypeNom(String stereotypeNom) {
        for(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype : genStereotypeRefPourGenererParStereotypes) {
            if(genStereotypeRefPourGenererParStereotype.getStereotypeNom().equalsIgnoreCase(stereotypeNom)) {
                return genStereotypeRefPourGenererParStereotype;
            }
        }
        throw new IllegalStateException("La genStereotypeRefPourGenererParStereotype n'est pas définie : stereotypeNom de genStereotypeRefPourGenererParStereotype = "+stereotypeNom);
    }

    public List<GenStereotypeRefPourGenererParStereotype> getGenStereotypeRefPourGenererParStereotypesByStereotypeNom(String stereotypeNom) {
        List<GenStereotypeRefPourGenererParStereotype> result = new ArrayList<GenStereotypeRefPourGenererParStereotype>();
        for(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype : genStereotypeRefPourGenererParStereotypes) {
            if(genStereotypeRefPourGenererParStereotype.getStereotypeNom().equalsIgnoreCase(stereotypeNom)) {
                result.add(genStereotypeRefPourGenererParStereotype);
            }
        }
        return result;
    }

    public void addGenStereotypeRefPourGenererParStereotype(GenStereotypeRefPourGenererParStereotype genStereotypeRefPourGenererParStereotype) {
    	genStereotypeRefPourGenererParStereotype.setReferenceGenStereotypeRefPourGenererParStereotypes(this);
        genStereotypeRefPourGenererParStereotypes.add(genStereotypeRefPourGenererParStereotype);
    }
    public List<GenStereotypeRefPourGenererParStereotype> getGenStereotypeRefPourGenererParStereotypes() {
        return genStereotypeRefPourGenererParStereotypes;
    }
    public void setGenStereotypeRefPourGenererParStereotypes(List<GenStereotypeRefPourGenererParStereotype> genStereotypeRefPourGenererParStereotypes) {
        this.genStereotypeRefPourGenererParStereotypes = genStereotypeRefPourGenererParStereotypes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genStereotypeRefPourGenererParStereotypes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genStereotypeRefPourGenererParStereotypes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genStereotypeRefPourGenererParStereotypes.contains(o);
	}

	@Override
	public Iterator<GenStereotypeRefPourGenererParStereotype> iterator() {
		return this.genStereotypeRefPourGenererParStereotypes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genStereotypeRefPourGenererParStereotypes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genStereotypeRefPourGenererParStereotypes.toArray(a);
	}

	@Override
	public boolean add(final GenStereotypeRefPourGenererParStereotype e) {
		return this.genStereotypeRefPourGenererParStereotypes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genStereotypeRefPourGenererParStereotypes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genStereotypeRefPourGenererParStereotypes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenStereotypeRefPourGenererParStereotype> c) {
		return this.genStereotypeRefPourGenererParStereotypes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenStereotypeRefPourGenererParStereotype> c) {
		return this.genStereotypeRefPourGenererParStereotypes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genStereotypeRefPourGenererParStereotypes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genStereotypeRefPourGenererParStereotypes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genStereotypeRefPourGenererParStereotypes.clear();
	}

	@Override
	public GenStereotypeRefPourGenererParStereotype get(final int index) {
		return this.genStereotypeRefPourGenererParStereotypes.get(index);
	}

	@Override
	public GenStereotypeRefPourGenererParStereotype set(final int index, final GenStereotypeRefPourGenererParStereotype element) {
		return this.genStereotypeRefPourGenererParStereotypes.set(index, element);
	}

	@Override
	public void add(final int index, final GenStereotypeRefPourGenererParStereotype element) {
		this.genStereotypeRefPourGenererParStereotypes.add(index, element);
	}

	@Override
	public GenStereotypeRefPourGenererParStereotype remove(final int index) {
		return this.genStereotypeRefPourGenererParStereotypes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genStereotypeRefPourGenererParStereotypes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genStereotypeRefPourGenererParStereotypes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenStereotypeRefPourGenererParStereotype> listIterator() {
		return this.genStereotypeRefPourGenererParStereotypes.listIterator();
	}

	@Override
	public ListIterator<GenStereotypeRefPourGenererParStereotype> listIterator(final int index) {
		return this.genStereotypeRefPourGenererParStereotypes.listIterator(index);
	}

	@Override
	public List<GenStereotypeRefPourGenererParStereotype> subList(final int fromIndex, final int toIndex) {
		return this.genStereotypeRefPourGenererParStereotypes.subList(fromIndex, toIndex);
	}
}
