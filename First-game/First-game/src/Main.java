import objets.Arme;
import objets.Armure;
import objets.Objet;
import personnages.Ennemi;
import personnages.Heros;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Heros newHero = new Heros("Bruna");
        Ennemi newEnnemi = new Ennemi();
        ArrayList<Objet> inventory = new ArrayList<>();
        newHero.nomPersonnages();
        newHero.afficherInventaire();
//        newHero.setArmor();
        newHero.combat(newEnnemi);
        newHero.afficherInventaire();
//        Armure steelarmor = new Armure("Steel torso", 10, 2, 2, 100);
//        Arme ironsword = new Arme("Epee de fer", 10,1,3,100);
//        Arme steelsword = new Arme("Epée d'acier", 50, 1, 10, 100);
//        Arme ultima = new Arme("Ultima", 100,3,30,100);
//        newHero.setArme(ironsword);
//        newHero.changeArme(steelsword);
//        newHero.afficherInventaire();
//        newHero.recupArme();
//        newHero.afficherInventaire();
    }
}