package entites;

public class AdressePostale {
	public int numRue;
	public String libelle;
	public int codePostale;
	public String ville;
	
	public AdressePostale(int nvNumRue,String nvLibelle,int nvCodePostale,String nvVille) {
		numRue = nvNumRue;
		libelle = nvLibelle;
		codePostale = nvCodePostale;
		ville = nvVille;
	}

}
