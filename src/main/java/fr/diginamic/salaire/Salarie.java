package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private String typeContrat;
	private double salaireMensuel;
	
	


	public Salarie(String nom, String prenom,double salaireMensuel,String typeContrat) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
		this.typeContrat = typeContrat;
	}



	public double getSalaire() {
		return salaireMensuel;
	}

	public String getStatut() {
		return typeContrat;
	}

}
