public class Wrong {
    private static int n = 0;
    private static final int COUNT = 10_0000;

    private static class Add extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < COUNT;i++){
                n++;
            }
        }
    }
    private static class Sub extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < COUNT;i++){
                n--;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {   //共享数据n，线程不安全
        Thread thread1 = new Add();
        Thread thread2 = new Sub();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(n);
    }
}
