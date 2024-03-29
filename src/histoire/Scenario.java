package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);
		
//		Partie a decommenter
		
//		Musee musee = new Musee();
//		asterix.faireUneDonnation(musee);

	}

}






// ---------------------------ANCIEN MAIN---------------------------------
/*package histoire;
import personnages.*;
public class Scenario {
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("TP1: \n");
		
		
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",10);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		
		System.out.println("\n" + asterix);
		
		System.out.println(asterix.getNom()+ "\n");
		
		
		panoramix.preparerPotion();
		
		panoramix.booster(obelix);
		
		obelix.parler("Par bélénos ce n'est pas juste !");
		
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour");
		
		minus.parler("Un GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		
		System.out.println("\n");	
		
		
		
		
		
		
		
		
		System.out.println("TP2: \n");
		
		
		Village village = new Village("Village des Irréductibles",30);
		
	
		//Gaulois gaulois = village.trouverHabitant(30);
		//Prob: Nous sommes hors tableau
		
		Chef Abraracourcix = new Chef("Abraracourcix",6,0,village);
		
		village.ajouterChef();
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// null car j'ai du incrémenter de 1 le tableau car nous avons un habitant en plus dans un tableau de gaulois mais le chef est un Chef et pas un Gaulois (INSTRUCTION DU PROFESSEUR)
		Gaulois Enzo = new Gaulois("Enzo",10);
		
		Gaulois Rayan = new Gaulois("Rayan",10);
		
		Gaulois Obelix = new Gaulois("Obelix",25);
		
		village.ajouterHabitant(Enzo);
		
		village.ajouterHabitant(Rayan);
		
		village.ajouterHabitant(Obelix);
		
		village.afficherVillageois(Abraracourcix);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
} */
