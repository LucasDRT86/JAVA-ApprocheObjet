package tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompareVille {


	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/recensement.csv");
		List<String> lignes = Files.readAllLines(path,  StandardCharsets.UTF_8);
		lignes.remove(0);

		List<Ville> villes = new ArrayList<Ville>();

		for (String line: lignes) {


			String[] tokens = line.split(";");	
			
			Ville current = new Ville();


			current.setCodeDpt(tokens[0]);
			current.setNom(tokens[6]);
			current.setNomRegion(tokens[1]);

			current.setPoptotal(Integer.parseInt(tokens[9].replaceAll(" ", "")));

			villes.add(current);


		}
		
		Collections.sort(villes);
		for(Ville ville : villes) {
			System.out.println(ville);			
		}
		
	}

}
