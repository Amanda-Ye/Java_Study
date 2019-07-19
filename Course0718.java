/*import java.util.Arrays; //导入该“包”才可使用
//java.util.System;  //无需导入（import）该包即可使用

//**数组与方法互操作**
public class Course0718 {
	//交换元素
	public static void swap(int[] a,int i,int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
 	}
	//查找索引
	public static int indexOf(int[] a,int v) {
		//a.length获取数组长度
		for(int i = 0;i < a.length;i++){
			if(a[i] == v){
				return i;
			}
		}
		return -1;
	}
	//拷贝部分数组元素
	public static int[] copyOf(int[] original,int newLength){
		int[] dest = new int[newLength];
		int length = original.length <= newLength ? original.length : newLength;
		for(int i = 0;i < length;i++){
			dest[i] = original[i];
		}
		return dest;
	}
	//填充数组
	public static void fill(int[] a,int v){
		for(int i = 0;i < a.length;i++){
			a[i] = v;
		}
	}
	//二分查找(前提是数组从小到大有序)
	public static int binarySearch1(int[] a,int v){
		//左闭右开（即a[right]不在每次二分查找序列中）
		int left = 0;
		int right = a.length;
		while(left < right){
			int mid = (left + right)/2;
			if(v == a[mid]){
				return mid;
			}else if(v < a[mid]){
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}
	public static int binarySearch2(int[] a,int v){
		//左闭右闭（a[left]和a[right]都在每次的二分查找序列中）
		int left = 0;
		int right = a.length - 1;
		while(left <= right){
			int mid = (left + right)/2;
			if(v == a[mid]){
				return mid;
			}else if(v < a[mid]){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}
	
	//主方法
	public static void  main(String[] args){
		int[] a = {1,2,3,4,5};
		int v = 2;
		System.out.println(a); //打印有误
		System.out.println(Arrays.toString(a)); //java中正确打印数组的格式
		
		//查找v在数组中第一次出现的索引位置
		int t0 = indexOf(a,v);
		System.out.printf("t0 = %d%n",t0);
		int t1 = binarySearch1(a,v);
		System.out.printf("t1 = %d%n",t1);
		int t2 = binarySearch2(a,v);
		System.out.printf("t2 = %d%n",t2); 
		
		//交换索引为0和3的数据
		swap(a,0,3);
		System.out.println(Arrays.toString(a));
		
		//拷贝元素
		copyOf(a,10);
		System.out.println(Arrays.toString(Arrays.copyOf(a,10)));
		int[] b = new int[10]; //数组的动态初始化，元素默认值为0
		System.arraycopy(a,0,b,5,4); //调用库函数拷贝
		//（从源数组a的0索引开始拷贝4个元素到目的数组b中从索引5开始的索引位置）
		//注释：System.arraycopy(源数组名称，源数组开始点，目标数组名称，目标数组开始点，拷贝长度);
		
		//填充数组
		fill(a,1);
		Arrays.fill(a,2); //调用库函数填充数组
		System.out.println(Arrays.toString(a));
	}
}
*/

/*public class Course0718 {
	//**数组（引用数据类型）引用传递**
	public static void main(String[] args) {
		int[] x = null;
	int[] temp = null; // 声明对象
	x = new int[3]; //分步进行数组实例化
	System.out.println(x.length);
	x[0] = 10; // 数组第一个元素
	x[1] = 20; // 数组第二个元素
	x[2] = 30; // 数组第三个元素
	for (int i = 0; i<x.length; i++) {
	System.out.println(x[i]); // 通过循环控制索引下标更改
	}
	temp = x; //如果要发生引用传递，不要出现[]
	temp[0] = 55; // 修改数据
	System.out.println(x[0]);
	}
}
*/

public class Course0718 {
	public static void printArray(int[] temp) {
		//方法接受数组
		for (int i = 0 ; i<temp.length ; i++) {
		System.out.println(temp[i]) ;
		}
	}
	public static void processData(int[] temp){
		double[] result = new double[4];
		result[0] = temp[0]; //result[0] means the max of the array
		result[1] = temp[0]; //result[1] means the min of the array
		result[2] = temp[0]; //result[2] means the sum of the array 
		result[3] = temp[0]; //result[3] means the avg of the array
		for(int i = 1;i < temp.length;i++){
			result[2] += temp[i];
			if(result[0] < temp[i]){
				result[0] = temp[i];
			}
			if(result[1] > temp[i]){
				result[1] = temp[i];
			}
		}
		result[3] = result[2]/temp.length;
		System.out.println("最大值是：" + result[0]);
		System.out.println("最小值是：" + result[1]);
		System.out.println("总和是：" + result[2]);
		System.out.println("平均值是：" + result[3]);
	}
	public static void main(String[] args) {
		int[] data = new int[] {1,2,3,4,5} ;
		printArray(data) ; // 其效果等价于 int[] temp = data ;
		
		//**数组案例:数据统计**
		processData(new int[]{1,4,3,4,55,77,6,9,8}); //主方法相当于客户端调用，里面的代码应该越简单越好
	}
}	













