package sets;

import java.util.HashSet;
import java.util.Set;

public class TetsSetObjet {
	public static void main(String[] args) {
		Set<Pays> setPays = new HashSet<>(Set.of(new Pays("USA",152422225,23000), new Pays("France",70000000,32000), new Pays("Allemagne",55000000,12000), new Pays("UK",85000000,45000), new Pays("Italie",45000000,10000), new Pays("Japon",80000000,65000), new Pays("Chine",1200000000,8000), new Pays("Russie",120000000,14000), new Pays("Inde",300000000,12000)));
		
		Pays grandPays = new Pays(" ",0,0);
		for(Pays pays : setPays) {
			if(pays.getPib() > grandPays.getPib()) {
				grandPays = pays;
			}
		}
		
		Pays totalPib = new Pays(" ",0,0);	
		
		for(Pays pays : setPays) {
			if(pays.getPib() * pays.getNbHabitant() > totalPib.getPib() * totalPib.getNbHabitant()) {
				totalPib = pays;
			}
		}
		
		setPays.remove(totalPib);
		
		for(Pays pays : setPays) {
			System.out.println(pays + " Pib: " + pays.getNbHabitant() * pays.getPib());
		}
		
		
	}
	
	
}
