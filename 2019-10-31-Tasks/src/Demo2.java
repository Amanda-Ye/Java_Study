import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class Demo2 {
    //10.求出100以内所有偶数的和
    public static int sum(){
        int sum = 0;
        int i = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        return sum;
    }
    /*11.使用do-while实现：输出摄氏温度与华氏温度的对照表，
    *要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
	*   转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 32
	*   提示：
	*       1、循环操作：计算摄氏温度，并输出对照条目
	*		2、循环条件：条目<=10 && 摄氏温度 <= 250
	*/
    public static Map<Integer,Double> celsAndFahr(){
        Map<Integer,Double> map = new TreeMap<>();
        int cels = 0;
        int count = 1;
        do{
            double fahr = cels * 9 / 5.0 + 32;
            map.put(cels,fahr);
            count++;
            cels += 20;
        }while(count <= 10 && cels <= 250);
        return map;
    }
    //12.输出100以内能被7整除的前5个数
    public static List<Integer> multipleOfSeven(){
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while(num <= 100 && list.size() < 5){
            if(num % 7 == 0){
                list.add(num);
            }
            num++;
        }
        return list;
    }
    //13.缸子里一共有50升水。现有15升。每次能挑5升。要挑几次才能挑满。（while循环）
    public static int count(){
        int water = 15;
        int count = 0;
        while(water < 50){
            water += 5;
            count++;
        }
        return count;
    }
    //14.求出1!+2!+...+n!是多少？（使用while来做）
    public static int facSum(int n){
        int sum = 0;
        int temp = 1;
        int i = 1;
        while(i <= n){
            temp *= i;
            sum += temp;
            i++;
        }
        return sum;
    }
    //15.用while循环方式做一个图形！直角三角形！
    public static void printRightTriangle(int n){
        int i = 1;
        while(i <= n){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    //16.要求用户输入一个数，使用do-while将它反转过去！
    public static void reverseNum(int num){
        System.out.println("原来的数字：" + num);
        String str = "";
        do{
            int i = num % 10;
            num /= 10;
            str += String.valueOf(i);
        }while(num > 0);
        int result = Integer.valueOf(str).intValue();
        System.out.println("反转后的数字：" + result);
    }

    public static void main(String[] args) {
        System.out.println("100以内所有偶数的和：" + sum());     //10
        System.out.println("摄氏温度与华氏温度的对照表：" + celsAndFahr());   //11
        System.out.println("100以内能被7整除的前5个数：" + multipleOfSeven());   //12
        System.out.println("挑满缸子的次数：" + count());    //13
        System.out.println("1!+2!+3!+...+n!的结果：" + facSum(4));    //14
        System.out.println("打印直角三角形：");
        printRightTriangle(4);     //15
        reverseNum(123456);    //16
    }
}