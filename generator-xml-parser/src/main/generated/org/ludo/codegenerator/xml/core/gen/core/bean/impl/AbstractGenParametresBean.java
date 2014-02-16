package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametres;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenMethode;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenParametre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenParametresBean implements GenParametres {
	
	/** Récupération de l'élément parent */
	
	private GenMethode referenceGenMethode;
	
	public GenMethode getReferenceGenMethode() {
		return referenceGenMethode;
	}
	
	public void setReferenceGenMethode(GenMethode referenceGenMethode) {
		this.referenceGenMethode = referenceGenMethode;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenParametre> genParametres = new ArrayList<GenParametre>();
	
    public GenParametre getGenParametreForGenId(String genId) {
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getGenId().equalsIgnoreCase(genId)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : genId de genParametre = "+genId);
    }

    public List<GenParametre> getGenParametresByGenId(String genId) {
        List<GenParametre> result = new ArrayList<GenParametre>();
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getGenId().equalsIgnoreCase(genId)) {
                result.add(genParametre);
            }
        }
        return result;
    }

    public GenParametre getGenParametreForNomJava(String nomJava) {
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getNomJava().equalsIgnoreCase(nomJava)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : nomJava de genParametre = "+nomJava);
    }

    public List<GenParametre> getGenParametresByNomJava(String nomJava) {
        List<GenParametre> result = new ArrayList<GenParametre>();
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getNomJava().equalsIgnoreCase(nomJava)) {
                result.add(genParametre);
            }
        }
        return result;
    }

    public GenParametre getGenParametreForType(String type) {
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getType().equalsIgnoreCase(type)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : type de genParametre = "+type);
    }

    public List<GenParametre> getGenParametresByType(String type) {
        List<GenParametre> result = new ArrayList<GenParametre>();
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getType().equalsIgnoreCase(type)) {
                result.add(genParametre);
            }
        }
        return result;
    }

    public GenParametre getGenParametreForDescription(String description) {
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getDescription().equalsIgnoreCase(description)) {
                return genParametre;
            }
        }
        throw new IllegalStateException("La genParametre n'est pas définie : description de genParametre = "+description);
    }

    public List<GenParametre> getGenParametresByDescription(String description) {
        List<GenParametre> result = new ArrayList<GenParametre>();
        for(GenParametre genParametre : genParametres) {
            if(genParametre.getDescription().equalsIgnoreCase(description)) {
                result.add(genParametre);
            }
        }
        return result;
    }

    public void addGenParametre(GenParametre genParametre) {
    	genParametre.setReferenceGenParametres(this);
        genParametres.add(genParametre);
    }
    public List<GenParametre> getGenParametres() {
        return genParametres;
    }
    public void setGenParametres(List<GenParametre> genParametres) {
        this.genParametres = genParametres;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genParametres.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genParametres.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genParametres.contains(o);
	}

	@Override
	public Iterator<GenParametre> iterator() {
		return this.genParametres.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genParametres.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genParametres.toArray(a);
	}

	@Override
	public boolean add(final GenParametre e) {
		return this.genParametres.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genParametres.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genParametres.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenParametre> c) {
		return this.genParametres.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenParametre> c) {
		return this.genParametres.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genParametres.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genParametres.retainAll(c);
	}

	@Override
	public void clear() {
		this.genParametres.clear();
	}

	@Override
	public GenParametre get(final int index) {
		return this.genParametres.get(index);
	}

	@Override
	public GenParametre set(final int index, final GenParametre element) {
		return this.genParametres.set(index, element);
	}

	@Override
	public void add(final int index, final GenParametre element) {
		this.genParametres.add(index, element);
	}

	@Override
	public GenParametre remove(final int index) {
		return this.genParametres.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genParametres.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genParametres.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenParametre> listIterator() {
		return this.genParametres.listIterator();
	}

	@Override
	public ListIterator<GenParametre> listIterator(final int index) {
		return this.genParametres.listIterator(index);
	}

	@Override
	public List<GenParametre> subList(final int fromIndex, final int toIndex) {
		return this.genParametres.subList(fromIndex, toIndex);
	}
}
