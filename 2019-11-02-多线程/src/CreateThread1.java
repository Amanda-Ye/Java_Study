public class CreateThread1 {
    private static class MyThread1 extends Thread{
        private int count = 100_0000;
        @Override
        public void run() {
            long sum = 0;
            int n = 0;
            while(n <= count){
                sum += n;
                n++;
            }
            System.out.println("1+2+3+...+1000000 = " + sum);
        }
    }
    private static class MyThread2 extends Thread{
        private int count = 100_0001;
        @Override
        public void run() {
            int n = 1;
            long sum = 0;
            while(n <= count){
                sum += n;
                n += 2;
            }
            System.out.println("1+3+5+7+9+...+1000001 = " + sum);
        }
    }
    private static class MyThread3 extends Thread{
        private int count = 10_0000;
        @Override
        public void run() {
            long sum = 0;
            int n = 0;
            while(n <= count){
                sum += n * n;
                n++;
            }
            System.out.println("1^2 + 2^2 + 3^2 +...+100000^2 = " + sum);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        long begin = System.currentTimeMillis();
        //long begin = System.nanoTime();

        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();
        Thread thread3 = new MyThread3();
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();

        //获取线程ID
        System.out.println(thread1.getId());
        System.out.println(thread2.getId());
        System.out.println(thread3.getId());

        //判断线程是否活着  活着？？？已经启动并且尚未死亡
        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());

        //获取线程的优先级
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());

        //获取线程的状态    状态？？？
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread3.getState());

        //测试线程是否是守护线程    守护线程？？？
        System.out.println(thread1.isDaemon());
        System.out.println(thread2.isDaemon());
        System.out.println(thread3.isDaemon());

        //等待线程死亡
        thread1.join();
        thread2.join();
        thread3.join();

        long end = System.currentTimeMillis();
        double s = (end - begin) * 1.0 / 1000;
        /*long end = System.nanoTime();
        double s = (end - begin) * 1.0 / 1000 / 1000 / 1000;  */

        System.out.printf("并发模式: 耗时: %.4f%n", s);
    }
}
