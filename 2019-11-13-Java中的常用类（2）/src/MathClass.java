public class MathClass {
    public static void main(String[] args) {
        //Math类中的常用方法
        System.out.println("绝对值：" + Math.abs(-1.0));
        System.out.println("正弦：" + Math.sin(1.57));
        System.out.println("余弦：" + Math.cos(2.0));
        System.out.println("正切：" + Math.tan(0.8));
        System.out.println("平凡根：" + Math.sqrt(4));
        System.out.println("立方根：" + Math.cbrt(9));
        System.out.println("乘方：" + Math.pow(2,3));
        System.out.println("大于参数的最小整数：" + Math.ceil(4.6));
        System.out.println("小于参数的最大整数：" + Math.floor(-5.2));
        System.out.println("对小数进行四舍五入：" + Math.round(-11.5));
        System.out.println("对小数进行四舍五入：" + Math.round(11.5));
        System.out.println("两个数的较大值：" + Math.max(5.2,5.6));
        System.out.println("两个数的较小值：" + Math.min(-4.2,-5.3));
        System.out.println("生成一个大于等于0.0小于1.0的随机值：" + Math.random());
    }
}
