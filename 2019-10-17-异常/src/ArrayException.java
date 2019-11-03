public class ArrayException {
    private int[] array = new int[5];
    private int size;

    public int get(int index)throws Exception{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public static void main(String[] args) {
        ArrayException demo = new ArrayException();
        demo.array = new int[]{0,1,2,3,4};
        try{
            System.out.println(demo.get(5));
        }catch(IndexOutOfBoundsException e){
            System.out.println("捕获的异常信息为：" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
