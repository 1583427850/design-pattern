package CreationalPatterns.Singleton;

/**
 * 单例之懒汉式方法1
 * @author lin
 */
public class Singleton3 {

    private Singleton3(){};

    private static Singleton3 singleton3;

//    public static synchronized Singleton3 getInstance(){
////        这种方法是线程不安全的，如果有多个线程同时进入null，那么就可能创建多个singleton
//        if(singleton3==null) {
//            singleton3 = new Singleton3();
//        }
//        return singleton3;
//    }
    public static  synchronized Singleton3 getInstance(){
//        这种方法是线程不安全的，如果有多个线程同时进入null，那么就可能创建多个singleton
        if(singleton3==null) {
            System.out.println(Thread.currentThread().getName()+"进来了");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
