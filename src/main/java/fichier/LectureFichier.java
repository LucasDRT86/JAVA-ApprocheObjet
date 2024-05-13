package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/recensement.csv");
		Path writePath = Paths.get("C:/Users/lucas/OneDrive/Documents/Cours/CDA/JAVA/ville25000.csv");
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		String ligneColonne = lines.get(0);
		String[] colonnes = ligneColonne.split(";");

		ArrayList<String> selection = new ArrayList<>();
		selection.add(colonnes[1]+";"+colonnes[2]+";"+colonnes[3]+";"+colonnes[9]);
		
		
		for (int i = 1; i < lines.size(); i++) {
						
			String ligne = lines.get(i);
			String[] elt = ligne.split(";");
			
			int nbHbt = Integer.parseInt(elt[9].replaceAll("\\s", ""));
			if(nbHbt > 25000) {
				String ligneSortie = elt[1] + ";" + elt[2] + ";" + elt [6] + ";" +elt[9];
				selection.add(ligneSortie);
			}

		}
		
		
		
		ArrayList<Ville> villes = new ArrayList<>();
		
		selection.remove(0);
		
		for (String ville : selection) {
			
			String[] elt = ville.split(";");
			Ville current = new Ville();
			current.setNomRegion(elt[0]);
			current.setCodeDpt(elt[1]);
			current.setNom(elt[2]);
			
			current.setPoptotal(Integer.parseInt(elt[3].replaceAll("\\s", "")));
			
			villes.add(current);
		}
		
		Collections.sort(villes);
		
		ArrayList<String> selectionFilter = new ArrayList<>();
		
		selectionFilter.add(colonnes[0]+";"+colonnes[1]+";"+colonnes[2]+";"+colonnes[9]);
		for(Ville currentVille : villes) {
			String ville = currentVille.getNomRegion()+ ";" + currentVille.getCodeDpt()+ ";" + currentVille.getNom()+ ";" + currentVille.getPoptotal();
			selectionFilter.add(ville);
		}
		
		Files.write(writePath, selectionFilter);
		
	}

}
