package CreationalPatterns.Builder.Phone;


public class PhoneOld {

    private String cpu;

    private String memory;

    private String graphicsCard;

    private String mainBroard;

    public PhoneOld() {

    }

    public PhoneOld(String cpu, String memory, String graphicsCard, String mainBroard) {
        this.cpu = cpu;
        this.memory = memory;
        this.graphicsCard = graphicsCard;
        this.mainBroard = mainBroard;
    }

    @Override
    public String toString() {
        return "PhoneOld{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", mainBroard='" + mainBroard + '\'' +
                '}';
    }
}
