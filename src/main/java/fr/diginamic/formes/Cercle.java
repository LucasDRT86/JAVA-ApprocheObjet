package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double calculerSurface() {
		return rayon*rayon*Math.PI;
	}

	public double calculerPerimetre() {
		return rayon*Math.PI;
	}

}
