package CreationalPatterns.Factory.AbstractFactory;

public abstract class Coffee {

    public abstract String getName();

    public void addMilk(){
        System.out.println("addMilk");
    }

    public void addSugar(){
        System.out.println("addSugar");
    }
}
