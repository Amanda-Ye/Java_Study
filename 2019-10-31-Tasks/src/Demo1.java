import java.util.*;

public class Demo1 {
    //8.要求输入一个代表年月日的8位整数，计算出其上一天和下一天是什么日期
    public static void preDayOfDate(long date){
        String s = String.valueOf(date);
        System.out.println(s);
        int year = Integer.valueOf(s.substring(0,4)).intValue();
        System.out.println(year);
        int month = Integer.valueOf(s.substring(4,6)).intValue();
        System.out.println(month);
        int day = Integer.valueOf(s.substring(6,8)).intValue();
        System.out.println(day);
        if(day == 1){
            if(month == 3){
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){

                }
            }
        }
    }
    public static void nextDayOfDate(){

    }

    public static void main(String[] args) {
        preDayOfDate(12345678);
    }
}
