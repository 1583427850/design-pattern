package CreationalPatterns.Singleton;

/**
 * 双重检查锁
 * 单例模式之懒汉式
 * 优化前面synchronized每次进入都要上锁的情况
 * @author lin
 */
public class Singleton4 {

    private Singleton4(){};

//    出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
//    需要添加volatile， volatile 关键字可以保证可见性和有序性。
    private static volatile Singleton4 singleton5;

    public static Singleton4 getInstance(){
        if(singleton5==null){
            System.out.println("进入了");
            synchronized (Singleton4.class){
//                再次判断是否为null
                if(singleton5==null) {
                    singleton5 = new Singleton4();
                }
            }
        }
        return singleton5;
    }

}
