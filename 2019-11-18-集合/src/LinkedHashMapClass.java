import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        Map map1 = new HashMap();  //创建HashMap对象
        map1.put(2,"Rose");
        map1.put(1,"Jack");
        map1.put(3,"Lucy");
        map1.forEach((key,value)->System.out.println(key + ":" + value));
        System.out.println("========================");
        //使用LinkedHashMap集合来保证元素添加顺序
        Map map2 = new LinkedHashMap();  //创建LinkedHashMap对象
        map2.put(2,"Rose");
        map2.put(1,"Jack");
        map2.put(3,"Lucy");
        map2.forEach((key,value)->System.out.println(key + ":" + value));
    }
}
