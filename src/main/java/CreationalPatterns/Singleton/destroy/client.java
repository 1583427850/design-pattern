package CreationalPatterns.Singleton.destroy;

import CreationalPatterns.Singleton.Singleton5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化反序列化破坏单例模式
 * @author lin
 */
public class client {

    public static final String path = "C:\\Users\\lin\\Desktop\\abc.txt";
    public static void main(String[] args) throws Exception{
//        client.ReadInstanceToFile();
        getInstanceFromFile();
        getInstanceFromFile();
    }

    /**
     * 从文件里面读取实例化对象
     * @throws Exception
     */
    public static void getInstanceFromFile() throws  Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Singleton5 instance = (Singleton5) objectInputStream.readObject();
        System.out.println(instance);
    }

    /**
     * 将对象读取文件中
     * @throws Exception
     */
    public static void ReadInstanceToFile() throws Exception{
        Singleton5 instance = Singleton5.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(instance);
    }
}
