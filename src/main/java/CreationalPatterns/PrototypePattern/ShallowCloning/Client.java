package CreationalPatterns.PrototypePattern.ShallowCloning;

/**
 * @author lin
 */
public class Client {

    public static void main(String[] args) throws Exception{
        Certificate certificate = new Certificate();
        Certificate clone = certificate.clone();

        certificate.setName("小明");
        certificate.show();

        certificate.setName("张三");
        certificate.show();
    }
}
