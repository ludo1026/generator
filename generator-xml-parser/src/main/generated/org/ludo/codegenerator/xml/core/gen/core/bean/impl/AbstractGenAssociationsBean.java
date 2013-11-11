package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociations;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAssociation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenAssociationsBean implements GenAssociations {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenAssociation> genAssociations = new ArrayList<GenAssociation>();
	
    public GenAssociation getGenAssociationForGenId(String genId) {
        for(GenAssociation genAssociation : genAssociations) {
            if(genAssociation.getGenId().equalsIgnoreCase(genId)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : genId de genAssociation = "+genId);
    }
    public GenAssociation getGenAssociationForNomJava(String nomJava) {
        for(GenAssociation genAssociation : genAssociations) {
            if(genAssociation.getNomJava().equalsIgnoreCase(nomJava)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nomJava de genAssociation = "+nomJava);
    }
    public GenAssociation getGenAssociationForClasseGenId(String classeGenId) {
        for(GenAssociation genAssociation : genAssociations) {
            if(genAssociation.getClasseGenId().equalsIgnoreCase(classeGenId)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : classeGenId de genAssociation = "+classeGenId);
    }
    public GenAssociation getGenAssociationForNbMin(String nbMin) {
        for(GenAssociation genAssociation : genAssociations) {
            if(genAssociation.getNbMin().equalsIgnoreCase(nbMin)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nbMin de genAssociation = "+nbMin);
    }
    public GenAssociation getGenAssociationForNbMax(String nbMax) {
        for(GenAssociation genAssociation : genAssociations) {
            if(genAssociation.getNbMax().equalsIgnoreCase(nbMax)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : nbMax de genAssociation = "+nbMax);
    }
    public GenAssociation getGenAssociationForDescription(String description) {
        for(GenAssociation genAssociation : genAssociations) {
            if(genAssociation.getDescription().equalsIgnoreCase(description)) {
                return genAssociation;
            }
        }
        throw new IllegalStateException("La genAssociation n'est pas définie : description de genAssociation = "+description);
    }
    public void addGenAssociation(GenAssociation genAssociation) {
    	genAssociation.setReferenceGenAssociations(this);
        genAssociations.add(genAssociation);
    }
    public List<GenAssociation> getGenAssociations() {
        return genAssociations;
    }
    public void setGenAssociations(List<GenAssociation> genAssociations) {
        this.genAssociations = genAssociations;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genAssociations.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genAssociations.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genAssociations.contains(o);
	}

	@Override
	public Iterator<GenAssociation> iterator() {
		return this.genAssociations.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genAssociations.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genAssociations.toArray(a);
	}

	@Override
	public boolean add(final GenAssociation e) {
		return this.genAssociations.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genAssociations.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genAssociations.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenAssociation> c) {
		return this.genAssociations.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenAssociation> c) {
		return this.genAssociations.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genAssociations.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genAssociations.retainAll(c);
	}

	@Override
	public void clear() {
		this.genAssociations.clear();
	}

	@Override
	public GenAssociation get(final int index) {
		return this.genAssociations.get(index);
	}

	@Override
	public GenAssociation set(final int index, final GenAssociation element) {
		return this.genAssociations.set(index, element);
	}

	@Override
	public void add(final int index, final GenAssociation element) {
		this.genAssociations.add(index, element);
	}

	@Override
	public GenAssociation remove(final int index) {
		return this.genAssociations.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genAssociations.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genAssociations.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenAssociation> listIterator() {
		return this.genAssociations.listIterator();
	}

	@Override
	public ListIterator<GenAssociation> listIterator(final int index) {
		return this.genAssociations.listIterator(index);
	}

	@Override
	public List<GenAssociation> subList(final int fromIndex, final int toIndex) {
		return this.genAssociations.subList(fromIndex, toIndex);
	}
}
