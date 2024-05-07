package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<>();
		Collections.addAll(liste, -1,5,7,3,-2,4,8,5);
		System.out.println("liste: "+liste);
		System.out.println("Taille de la liste: "+ liste.size());
		
		int max = liste.lastIndexOf(liste);
		for(int elt : liste) {
			if(elt > max) {
				max = elt;
			}
		}
		System.out.println("Le nombre le plus grand est " + max);

		int min = liste.lastIndexOf(liste);
		int index = -1;
		for(int i = 0; i < liste.size(); i++) {
			int elt = liste.get(i);
			if(elt < min) {
				min = elt;
				index = i;
			}
		}

		System.out.println("Le nombre le plus petit est: " + min);
		liste.remove(index);
		System.out.println("liste: " + liste);

		for(int i = 0; i < liste.size(); i++) {
			if(liste.get(i) < 0 ) {
				liste.set(i, liste.get(i) * -1);
			}
		}
		System.out.println("liste: "+ liste);

		
		
	}
	
}
