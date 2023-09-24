package CreationalPatterns.Builder;

public class MobikeBuilder extends Builder{

//    构建对应的属性
    public void buildFrame() {
        mBike.setFrame("金属车架");
    }

    public void buildSeat() {
        mBike.setSeat("金属车座");
    }

    public Bike createBike() {
        return mBike;
    }
}
