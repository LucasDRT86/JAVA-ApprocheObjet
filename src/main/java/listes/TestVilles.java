package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
	public static void main(String[] args) {
		ArrayList<Ville> liste = new ArrayList<>();
		Collections.addAll(liste, new Ville("Nice",343000),new Ville("Carcassonne",47800),new Ville("Narbonne",53400),new Ville("Lyon",484000),new Ville("Foix",9700),new Ville("Pau",77200),new Ville("Marseille",850700),new Ville("Tarbes",40600));
		
		Ville grandeVille = new Ville("v",-1);
		for(int i = 0; i < liste.size();i++) {
			if (liste.get(i).getNbHabitants() > grandeVille.getNbHabitants()) {
				grandeVille = liste.get(i);
			}
		}
		System.out.println(grandeVille.toString());
		
		Ville petiteVille = liste.get(0);
		int indexPetiteVille = 0;
		for(int i = 0; i < liste.size();i++) {
			if (liste.get(i).getNbHabitants() < petiteVille.getNbHabitants()) {
				petiteVille = liste.get(i);
				indexPetiteVille = i;
			}
		}
		
		liste.remove(indexPetiteVille);
		
		for(Ville ville : liste ) {
			if(ville.getNbHabitants() > 100_000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		System.out.println("liste: "+ liste);
	}
}
