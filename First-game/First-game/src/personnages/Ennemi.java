package personnages;

import objets.Arme;
import objets.Objet;

public class Ennemi {

    float pointVie = 50;
    int ptDamage = 5;
    int xpDonner = 50;
    static int toto = 0;
    private boolean vivant = true;
    Arme loot = new Arme("Epée féérique", 500, 10, 10, 100, 1);


    public void ennemiAttaque(Heros heros) {
        if (heros.armor == null) {
            heros.pv -= this.ptDamage;
            System.out.println("Moi le goblin j'ai attaquer & il reste " + heros.pv + " pv au héros");
        } else {
            heros.pv -= (this.ptDamage - heros.armor.getDefense());
            System.out.println("Moi le goblin j'ai attaquer & il reste " + heros.pv + " pv au héros");
        }
    }

    public void mourir(Heros heros) {
        if (this.pointVie <= 0) {
            this.vivant = false;
            heros.winXp(this.xpDonner);
            heros.addLoot(this.loot);
            System.out.println("Le goblin est mort !");
        }
    }

    public boolean getVivant() {
        return this.vivant;
    }

}
