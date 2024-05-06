package fr.diginamic.Operations;

import java.util.Arrays;

public class CalculMoyenne {

	private double[] tab = new double[0];
	
	public void add(double number) {
		this.tab = Arrays.copyOf(tab, tab.length +1);
		this.tab[tab.length -1] = number;
	}
	
	public double calcul() {
		double somme = 0;
		for(int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme / tab.length;
	}
	
}
