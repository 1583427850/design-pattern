package CreationalPatterns.Singleton.destroy;

import CreationalPatterns.Singleton.Singleton5;

import java.lang.reflect.Constructor;

/**
 * 利用反射破坏单例模式
 * @author lin
 */
public class client2 {

    public static void main(String[] args) throws Exception{
//        获取反射
        Class<Singleton5> clazz = Singleton5.class;
//        获取无参构造
        Constructor<Singleton5> constructor = clazz.getDeclaredConstructor();
//        将构造器的private解除
        constructor.setAccessible(true);

//        利用无参构造创建实例
        Singleton5 singleton5 = constructor.newInstance();
//        利用无参构造创建实例
        Singleton5 singleton51 = constructor.newInstance();
//        破坏了单例
        System.out.println(singleton51==singleton5);
    }
}
