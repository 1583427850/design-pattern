package CreationalPatterns.Factory.AbstractFactory;

public class LtalyDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Turamisu();
    }

}
