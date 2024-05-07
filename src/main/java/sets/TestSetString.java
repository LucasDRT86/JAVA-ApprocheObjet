package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<>(Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		String longName = "";
		
		for(String pays : setString) {
			if(pays.length() > longName.length()) {
				longName = pays;
			}
		}
		
		System.out.println("Le pays qui a le grand nom est: " + longName);
		setString.remove(longName);
		
		System.out.println("Liste des pays: " + setString);
	}

}
