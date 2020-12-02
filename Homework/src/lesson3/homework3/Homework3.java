package lesson3.homework3;

import java.util.ArrayList;

public class Homework3 {


    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>(5);

        people.add(new Person("Ivan", "Ivanov").setBirthYear(1975));
        people.add( new Person("Petr", "Petrov").setBirthYear(1980));
        people.add(new Person("Semen", "Sidorov").setBirthYear(1985));
        people.add(new Person("Aleksey", "Alekseev").setBirthYear(1990));
        people.add(new Person());

        printPeople("Right after creation:", people);

        // Manually update person #5
        System.out.println("\n\nUpdate people data");
        for (Person p : people){
            p.input();
        }
        printPeople("After user input:", people);

        // Some more updates

        people.get(4).setBirthYear(1995).setFirstName("Maksim").setLastName("Maksimov");
        people.get(2).changeName("", "Korolyov");
        people.get(3).changeName("Vasya", null);

        printPeople("After some data updates from the code:", people);
    }

    private static void printPeople(String caption, ArrayList<Person> people){
        System.out.println("\n\t-----" + caption + "-----");
        for (Person p : people){
            p.output();
        }
    }

}
