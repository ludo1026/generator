package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethodes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenMethodesBean implements GenMethodes {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenMethode> genMethodes = new ArrayList<GenMethode>();
	
    public GenMethode getGenMethodeForGenId(String genId) {
        for(GenMethode genMethode : genMethodes) {
            if(genMethode.getGenId().equalsIgnoreCase(genId)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : genId de genMethode = "+genId);
    }
    public GenMethode getGenMethodeForNomJava(String nomJava) {
        for(GenMethode genMethode : genMethodes) {
            if(genMethode.getNomJava().equalsIgnoreCase(nomJava)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : nomJava de genMethode = "+nomJava);
    }
    public GenMethode getGenMethodeForRetourType(String retourType) {
        for(GenMethode genMethode : genMethodes) {
            if(genMethode.getRetourType().equalsIgnoreCase(retourType)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : retourType de genMethode = "+retourType);
    }
    public GenMethode getGenMethodeForDescription(String description) {
        for(GenMethode genMethode : genMethodes) {
            if(genMethode.getDescription().equalsIgnoreCase(description)) {
                return genMethode;
            }
        }
        throw new IllegalStateException("La genMethode n'est pas définie : description de genMethode = "+description);
    }
    public void addGenMethode(GenMethode genMethode) {
    	genMethode.setReferenceGenMethodes(this);
        genMethodes.add(genMethode);
    }
    public List<GenMethode> getGenMethodes() {
        return genMethodes;
    }
    public void setGenMethodes(List<GenMethode> genMethodes) {
        this.genMethodes = genMethodes;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genMethodes.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genMethodes.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genMethodes.contains(o);
	}

	@Override
	public Iterator<GenMethode> iterator() {
		return this.genMethodes.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genMethodes.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genMethodes.toArray(a);
	}

	@Override
	public boolean add(final GenMethode e) {
		return this.genMethodes.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genMethodes.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genMethodes.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenMethode> c) {
		return this.genMethodes.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenMethode> c) {
		return this.genMethodes.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genMethodes.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genMethodes.retainAll(c);
	}

	@Override
	public void clear() {
		this.genMethodes.clear();
	}

	@Override
	public GenMethode get(final int index) {
		return this.genMethodes.get(index);
	}

	@Override
	public GenMethode set(final int index, final GenMethode element) {
		return this.genMethodes.set(index, element);
	}

	@Override
	public void add(final int index, final GenMethode element) {
		this.genMethodes.add(index, element);
	}

	@Override
	public GenMethode remove(final int index) {
		return this.genMethodes.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genMethodes.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genMethodes.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenMethode> listIterator() {
		return this.genMethodes.listIterator();
	}

	@Override
	public ListIterator<GenMethode> listIterator(final int index) {
		return this.genMethodes.listIterator(index);
	}

	@Override
	public List<GenMethode> subList(final int fromIndex, final int toIndex) {
		return this.genMethodes.subList(fromIndex, toIndex);
	}
}
