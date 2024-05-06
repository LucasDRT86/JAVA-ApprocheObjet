package fr.diginamic.essais;

import fr.diginamic.formes.AffichageForme;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle c = new Cercle(3);
		Rectangle r = new Rectangle(2,5);
		Carre ca = new Carre(4);
		
		AffichageForme disp = new AffichageForme();


		disp.displayForme(c);

		disp.displayForme(r);

		disp.displayForme(ca);
	}

}
