package CreationalPatterns.Factory.AbstractFactory;

/**
 * 抽象工厂类,因为咖啡和甜品都可以看成甜品，所以可以有一个统一的抽象工厂
 */
public interface DessertFactory {

//    这里定义的都只是对应的抽象类，后面具体种类的实现会指定是哪种咖啡
    Coffee createCoffee();

    Dessert createDessert();

}
