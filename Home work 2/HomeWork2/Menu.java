import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Andrew", "Lagdan");
        Person person3 = new Person("Oleg", "Kravchenko");
        Person person4 = new Person("Roma", "Sadova");
        Person person5 = new Person("Anna","Yurchenko");
        person1.input();
        person1.output();
    }
}