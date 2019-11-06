//字符串的替换和去除空格操作

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "     http :// localhost : 8080    ";
        //字符串去除空格操作
        System.out.println("去除字符串两端空格后的结果：" + s.trim());
        //字符串替换操作
        System.out.println("去除字符串中所有空格后的结果：" + s.replace(" ",""));
    }
}
