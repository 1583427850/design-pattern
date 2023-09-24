package CreationalPatterns.PrototypePattern.Preposition;

/**
 * 原型模式 再复制一个这个类
 * 浅克隆
 * @author lin
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("通过构造器创造了这个类");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
