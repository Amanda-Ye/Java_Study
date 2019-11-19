import java.sql.SQLOutput;

public class JoinDemo {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for(Thread.State state : Thread.State.values() ){  //Thread.State是枚举类型
            System.out.println(state);
        }
        System.out.println("=========================");
        Thread thread = new MyThread();
        System.out.println(thread.getState());
        System.out.println("=========================");
        thread.start();
        while (thread.isAlive()) {
            System.out.println(thread.getState());
        }
        System.out.println("=========================");
        System.out.println(thread.getState());
    }
}
