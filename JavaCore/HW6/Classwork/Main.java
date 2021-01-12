public class Main {
    public static void main(String[] args) {
        Person[] people = {new Teacher("Himichka"),
                new Teacher("Uchilka"),
                new Cleaner("Lyuda"),
                new Student("Alex"),
                new Student("Ego Drug"),
                new Student("i ya")};
        for (Person person:
             people) {
            System.out.println(person.getName() + " " + person.print());
            if(person instanceof Staff){ //якщо person був створений на основі класу Staff то
                System.out.println(((Staff) person).salary()); //вивести зп тільки для працівників
            }
        }
    }
}
