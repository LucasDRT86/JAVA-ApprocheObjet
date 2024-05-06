package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre bastille = new Theatre("Bastille",500,0);
		
		System.out.println("Nombre total de personne inscrit: "+ bastille.getTotalRegister());
		
		bastille.inscrire(20, 11.20);
		
		System.out.println("Nombre total de personne inscrit: "+ bastille.getTotalRegister());
		
		bastille.inscrire(479, 11.20);
		
		System.out.println("Nombre total de personne inscrit: "+ bastille.getTotalRegister());
		
		bastille.inscrire(2, 11.20);
		
		System.out.println("Recette: " + bastille.getRecette() );
		
	}

}
