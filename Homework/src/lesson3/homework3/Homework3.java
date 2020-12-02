package lesson3.homework3;

public class Homework3 {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov");
        Person p2 = new Person("Petr", "Petrov");
        Person p3 = new Person("Semen", "Sidorov");
        Person p4 = new Person("Aleksey", "Alekseev");
        Person p5 = new Person();

        p1.setBirthYear(1975);
        p2.setBirthYear(1980);
        p3.setBirthYear(1985);
        p4.setBirthYear(1990);
        p5.setBirthYear(1995);
        p5.setFirstName("Maksim");
        p5.setLastName("Maksimov");

        p3.changeName("", "Korolyov");
        p4.changeName("Vasya", null);

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();








    }

}
