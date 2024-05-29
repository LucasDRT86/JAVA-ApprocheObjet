package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	

	private String libelle;
	private int numero;
	
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}

	public static Saison extraireSaisonParLibelle(String libelle) {
		Saison[] saisons = values();
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}
	/** 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
