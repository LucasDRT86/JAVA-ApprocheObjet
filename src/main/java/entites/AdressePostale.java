package entites;

public class AdressePostale {
	int numRue;
	String libelle;
	int codePostale;
	String ville;
	
	public AdressePostale(int nvNumRue,String nvLibelle,int nvCodePostale,String nvVille) {
		numRue = nvNumRue;
		libelle = nvLibelle;
		codePostale = nvCodePostale;
		ville = nvVille;
	}

}
