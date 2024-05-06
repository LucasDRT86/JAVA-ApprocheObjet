package fr.diginamic.entites;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimetre() {
		return rayon*Math.PI;
	}
	
	public double getSurface() {
		return rayon*rayon*Math.PI;
	}
	
}
