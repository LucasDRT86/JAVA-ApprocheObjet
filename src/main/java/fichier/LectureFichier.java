package fichier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/recensement.csv");
		Path writePath = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/ville25000.txt");
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		

		ArrayList<Ville> ville = new ArrayList<>();
		int i = 0;
		
		for (String line: lines) {
						
			
			if(i > 0) {
				String[] tokens = line.split(";");	
				Ville current = new Ville();
				

				current.setCodeDpt(Integer.parseInt(tokens[0]));
				current.setNom(tokens[6]);
				current.setNomRegion(tokens[1]);
				
				current.setPoptotal(Integer.parseInt(tokens[9].replaceAll("\\s", "")));
				
				ville.add(current);
			}
			
			i++;			

		}
		List<String> villelines = new ArrayList<>();
		ArrayList<Ville> ville25000 = new ArrayList<>();
		
		for(Ville lineVille : ville) {
			if(lineVille.getPoptotal() > 25000) {
				ville25000.add(lineVille);
			}
			
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/ville25000.csv"));
		
		writer.write("Nom,Code département,Nom de la région,Population totale\n");
		for (Ville lineVille : ville25000) {
			writer.write(lineVille.getCodeDpt() + ";"+lineVille.getNomRegion()+";"+lineVille.getNom()+";"+lineVille.getPoptotal()+"\n");
		}
		
	}

}
