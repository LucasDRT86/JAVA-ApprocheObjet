package fr.diginamic.chaines;

public class Salarie {

	String nom;
	String prenom;
	double salarie;
	public Salarie(String nom, String prenom, double salarie) {
		this.nom = nom;
		this.prenom = prenom;
		this.salarie = salarie;
	}
	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", salarie=" + salarie;
	}
	
	
}
