import java.time.*;

public class ClassOfJDKeight {
    public static void main(String[] args) {
        //1.Clock （获取指定时区的当前日期、时间）
        Clock clock = Clock.systemUTC();
        System.out.println("获取当前UTC时区转换的当前时间：" + clock.instant());
        System.out.println("获取UTC时区转换的毫秒数：" + clock.millis());

        //2.Duration （表示持续时间）
        Duration d = Duration.ofDays(1);
        System.out.println("一天等于" + d.toHours() + "小时");
        System.out.println("一天等于" + d.toMinutes() + "分钟");
        System.out.println("一天等于" + d.toMillis() + "秒");

        //3.Instant （表示一个具体时刻，可精确到纳秒）
        Instant instant = Instant.now();  //Instant默认的是UTC（世界标准时间）
        System.out.println("获取UTC时区的当前时间为：" + instant);
        System.out.println("当前时间一小时后的时间：" + instant.plusSeconds(3600));
        System.out.println("当前时间一小时前的时间：" + instant.minusSeconds(3600));

        //4.LocalDate（表示不带时区的日期）
        LocalDate localDate = LocalDate.now();
        System.out.println("从默认时区的系统时钟获得当前日期：" + localDate);
        //5.LocalTime（表示不带时区的时间）
        LocalTime localTime = LocalTime.now();
        System.out.println("从默认时区的系统时钟获得当前时间：" + localTime);
        //6.LocalDateTime （表示不带时区的日期、时间）
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("从默认时区的系统时钟获得当前日期、时间：" + localDateTime);
        LocalDateTime times = localDateTime.plusDays(1).plusHours(3).plusMinutes(30);
        System.out.println("当前的日期时间加上1天3小时30分之后：" + times);

        //7.Year（年） YearMonth（年月） MonthDay（月日）
        Year year = Year.now();
        System.out.println("当前年份为：" + year);
        YearMonth yearMonth = YearMonth.now();
        System.out.println("当前年月为：" + yearMonth);
        MonthDay monthDay = MonthDay.now();
        System.out.println("当前月日为：" + monthDay);

        //8.ZoneID（表示一个时区）获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("当前系统默认时区为：" + zoneId);
    }
}
