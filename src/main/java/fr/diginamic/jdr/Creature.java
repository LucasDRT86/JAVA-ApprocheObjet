package fr.diginamic.jdr;

public class Creature {
	int force;
	int pointDeVie;
	
	public Creature(int force, int pointDeVie) {
		this.force = force;
		this.pointDeVie = pointDeVie;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	
	
}
