import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList list = new ArrayList();
        //向该集合中添加字符串
        list.add("data1");
        list.add("data2");
        list.add("data3");

        //获取Iterator对象
        Iterator iterator = list.iterator();

        //判断集合中是否存在下一个元素
        while(iterator.hasNext()){
            Object obj = iterator.next();  //取出ArrayList集合中的元素
            System.out.println(obj);
        }

        /*foreach循环遍历集合
        * foreach(Object obj : list){ System.out.println(obj);  //取出并打印集合中的元素}
        * */
    }

    //注意：在通过next()方法获取元素时，必须保证要获取的元素存在，否则会抛出NoSuchElementException异常
}

