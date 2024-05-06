package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie s = new Salarie("Dupont","Michel",1905,"CDI");
		Pigiste p = new Pigiste("Martin","Alain",28,70);

		System.out.println("Salaire de Michel Dupont: " + s.getSalaire());
		System.out.println("Salaire de Alain Martin: " + p.getSalaire());
		
		System.out.println(s.afficherDonnees());
		System.out.println(p.afficherDonnees());
	}
	
}
