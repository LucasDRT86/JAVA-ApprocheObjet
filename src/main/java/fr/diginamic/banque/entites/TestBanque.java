package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(16651,55555);
		
		System.out.println(c1.getNumCompte());
		System.out.println(c1.getSolde());

	}

}
