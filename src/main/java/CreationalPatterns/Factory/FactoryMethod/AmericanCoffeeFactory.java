package CreationalPatterns.Factory.FactoryMethod;


public class AmericanCoffeeFactory implements CoffeeFactory{
    /**
     * 创建对应咖啡
     *
     * @param
     * @return
     */
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
