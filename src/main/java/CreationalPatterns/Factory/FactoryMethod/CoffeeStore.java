package CreationalPatterns.Factory.FactoryMethod;


public class CoffeeStore {

    /**
     * 通过设置这个属性是什么工厂，决定是要用什么工厂生产咖啡
     * 优点：
     * 如果要增加新的咖啡，那么直接创建新的类实现coffeeFactory，符合开闭原则
     * 缺点：
     * 如果有很多的咖啡，那么需要创建很多工厂
     *
     */
    private CoffeeFactory coffeeFactory;

    public void setcoffeeFactory(CoffeeFactory factory){
        coffeeFactory=factory;
    }


    public Coffee orderCoffee( ){
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
