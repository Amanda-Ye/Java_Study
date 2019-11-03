public class CreateThread3 {
    private interface F {
        int f(int n);
    }

    private static class Calculator {
        public long calc(int n, F f) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += f.f(i);      //求和1+2+3+...+n
            }
            return sum;
        }
    }

    private static class F1 implements F {
        @Override
        public int f(int n) {
            return n;
        }
    }

    private static class P1 extends Thread {
        private int count = 100_0000;

        @Override
        public void run() {
            Calculator calculator = new Calculator();
            long sum = calculator.calc(count, new F1());
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        new P1().start();
    }
}
