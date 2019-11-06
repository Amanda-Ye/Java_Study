//字符串的截取和分割

public class StringDemo5 {
    public static void main(String[] args) {
        String str = "2019-11-06";
        //字符串截取操作
        System.out.println("从第6个字符截取到最后的结果：" + str.substring(5));
        System.out.println("从第6个字符截取到第7个字符的结果：" + str.substring(5,7));
        //字符串分割操作
        System.out.print("分割后的字符串数组中的元素依次为：");
        String[] strArray = str.split("-");  //用横线链接符“-”进行分割
        for(String s : strArray){
            System.out.print(s + "、");
        }
    }
}
