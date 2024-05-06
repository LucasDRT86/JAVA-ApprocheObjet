package fr.diginamic.formes;

public class Carre extends Rectangle {

	private double longueur;

	public Carre(double longueur) {
		this.longueur = longueur;
	}
	
	public double calculerSurface() {
		return this.longueur * this.longueur;
	}

	public double calculerPerimetre() {
		return this.longueur  * 4;
	}

}
