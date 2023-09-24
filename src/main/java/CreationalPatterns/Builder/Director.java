package CreationalPatterns.Builder;

public class Director {

    private Builder mBuilder;

//    通过传入的对应builder进行构建
    Director(Builder builder){
        this.mBuilder=builder;
    }


//    具体构建
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
