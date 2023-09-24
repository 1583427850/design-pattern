package CreationalPatterns.Builder.Phone;

/**
 * 对通过构造器传递所有手机部件然后构造手机进行重构
 */
public class PhoneNew {

    private String cpu;

    private String memory;

    private String graphicsCard;

    @Override
    public String toString() {
        return "PhoneNew{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", mainBroard='" + mainBroard + '\'' +
                '}';
    }

    private String mainBroard;

    private PhoneNew(Builder builder){
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.graphicsCard = builder.graphicsCard;
        this.mainBroard= builder.mainBroard;
    }

    public static class Builder {
        private String cpu;

        private String memory;

        private String graphicsCard;

        private String mainBroard;

        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder memory(String memory){
            this.memory=memory;
            return this;
        }

        public Builder graphicsCard(String graphicsCard){
            this.graphicsCard=graphicsCard;
            return this;
        }

        public Builder mainBroard(String mainBroard){
            this.mainBroard=mainBroard;
            return this;
        }

        public PhoneNew create(){
            return new PhoneNew(this);
        }
    }
}
