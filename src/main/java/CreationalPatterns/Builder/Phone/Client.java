package CreationalPatterns.Builder.Phone;

public class Client {

    public static void main(String[] args) {
//        麻烦
        PhoneOld phoneOld = new PhoneOld("因特尔cpu", "金士顿内存条", "七彩虹显卡", "华硕主板");
        System.out.println(phoneOld);

//        可以不用按照顺序构建
        PhoneNew phoneNew = new PhoneNew
                .Builder()
                .cpu("amd")
                .graphicsCard("显卡")
                .memory("内存条")
                .mainBroard("主板")
                .create();

        System.out.println(phoneNew);
    }
}
