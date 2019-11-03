//模拟Java虚拟机进行垃圾回收的过程

class Person{
    //finalize()方法将会在垃圾回收前被调用
    public void finalize(){
        System.out.println("对象将被作为垃圾回收...");
    }
}
public class RecycleWaste {
    //1.演示一个不通知强制垃圾回收的方法
    public static void recycleWaste1(){
        Person p1 = new Person();
        p1 = null;
        int i = 1;
        while(i < 10){
            System.out.println("方法1循环中...");
            i++;
        }
    }
    //2.演示一个通知强制垃圾回收的方法
    public static void recycleWaste2(){
        Person p2 = new Person();
        p2 = null;
        System.gc();  //通知垃圾回收器进行强制垃圾回收
        //Runtime.getRuntime().gc();
        int i = 1;
        while(i < 10){
            System.out.println("方法2循环中........");
            i++;
        }
    }

    public static void main(String[] args) {
        //分别调用两个模拟垃圾回收的方法
        recycleWaste1();
        System.out.println("===========================");
        recycleWaste2();
    }
}
