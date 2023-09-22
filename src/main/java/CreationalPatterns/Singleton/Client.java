package CreationalPatterns.Singleton;

/**
 * 测试单例模式
 * @author lin
 */
public class Client {
    public static void main(String[] args) {
//        单例饿汉式测试
        Singleton1 singleton1 = Singleton1.get();
        Singleton1 singleton2 = Singleton1.get();
        System.out.println(singleton1==singleton2);
//        单例懒汉式测试
//        Singleton3 instance1 = Singleton3.getInstance();
//        Singleton3 instance2 = Singleton3.getInstance();
//        System.out.println(instance1==instance2);



//        多线程测试懒汉式3 如果没有上锁，多线程的情况下就会出现不是单例的情况
        Thread thread = new Thread(new Runnable() {
            public void run() {

                Singleton4 instance = Singleton4.getInstance();
                System.out.println(instance);
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                Singleton4 instance = Singleton4.getInstance();
                System.out.println(instance);
            }
        });
        thread.start();
        thread1.start();




        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();
        System.out.println(instance==instance1);

//        枚举测试
        System.out.println("-------------enum--------------------");
        Singleton6 instance2 = Singleton6.INSTANCE;
        Singleton6 instance3 = Singleton6.INSTANCE;
        System.out.println(instance2==instance3);

    }
}
