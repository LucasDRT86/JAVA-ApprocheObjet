package fr.diginamic.entites;

public class Theatre {

	private String name;
	private int nbMax;
	private int totalRegister;
	private double recette;
	
	public Theatre(String name, int nbMax, int totalRegister) {
		this.name = name;
		this.nbMax = nbMax;
		this.totalRegister = totalRegister;
	}
	
	public void inscrire(int nbClient, double price) {
		if(nbClient < nbMax - totalRegister) {
			totalRegister += nbClient;
			recette += (nbClient * price);
		}else {
			System.err.println("La salle ne peux plus recevoir autant de client");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbMax() {
		return nbMax;
	}

	public void setNbMax(int nbMax) {
		this.nbMax = nbMax;
	}

	public int getTotalRegister() {
		return totalRegister;
	}

	public void setTotalRegister(int totalRegister) {
		this.totalRegister = totalRegister;
	}

	public double getRecette() {
		return recette;
	}

	
}
