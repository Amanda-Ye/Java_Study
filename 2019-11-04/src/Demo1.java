public class Demo1 {

    /*
    * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
    * 并且它们的每个节点只能存储 一位 数字。如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    *您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers0(ListNode l1, ListNode l2) {   //发生未知错误
        ListNode last1 = l1;
        ListNode last2 = l2;
        String s1 = "";
        String s2 = "";
        ListNode result = null;
        ListNode last = null;
        while(last1 != null){
            s1 += last1.val;
            last1 = last1.next;
        }
        while(last2 != null){
            s2 += last2.val;
            last2 = last2.next;
        }
        int ret = Integer.valueOf(s1).intValue() + Integer.valueOf(s2).intValue();
        while(ret > 0){
            ListNode node = new ListNode(ret % 10);
            ret /= 10;
            if(result == null){
                result = node;
            }else{
                last.next = node;
            }
            last = node;
        }
        return result;
    }
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode head = new ListNode(-1);
        ListNode last = head;
        int carry = 0;
        while(head1 != null || head2 != null){
            int x = (head1 != null) ? head1.val : 0;
            int y = (head2 != null) ? head2.val : 0;
            int val = x + y + carry;
            carry = val / 10;
            ListNode node = new ListNode(val % 10);
            last.next = node;
            last = node;
            if(head1 != null){
                head1 = head1.next;
            }
            if(head2 != null){
                head2 = head2.next;
            }
        }
        if(carry > 0){
            last.next = new ListNode(carry);
        }
        return head.next;
    }
}
