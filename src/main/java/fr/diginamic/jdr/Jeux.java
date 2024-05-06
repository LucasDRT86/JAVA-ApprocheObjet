package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Jeux {
	
	public void start() {
		Personnage personnage = null;
		Scanner scanner = new Scanner(System.in);
		int choix = 0;
		
		while(choix != 4) {
			
			System.out.println("Menu du jeu :");
	        System.out.println("1. Créer le personnage");
	        System.out.println("2. Combattre une créature");
	        System.out.println("3. Afficher score");
	        System.out.println("4. Sortir");
			choix = scanner.nextInt();
			switch (choix) {
	        case 1:
	        	if(personnage!= null) {
	        		System.out.println("Etes vous sur de vouloir détruire votre précédent personnage ?");
	        		System.out.println("1. Oui 2. Non");
	        		choix = scanner.nextInt();
	        		if(choix == 1) {
	        			personnage = createPersonnage();
	        		}
	        	}else {
	        		personnage = createPersonnage();
	        	}
	            break;
	        case 2:
	        	if(personnage == null) {
	        		System.out.println("Vous devez créé un personnage avant de commencer ");
	        	}else if(personnage.getPointDeVie() == 0) {
	        		System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() +"points. Veuillez créer un nouveau personnage");
	        	}else {
	        		combattre(personnage,createCreature());
	        	}
	            break;
	        case 3:
	        	if(personnage == null) {
	        		System.out.println("Vous devez créé un personnage avant de commencer ");
	        	}else {
		        	System.out.println("Vous avez un score de " + personnage.getScore());	        		
	        	}
	            break;
	        case 4:
	        	System.out.println("Merci d'avoir jouer à ce jeu !");
	        	choix = 4;
	            break;
	        default:
	            System.out.println("Choix invalide. Veuillez choisir une option valide.");
	    }
		}
	}
	
	public Personnage createPersonnage() {
		Random random = new Random();
		int pdv = random.nextInt(31) + 20;
		int force = random.nextInt(7) +12; 
		Personnage personnage = new Personnage(force,pdv);
		
		System.out.println("Le personnage est crée\nForce: "+ force + "\nPointde vie: " + pdv);
		return personnage;
	}
	
	public void combattre(Personnage personnage, Creature creature) {
		Random random = new Random();
		
		while(personnage.getPointDeVie() > 0 && creature.getPointDeVie() > 0) {
			int forcePersonnage = personnage.getForce() + (random.nextInt(10) + 1);
			int forceCreature = creature.getForce() + (random.nextInt(10) + 1);
			
			if(forcePersonnage > forceCreature) {
				System.out.println("Vous avez plus de force ! Vous infligez un total de " + (forcePersonnage - forceCreature) + " dégats !");
				creature.setPointDeVie(creature.getPointDeVie() - (forcePersonnage - forceCreature));
			}else {
				System.out.println("La Créature à plus de force ! Elle vous inflige un total de " + (forcePersonnage - forceCreature) + " dégats !");
				personnage.setPointDeVie(personnage.getPointDeVie() - (forceCreature - forcePersonnage));
			}
			
			if(creature.getPointDeVie() <= 0) {
				if (creature instanceof Loup) {
	                personnage.setScore(personnage.getScore() + 1);
	            } else if (creature instanceof Gobelin) {
	            	personnage.setScore(personnage.getScore() + 2);
	            } else if (creature instanceof Troll) {
	            	personnage.setScore(personnage.getScore() + 5);
	            }
				System.out.println("Vous avez gagné votre combat, votre score est de " + personnage.getScore());
			} else if(personnage.getPointDeVie() <= 0) {
				System.out.println("Vous avez perdu et votre personnage est décédé :(");
				System.out.println("Votre score est de " + personnage.getScore());
			}
		}
	}
	
	public Creature createCreature() {
		Random random = new Random();
		int creatureRandom = random.nextInt(3) + 1;
		if(creatureRandom == 1) {
			int pdv = random.nextInt(6) + 10;
			int force = random.nextInt(9) +3;
			Loup loup = new Loup(force,pdv);
			return loup;
		}else if(creatureRandom == 2) {
			int pdv = random.nextInt(11) + 15;
			int force = random.nextInt(6) +10;
			Gobelin gobelin = new Gobelin(force,pdv);
			return gobelin;
		}else {
			int pdv = random.nextInt(21) + 30;
			int force = random.nextInt(11) +15;
			Troll troll = new Troll(force,pdv);
			return troll;
		}
	}
}
