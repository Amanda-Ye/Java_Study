/*public class Course0717 {
	public static int add(int x,int y){
			return x+y;
		}
	public static int add(int x,int y,int z){
			return x+y+z;
		}	
	public static void  myPrint(int x){
		if(x == 2){
			return ;
		}
		else{
			System.out.println(x);
		}
	}
	public static int sum(int num) {
		if(num == 1){
			return 1;
		}
		return num + sum(num-1);
	}	
	//主方法
	public static void main(String[] args) {
		//打印*三角
		int line = 10;
		for (int x = 0; x < line; x++) { 
		//控制行数
		for (int y = 0; y < line -x ; y++) {
		//控制空格
			System.out.print(" ");
		}
		for (int z = 0; z < x ; z++ ) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
	System.out.println(add(5,5)); //调用方法add()定义在主方法外,输出10
	
	//如果方法(如myPrint)以void声明，那么可以使用return来结束调用（常常与if语句配合使用）
		myPrint(1);
		myPrint(2);
		myPrint(3);
		myPrint(4); //输出1 3 4
		
	//方法重载（两个方法名称相同，参数列表不同）示例
		System.out.println(add(5,5)); //调用方法add(int x,int y)输出10
		System.out.println(add(5,5,55)); //调用方法add(int x,int y,int z)输出65
		
	//方法递归(示例：1到100的累加)
		System.out.println(sum(100)); //输出5050
	}
}
*/

/*public class Course0717{
	//打印九九乘法表
	public static void main(String[] args){
		int i = 1;
		int j = 1;
		for(i = 1;i <= 9;i++){
			for(j = 1;j <= i;j++){
				System.out.printf("%d * %d = %d\t",j,i,i*j);
				//System.out.print(j + "*" + i + "=" + i*j + "  ");
			}
			System.out.printf("\n");
		}
	}
}
*/

/*public class Course0717{
	//递归求阶乘
	public static int fac1(int x){
		if(x == 0 || x == 1){
			return 1;
		}
		return x * fac1(x-1);
	}
	//循环求阶乘
	public static int fac2(int x){
		int r = 1;
		for(int i = 1;i <= x;i++){
			r *= i;
		}
		return r;
	}
	//计算自然对数e=1+1/1!+1/2!+...
	public static void main(String[] args){
		double sum = 0.0;
		int i = 0;
		int n = 3;
		while(i <= n-1){
			//sum = sum + 1.0/fac1(i);
			sum = sum + 1.0/fac2(i);
			i++;
		}
		System.out.printf("e = %f",sum);
	}
}
*/

/*public class Course0717{
	//计算Pi的值，其中sum=Pi/4=1-1/3+1/5-1/7+...
	public static double calcPi(int n){
		int  i = 0;
		double flag = 1.0;
		double sum = 0.0;
		for(i = 1;i <= n;i++){
			sum = sum + flag/(2*i-1);
			flag = -flag;
		}
		return sum;
	}
	public static void main(String[] args){
		int n = 15000; //所要计算的项数
		double sum = calcPi(n);
		System.out.format("Pi = %f",4 * sum);
	}
}
*/

/*public class Course0717{
	//反转字符串
	public static String reverse(String s){
		int length = s.length();
		String r = "";
		for(int i = length - 1; i >= 0;i--){
			r += s.charAt(i); //charAt(i)返回指定索引 i 位置处的 char 值
		}
		return r;
	}
	//10进制数转16进制数
	public static String decToHex(int n){
		String a = "";
		int i = 0;
		int tmp;
		while(n != 0){
			tmp = n % 16;
			if(tmp >= 0 && tmp <= 9){
				a = a + (char)(tmp + '0'); //此处的“+”号表示字符串的连接
				i++;
			}
			else{
				a = a + (char)(tmp + 'A' - 10);
				i++;
			}
			n = n /16;
		} 
		return a;
	}
	public static void main(String[] args){
		String s;
		int num = 300;
		s = reverse(decToHex(num));
		System.out.printf("10进制数 %d 的16进制数为 %s ",num,s);	
	}
}
*/

public class Course0717 {
	// 0, 1, 2 (汉诺塔Hannoi)
	public static void move(int n, int source, int dest) {
		if (n == 1) {
			System.out.printf("从 %d 移到 %d%n", source, dest);
			return;
		}
		
		int other = 3 - source - dest;
		move(n - 1, source, other);
		System.out.printf("从 %d 移到 %d%n", source, dest);
		move(n - 1, other, dest);
	}
	
	public static void main(String[] args) {
		// String "11" -> int 11
		move(Integer.parseInt(args[0]), 0, 2);	//有问题！！！
	}
}


//使用递归实现快速排序








































