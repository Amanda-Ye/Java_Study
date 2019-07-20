//定义一个类(可以没有修饰符)
class Person {
	//定义属性
	public String name = null;
	public int gender = 0; //0 女  1  男  2  秘密
	public int age = 0;
	
	//定义方法
	public String toString() {
		return String.format("Person(%s, %d, %d)",name,gender,age);
	}
	
	//定义构造方法(调用构造方法，对属性初始化)*构造方法允许重载*
	public Person(String n,int g, int a) {
		name = n;
		gender = g; 
		age = a;
	}
}

/*定义一个类Date：存储年-月-日信息
原则：一切从用户角度出发
功能： 1)初始化  传入年月日  不传就当天
	   2）多少天之后的年月日
	   3）多少天之前的年月日*/
class Date {
	//定义属性
	public int year = 0;
	public int month = 0;
	public int day = 0;
	public int[] day_of_month = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	
	//定义构造方法
	//年：1840-2020
	//月：[1,12]
	//日
	public Date(int year,int month,int day){
	//用户传入参数的合法性校验
		if(year < 1840 || year > 2020){
			System.err.println("年的支持范围是[1840,2020]");
			return ;
		}
		if(month < 1 || month > calDayOfMonth(year,month)){
			System.out.println("不是地球人的月份呢");
			return ;
		}
		if(day < 1 || day > calDayOfMonth(year,month)){
			System.err.println("天数不正确");
			return ;
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//定义方法
	//确定某年某月的天数
	public int calDayOfMonth(int year,int month){
		if(month != 2){
			return day_of_month[month - 1];
		}
		if(isLeapYear(year)){
			return 29;
		}
		else{
			return 28;
		}
	}
	//判断是否是闰年
	public boolean isLeapYear(int year){
		if(year % 4 == 0 && year % 100 != 0){
			return true;
		}
		if(year % 400 == 0){
			return true;
		}
		return false;
	}
	//多少天之后的 (年-月-日) 信息
	public Date after(int days){
		day += days;
		while(day > calDayOfMonth(year,month)){
			day -= calDayOfMonth(year,month);
			month += 1;
			if(month > 12){
				month = 1;
				year += 1;
			}
		}
		return this;
	}
	//多少天之前的 (年-月-日) 信息
	public Date before(int days){
		day -= days;
		while(day < 1){
			month -= 1;
			if(month < 1){
				month = 12;
				year -= 1;
			}
			day += calDayOfMonth(year,month);
		}
		return this;
	}
	//打印年月日信息
	public String toString(){
		return String.format("%04d-%02d-%02d",year,month,day);
	} 
}

//定义一个类Time:存储 时(hh)：分(mm)：秒(ss) 信息，功能类上
class Time{
	//定义属性
	public int hour;
	public int minute;
	public int second;
	
	//定义构造方法
	//时：[0,24)   分：[0,60)   秒：[0,60)
	public Time(int hour,int minute,int second){
	//用户传入参数的合法性校验
		if(hour < 0 || hour >= 24){
			System.err.println("hour传入的参数不对哦");
		}
		if(minute < 0 || minute >= 60){
			System.err.println("minute传入的参数不对哦");
		}
		if(second < 0 || second > 60){
			System.err.println("second传入的参数不对哦");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//定义方法
	//多少秒之后的 (时：分：秒) 信息
	public Time after(int seconds){
		second += seconds;
		while(second > 59){
			second -= 60;
			minute += 1;
			if(minute > 59){
				minute = 0;
				hour += 1;
				if(hour > 23){
					hour = 0;
				}
			}
		}
		return this;
	}
	//多少秒之前的 (时：分：秒) 信息
	public Time before(int seconds){
		second -= seconds;
		while(second < 0){
			second += 60;
			minute -= 1;
			if(minute < 0){
				minute = 59;
				hour -= 1;
				if(hour < 0){
					hour = 23;
				}
			}
		}
		return this;
	}
	//打印时分秒信息
	public String toString(){
		return String.format("%02d : %02d : %02d",hour,minute,second);
	}
}

public class Course0720 {
		public static void main(String[] args) {
			
		//使用类Person
		Person p = new Person("名字",2,4);
		System.out.println(p.toString()); //p.toString() --> 访问对象p的方法toString()
		
		//使用类Date
		Date d = new Date(2015,7,20);
		System.out.println(d.toString());
		Date r = d.after(400); //多少天之后的年月日
		System.out.println(r.toString());
		Date s = d.before(400); //多少天之前的年月日
		System.out.println(s.toString());
		
		//使用类Time
		Time t = new Time(23,55,24);
		System.out.println(t.toString());
		Time m = t.after(3661); //多少秒之后的时分秒
		System.out.println(m.toString());
		Time q = t.before(3661); //多少秒之前的时分秒
		System.out.println(q.toString());		
	}
}