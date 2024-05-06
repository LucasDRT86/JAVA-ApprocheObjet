package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	double longueur;
	double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}


	public Rectangle() {
	}


	public double calculerSurface() {
		return this.longueur * this.largeur;
	}

	public double calculerPerimetre() {
		return (this.longueur + this.largeur) * 2;
	}



}
