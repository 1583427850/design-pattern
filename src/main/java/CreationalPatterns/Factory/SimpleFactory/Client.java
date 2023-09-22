package CreationalPatterns.Factory.SimpleFactory;


public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("拿铁");
        System.out.println(coffee.getName());
    }
}
