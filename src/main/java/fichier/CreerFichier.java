package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path readPath = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/recensement.csv");
		Path writePath = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/TP/JAVAObjet/JAVA-ApprocheObjet");
		
		List<String> lines = Files.readAllLines(readPath, StandardCharsets.UTF_8);
	
		ArrayList<String> list = new ArrayList<String>();
		
	
		for(int i = 0; i < 100; i++) {
			list.add(lines.get(i));

			System.out.println(i + " - " + lines.get(i));
		}
		
	}

}
