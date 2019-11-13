import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        //Random类的常用方法
        Random random = new Random();
        System.out.println("生成 boolean 类型的随机数：" + random.nextBoolean());
        System.out.println("生成 double 类型的随机数：" + random.nextDouble());
        System.out.println("生成 float 类型的随机数：" + random.nextFloat());
        System.out.println("生成 int 类型的随机数：" + random.nextInt());
        System.out.println("生成0到10(不含)之间的 int 类型的随机数：" + random.nextInt(10));
        System.out.println("生成 long 类型的随机数：" + random.nextLong());

        //注意：nextDouble()方法和nextFloat()返回的都是0.0到1.0之间的数值
    }
}
