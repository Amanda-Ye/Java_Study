import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

public class SystemClass {
    public static void main(String[] args) {
        //获取当前系统属性（以键值对的形式存在）
        Properties properties = System.getProperties();
        System.out.println(properties);

        //获取所有系统属性的key(属性名)，返回Set对象
        Set<String> propertyNames = properties.stringPropertyNames();
        for(String key : propertyNames){
            //获取当前键key（属性名）所对应的值（属性值）
            String value = System.getProperty(key);
            System.out.println(key + "--->" + value);
        }

        //currentTimeMillis()方法返回一个long 类型的值，
        // 该值表示当前时间与1970年1月1日0点0分0秒之间的时间差，单位是毫秒，
        // 通常也将该值称为时间戳
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0;i < 1_0000_0000;i++){
            sum +=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间为：" + (endTime - startTime) + "毫秒");

        //arraycopy()方法用于将一个数组中的元素快速拷贝到另一个数组
        //方法原型：arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
        //注意：拷贝时必须保证两数组元素类型一样，否则会出现 ArrayStoreException 异常
        int[] src = {101,102,103,104,105,106,};
        int[] dest = {201,202,203,204,205};
        System.arraycopy(src,2,dest,0,4);
        System.out.println(Arrays.toString(dest));

        //static void exit(int status) 该方法用于终止当前正在运行的Java虚拟机，
        // 参数status表示状态码，若状态码非0，则表示异常终止

        //static void gc() 该方法用来启动Java的垃圾回收器，并对内存中的垃圾对象进行回收
    }
}
