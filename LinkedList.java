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

    //头删
    private static Node popFront(Node head){
        if(head == null){
            System.err.println("链表为空无法删除"); //标准错误输出
            return null;
        }
        return head.next;  //原来的第一个结点会因为没有引用指向而被回收
    }

    //尾删（需要找到倒数第二个结点，因此要单独处理链表为空和只有一个结点的情况）
    private static Node popBack(Node head){
        if(head == null){
            System.err.println("链表为空无法删除"); //标准错误输出
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node cur = head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        cur.next = null; //尾部的结点会因为没有引用指向而被回收
        return head;
    }

    //删除所有指定元素（方法1——定义新链表，对需要的结点进行尾插）
    private static Node removeElement1(Node head,int val){
        Node result = null;  //新链表
        Node last = result;  //新链表的尾部结点引用
        Node cur = head;
        while(cur != null){
            if(cur.val == val){
                cur = cur.next;
                continue; //若结点值与所给值相等，则直接遍历下一个结点
            }
            //若结点值与所给值不相等，则将结点变为尾部结点在新链表中进行尾插
            Node next = cur.next;
            cur.next = null;  //尾部结点的 next 指向 null
            if(result == null){
                result = cur;
            }else{
                last.next = cur;
            }
            last = cur;
            cur = next;
        }
        return result;
    }

    //删除所有指定元素（方法2——在原来的链表中遍历删除，对第一个结点单独处理，因为它没有前驱结点）
    private static Node removeElement2(Node head,int val){
        if(head == null){
            return null;
        }
        Node prev = head;  //cur的前驱结点
        Node cur = head.next;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
            }else{
                prev = cur;
            }
            cur = cur.next;
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }

    //删除所有指定元素（方法3——在方法2的基础上优化，原理一样）
    private static Node removeElement3(Node head,int val){
        Node prev = null;
        Node cur = head;
        while(cur != null){
            if(cur.val == val){
                if(cur == head){
                    head = cur.next;
                }else{
                    prev.next = cur.next;
                }
            }else{
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    //删除所有指定元素（方法4——给原来链表中的第一个结点加一个前驱结点，便可统一处理所有结点）
    private static Node removeElement4(Node head,int val){
        Node tmpHead = new Node(-1);
        tmpHead.next = head;
        Node prev = tmpHead;
        Node cur = head;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
            }else{
                prev = cur;
            }
            cur = cur.next;
        }
        return tmpHead.next;
    }

    //合并两个有序链表（方法1--非递归）
    private static Node mergeTwoList1(Node l1,Node l2) {
        Node result = null;  //定义一个新链表
        Node last = result;   //指向新链表的尾部结点
        Node cur1 = l1;  //遍历链表l1
        Node cur2 = l2;  //遍历链表l2
        //原来的链表可能有一个为空链表，或者两个都为空链表
        if(cur1 == null && cur2 == null) {
            return null;
        }
        if(cur1 == null){
            return cur2;
        }
        if(cur2 == null){
            return cur1;
        }
        //两个链表都不为空
        while (cur1 != null && cur2 != null) {  // && 条件
            if (cur1.val <= cur2.val) {
                //尾插cur1
                if(result == null){
                    result = cur1;
                }else{
                    last.next = cur1;
                }
                last = cur1;  //last指向尾结点
                cur1 = cur1.next;
            }else{
                //尾插cur2
                if(result == null){
                    result = cur2;
                }else{
                    last.next = cur2;
                }
                last = cur2;  //last指向尾结点
                cur2 = cur2.next;
            }
        }
        //若链表l2已遍历完，将链表l1中剩下的链到last后面
        if(cur1 != null){
            last.next = cur1;
        }
        //若链表l1已遍历完，将链表l2中剩下的链到last后面
        if(cur2 != null) {
            last.next = cur2;
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
        while (cur1 != null || cur2 != null) {  // || 条件
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
                    cur1.next = null;  //把当前结点变为尾部结点尾插到新链表中
                    last.next = cur1;
                    last = cur1;
                    cur1 = next;
                }
            } else {
                if (result == null) {
                    result = cur2;
                } else {
                    Node next = cur2.next;
                    cur2.next = null;  //把当前结点变为尾部结点尾插到新链表中
                    last.next = cur2;
                    last = cur2;
                    cur2 = next;
                }
            }
        }
        return result;
    }

    //以给定值x为基准将链表分成两部分，小于x的值在大于或等于x的值前面（方法1——定义两个新链表）
    private static Node partition(Node head,int x){
        Node small = null;
        Node last1 = small;
        Node big = null;
        Node last2 = big;
        Node cur = head;
        while(cur != null){
            if(cur.val < x ){
                if(small == null){
                    small = cur;
                }else{
                    last1.next = cur;
                }
                last1 = cur;
                cur = cur.next;
            }else{
                if(big == null){
                    big = cur;
                }else{
                    last2.next = cur;
                }
                last2 = cur;
                cur = cur.next;
            }
        }
        // small 和 big 可能有一个链表为空
        if(small == null){
            return big;
        }else{
            last1.next = big;
            if(big != null){
                last2.next = null;  //最后一个结点的 next 必须指向 null
            }
        }
        return small;
    }

    //计算链表中的结点个数（即链表长度）
    private static int getLength(Node head){
        int len = 0;
        for(Node cur = head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }

    //返回链表的中间结点（若为偶数个结点，返回中间的两个中的右边结点）
    //方法1（得到链表长度，遍历走一半即可）
    private static Node middleNode1(Node head){
        int len = getLength(head);
        Node node = head;
        for(int i = 0;i < len / 2;i++){
            node = node.next;
        }
        return node;
    }
    //方法2（定义两个引用，fast 走的比 slow 快，当 fast==null 时，slow刚好为中间结点）
    private static Node middleNode2(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            fast = fast.next;
            if(fast == null){  //结束条件是 fast==null ，故fast每走一次都要判断是否指向null
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //返回链表中倒数第k个结点
    //方法1（利用链表长度来决定结束条件,确定返回结点的位置）
    private static Node lastKNode1(Node head,int k){
        int len = getLength(head);
        if(len < k){
            return null;
        }
        int steps = len - k;
        Node node = head;
        for(int i = 0;i < steps;i++){
            node = node.next;
        }
        return node;
    }
    //方法2（定义两个引用first和second，first比second快k个结点，当first== null时返回second）
    private static Node lastKNode2(Node head,int k){
        Node first = head;
        Node second = head;
        for(int i = 0;i < k;i++){
            if(first == null){
                return null;
            }
            first = first.next;
        }
        while(first != null){
            second = second.next;
            first = first.next;
        }
        return second;
    }

    //反转链表
    private static Node reverseList(Node head){
        Node result = null; //定义新链表
        Node cur = head;  //遍历原来的链表,将遍历到的结点头插到新链表中
        while(cur != null){
            Node next = cur.next; //cur.next会被修改，故需要 next 来保存原来的cur.next
            cur.next = result;
            result = cur;
            cur = next;
        }
        return result;  //返回新链表
    }

    //判断链表是否为回文链表，返回 boolean 值
    private static boolean chkPalindrome(Node head){
        Node mid = middleNode2(head); //将链表从中间截断的后半部分定义为新链表
        Node list1 = reverseList(mid);
        Node list2 = head;
        while(list1 != null && list2 != null){
            if(list1.val != list2.val){
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return true;
    }

    //在已排序的链表中删除重复的结点
    private static Node deleteDuplication(Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node cur = head;
        Node back = head.next;
        while(back != null){
            if(cur.val != back.val){
                prev = cur;
                cur = back;
                back = back.next;
            }else{
                while(back != null && cur.val == back.val){
                    back = back.next;
                }
                if(prev == null){
                    head = back;
                }else{
                    prev.next = back;
                }
                cur = back;
                if(back != null){
                    back = back.next;
                }
            }
        }
        return head;
    }

    //链表的拷贝
    private static Node copy(Node head) {
        Node result = null;
        Node last = result;
        Node cur = head;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            if (result == null) {
                result = tmp;
            } else {
                last.next = tmp;
            }
            last = tmp;
            cur = cur.next;
        }
        return result;
    }

    //输入两个链表，找到它们的第一个公共结点（链表的相交）
    /*计算出两个链表的长度，以及两个链表的长度差 diff ，
    定义两个引用，链表较长的先遍历diff个，然后同时遍历并作比较，
    找到第一个相同的结点并返回*/
    private static Node getIntersectionNode(Node head1,Node head2){
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        int diff = length1 - length2;
        Node longer = head1;
        Node shorter = head2;
        if(length1 < length2){
            longer = head2;
            shorter = head1;
            diff = length2 - length1;
        }
        for(int i = 0;i < diff;i++){
            longer = longer.next;
        }
        while(longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }

    //判断是否为环形链表，并返回入环结点
    public static Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        do{
            if(fast == null){
                return null; //如果fast遇到null表示没有环
            }
            fast = fast.next;
            if(fast == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next;
        }while(slow != fast);
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String[] args) {

    }
}


