package fr.diginamic.automates;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class JeuDeLaVie {


	private Grille grille;
	private Timer timer;

	public JeuDeLaVie(int taille) {
		this.grille = new Grille(taille);
		this.timer = new Timer();
	}

	public void affiche() {
		grille.displayGrille();
	}

	public void life() {

		userChoice();
		
		TimerTask task = new TimerTask() {
			public void run() {
				newGen();
			}
		};
		timer.scheduleAtFixedRate(task, 0, 250);
		affiche();

	}
	
	public void arreterJeu() {
        timer.cancel();
    }
	
	public int userChoice() {
		int choice = 0;
		while(choice == 0) {
			System.out.println("Choisissez une conficguration");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
		}
		
		return choice;
	}

	public void newGen() {
		int taille = grille.getTaille();		
		Grille newGrille = new Grille(taille);

		for(int i = 0; i < taille; i++) {
			for(int j = 0; j < taille; j++) {
				int nbVoisins = grille.compterVoisins(i, j);
				if(grille.estVivante(i, j)){
					if(nbVoisins == 2 || nbVoisins == 3 ) {
						newGrille.setVivante(i, j, true);
						System.out.println("test");
					} else {
						newGrille.setVivante(i, j, false);
					}
				} else {
					if (nbVoisins == 3) {
						newGrille.setVivante(i, j, true);
						System.out.println("test2");
					} else {
						newGrille.setVivante(i, j, false);
                    }
				}
			}
		}
		
		this.grille = newGrille;

	}
	
	public void setEtatCellule(int x, int y, boolean vivante) {
        grille.setVivante(x, y, vivante);
    }


}
