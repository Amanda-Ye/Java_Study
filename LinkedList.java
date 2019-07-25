//定义结点类
class Node{
    //定义属性
    int val;  //data
    Node next;  //下一个结点的引用，如果 next == null 表示最后一个结点

    //构造方法
    public Node(int val){
        this.val = val;
    }

    //打印结点
    public String toString(){
        return String.format("Node(%d)",val);
    }
}

//定义单链表类
public class LinkedList {

    //打印链表
    private static void print(Node head){
        System.out.println("打印链表：");
        Node cur = head;
        while(cur != null){
            System.out.print(cur + " --> ");
            cur  = cur.next;
        }
        System.out.println("null");
        System.out.println();
    }

    //头插
    private static Node pushFront(Node head,int val){
        Node node = new Node(val);  //将数据装入结点
        node.next = head;  //头插
        return node;   //返回新链表的第一个结点
    }

    //尾插（想插入尾部就要找到最后一个结点，即链表至少要有一个结点，但存在链表为空的情况，故需要分情况讨论）
    private static Node pushBack(Node head,int val){
        Node node = new Node(val); //将数据装入结点
        if(head == null){
            return node;  //返回新链表
        }
        else{
            Node last = head;  //用引用 cur 来遍历链表找到最后一个结点
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
            return head;
        }
    }

    //删除所有指定元素（方法1）
    private static Node removeElement1(Node head,int val){

    }

    //删除所有指定元素（方法2）
    private static Node removeElement2(Node head,int val){

    }

    //删除所有指定元素（方法3）
    private static Node removeElement3(Node head,int val){

    }

    //合并两个有序链表（方法1--非递归）
    private static Node mergeTwoList1(Node l1,Node l2) {
        Node result = null;  //定义一个新链表
        Node last = result;   //指向新链表的尾部结点
        Node cur1 = l1;  //遍历链表l1
        Node cur2 = l2;  //遍历链表l2
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                Node next = cur1.next;
                //尾插cur1
                if(result == null){
                    result = cur1;
                }else{
                    last.next = cur1;
                }
                last = cur1;  //last指向尾结点
                cur1 = cur1.next;
            }else{
                Node next = cur2.next;
                //尾插cur2
                if(result == null){
                    result = cur2;
                }else{
                    last.next = cur2;
                }
                last = cur2;  //last指向尾结点
                cur2 = next;
            }
         //若链表l2已遍历完，将链表l1中剩下的链到last后面
         if(cur1 != null){
             last.next = cur1;
         }
         //若链表l1已遍历完，将链表l2中剩下的链到last后面
            if(cur2 != null) {
                last.next = cur2;
            }
        }
        return result;  //返回新链表result
    }

    //合并两个有序链表（方法2--递归）
    private static Node mergeTwoLists2(Node l1,Node l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists2(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists2(l1,l2.next);
            return l2;
        }
    }

    //合并两个有序链表（方法3）
    private static Node mergeTwoLists3 (Node l1,Node l2) {
        Node result = null;
        Node last = result;
        Node cur1 = l1;
        Node cur2 = l2;
        while (cur1 != null || cur2 != null) {
            if (cur1 == null) {
                return cur2;
            }
            if (cur2 == null) {
                return cur1;
            }
            if (cur1.val <= cur2.val) {
                if (result == null) {
                    result = cur1;
                } else {
                    Node next = cur1.next;
                    //cur1.next = null;
                    last.next = cur1;
                    last = cur1;
                    cur1 = next;
                }
            } else {
                if (result == null) {
                    result = cur2;
                } else {
                    Node next = cur2.next;
                    //cur2.next = null;
                    last.next = cur2;
                    last = cur2;
                    cur2 = next;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
