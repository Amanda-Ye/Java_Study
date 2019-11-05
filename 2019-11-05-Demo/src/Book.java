import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements Comparable<Book>{
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book(){

    }

    @Override
    public int compareTo(Book o) {
        if(price < o.price){
            return -1;
        }else if(price == o.price){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        Scanner priceScanner = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            System.out.println("请输入书名：");
            String name = nameScanner.next();
            System.out.println("请输入价格：");
            double price = priceScanner.nextDouble();
            Book book = new Book(name,price);
            list.add(book);
        }
        //System.out.println(list);
        Book book = new Book("白夜行",34.56);
        for(int i = 0;i < list.size();i++){
            if(list.get(i).equals(book)){
                System.out.println(list.get(i));
            }
        }
    }
}
