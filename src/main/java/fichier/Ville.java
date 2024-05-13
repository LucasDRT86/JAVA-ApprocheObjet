package fichier;

public class Ville {
	String Nom;
	int codeDpt;
	String nomRegion;
	int poptotal;
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getCodeDpt() {
		return codeDpt;
	}
	public void setCodeDpt(int codeDpt) {
		this.codeDpt = codeDpt;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public int getPoptotal() {
		return poptotal;
	}
	public void setPoptotal(int poptotal) {
		this.poptotal = poptotal;
	}
	@Override
	public String toString() {
		return "Nom=" + Nom + ", codeDpt=" + codeDpt + ", nomRegion=" + nomRegion + ", poptotal=" + poptotal;
	}
	
	
}
