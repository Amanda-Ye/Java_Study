import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    public static void main(String[] args) {
        //Date类的两个构造方法
        Date date1 = new Date();    //创建表示当前时间的Date对象
        Date date2 = new Date(System.currentTimeMillis() + 1000); //获取当前时间后1秒的时间
        System.out.println(date1);
        System.out.println(date2);

        //Calendar类的操作方法
        Calendar calendar = Calendar.getInstance();   //获取表示当前时间的Calendar对象
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("当前时间为：" + year + "年" + month + "月" + date + "日"
        + hour + "时" + minute + "分" + second + "秒");

        calendar.set(2019,11,14);  //设置指定日期
        calendar.add(Calendar.DATE,100);
        int year1 = calendar.get(Calendar.YEAR);  //返回指定日期的年
        int month1 = calendar.get(Calendar.MONTH);
        int date3 = calendar.get(Calendar.DATE);
        System.out.println("计算截止日期为：" + year1 + "年" + month1 + "月" + date3 + "日");

        //开启non-lenient（非容错）模式   默认容错模式
        calendar.setLenient(false);
        calendar.set(Calendar.MONTH,13);
        System.out.println(calendar.getTime());
    }
}
