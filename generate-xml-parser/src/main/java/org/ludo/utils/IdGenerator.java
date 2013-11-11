package org.ludo.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

public class IdGenerator {

	private static Random random = new Random();

	private static List listeValeurGeneree = new ArrayList();

	private static int LONGUEUR_ID = 32;
	private static int NOMBRE_ESSAI_MAXIMUM = 5;

	/*public static String getNewId(String nom) {
		String valeurGeneree;
		int i = 1;
		do {
			valeurGeneree = nom + "#" + i;
			i++;
		} while (estDejaGenere(valeurGeneree));
		return valeurGeneree;
	}*/

    public static String getNewId(final String nom)
    {
        boolean ok = true;
        int nombreEssai = 0;

        int i = 1;
        String valeurGeneree = null;
        do {
            valeurGeneree = nom + "#" + i;
            i++;
            nombreEssai++;
        } while(estDejaGenere(valeurGeneree) && (nombreEssai < NOMBRE_ESSAI_MAXIMUM));

        if( nombreEssai >= NOMBRE_ESSAI_MAXIMUM ) {
            ok = false;
        }

        if( ok ) {
            listeValeurGeneree.add(valeurGeneree);
        } else {
            AssertHelper.assertBoolean(ok, "Error lors de la gÃ©nÃ©ration d'un id : aucun nouvel id n'a pu Ãªtre gÃ©nÃ©rÃ©.");
        }
        return valeurGeneree;
    }

	public static String getNewId() {
		return getNewId(LONGUEUR_ID);
	}

	public static String getNewId(final int longueurId) {
		String valeurGeneree = generer(longueurId);
		boolean ok = true;
		int nombreEssai = 0;
		while(estDejaGenere(valeurGeneree) && (nombreEssai < NOMBRE_ESSAI_MAXIMUM)) {
			valeurGeneree = generer(longueurId);
			nombreEssai++;
		}
		if( nombreEssai >= NOMBRE_ESSAI_MAXIMUM ) {
			ok = false;
		}
		if( ok ) {
			listeValeurGeneree.add(valeurGeneree);
		} else {
			AssertHelper.assertBoolean(ok, "Error lors de la gÃ©nÃ©ration d'un id : aucun nouvel id n'a pu Ãªtre gÃ©nÃ©rÃ©.");
		}
		return valeurGeneree;
	}

	private static String generer(final int longueurId) {
		final StringBuffer id = new StringBuffer();
		for(int i=0; i<longueurId; i++) {
			id.append(
					//(char)byteArray[i]
					random.nextInt(10)
				);
		}
		return id.toString();
	}

	private static boolean estDejaGenere(final String valeurGeneree) {
		boolean estDejaGenere = false;
		for( final Iterator iterValuerGeneree = listeValeurGeneree.iterator(); iterValuerGeneree.hasNext() && ! estDejaGenere; ) {
			final String valeur = (String) iterValuerGeneree.next();
			estDejaGenere = estDejaGenere || StringUtils.equals(valeurGeneree, valeur);
		}
		return estDejaGenere;
	}

	public static void main(final String[] args) {
		final int taille = 20;
		final int limit = 100;
		System.out.println("taille = "+taille+", limit = "+limit);
		final String[] tab = new String[limit];
		boolean duplique = false;
		for(int i=0; i<limit; i++) {
			tab[i] = getNewId(taille);
			//System.out.println("id nÂ°"+i+" = "+tab[i]);
			for(int j=0; j<i; j++) {
				duplique = duplique || StringUtils.equals(tab[j],tab[i]);
			}
		}
		System.out.println("duplique = "+duplique);
	}

}
