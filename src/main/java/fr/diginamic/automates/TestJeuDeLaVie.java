package fr.diginamic.automates;

public class TestJeuDeLaVie {

	public static void main(String[] args) {
		int taille = 4;
		
		JeuDeLaVie jeu = new JeuDeLaVie(taille);
		
		jeu.setEtatCellule(3, 0, true);
	    jeu.setEtatCellule(1, 2, true);
	    jeu.setEtatCellule(3, 2, true);
	    jeu.setEtatCellule(3, 1, true);
	    
	    
		
	    jeu.affiche();
	    
	    jeu.newGen();
	    
	    jeu.affiche();
	    
	    jeu.newGen();
	    
	    jeu.affiche();
	    
	    jeu.newGen();
	    
	    jeu.affiche();
	    
	    jeu.newGen();
	    
		
	}

}
