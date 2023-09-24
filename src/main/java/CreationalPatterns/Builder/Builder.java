package CreationalPatterns.Builder;

public abstract class Builder {

//    将要构建的对象类声明在这里，下面继承的就也有这个对象
    protected Bike mBike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
