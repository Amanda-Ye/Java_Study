import java.util.LinkedList;

//链表实现队列：头插尾删  or  尾插头删

public class Queue {
    public static void main(String[] args) {
        //尾插头删
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("全场动作必须跟我整齐划一");
        queue.addLast("来 左边 跟我一起画个龙");
        queue.addLast("在你右边 画一道彩虹");
        queue.addLast("来 左边 跟我一起画彩虹");
        queue.addLast("在你右边 再画个龙");
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
