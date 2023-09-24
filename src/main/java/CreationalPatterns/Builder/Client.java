package CreationalPatterns.Builder;

import com.sun.scenario.effect.Offset;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        OfoBuilder ofoBuilder = new OfoBuilder();
        Director director = new Director(ofoBuilder);

        Bike bike = director.construct();
        System.out.println(bike.getFrame());

    }

}
