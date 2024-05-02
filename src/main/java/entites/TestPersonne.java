package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale(8,"rue des poiriers",79010,"Niort");
		Personne personne1 = new Personne("Michel","Dupont",adresse1);
		Personne personne2 = new Personne("Olivier","Martin",adresse1);
			
		personne2.prenom = "Olivier";
		personne2.nom = "Martin";
		personne2.adresse = adresse1;
		
		System.out.println(personne1.prenom + " " + personne1.nom);
		System.out.println(personne2.prenom + " " + personne2.nom);
		
		personne2.afficher();
		
		System.out.println("Test getNom: "+ personne2.getNom());
		System.out.println("Test getAdresse: "+ personne2.getAdresse());
		System.out.println("Test getPrenom: "+ personne2.getPrenom());
		
		personne2.setNom("Michelin");
		personne2.setPrenom("Didier");
		personne2.setAdresse(new AdressePostale(5, "route de Bordeaux",14000,"Poitiers"));
		
		System.out.println("Test getNom: "+ personne2.getNom());
		System.out.println("Test getPrenom: "+ personne2.getPrenom());
		System.out.println("Test getAdresse: "+ personne2.getAdresse().getVille());
	}

}
