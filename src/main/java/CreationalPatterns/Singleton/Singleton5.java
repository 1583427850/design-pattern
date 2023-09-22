package CreationalPatterns.Singleton;

import java.io.Serializable;

/**
 * 静态内部类
 * 单例模式之懒汉式
 *
 * 	静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。
 * 	在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 * @author lin
 */
public class Singleton5 implements Serializable {

    private static Boolean flag = false;

//    防止被反射破坏单例模式
    private Singleton5() throws Exception {
        synchronized (this.getClass()){
//            判断实例化对象是否存在 (会有缺陷，如果通过getinstance和构造器一起创建就会还不是单例，需要两边都判断flag)
            if(flag){
                throw new Exception("不能创建多个对象");
            }
//            if(SingletonHolder.INSTANCE!=null || flag){
//                throw new Exception("不能创建多个对象");
//            }
//            如果通过构造器构造了，那么就不能在通过构造器构造了
            flag=true;
        }
    }

//    静态内部类 由于 JVM 在加载外部类的过程中,
//    是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载,
//    并初始化其静态属性。静态属性由于被 `static` 修饰，保证只被实例化一次，并且严格保证实例化顺序。
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE;

    static {
        try {
            INSTANCE = new Singleton5();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

    public static Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 添加这个方法，会在objectInputStream.readObject();的时候去判断是否有这个方法，这个方法的返回值就是反序列化后的值
     * 在objectInputStream.readObject();这个方法的源码里面的Object obj = readObject0(type, false);里面的checkResolve（）会判断是否有readresolve（）方法
     * @return
     */
    private Object readResolve(){
        return Singleton5.getInstance();
    }
}
