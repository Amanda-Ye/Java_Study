//特殊的结点
class CNode{
    //定义属性
    int val;  //data
    CNode next;  //下一个结点的引用，如果 next == null 表示最后一个结点
    CNode random; //指向链表中的任意一个结点，也可能是 null

    //构造方法
    public CNode(int val){
        this.val = val;
    }

    //打印结点
    public String toString(){
        return String.format("CNode(%d)",val);
    }
}

public class CopyList {
    //特殊结点的深拷贝
    private static CNode complexCopy(CNode head){
        if(head == null){
            return null;
        }
        //拷贝结点的同时糅合两个链表，一个原链表的结点紧跟一个拷贝的结点，直到全部结点被拷贝
        CNode p1 = head;
        while(p1 != null){
            CNode p2 = new CNode(p1.val);
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
        }

        //拷贝结点的random
        p1 = head;
        while(p1 != null){
            CNode p2 = p1.next;
            if(p1.random != null){
                p2.random = p1.random.next;
            }
            p1 = p2.next;
        }

        //拆分两个链表，返回深拷贝后的链表
        p1 = head;
        CNode newHead = head.next;  //拷贝链表的第一个结点
        while(p1 != null){
            CNode p2 = p1.next;
            p1.next = p2.next;
            if(p2.next != null){
                p2.next = p2.next.next;
            }
            p1 = p1.next;
        }
        return newHead; //返回深拷贝的新链表
    }

    public static void main(String[] args) {

    }
}
