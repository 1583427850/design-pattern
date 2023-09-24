package StructuralPattern.ProxyModelDynamic;

public class Client {

    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyInstance = proxyFactory.getProxyInstance();
        proxyInstance.sellTicket();

        System.out.println(proxyInstance.getClass());

        while(true){

        }
    }
}
