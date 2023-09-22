package CreationalPatterns.Factory.SimpleFactoryConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * 简单工厂+配置类
 * 在这个类第一次加载的时候,将所有type对应所要创建的类保存到map中,然后要创建啥类型的去map里面找就可以,如果新增其他咖啡,只需修改配置文件
 * @author lin
 */
public class SimpleFactory {

//    key就是对应的type，value就是对应的coffee类
    private static HashMap map = new HashMap<String,Coffee>();

    /**
     * 静态代码块只会执行一次,所以只会加载一次配置文件里面的类到hashmap中
     */
    static {

        try {

//            获取文件里面的配置
            Properties properties = new Properties();
            InputStream is = SimpleFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(is);

            for (Object key : properties.keySet()) {
                String className = (String)properties.get(key);

//                通过反射获取对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee)clazz.newInstance();
//                保存到hashmap中
                map.put(key, coffee);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Coffee createCoffee(String type){
        if(map!=null){
            Coffee coffee  = (Coffee)map.get(type);
            if(coffee==null){
                throw new RuntimeException("没有这种咖啡");
            }
            return coffee;
        }
        throw new RuntimeException("没有这种咖啡");
    }
}
