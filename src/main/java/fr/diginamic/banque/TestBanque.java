package fr.diginamic.banque;

import java.util.Arrays;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(16651,55555);
		CompteTaux ctaux = new CompteTaux(c1.getNumCompte(),c1.getSolde(),10);
		Compte[] tabCompte = {c1, ctaux};
		
		for(int i = 0; i <= 1; i++) {
			System.out.println(tabCompte[i].toString());			
		}

	}

}
