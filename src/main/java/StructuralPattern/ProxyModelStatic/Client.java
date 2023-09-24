package StructuralPattern.ProxyModelStatic;

public class Client {

    public static void main(String[] args) {
        LocalRailwayStation station = new LocalRailwayStation();
        station.sellTicket();
    }
}
