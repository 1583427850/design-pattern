package CreationalPatterns.Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {

//        创建咖啡商店
        CoffeeStore coffeeStore = new CoffeeStore();

//        指定是要哪种分类的甜品工厂
        AmericanDessertFactory factory = new AmericanDessertFactory();
        coffeeStore.setDessertFactory(factory);

//        点对应分类的甜品工厂里面的咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        Dessert dessert = coffeeStore.orderDessert();
        System.out.println(coffee.getName());
    }
}
