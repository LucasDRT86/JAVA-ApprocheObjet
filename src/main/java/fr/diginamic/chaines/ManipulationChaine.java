package fr.diginamic.chaines;

import java.util.Arrays;

public class ManipulationChaine {
	public static void main(String[] args) {
		String chaine = "Durans;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println("Taille de la chaîne: " + chaine.length() );
		
		System.out.println("Le premier ';' est à l'index: " + chaine.indexOf(';'));
		
		String nom = chaine.substring(0, chaine.indexOf(';'));
		
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		
		String[] tab = chaine.split(";");
		System.out.println(Arrays.toString(tab));
		
		tab[2] = tab[2].replace(" ", "");

		System.out.println(tab[2]);
		
		Salarie salarie = new Salarie(tab[0],tab[1],Double.parseDouble(tab[2]));
		
		System.out.println(salarie.toString());
	}
}
