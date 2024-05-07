package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<>();
		Collections.addAll(liste, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		System.out.println("liste: " + liste);
		
		String villeLongue = "";
		
		for(String ville : liste) {
			if(ville.length() > villeLongue.length()) {
				villeLongue = ville;
			}
		}
		
		System.out.println("La ville avec le nom le plus grand est: "+ villeLongue);
		
		
		for(int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		
		System.out.println("liste: " + liste);
		
		Iterator<String> iter  =  liste.iterator();
		while(iter.hasNext()) {
			String nom = iter.next();
			if(nom.startsWith("N")) {
				iter.remove();
			}
		}
		
		System.out.println("liste: " + liste);
		
		
	}
}
