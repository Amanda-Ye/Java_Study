public class ExceptionDemo {

    public static void throwExceptionMethod(boolean isThrow){
        System.out.println("抛异常之前");
        if(isThrow){
            throw new NullPointerException();
        }
        System.out.println("抛异常之后");
    }

    public static void main(String[] args) {
        try{
            throwExceptionMethod(true);
        } catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("看看行不行");
        }catch(NullPointerException exc){
            System.out.println("捕获到异常");
        }catch(Exception exc ){     //总异常的捕获不能放在子异常的捕获之前
            System.out.println("捕获总异常");
        }finally{
            System.out.println("总得走一遭");
        }
    }
}
