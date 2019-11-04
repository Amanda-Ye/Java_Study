import java.util.Scanner;

public class Demo1 {
    //8.要求输入一个代表年月日的8位整数，计算出其上一天和下一天是什么日期
    public static void dateOfDay(long date){
        /*String s = String.valueOf(date);
        System.out.println(s);
        int year = Integer.valueOf(s.substring(0,4)).intValue();
        System.out.println(year);
        int month = Integer.valueOf(s.substring(4,6)).intValue();
        System.out.println(month);
        int day = Integer.valueOf(s.substring(6,8)).intValue();
        System.out.println(day);
        */
        int year = (int)(date / 10000);
        int month = (int)(date / 100) % 100;
        int day = (int)(date % 100);
        if(month == 1){
            if(day == 1){
                System.out.println("上一天：" + (year - 1) + "年12月31日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day == 1){
                System.out.println("上一天：" + year + "年" + (month - 1) + "月" + "31日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 30){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month == 2){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){   //是闰年
                if(day == 1){
                    System.out.println("上一天：" + year + "年" + "1月31日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 29){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }else{
                if(day == 1){
                    System.out.println("上一天：" + year + "年" + "1月31日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 28){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }
        }else if(month == 3){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {   //是闰年
                if(day == 1){
                    System.out.println("上一天：" + year + "年" + "2月29日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 31){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }else{
                if(day == 1) {
                    System.out.println("上一天：" + year + "年" + "2月28日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 31){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }
        }else if(month == 8) {
            if(day == 1){
                System.out.println("上一天：" + year + "年" + "7月31日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + "9月1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month == 12){
            if(day == 1){
                System.out.println("上一天：" + year + "年" + (month - 1) + "月" + "30日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + (year + 1) + "年" + "1月1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else{   //5,7,10
            if(day == 1){
                System.out.println("上一天：" + year + "年" + (month - 1) + "月" + "30日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }
    }

    //9.已知2019年3月17日是星期日,求出用户输入一个代表年月日的8位整数是星期几
    public static void weekOfDay(long date){
        int year = (int)(date / 10000);
        int month = (int)(date / 100) % 100;
        int day = (int)(date % 100);
        int days = 0;
        if(year > 2019){
            days += 289;  //2019年剩余的天数
            for(int i = 2020;i < year;i++){
                days += (isLeapYear(i) + 365);
            }
            if(month == 1){
                days += day;
            }else if(month == 2){
                days += (day + 31);
            }else{
                days += (31 + isLeapYear(year) + 28);
                for(int i = 3;i < month;i++){
                    if(i == 4 || i == 6 || i == 9 || i == 11){
                        days += 30;
                    }else{
                        days += 31;
                    }
                }
                days += day;
            }
            int week = days % 7;
            if(week == 0){
                System.out.println(year + "年" + month + "月" + day + "日是星期7");
            }else{
                System.out.println(year + "年" + month + "月" + day + "日是星期" + week);
            }
        }else if(year == 2019){
            if(month == 1){
                days += ((31 - day) + 28 + 17);
                int week = (7 - days % 7);
                System.out.println(year + "年" + month + "月" + day + "日是星期" + week);
            }else if(month == 2){
                days += ((28 - day) + 17);
                int week = (7 - days % 7);
                System.out.println(year + "年" + month + "月" + day + "日是星期" + week);
            }else if(month == 3){
                if(day <= 17){
                    days += (17 - day);
                }else{
                    days += (day - 17);
                }
                int week = days % 7;
                if(week == 0){
                    System.out.println(year + "年" + month + "月" + day + "日是星期7");
                }else{
                    System.out.println(year + "年" + month + "月" + day + "日是星期" + week);
                }
            }else{
                days += 14;
                for(int i = 4;i < month;i++){
                    if(i == 4 || i == 6 || i == 9 || i == 11){
                        days += 30;
                    }else{
                        days += 31;
                    }
                }
                days += day;
                int week = days % 7;
                if(week == 0){
                    System.out.println(year + "年" + month + "月" + day + "日是星期7");
                }else{
                    System.out.println(year + "年" + month + "月" + day + "日是星期" + week);
                }
            }
        }else{
            days += 76;  //2019年的天数
            for(int i = 2018;i >= year;i--){
                days += (isLeapYear(i) + 365);
            }
            if(month == 1){
                days -= day;
            }else if(month == 2){
                days -= (31 + day);
            }else {
                days -= (31 + isLeapYear(year) + 28);
                for (int i = 3; i < month; i++) {
                    if (i == 4 || i == 6 || i == 9 || i == 11) {
                        days -= 30;
                    } else {
                        days -= 31;
                    }
                }
                days -= day;
            }
            int week = (7 - (days % 7));
            System.out.println(year + "年" + month + "月" + day + "日是星期" + week);
        }
    }
    private static int isLeapYear(int year){   //判断是否是闰年
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i++ < 10) {
            System.out.println("请输入一个代表日期的8位整数：");
            long date = scanner.nextLong();
            dateOfDay(date);    //8
            weekOfDay(date);    //9
        }
    }
}

