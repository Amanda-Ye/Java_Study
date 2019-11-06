//字符串的判断操作

/*
注意：equals()方法用于比较两个字符串中的字符值是否相等
      ==  方法用于比较两个字符串对象的内存地址是否相同
*/
public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "Starter";   //声明一个字符串
        String s2 = "St";
        System.out.println("判断是否以字符串St开头：" + s1.startsWith("St"));
        System.out.println("判断是否以字符串er结尾：" + s1.endsWith("er"));
        System.out.println("判断是否包含字符串ar：" + s1.contains("ar"));
        System.out.println("判断字符串是否为空：" + s1.isEmpty());
        System.out.println("判断两个字符串是否相等：" + s1.equals(s2));
    }
}
