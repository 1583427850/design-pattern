package CreationalPatterns.Singleton;

/**
 * 单例之懒汉式之枚举
 * 因为枚举类型是线程安全的，并且只会装载一次
 * 而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式
 * @author lin
 */
public enum Singleton6 {
//    就是简化的 Singletion6 INSTANCE = new  Singletion6（）；
    INSTANCE;
}
