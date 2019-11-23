import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        //创建一个List集合对象
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("张小明");
        list.add("张扬");
        //1.创建一个Stream流对象
        Stream<String> stream = list.stream();

        //2.对Stream流中的元素分别进行过滤、截取操作
        Stream<String> stream1 = stream.filter(i->i.startsWith("张"));
        //stream.filter(i->i.startWith("张") && i.length() > 2);  //筛选条件可以使用 “&&”
        Stream<String> stream2 = stream1.limit(2);
        //stream.skip(long n)  跳过流中前 n 个元素

        //3.对Stream流中的元素进行终结操作，遍历输出
        stream2.forEach(j->System.out.println(j));

        //通过链式表达式的形式完成以上聚合操作 （链式调用也被称为操作管道流）
        list.stream().filter(i->i.startsWith("张"))
                    .limit(2)
                    .forEach(j->System.out.println(j));

        //4.映射
        Stream<String> stream3 = Stream.of("a1","a2","b2","c1","c2");
        stream3.filter(s->s.startsWith("c"))     //筛选出流中以“c”开头的元素
                .map(String::toUpperCase)        //对流元素进行映射，将全部字符改为大写
                .sorted()                 //对流元素进行排序
                .forEach(System.out::println);   //对流元素进行遍历输出
        System.out.println("=======================");

        //5.收集
        /*collect()方法使用Collector作为参数，Collector包含四种不同的操作：
        （1）supplier(初始构造器)
        （2）accumulator(累加器)
        （3）combiner(组合器)
        （4）finisher(终结者)
        */
        Stream<String> stream4 = Stream.of("张三","李四","张小明","张扬");
        //筛选并进行终结操作，将流元素收集到一个List集合中
        List<String> list1 = stream4.filter(i->i.startsWith("张"))
                                    .collect(Collectors.toList());
        System.out.println(list1);
        //收集到一个字符串中
        Stream<String> stream5 = Stream.of("张三","李四","张小明","张扬");
        String string = stream5.filter(i->i.startsWith("张"))
                                .collect(Collectors.joining(" and "));
        System.out.println(string);
        //收集到数组中
        Stream<String> stream6 = Stream.of("张三","李四","张小明","张扬");
        String[] arr = stream6.filter(i->i.startsWith("张"))
                                .toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
