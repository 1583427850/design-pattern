package CreationalPatterns.Builder;

/**
 * 单车类
 */
public class Bike {

//    车架
    private String frame;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    //    车座
    private String seat;
}
