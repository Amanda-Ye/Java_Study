import org.omg.CORBA.DATA_CONVERSION;

import java.time.* ;
import java.time.format.*;

public class FormatClass2 {
    public static void main(String[] args) {
         LocalDateTime date = LocalDateTime.now();
         //1.使用常量创建DateTimeFormatter
        System.out.print("使用常量创建DateTimeFormatter：");
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dtf1.format(date));
        //2.使用MEDIUM类型风格的DateTimeFormatter
        System.out.print("使用MEDIUM类型风格的DateTimeFormatter：");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(dtf2.format(date));
        //3.根据模式字符串来创建DateTimeFormatter格式器
        System.out.print("使用模式字符串来创建DateTimeFormatter：");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(date.format(dtf3));

        //解析字符串
        //定义两种格式的日期字符串
        String str1 = "2019-11-15 18:21:36";
        String str2 = "2019年11月15日18时21分36秒";
        //定义解析所用的格式器
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");
        //使用LocalDateTime的parse()方法进行解析
        LocalDateTime localDateTime1 = LocalDateTime.parse(str1,formatter1);
        LocalDateTime localDateTime2 = LocalDateTime.parse(str2,formatter2);
        //输出结果
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}