import java.util.*;
import java.util.stream.Stream;

//三种方式创建的都是串行流
//串行流就是将一个源数据转换为一个流对象，然后在单线程下执行聚合操作的流（即单一管道流）
public class CreateStreamObject {
    public static void main(String[] args) {
        //创建一个数组
        Integer[] array = {9,8,3,5,2};
        //将数组转换为List对象
        List<Integer> list = Arrays.asList(array);
        //1.使用集合队象的stream()静态方法创建
        Stream<Integer> stream = list.stream();
        stream.forEach(i->System.out.print(i + " "));
        System.out.println();
        //2.使用Stream接口的of()静态方法创建
        Stream<Integer> stream1 = Stream.of(array);
        stream1.forEach(i->System.out.print(i + " "));
        System.out.println();
        //3.使用Arrays数组工具类的stream()静态方法创建
        Stream<Integer> stream2 = Arrays.stream(array);
        stream2.forEach(i->System.out.print(i + " "));
    }
}
