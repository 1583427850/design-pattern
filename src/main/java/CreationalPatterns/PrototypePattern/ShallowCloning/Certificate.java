package CreationalPatterns.PrototypePattern.ShallowCloning;

public class Certificate implements Cloneable{

    public Certificate() {
        System.out.println("通过构造器创建奖状");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Certificate clone() throws CloneNotSupportedException {
        return (Certificate) super.clone();
    }

    public void show(){
        System.out.println(name+"获得了奖状");
    }
}
