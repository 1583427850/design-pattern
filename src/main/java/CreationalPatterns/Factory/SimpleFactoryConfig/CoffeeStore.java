package CreationalPatterns.Factory.SimpleFactoryConfig;

import CreationalPatterns.Factory.FactoryMethod.CoffeeFactory;

/**
 * @author lin
 */
public class CoffeeStore {



    public static Coffee orderCoffee(String type){
        SimpleFactory simpleFactory = new SimpleFactory();

        try {
//            通过工厂创建对应的咖啡类
            Coffee coffee = simpleFactory.createCoffee(type);
            coffee.addMilk();
            coffee.addSugar();

            return coffee;
        } catch (Exception e) {
            throw new RuntimeException("没有这种咖啡");
        }
    }
}
