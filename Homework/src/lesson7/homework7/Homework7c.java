package lesson7.homework7;

import java.util.*;

public class Homework7c {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Petr", "Ivanov", 3));
        students.add(new Student("Ivan", "Petrov", 5));
        students.add(new Student("Sidor", "Sidorov", 4));
        students.add(new Student("Andrey", "Ostapov", 1));
        students.add(new Student("Ostap", "Andreev", 2));
        
        printStudents(students, 2);

        Set<Student> setByName = new TreeSet<>(Student.nameComparator);
        setByName.addAll(students);
        System.out.println(setByName);

        Set<Student> setByCourse = new TreeSet<>(Student.courseComparator);
        setByCourse.addAll(students);
        System.out.println(setByCourse);
    }

    public static void printStudents(List<Student> students, Integer course){

        for (ListIterator<Student> i = students.listIterator(); i.hasNext();){
            Student s =  i.next();
            if(s.getCourse().equals(course)) {
                System.out.println(s);
            }
        }
    }
}
