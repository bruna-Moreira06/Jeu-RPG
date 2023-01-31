package objets;

public class Objet{
    public String name;    // nom de l'objet
    public int value;     // valeur en gold
    public int weight;    // poid de l'objet

    public int quantity;


    // getter
    public int getWeight() {
        return this.weight;
    }
    public int getValue() {
        return this.value;
    }
    public String getName() {
        return this.name;
    }

    /// constructor
    public Objet(String name, int value, int weight, int quantity) {
        this.name = name;
        this.value = value;
        this.weight = weight;
        this.quantity = quantity;
    }
}
