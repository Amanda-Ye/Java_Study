import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FormatClass1 {
    public static void main(String[] args) throws ParseException {
        //创建一个SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
        //按SimpleDateFormat对象的日期模板格式化Date对象
        System.out.println(sdf.format(new Date()));

        //创建一个SimpleDateFormat对象，并指定日期格式
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy/MM/dd");
        //定义一个日期格式的字符串
        String str = "2019/11/15";
        //将字符串解析成Date对象
        System.out.println(sdf1.parse(str));
    }
}
