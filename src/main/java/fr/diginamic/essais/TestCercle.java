package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(4);
		Cercle c2 = new Cercle(5.6);

		
		System.out.println("Le cercle c1 à pour perimetre: "+c1.getPerimetre() +" et pour surface: " + c1.getSurface());
		System.out.println("Le cercle c2 à pour perimetre: "+c2.getPerimetre() +" et pour surface: " + c2.getSurface());
	}

}
