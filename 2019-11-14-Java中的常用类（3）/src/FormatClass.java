import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

public class FormatClass {
    public static void main(String[] args) throws ParseException {
        //创建Date对象
        Date date = new Date();
        //FULL格式的日期格式器对象
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        //LONG格式的日期格式器对象
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        //MEDIUM格式的日期/时间格式器对象
        DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        //SHORT格式的日期/时间格式器对象
        DateFormat shortFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);

        //打印格式化后的日期或者日期/时间
        System.out.println("当前日期的完整格式：" + fullFormat.format(date));
        System.out.println("当前日期的长格式：" + longFormat.format(date));
        System.out.println("当前日期的普通格式：" + mediumFormat.format(date));
        System.out.println("当前日期的短格式：" + shortFormat.format(date));

        //parse(String source)方法能够将一个字符串解析成Date对象，要求字符串必须符合日期/时间的格式要求，否则抛出异常
        //创建DateFormat对象
        DateFormat dt1 = DateFormat.getDateInstance();
        DateFormat dt2 = DateFormat.getDateInstance(DateFormat.LONG);
        //定义两个日期格式的字符串
        String str1 = "2019-11-15";
        String str2 = "2019年11月15日";
        //书橱对应格式的字符串解析成Date对象后的结果
        System.out.println(dt1.parse(str1));
        System.out.println(dt2.parse(str2));
    }
}
