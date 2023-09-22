package CreationalPatterns.Factory.AbstractFactory;


import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class CoffeeStore {

    /**
     * 通过设置这个属性是什么工厂，决定是要用什么工厂生产咖啡
     * 优点：
     * 如果要增加新的咖啡，那么直接创建新的类实现coffeeFactory，符合开闭原则
     * 缺点：
     * 如果有很多的咖啡，那么需要创建很多工厂
     *
     */
//    因为有一个统一的抽象工厂，所以这里可以直接指定最高层的，后面要什么类型的在对应赋值
    private DessertFactory dessertFactory;

    public void setDessertFactory(DessertFactory factory){
        dessertFactory=factory;
    }


//    可以根据上面不同类型的创建不同的咖啡
    public Coffee orderCoffee(){
        Coffee coffee = dessertFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }

    public Dessert orderDessert(){
        Dessert dessert = dessertFactory.createDessert();
        dessert.show();
        return dessert;
    }
}
