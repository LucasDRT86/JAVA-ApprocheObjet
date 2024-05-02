package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();
		
		adresse1.numRue = 8;
		adresse1.libelle ="rue des poiriers";
		adresse1.codePostale =79010;
		adresse1.ville = "Niort";
		
		adresse2.numRue = 10;
		adresse2.libelle ="rue des cerisiers";
		adresse2.codePostale =86110;
		adresse2.ville = "Poitiers";
	}

}
