package StructuralPattern.ProxyModelDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyFactory {

    private RailwayStation station = new RailwayStation();

    public SellTickets getProxyInstance(){

        /**
         *              ClassLoader loader,  类加载器
         *              Class<?>[] interfaces, 接口的字节码
         *              InvocationHandler h  一个对象（直接创建一个匿名实现
         */
        SellTickets sellTickets = (SellTickets)Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
            /**
             *     proxy 被代理的对象
             *     method 被代理的方法
             *     args 方法的请求参数
             *
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理到。。。。。。。。。。。。。。。");
                Object invoke = method.invoke(station, args);
                return invoke;
            }
        });

        return sellTickets;
    }
}
