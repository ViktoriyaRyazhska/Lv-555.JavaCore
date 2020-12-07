package main;
import person.Person;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Person person = new Person();
        Person p1 = new Person();
        Person p2 = new Person("Andrew", "Pasternak");
        p2.changeName("Igor", "Rudchik");
        p1.input("Natalya", "Korzh", 1900);
        System.out.println("Changed function:\n\t");
        p2.output();
        System.out.println("\nInputed data is:");
        p1.output();
        System.out.println("Age of inputed person is: \t");
        System.out.println(p1.getAge());
    }
}
