import java.util.*;
import java.util.stream.Stream;

//并行流的创建和基本使用
public class ParallelStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三","李四","张小明","张扬");
        //1.直接使用Collection集合接口的parallelStream()方法
        Stream<String> parallelStream = list.parallelStream();
        System.out.println(parallelStream.isParallel());
        //2.使用BaseStream接口的parallel()方法将Stream串行流转变为Stream并行流
        Stream<String> stream = Stream.of("张三","李四","张小明","张扬");
        Stream<String> parallel = stream.parallel();
        System.out.println(parallel.isParallel());
    }
}
