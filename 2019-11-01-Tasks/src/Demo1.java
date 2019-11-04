import java.util.*;

public class Demo1 {
    //17.打印出九九乘法表
    public static void multiTable(){
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + (i*j) + " ");
            }
            System.out.println();
        }
    }
    //18.求出1000以内所有能被4和5整除并且不能被3整除的数之和
    public static int sum(){
        int sum = 0;
        int i = 0;
        while(i <= 1000){
            if(i % 4 == 0 && i % 5 == 0 && i % 3 != 0){
                sum += i;
            }
            i++;
        }
        return sum;
    }
    //20.1到10之间的整数相加，得到累加值大于20的当前数
    public static int num(){
        int i = 1;
        int sum = 0;
        while(i <= 10 && sum < 20){
            sum += i;
            i++;
        }
        return i - 1;
    }
    //21.求出1000以内所有能被9整除的数之和，每行显示5个数
    public static void printNum(){
        int i = 0;
        int sum = 0;
        //List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        while(i < 1000){
            if(i % 9 == 0){
                sum += i;
                list.add(i);
                /*if(list.size() == 5){
                    lists.add(list);
                    list.clear();
                }*/
            }
            i++;
        }
        System.out.println("1000以内所有能被9整除的数之和：" + sum);
        System.out.println("1000以内所有能被9整除的数：" + list);
    }
    //22.求出10的N次方的值，N为用户输入的
    public static void powerOfTen(){
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        int i = 0;
        while(i < n){
            sum *= 10;
            i++;
        }
        System.out.println("10的" + n + "次方是：" + sum);
    }
    //23.循环打印出26个英文字母，并按照通用排列表排列（提示a是97，显示出来4行，每行显示6到7个）
    public static void printLetter(){
        Map<Character,Character> map = new TreeMap<>();
        char lower = 'a';
        while(lower <= 'z'){
            char upper = Character.toUpperCase(lower);
            map.put(lower,upper);
            lower++;
        }
        System.out.println("英文字母表：" + map);
    }
    //24.使用for循环求出斐波那契数，循环次数用户界面输入，并打印该数列
    public static void fibonacci(){
        System.out.println("请输入循环次数：");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = scanner.nextInt();
        int num1 = 1;
        int num2 = 1;
        list.add(num1);
        list.add(num2);
        for(int i = 0;i < count;i++){
            int num3 = num1 + num2;
            list.add(num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.println("循环次数为" + count + "的斐波那契数列：" + list);
    }
    /*25.打印出这样的效果图：
                *
              * * *
            * * * * *
          * * * * * * *
     */
    public static void print(){
        System.out.println("请输入行数：");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for(int i = 0;i < row;i++){
            for(int j = 0;j < row - i;j++){
                System.out.print(" " + " ");
            }
            for(int j = 0;j < (2 * i + 1);j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    //26.用户输入一个数，判断这个数是否是素数
    public static boolean isPrimeNum(){
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + "是否是素数？");
        for(int i = 2;i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        multiTable();    //17
        System.out.println("1000以内所有能被4和5整除并且不能被3整除的数之和：" + sum());    //18
        System.out.println("1到10之间的整数相加，得到累加值大于20的当前数：" + num());    //20
        printNum();    //21
        powerOfTen();    //22
        printLetter();   //23
        fibonacci();    //24
        print();   //25
        System.out.println(isPrimeNum());   //26
    }
}
