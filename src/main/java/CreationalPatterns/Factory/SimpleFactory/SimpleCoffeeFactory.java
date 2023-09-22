package CreationalPatterns.Factory.SimpleFactory;

public class SimpleCoffeeFactory {

//    可以将这个方法改为静态的
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("美式".equals(type)){
            coffee = new AmericanCoffee();
        }else if("拿铁".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("没有这个咖啡");
        }
        return  coffee;
    }
}