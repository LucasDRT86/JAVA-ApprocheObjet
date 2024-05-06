package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private double nbJour;
	private double priceDay;
	
	
	public Pigiste(String nom, String prenom,double nbJour,double priceDay) {
		super(nom, prenom);
		this.nbJour = nbJour;
		this.priceDay = priceDay;
	}

	public double getSalaire() {
		return nbJour * priceDay;
	}


	public String getStatut() {
		return "pigiste";
	}

}
