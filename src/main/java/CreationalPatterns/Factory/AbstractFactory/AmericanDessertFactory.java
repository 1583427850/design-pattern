package CreationalPatterns.Factory.AbstractFactory;

/**
 * 美式甜品工厂，里面定义了美式对应返回的咖啡或甜点类型
 */
public class AmericanDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
