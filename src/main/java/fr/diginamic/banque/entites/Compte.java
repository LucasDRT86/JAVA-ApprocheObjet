package fr.diginamic.banque.entites;

public class Compte {
	private int numCompte;
	private int solde;
	
	
	public Compte(int numCompte, int solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}


	public int getNumCompte() {
		return numCompte;
	}


	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public int getSolde() {
		return solde;
	}


	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Numéro de compte: " + numCompte + "\nSolde: " + solde; 
	}
	
	
}
