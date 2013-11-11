package org.ludo.codegenerator.xml.core.gen.core.bean.impl;

import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AbstractGenClassesBean implements GenClasses {
	
	/** Récupération de l'élément parent */
	
	private Gen referenceGen;
	
	public Gen getReferenceGen() {
		return referenceGen;
	}
	
	public void setReferenceGen(Gen referenceGen) {
		this.referenceGen = referenceGen;
	}
	
	/** Récupération des éléments fils */
	
    private List<GenClasse> genClasses = new ArrayList<GenClasse>();
	
    public GenClasse getGenClasseForGenId(String genId) {
        for(GenClasse genClasse : genClasses) {
            if(genClasse.getGenId().equalsIgnoreCase(genId)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : genId de genClasse = "+genId);
    }
    public GenClasse getGenClasseForNomJava(String nomJava) {
        for(GenClasse genClasse : genClasses) {
            if(genClasse.getNomJava().equalsIgnoreCase(nomJava)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomJava de genClasse = "+nomJava);
    }
    public GenClasse getGenClasseForPackageJava(String packageJava) {
        for(GenClasse genClasse : genClasses) {
            if(genClasse.getPackageJava().equalsIgnoreCase(packageJava)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : packageJava de genClasse = "+packageJava);
    }
    public GenClasse getGenClasseForNomTable(String nomTable) {
        for(GenClasse genClasse : genClasses) {
            if(genClasse.getNomTable().equalsIgnoreCase(nomTable)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomTable de genClasse = "+nomTable);
    }
    public GenClasse getGenClasseForNomVue(String nomVue) {
        for(GenClasse genClasse : genClasses) {
            if(genClasse.getNomVue().equalsIgnoreCase(nomVue)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : nomVue de genClasse = "+nomVue);
    }
    public GenClasse getGenClasseForDescription(String description) {
        for(GenClasse genClasse : genClasses) {
            if(genClasse.getDescription().equalsIgnoreCase(description)) {
                return genClasse;
            }
        }
        throw new IllegalStateException("La genClasse n'est pas définie : description de genClasse = "+description);
    }
    public void addGenClasse(GenClasse genClasse) {
    	genClasse.setReferenceGenClasses(this);
        genClasses.add(genClasse);
    }
    public List<GenClasse> getGenClasses() {
        return genClasses;
    }
    public void setGenClasses(List<GenClasse> genClasses) {
        this.genClasses = genClasses;
    }
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	

	public String getPackageBaseAsString() {
		return this.packageBase;
	}
	public void setPackageBaseAsString(String packageBaseAsString) {
		this.packageBase = packageBaseAsString;
	}
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
	private String packageBase = null;

	public String getPackageBase() {
		return this.packageBase;
	}
	public void setPackageBase(String packageBase) {
		this.packageBase = packageBase;
	}

	@Override
	public int size() {
		return this.genClasses.size();
	}

	@Override
	public boolean isEmpty() {
		return this.genClasses.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return this.genClasses.contains(o);
	}

	@Override
	public Iterator<GenClasse> iterator() {
		return this.genClasses.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.genClasses.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		return this.genClasses.toArray(a);
	}

	@Override
	public boolean add(final GenClasse e) {
		return this.genClasses.add(e);
	}

	@Override
	public boolean remove(final Object o) {
		return this.genClasses.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		return this.genClasses.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends GenClasse> c) {
		return this.genClasses.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends GenClasse> c) {
		return this.genClasses.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		return this.genClasses.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		return this.genClasses.retainAll(c);
	}

	@Override
	public void clear() {
		this.genClasses.clear();
	}

	@Override
	public GenClasse get(final int index) {
		return this.genClasses.get(index);
	}

	@Override
	public GenClasse set(final int index, final GenClasse element) {
		return this.genClasses.set(index, element);
	}

	@Override
	public void add(final int index, final GenClasse element) {
		this.genClasses.add(index, element);
	}

	@Override
	public GenClasse remove(final int index) {
		return this.genClasses.remove(index);
	}

	@Override
	public int indexOf(final Object o) {
		return this.genClasses.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o) {
		return this.genClasses.lastIndexOf(o);
	}

	@Override
	public ListIterator<GenClasse> listIterator() {
		return this.genClasses.listIterator();
	}

	@Override
	public ListIterator<GenClasse> listIterator(final int index) {
		return this.genClasses.listIterator(index);
	}

	@Override
	public List<GenClasse> subList(final int fromIndex, final int toIndex) {
		return this.genClasses.subList(fromIndex, toIndex);
	}
}
