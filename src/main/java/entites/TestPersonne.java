package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		AdressePostale adresse1 = new AdressePostale();
		
		
		adresse1.numRue = 8;
		adresse1.libelle ="rue des poiriers";
		adresse1.codePostale =79010;
		adresse1.ville = "Niort";
		
		personne1.prenom = "Michel";
		personne1.nom = "Dupont";
		personne1.adresse = adresse1;
		
		personne2.prenom = "Olivier";
		personne2.nom = "Martin";
		personne2.adresse = adresse1;
		
		System.out.println(personne1.prenom + " " + personne1.nom);
		System.out.println(personne2.prenom + " " + personne2.nom);
	}

}
