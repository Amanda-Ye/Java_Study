import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Person{
    public String name;
    public int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MyArrayList {
    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        Scanner nameScanner = new Scanner(System.in);
        Scanner ageScanner = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.out.println("请输入姓名：");
            String name = nameScanner.next();
            System.out.println("请输入年龄：");
            int age = ageScanner.nextInt();
            Person person = new Person(name,age);
            if(!list.contains(person)){
                list.add(person);
            }else{
                i--;
                System.out.println("请重新输入姓名和年龄：");
            }
        }
        System.out.println(list);
    }
}