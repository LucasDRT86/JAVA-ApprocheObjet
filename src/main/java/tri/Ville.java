package tri;

public class Ville implements Comparable<Ville> {
	String Nom;
	String codeDpt;
	String nomRegion;
	int poptotal;
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getCodeDpt() {
		return codeDpt;
	}
	public void setCodeDpt(String codeDpt) {
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
	
	
	public int compareTo(Ville autre) {
		
		if(this.getPoptotal() < autre.getPoptotal()) {
			return -1;
		}else if(this.getPoptotal() > autre.getPoptotal()) {
			return 1;
		}
		return 0;
	}
	
	
}
