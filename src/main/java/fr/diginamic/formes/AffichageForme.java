package fr.diginamic.formes;

public class AffichageForme {
	
	Forme forme;

	public void displayForme(Forme forme) {
		
		System.out.println("Perimètre: " + forme.calculerPerimetre() + " Surface: " + forme.calculerSurface());
	}
}
