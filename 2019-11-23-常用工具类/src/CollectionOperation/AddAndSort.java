package CollectionOperation;
import java.util.ArrayList;
import java.util.Collections;

public class AddAndSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"C","Z","P","K");   //添加元素
        System.out.println("排序前：" + list);
        Collections.reverse(list);    //反转指定List集合中元素的顺序
        System.out.println("反转后：" + list);
        Collections.sort(list);   //根据元素的自然顺序对List集合中的元素进行排序
        System.out.println("排序后：" + list);
        Collections.shuffle(list);    //对List集合中的元素进行随机排序
        System.out.println("按随即顺序排序后：" + list);
        Collections.swap(list,0,list.size() - 1);    //将指定List集合中角标处元素进行交换
        System.out.println("集合首尾元素交换后：" + list);
    }
}
