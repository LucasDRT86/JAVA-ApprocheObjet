package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public abstract String getStatut();
	
	public String afficherDonnees() {
		return "nom: " + nom + " prenom: " + prenom + " salaire: " + getSalaire() + " statut: " + getStatut(); 
	}

}
