import java.util.Arrays;
public class MyArrayList{
	//定义属性
	private int[] a;   //顺序表
	private int size;  //顺序表中的数据个数
	
	//构造方法
	private MyArrayList(){
		a = new int[2];  //申请空间
		size = 0;   //初始化数据个数		
	}
	
	//顺序表:增（重点），删（重点），改，查
	
	//保证容量够用，否则进行扩容
	private void ensureCapacity(){
		if(size < a.length){
			return ;
		}
		int newCapacity = a.length * 2;  //按二倍增长扩容
		int[] newA = new int[newCapacity];
		for(int i = 0;i < size;i++){
			newA[i] = a[i];
		}
		a = newA;
	}
	
	//尾插
	public void pushBack(int element){
		ensureCapacity();
		a[size++] = element;
	}
	
	//头插
	public void pushFront(int element){
		ensureCapacity();
		for(int i = size;i > 0;i--){
			a[i] = a[i - 1];
		}
		a[0] = element;
		size++;
	}
	
	//中间插入
	public void insert(int index,int element){
		if(index < 0 || index > size){
			System.err.println("下标错误哦");
			return ;
		}
		ensureCapacity();
		for(int i = size -1;i >= index;i--){
			a[i+1] = a[i];
		}
		a[index] = element;
		size++;
	}
	
	//尾删
	public void popBack(){
		if(size <= 0){
			System.err.println("顺序表为空");
			return ;
		}
		a[--size] = 0;
	}
	
	//头删
	public void popFront(){
		if(size <= 0){
			System.err.println("顺序表为空");
			return ;
		}
		for(int i = 1;i <= size - 1;i++){
			a[i - 1] = a[i];
		}
		a[--size] = 0;
	}
	
	//删除中间元素
	public void delete(int index){
		if(size <= 0){
			System.err.println("顺序表为空");
			return ;
		}
		if(index < 0 || index >= size){
			System.err.println("下标有误");
		}
		
		for(int i = index;i <= size - 2;i++){
			a[i] = a[i + 1];
		}
		a[--size] = 0;
	}
	
	//删除指定元素，如果多次出现，全部删除
	public void deleteAll(int value){
		//时间复杂度：O(n^2)  空间复杂度：O(1)
		int index; 
		while((index = indexOf(value)) != -1){
			delete(index);
		}
		
		/*
		//时间复杂度：O(n)   空间复杂度：O(n)
		int[] newA = new int[a.length];
		int j = 0;
		for(int i = 0;i < size;i++){
			if(a[i] != value){
				newA[j++] = a[i];
			}
		}
		a = newA;
		size = j;
		*/
		
		//时间复杂度：O(n)  空间复杂度：O(1)
		int j = 0;
		for(int i = 0;i < size;i++){
			if(a[i] != value){
				a[j++] = a[i];
			}
		}
		size = j;
	}
	
	//修改指定下标元素
	public void modify(int index,int value){
		if(index < 0 || index >= size){
			System.err.println("下标错误哦");
		}
		a[index] = value; //可通过下标直接访问到目标位置
	}
	
	//查找(返回value在顺序表中的下标，如果出现多次，返回第一次出现的下标)
	public int indexOf(int value){
		if(size <= 0){
			System.err.println("顺序表为空");
			return -1;
		}
		for(int i = 0;i < a.length;i++){
			if(a[i] == value){
				return i;
			}
		}
		return -1;
	}
	
	//打印顺序表
	public void print(){
		System.out.println("打印顺序表：当前容量：" + a.length);
		//System.out.println(Arrays.toString(a));
		for(int i = 0;i < size;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.print();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.print();	// 1 2 3 (默认初始值)
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list.pushFront(20);
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(20);
		list.print();	// 20 20 10 20 30 20 10 1 2 3 
		list.insert(3,100);
		list.print();	// 20 20 10 100 20 30 20 10 1 2 3
		list.insert(20, 200);	// 报错
		
		list.delete(2);
		list.delete(2);
		list.print();	// 20 20 20 30 20 10 1 2 3 
		list.deleteAll(20);
		list.print();  // 30 10 1 2 3
		list.popFront();
		list.popFront();
		list.popFront();
		list.print();	// 2 3 
		list.popBack();
		list.popBack();
		list.print();	// 空的   
		list.popBack();	// 报错		
	}
}

	