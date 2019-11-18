package SortOfTreeSet;
import java.util.Comparator;
import java.util.TreeSet;

//定义比较器实现Comparator接口
class MyComparator implements Comparator {
    public int compare(Object obj1,Object obj2){  //定制排序方式
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        int temp = s1.length() - s2.length();
        return temp;
    }
}

//定制排序(实现TreeSet集合中字符串按照长度进行定制排序)
public class CustomOrder {
    public static void main(String[] args) {
        //1.创建集合时，传入Comparator接口实现定制排序规则
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Eve");
        System.out.println(ts);

        //2.创建集合时，使用Lambda表达式定制排序规则
        TreeSet ts2 = new TreeSet((obj1,obj2) -> {
            String s1 = (String) obj1;
            String s2 = (String) obj2;
            return s1.length() - s2.length();
        });
        ts2.add("Jack");
        ts2.add("Helena");
        ts2.add("Eve");
        System.out.println(ts2);
    }
}
