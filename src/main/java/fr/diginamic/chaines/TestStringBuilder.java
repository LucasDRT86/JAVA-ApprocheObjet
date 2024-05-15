package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut1 = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < 100_000; i++) {
			builder.append(i);
		}
		
		long fin1 = System.currentTimeMillis();
		System.out.println(" --- Builder --- ");

		System.out.println("Temps écoulé en millisecondes: " + (fin1 - debut1) + "ms");
		
		long debut2 = System.currentTimeMillis();

		String res = "";
		for(int i = 0; i < 100_000; i++) {
			res += i;
		}
		
		long fin2 = System.currentTimeMillis();
		System.out.println("\n --- Concatenation classique ---");
		
		System.out.println("Temps écoulé en millisecondes: " + (fin2 - debut2) + "ms");
	}

}
