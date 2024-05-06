package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	Piece[] pieces;
	
	public void ajouterPiece(Piece piece){
		pieces = Arrays.copyOf(pieces, pieces.length + 1);
		pieces[pieces.length -1] = piece;
	}
	
	public double calcSuperficie() {
		double res = 0;
		for(int i = 0; i < pieces.length -1; i++) {
			res += pieces[i].getSuperficie();
		}
		
		return res;
	}
	
	public double superficieEtage(int etage) {
		double res = 0;
		for(int i = 0; i < pieces.length -1; i++) {
			if(etage == pieces[i].getEtage()) {
				res += pieces[i].getSuperficie();
			}
		}
		return res;
	}
	
}
