package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Poitiers",95000);
		Ville ville2 = new Ville("Poitiers",95000);
		Ville ville3 = new Ville("Angoulême",95000);
		Ville ville4 = null;

		if(ville1.equals(ville2)) {
			System.out.println("Les deux villes sont indentique");
		} 
		else {
			System.out.println("Les deux villes sont differente");
		}
		
		if(ville1.equals(ville3)) {
			System.out.println("Les deux villes sont indentique");
		} 
		else {
			System.out.println("Les deux villes sont differente");
		}
		
		if(ville1.equals(ville4)) {
			System.out.println("Les deux villes sont indentique");
		} 
		else {
			System.out.println("Les deux villes sont differente");
		}
		
		if(ville1 == ville2) {
			System.out.println("Les deux villes sont indentique");
		} 
		else {
			System.out.println("Les deux villes sont differente");
		}
	}

}
