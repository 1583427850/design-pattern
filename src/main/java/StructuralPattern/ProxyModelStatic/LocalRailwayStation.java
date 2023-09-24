package StructuralPattern.ProxyModelStatic;

/**
 * 静态代理，在编译前就已经将代码写好了
 */
public class LocalRailwayStation implements SellTickets{

    private RailwayStation station = new RailwayStation();

    public void sellTicket() {
        System.out.println("地方火车站收取服务费");
        station.sellTicket();
    }
}
