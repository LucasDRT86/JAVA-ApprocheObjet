package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		
		
		HashMap<String, Double> map = new HashMap<>();

		map.put("Paul", (double)1750);
		map.put("Hicham", (double)1825);
		map.put("Paul", (double)2250);
		map.put("Yu", (double)1825);
		map.put("Ingrid", (double)2015);
		map.put("Chantal", (double)2418);
		
		System.out.println("Taille de la map: " + map.size());
	}

}
