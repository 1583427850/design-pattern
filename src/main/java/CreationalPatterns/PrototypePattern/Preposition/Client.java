package CreationalPatterns.PrototypePattern.Preposition;

public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();

//        克隆不需要通过构造器
        Realizetype clone = realizetype.clone();

        System.out.println(realizetype);
        System.out.println(clone);
    }
}
