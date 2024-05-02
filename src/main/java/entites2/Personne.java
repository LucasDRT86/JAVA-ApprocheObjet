package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) {
		nom = nvNom;
		prenom = nvPrenom;
		adresse = nvAdresse;
	}
	
	
	public void afficher() {
		System.out.println("Je m'appelle " + prenom + " " + nom.toUpperCase());;
	}
	
	public void setNom(String nvNom) {
		nom = nvNom;
	}
	
	public void setPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}
	
	public void setAdresse(AdressePostale nvAdresse) {
		adresse = nvAdresse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getAdresse() {
		return String.valueOf(adresse.numRue) + " " + adresse.libelle + " " + String.valueOf(adresse.codePostale) + " " + adresse.ville;
	}

}
