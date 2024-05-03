package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private int tauxRemune;

	public CompteTaux(int numCompte, int solde,int tauxRemune) {
		super(numCompte, solde);
		this.tauxRemune = tauxRemune;
	}

	

	public int getTauxRemune() {
		return tauxRemune;
	}

	public void setTauxRemune(int tauxRemune) {
		this.tauxRemune = tauxRemune;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Taux: "+ getTauxRemune();
	}

	
	
}
