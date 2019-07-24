//链表中结点的 前驱：prev  后继：next

//定义结点类
class Node{
	//定义属性
	int val;    //data
	Node next = null;    //下一个结点的引用，若next == null 表示是最后一个结点
	
	//构造方法中
	public Node(int val){
		this.val = val;
	}
	
	//打印结点
	public String toString(){
		return String.format("Node(%d)",val);
	}
}

//定义单链表类
public class MyLinkedList{
	//打印链表
	private static void print(Node head){
		System.out.println("打印链表：");
		Node cur = head;
		while(cur != null){
			System.out.print(cur + " --> ");
			cur = cur.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
	//头插(返回链表新的第一个结点)
	private static Node pushFront(Node head,int val){
		Node node = new Node(val);  //构造方法中已经将node.next初始化为null
		node.next = head;
		return node;
	}
	
	//尾插(必须分情况讨论，注意链表一开始为空时尾插会改变head！返回链表新的第一个结点)
	private static Node pushBack(Node head,int val){
		Node node = new Node(val);  //构造方法中已经将node.next初始化为null
		if(head == null){
			return node;
		}else{
			Node last = head;
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
			System.err.println("空链表无法删除");
			return null;
		}
		return head.next;  //原来的第一个结点会因为没有引用指向而被回收
	}
	
	//尾删(必须分情况讨论，链表一开始为空或者只有一个结点时单独考虑)
	private static Node popBack(Node head){
		if(head == null){
			System.err.println("空链表无法删除");
			return null;
		}
		if(head.next == null){
			return null;
		}
		Node cur = head;
		while(cur.next.next != null){
			cur = cur.next;
		}
		cur.next = null;  //最后一个结点会因为没有引用指向而被回收
		return head;
	}
	
	//反转链表
	private static Node reverseList(Node head){
		Node result = null;  //定义一个新的空链表
		Node cur = head;
		while(cur != null){  //遍历原来的链表，将遍历到的每个结点头插到新链表中
			Node next = cur.next;  //cur.next会被修改。故需要保存原先的cur.next 
			cur.next = result;
			result = cur;
			cur = next;
		}
		return result;  //返回新链表
	}
	
	public static void main(String[] args){
		Node head = null;
		// head 的意思是链表的第一个结点
		// 通过第一个结点，就可以找到完整的链表的所有结点
		// 所以，链表的第一个结点往往代表整个链表
		
		// 空的链表，就是一个结点都没有的链表
		// 也就没有第一个结点
		// head == null 表示第一个结点不存在
		// 也就是整个链表为空
		head = pushFront(head, 0);
		head = pushFront(head, 1);
		head = pushFront(head, 2);
		
		// 打印
		print(head);	// 2 1 0
		
		// 尾插
		head = popFront(head);
		print(head);	// 1 0
		
		head = pushBack(head, 10);
		head = pushBack(head, 20);
		head = pushBack(head, 30);
		print(head);	// 1 0 10 20 30
		head = popBack(head);
		head = popBack(head);
		head = popBack(head);
		head = popBack(head);
		head = popBack(head);
		
		head = popBack(head);	// 报错
		print(head);		// 空
		
		head = pushBack(head, 100);
		print(head);		// 100
	}
}
