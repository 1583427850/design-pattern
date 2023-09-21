package CreationalPatterns;

/**
 * 创建型模式之单例模式
 * 饿汉式：在类加载的时候就创建了类的对象
 * @author lin
 */
public class Singleton1 {

    /**
     * 私有构造方法
     */
    private Singleton1(){};

    /**
     * 只能在类里面创建唯一的实例
     */
    private final static Singleton1 singleton1 = new Singleton1();

    /**
     * 只能通过这个方法获取唯一实例
     * @return
     */
    public static Singleton1 get(){
        return singleton1;
    }
}
