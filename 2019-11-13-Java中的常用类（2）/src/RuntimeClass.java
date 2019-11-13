import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        //创建一个 Runtime 实例
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器的个数：" + rt.availableProcessors() + "个");
        System.out.println("空闲内存大小：" + rt.freeMemory() / 1024 / 1024 + "M");
        System.out.println("最大可用内存大小：" + rt.maxMemory() / 1024 / 1024 + "M");

        //得到一个表示进程的 Process 对象
        Process process  = rt.exec("notepad.exe");
        Thread.sleep(5000);  //等待5秒1后关闭 process 进程
        process.destroy();
    }
}
