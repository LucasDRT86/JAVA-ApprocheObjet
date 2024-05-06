package fr.diginamic.essais;

import fr.diginamic.Operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne m1 = new CalculMoyenne();
		CalculMoyenne m2 = new CalculMoyenne();
		
		
		m1.add(1);
		m1.add(2);
		m1.add(3);
		m1.add(4);
		m1.add(5);
		
		m2.add(0);
		m2.add(25);
		m2.add(50);
		m2.add(75);
		m2.add(100);
		
		System.out.println("La moyenne de m1 est " + m1.calcul());
		System.out.println("La moyenne de m2 est " + m2.calcul());
	}

}
