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
	
	public static String getNewId(String nom) {
		String valeurGeneree;
		int i = 1;
		do {
			valeurGeneree = nom + "#" + i;
			i++;
		} while (estDejaGenere(valeurGeneree));
		return valeurGeneree;
	}
	
	public static String getNewId() {
		return getNewId(LONGUEUR_ID);
	}
	
	public static String getNewId(int longueurId) {
		String valeurGeneree = generer(longueurId);
		boolean ok = true;
		int nombreEssai = 0;
		while(estDejaGenere(valeurGeneree) && nombreEssai < NOMBRE_ESSAI_MAXIMUM) {
			valeurGeneree = generer(longueurId);
			nombreEssai++;
		}
		if( nombreEssai >= NOMBRE_ESSAI_MAXIMUM ) {
			ok = false;
		}
		if( ok ) {
			listeValeurGeneree.add(valeurGeneree);
		} else {
			AssertHelper.assertBoolean(ok, "Error lors de la génération d'un id : aucun nouvel id n'a pu être généré.");
		}
		return valeurGeneree;
	}
	
	private static String generer(int longueurId) {
		StringBuffer id = new StringBuffer();
		for(int i=0; i<longueurId; i++) {
			id.append(
					//(char)byteArray[i]
					random.nextInt(10)
				);
		}
		return id.toString();
	}
	
	private static boolean estDejaGenere(String valeurGeneree) {
		boolean estDejaGenere = false;
		for( Iterator iterValuerGeneree = listeValeurGeneree.iterator(); iterValuerGeneree.hasNext() && ! estDejaGenere; ) {
			String valeur = (String) iterValuerGeneree.next();
			estDejaGenere = estDejaGenere || StringUtils.equals(valeurGeneree, valeur);
		}
		return estDejaGenere;
	}
	
	public static void main(String[] args) {
		int taille = 20;
		int limit = 100;
		System.out.println("taille = "+taille+", limit = "+limit);
		String[] tab = new String[limit];
		boolean duplique = false;
		for(int i=0; i<limit; i++) {
			tab[i] = getNewId(taille);
			//System.out.println("id n°"+i+" = "+tab[i]);
			for(int j=0; j<i; j++) {
				duplique = duplique || StringUtils.equals(tab[j],tab[i]);
			}
		}
		System.out.println("duplique = "+duplique);
	}
	
}
