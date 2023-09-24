package CreationalPatterns.Builder;

public class OfoBuilder extends Builder{

    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    public void buildSeat() {
        mBike.setSeat("铝合金车座");

    }

    public Bike createBike() {
        return mBike;
    }
}
