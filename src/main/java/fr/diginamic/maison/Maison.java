package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	Piece[] pieces;
	
	public Maison(Piece[] pieces) {
		this.pieces = pieces;
	}
	
	public void ajouterPiece(Piece piece){
		if(piece == null) {
			System.out.println("Doit etre non null");
		}else if(piece.getEtage()< 0 || piece.getSuperficie() <= 0){
			System.out.println("Merci de renseigner un champ correct");
		}else{
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length -1] = piece;
		}
	}
	
	public double calcSuperficie() {
		double res = 0;
		for(int i = 0; i < pieces.length; i++) {
			res += pieces[i].getSuperficie();
		}
		
		return res;
	}
	
	public double superficieEtage(int etage) {
		double res = 0;
		for(int i = 0; i < pieces.length; i++) {
			if(etage == pieces[i].getEtage()) {
				res += pieces[i].getSuperficie();
			}
		}
		return res;
	}
	
	public double superficieTypePiece(Class<?> typePiece) {
        double superficieType = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (typePiece.isInstance(pieces[i])) {
                superficieType += pieces[i].getSuperficie();
            }
        }
        return superficieType;
    }
	
	public int getNbPieces(Class<?> typePiece) {
        int nombre = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (typePiece.isInstance(pieces[i])) {
                nombre++;
            }
        }
        return nombre;
    }

	public void displayPieces() {
		System.out.println(Arrays.toString(pieces));
	}


	

	
}
