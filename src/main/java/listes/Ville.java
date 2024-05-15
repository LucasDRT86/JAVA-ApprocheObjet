package listes;

import java.util.Objects;

public class Ville {

	private String nom;
	private int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", nbHabitants=" + nbHabitants;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Ville)) {
			return false;
		}
		
		Ville other = (Ville) obj;
		return Objects.equals(nom, other.getNom()) && this.nbHabitants == other.getNbHabitants();
	}
	
	
	
}
