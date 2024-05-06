package fr.diginamic.jdr;

public class Personnage {

	private int force;
	private int pointDeVie;
	private int score;
	
	public Personnage(int force, int pointDeVie) {
		this.force = force;
		this.pointDeVie = pointDeVie;
		this.score = 0;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
