package fr.diginamic.automates;

public class Grille {
	private Cellule[][] grille;
	private int taille;

	public Grille(int taille) {
		this.grille = new Cellule[taille][taille];
		
		for(int i = 0; i < taille; i++) {
			for(int j = 0; j<taille; j++) {
				this.grille[i][j] = new Cellule(false);
			}
		}
		this.taille = taille;
	}
	
	public void displayGrille() {
		for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
				if(grille[i][j].isVivante()) {
					System.out.print("|X|");
				}else {
					System.out.print("| |");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public int getTaille() {
		return taille;
	}
	

	private boolean estDansGrille(int x, int y) {
		return x >= 0 && x < taille && y >= 0 && y < taille;
	}
	
	public boolean estVivante(int x, int y) {
		return grille[x][y].isVivante();
	}
	
	public void setVivante(int x, int y, boolean vivante) {
		grille[x][y].setVivante(vivante);
	}
	
	public int compterVoisins(int x,int y) {
		int count =0;
		int[][] adressesVoisins = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
		for(int[] adresse : adressesVoisins) {
			int newX = x + adresse[0];
			int newY = y + adresse[1];
			
			if(estDansGrille(newX, newY) && estVivante(newX, newY)) {
				count++;
			}
		}
		return count;
	}
	

	
	
}
