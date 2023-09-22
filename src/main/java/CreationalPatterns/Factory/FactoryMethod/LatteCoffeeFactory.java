package CreationalPatterns.Factory.FactoryMethod;

public class LatteCoffeeFactory implements CoffeeFactory{
    /**
     * 创建对应咖啡
     *
     * @return
     */
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
