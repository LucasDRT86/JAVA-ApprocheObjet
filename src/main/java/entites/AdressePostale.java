package entites;

public class AdressePostale {
	private int numRue;
	private String libelle;
	private int codePostale;
	private String ville;
	
	public AdressePostale(int nvNumRue,String nvLibelle,int nvCodePostale,String nvVille) {
		numRue = nvNumRue;
		libelle = nvLibelle;
		codePostale = nvCodePostale;
		ville = nvVille;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
