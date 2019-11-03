class checkedException1 extends Exception{}  //受查异常类
class checkedException2 extends Exception{}
class unCheckedException extends RuntimeException{}  //非受查异常类

public class ExceptionDemo2 {
    public static void throwCheckedException() throws checkedException1,checkedException2{
        if(true){
            throw new checkedException1();
        }else{
            throw new checkedException2();
        }
    }
    public static void throwUnCheckedException(){
        throw new unCheckedException();
    }

    public static void main(String[] args) throws checkedException1,checkedException2 {
        throwCheckedException();
    }
}
