import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");
        list.add("Tom");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("Annie".equals(obj)){  //判断该集合中的元素是否为Annie
                list.remove(obj);    //删除该集合中的元素
                break;   //使用该方法解决异常的前提是不关心后面的元素

                //iterator.remove();  //迭代器本身的删除方法，替换list.remove(obj);
            }
        }
        System.out.println(list);
    }

    /*注意：运行时出现了并发异常ConcurrentModificationException，这个异常时迭代器抛出的，
    * 出现异常的原因是集合中删除了元素会导致迭代器预期的迭代次数发生改变，
    * 导致迭代器的结果不准确。
    * 解决方法见上代码！！！
    * */
}
