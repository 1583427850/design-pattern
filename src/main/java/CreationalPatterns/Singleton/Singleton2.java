package CreationalPatterns.Singleton;

/**
 * 单例饿汉式方法2
 * @author lin
 */
public class Singleton2 {

    private Singleton2(){};

    private static Singleton2 singleton2;

//    代码块在类首次加载的时候会执行
    static {
        singleton2 = new Singleton2();
    }

    public Singleton2 getInstance(){
        return singleton2;
    }
}
