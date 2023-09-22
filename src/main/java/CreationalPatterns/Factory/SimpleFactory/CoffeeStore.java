package CreationalPatterns.Factory.SimpleFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type ){
//        利用简单工厂生产咖啡，减少商场和咖啡的耦合
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
