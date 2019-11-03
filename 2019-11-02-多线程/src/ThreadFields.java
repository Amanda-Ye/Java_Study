public class ThreadFields {
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getId());
            System.out.println(current.getName());
            System.out.println(current.getPriority());
            System.out.println(current.isAlive());
            System.out.println(current.isInterrupted());
            System.out.println(current.isDaemon());
        }
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getId());
            System.out.println(current.getName());
            System.out.println(current.getPriority());
            System.out.println(current.isAlive());
            System.out.println(current.isInterrupted());
            System.out.println(current.isDaemon());
        }
    }
    public static void main(String[] args) {
        new MyThread().start();
    }
}
