package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		Piece[] piece = new Piece[0];		
		Maison maison = new Maison(piece);
		
		maison.ajouterPiece(new Piece(15,1));
		maison.ajouterPiece(new Piece(20,0));
		maison.ajouterPiece(new Piece(15,6));
		maison.ajouterPiece(new Piece(115,2));
		maison.ajouterPiece(new Piece(35,2));
		maison.ajouterPiece(new Piece(5,1));
		
		maison.ajouterPiece(new Chambre(5,1));
		maison.ajouterPiece(new WC(5,1));
		maison.ajouterPiece(new SalleDeBain(5,1));
		maison.ajouterPiece(new Salon(5,1));
		maison.ajouterPiece(new Chambre(5,1));
		maison.ajouterPiece(new Chambre(5,1));
		
		maison.calcSuperficie();
		
		maison.ajouterPiece(null);
		maison.ajouterPiece(new Piece(1,-1));
		
		System.out.println("La Maison à une superficie de : " +maison.calcSuperficie()+"m²");
		System.out.println("Le RDC à une superficie de: " + maison.superficieEtage(0)+"m²");
		System.out.println("Le premier étage à une superficie de: " +maison.superficieEtage(1)+"m²");
		System.out.println("Le deuxieme étage à une superficie de: " +maison.superficieEtage(2)+"m²");
		System.out.println("Le troisieme étage à une superficie de: " +maison.superficieEtage(3)+"m²");
		System.out.println("Le quatrieme étage à une superficie de: " +maison.superficieEtage(4)+"m²");
		System.out.println("Le cinquieme étage à une superficie de: " +maison.superficieEtage(5)+"m²");
		System.out.println("Le sixième étage à une superficie de: " +maison.superficieEtage(6)+"m²");
		System.out.println("La superficie des chambres est de : " + maison.superficieTypePiece(Chambre.class) + " m²");
		System.out.println("Nombre de chambres : " + maison.getNbPieces(Chambre.class));
		
		maison.displayPieces();

	}

}
