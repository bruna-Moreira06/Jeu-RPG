package objets.consommable;

import objets.Objet;

abstract class Consommable extends Objet {

    Consommable(String name, int value, int weight, int quantity) {
        super(name, value, weight, quantity);
    }
}
