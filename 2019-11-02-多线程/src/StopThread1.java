public class StopThread1 {
    private static class Worker extends Thread {
        private volatile boolean quit = false;

        Worker() {
            super("李四");
        }

        public void setQuit(boolean quit) {
            this.quit = quit;
        }

        @Override
        public void run() {
            while (!quit) {
                System.out.println(this.getName() + ": 我正在转账，别烦我");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(this.getName() + ": 对方是骗子，我不转账了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();
        System.out.println("我是张三，正在等李四转账");
        Thread.sleep(10 * 1000);
        System.out.println("打听到对方是骗子，通知李四停止转账");
        worker.setQuit(true);
        System.out.println("通知李四完毕");
        worker.join();
        System.out.println("李四停止转账");
    }
}
