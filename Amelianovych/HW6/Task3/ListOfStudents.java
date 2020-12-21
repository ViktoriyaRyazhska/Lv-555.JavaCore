package HW6.Task3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfStudents {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        list.add(new Student("Pavlo", 4));
        list.add(new Student("Evgeniy", 1));
        list.add(new Student("Artem", 2));
        list.add(new Student("Vlad", 3));
        list.add(new Student("Ilya", 4));
        printStudents(list);
        list.sort(new NameComparator());
        for (Student student : list) {
            System.out.println(student);
        }
        list.sort(new CourseComparator());
        for (Student student : list) {
            System.out.println(student);
        }
    }




    public static void printStudents (ArrayList<Student> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
