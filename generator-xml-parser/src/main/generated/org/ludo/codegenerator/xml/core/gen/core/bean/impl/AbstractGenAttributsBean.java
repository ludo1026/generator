package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttributs;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenAttribut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenAttributsBean implements GenAttributs {
	
	/** Récupération de l'élément parent */
	
	private GenClasse referenceGenClasse;
	
	public GenClasse getReferenceGenClasse() {
		return referenceGenClasse;
	}
	
	public void setReferenceGenClasse(GenClasse referenceGenClasse) {
		this.referenceGenClasse = referenceGenClasse;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenAttribut> genAttributs = new ArrayList<GenAttribut>();
	
    public GenAttribut getGenAttributForGenId(String genId) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getGenId().equalsIgnoreCase(genId)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : genId de genAttribut = "+genId);
    }
    public GenAttribut getGenAttributForNomJava(String nomJava) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getNomJava().equalsIgnoreCase(nomJava)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nomJava de genAttribut = "+nomJava);
    }
    public GenAttribut getGenAttributForType(String type) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getType().equalsIgnoreCase(type)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : type de genAttribut = "+type);
    }
    public GenAttribut getGenAttributForNbMin(String nbMin) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getNbMin().equalsIgnoreCase(nbMin)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nbMin de genAttribut = "+nbMin);
    }
    public GenAttribut getGenAttributForNbMax(String nbMax) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getNbMax().equalsIgnoreCase(nbMax)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nbMax de genAttribut = "+nbMax);
    }
    public GenAttribut getGenAttributForNomSQL(String nomSQL) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getNomSQL().equalsIgnoreCase(nomSQL)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : nomSQL de genAttribut = "+nomSQL);
    }
    public GenAttribut getGenAttributForTypeSQL(String typeSQL) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getTypeSQL().equalsIgnoreCase(typeSQL)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : typeSQL de genAttribut = "+typeSQL);
    }
    public GenAttribut getGenAttributForEstDansTable(String estDansTable) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getEstDansTable().equalsIgnoreCase(estDansTable)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estDansTable de genAttribut = "+estDansTable);
    }
    public GenAttribut getGenAttributForSize(String size) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getSize().equalsIgnoreCase(size)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : size de genAttribut = "+size);
    }
    public GenAttribut getGenAttributForEstClePrimaire(String estClePrimaire) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getEstClePrimaire().equalsIgnoreCase(estClePrimaire)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estClePrimaire de genAttribut = "+estClePrimaire);
    }
    public GenAttribut getGenAttributForEstCleIncrementee(String estCleIncrementee) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getEstCleIncrementee().equalsIgnoreCase(estCleIncrementee)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estCleIncrementee de genAttribut = "+estCleIncrementee);
    }
    public GenAttribut getGenAttributForEstCleEtrangere(String estCleEtrangere) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getEstCleEtrangere().equalsIgnoreCase(estCleEtrangere)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : estCleEtrangere de genAttribut = "+estCleEtrangere);
    }
    public GenAttribut getGenAttributForDescription(String description) {
        for(GenAttribut genAttribut : genAttributs) {
            if(genAttribut.getDescription().equalsIgnoreCase(description)) {
                return genAttribut;
            }
        }
        throw new IllegalStateException("La genAttribut n'est pas définie : description de genAttribut = "+description);
    }
    public void addGenAttribut(GenAttribut genAttribut) {
    	genAttribut.setReferenceGenAttributs(this);
        genAttributs.add(genAttribut);
    }
    public List<GenAttribut> getGenAttributs() {
        return genAttributs;
    }
    public void setGenAttributs(List<GenAttribut> genAttributs) {
        this.genAttributs = genAttributs;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	

	@Override
	public int size() {
		return this.genAttributs.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genAttributs.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genAttributs.contains(o);
	}

	@Override
	public Iterator<GenAttribut> iterator() {
		return this.genAttributs.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genAttributs.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genAttributs.toArray(a);
	}

	@Override
	public boolean add(final GenAttribut e) {
		return this.genAttributs.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genAttributs.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genAttributs.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenAttribut> c) {
		return this.genAttributs.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenAttribut> c) {
		return this.genAttributs.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genAttributs.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genAttributs.retainAll(c);
	}

	@Override
	public void clear() {
		this.genAttributs.clear();
	}

	@Override
	public GenAttribut get(final int index) {
		return this.genAttributs.get(index);
	}

	@Override
	public GenAttribut set(final int index, final GenAttribut element) {
		return this.genAttributs.set(index, element);
	}

	@Override
	public void add(final int index, final GenAttribut element) {
		this.genAttributs.add(index, element);
	}

	@Override
	public GenAttribut remove(final int index) {
		return this.genAttributs.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genAttributs.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genAttributs.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenAttribut> listIterator() {
		return this.genAttributs.listIterator();
	}

	@Override
	public ListIterator<GenAttribut> listIterator(final int index) {
		return this.genAttributs.listIterator(index);
	}

	@Override
	public List<GenAttribut> subList(final int fromIndex, final int toIndex) {
		return this.genAttributs.subList(fromIndex, toIndex);
	}
}
