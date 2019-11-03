public class InterruptThread {
    /*通过异常方式通知*/
    private static class MyThread1 extends Thread{
        @Override
        public void run() {
            while(true){
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    //我收到了中断通知
                    System.out.println(isInterrupted());
                    break;
                }
            }
            System.out.println("退出");
        }
    }
    private static class MyThread2 extends Thread{
        @Override
        public void run() {
            while(!isInterrupted()){
            }
            /*通过判断中断状态退出，状态不会被重置*/
            System.out.println(isInterrupted());
            System.out.println("退出");
        }
    }
    private static class MyThread3 extends Thread{
        @Override
        public void run() {
            while(!Thread.interrupted()){
            }
            /*通过判断中断转态退出，状态被重置*/
            System.out.println(isInterrupted());
            System.out.println("退出");
        }
    }
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        t1.interrupt();
        MyThread2 t2 = new MyThread2();
        t2.start();
        t2.interrupt();
        MyThread3 t3 = new MyThread3();
        t3.start();
        t3.interrupt();
    }
}
