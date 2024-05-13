package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String args[]) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		for(Integer value: map1.keySet()) {
			map1.put(2,"2");
			map1.put(value, map1.get(value));
		}

		for(Integer value: map2.keySet()) {
			map2.put(value, map2.get(value));
		}

		for(Integer ville: map3.keySet()) {
			System.out.println(ville +" - " +map3.get(ville));
		}

	}


}
