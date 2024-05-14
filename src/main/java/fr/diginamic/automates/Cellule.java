package fr.diginamic.automates;

import java.util.Random;

public class Cellule {

	private boolean isVivante;

	public Cellule(boolean isVivante) {
		this.isVivante = isVivante;
	}
	
	public Cellule() {
        Random random = new Random();
        this.isVivante = random.nextBoolean();
    }

	public boolean isVivante() {
		return isVivante;
	}

	public void setVivante(boolean isVivante) {
		this.isVivante = isVivante;
	}
	
	
}
