package CreationalPatterns.Factory.FactoryMethod;

/**
 * 定义咖啡工厂，如果有新的，那么通过实现这个接口实现创建
 */
public interface CoffeeFactory {

    /**
     * 创建对应咖啡
     * @param
     * @return
     */
    public Coffee createCoffee();
}
