package lesson6.classwork6b;

public class Classwork6b {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Ivan"),
                new Student("Maya"),
                new Student("Bogdan"),
                new Teacher("Viktoriya"),
                new Teacher("Stanislav"),
                new Cleaner("Maria Ivanovna")
        };

        for (Person p : people) {
            System.out.print(p.getName() + ": ");
            p.print();
            if (p instanceof Staff) {
                ((Staff) p).salary();
            }
        }
    }
}
