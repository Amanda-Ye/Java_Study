public class StringBufferDemo {
    public static void main(String[] args) {
        System.out.println("1.添加======================");
        add();
        System.out.println("2.修改======================");
        update();
        System.out.println("3.删除======================");
        delete();
    }
    //添加
    private static void add(){
        StringBuffer sb = new StringBuffer();  //定义一个字符串缓冲区
        sb.append("ABC");   //添加字符串，该方法始终将字符添加到缓冲区的末尾
        System.out.println("append添加结果：" + sb);
        sb.insert(3,"DE");
        //sb.insert(7,"FGH");    //抛出异常，越界添加失败
        System.out.println("insert添加结果：" + sb);
    }
    //修改
    private static void update(){
        StringBuffer sb = new StringBuffer("ABAAA");
        sb.setCharAt(2,'C');   //修改指定位置字符
        System.out.println("修改指定位置字符结果：" + sb);
        sb.replace(3,5,"DE");  //替换指定位置字符或字符串
        //sb.replace(3,4,"FG");
        System.out.println("替换指定位置字符或字符串结果：" + sb);
        System.out.println("字符串翻转结果：" + sb.reverse());
    }
    //删除
    private static void delete(){
        StringBuffer sb = new StringBuffer("ABCDEFG");
        sb.delete(3,7);   //指定范围删除
        System.out.println("删除指定范围结果：" + sb);
        sb.deleteCharAt(2);  //指定位置删除
        System.out.println("删除指定位置结果：" + sb);
        sb.delete(0,sb.length());   //清空缓冲区
        System.out.println("清空缓冲区结果：" + sb);
    }
}
