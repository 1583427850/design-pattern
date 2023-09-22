package CreationalPatterns.Factory.SimpleFactoryConfig;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = CoffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
