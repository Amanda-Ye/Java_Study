/*import java.io.*;
import java.util.Arrays;
import java.util.List;
public class Course0716{
	public static void main(String[] args) {
		int age = 2;
		String name = "66";
		Dog dog = new Dog(name,age);
		int x = age - 1;
		if(x > 1){
			dog.play();
		}else{
			dog.bark();
		}
		int[] numlist = new int[]{1,3,5,7,9};
		//这是一段注释
		//JDK8新增的lambda表达式
		new Thread(()->System.out.println("hello world")).start();
		try{
			//如果文件没找到则会抛出异常
			InputStream in = new FileInputStream(new File("//xx.txt"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		//JDK1.8新增的Stream数据流
		List<Integer> list = Arrays.asList(1,2,2,4,5,6,7,10);
		list.stream()
			.filter(e -> e % 2 == 0)
			.distinct()
			.forEach(System.out::println);
	}
}
class Dog{
	private String name;
	private Integer age;
	public Dog(String name,Integer age){
		this.name = name;
		this.age = age;
	}
	public void play(){
		System.out.println(this.name + "want to play");
	}
	public void bark(){
		System.out.println(this.name + "汪汪汪");
	}
}
*/

/*class Test {
	public int a;
}
public class Course0716{
	public static void main(String[] args){
		int 变量1 = 10;
		int 变量2 = 10;
		int 计算结果 = 变量1 * 变量2;
		System.out.println(计算结果); //输出100（中文也可以作变量名，但是不推荐使用）
		
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		System.out.println(maxValue+1);	  //输出-2147483648	（数值循环）
		System.out.println(minValue-1);   //输出2147483647
		
		Test test = new Test();
		System.out.println(test.a);	//输出0（整型默认值）
		byte data1 = 10 ; // 10是int类型，在byte范围内
        System.out.println(data1) ;	//输出10
		int num = 10 ; 
		byte data2 = (byte) num ;
		System.out.println(data2) ;	//输出10
		//byte data3 = 300;
		//System.out.println(data3) ; //报错：类型不兼容  
		byte data4 = (byte)300;
		System.out.println(data4) ; //输出44
		//int类型300的存储为0...0 0...0 0000 0001 0010 1100;
		//强转后只取了低位的一个字节0010 1100，其对应十进制数为44
		
		System.out.println(1.1*1.1); //输出1.2100000000000002（浮点数不是高精度，会有精度丢失）
		char c = 'A'; 
		int num1 = c; 
		System.out.println(num1); //输出65（大写字母A的ASCII码值）
		int x = 3;
		int y = 4;
		int result = x++ * y;
		System.out.println(x); //输出4（后缀++是先用后加）
		System.out.println(result); //输出12
		char a = '哈';
		int num2 = 10;
		System.out.println(a>num2); //输出true
		System.out.println("5"+2); //输出52
		//注释：在java中，一个用+连接的表达式中，只要出现了字符串类型，
		//不管表达式中相加的是数值类型还是char类型，都会被全部隐式类型转换成字符串，
		//而且这种隐式转换的优先级还高于+
		//float f = 3.4;//报错：double转换到float类型不兼容，会发生数据丢失
	}
}
*/

public class Course0716{
	public static void main(String[] args){
	byte a = -128;
	byte b = 127;
	//byte c = b + 1; //报错：等号左边为byte类型，右边为int类型，不兼容
	System.out.println(a-1); //输出-129 (打印时发生类型提升，但定义byte c = a - 1不可)
	System.out.println(b+1); //输出128 (打印时发生类型提升，但定义byte c = b + 1不可)
	}
}















