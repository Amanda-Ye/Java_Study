public class PackingClass {
    //包装类
    public static void main(String[] args) {

        //定义一个基本数据类型的变量
        int a = 20;
        Integer b = a;  //自动装箱
        System.out.println(b);
        int c = b;  //自动拆箱
        System.out.println(c);

        int num = 123;
        String str = String.valueOf(num);
        System.out.println("将 int变量 转换为字符串：" + str);
        String s = "998";
        Integer integer = Integer.valueOf(num);
        Integer integer1 = Integer.valueOf(s);
        System.out.println("将 int变量 转换为包装类：" + integer);
        System.out.println("将 字符串变量 转换为包装类：" + integer1);
        Integer integer2 = new Integer(num);
        Integer integer3 = new Integer(s);
        System.out.println("通过有参构造将 int变量 转换为包装类：" + integer2);
        System.out.println("通过有参构造将 字符串 转换为包装类：" + integer3);
        int parseInt = Integer.parseInt(s);
        System.out.println("将 字符串 转换为基本类型：" + parseInt);
        String str2 = integer.toString();
        System.out.println("将包装类转换为字符串：" + str2);
    }
}
