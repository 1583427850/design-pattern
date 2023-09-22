package CreationalPatterns.Factory.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory factory = new LatteCoffeeFactory();
        coffeeStore.setcoffeeFactory(factory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
