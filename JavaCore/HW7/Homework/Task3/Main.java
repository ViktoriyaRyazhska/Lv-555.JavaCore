import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Andrew", 5));
        studentList.add(new Student("Jack", 3));
        studentList.add(new Student("Kate", 4));
        studentList.add(new Student("Pavlo", 2));
        studentList.add(new Student("Anna", 1));
        Student.printStudent(studentList,5);
        //А якщо в мене декілька людей з однаковим ім'ям і на 1 курсі
        //Як використати компаратор до іншої колекції? В мене не вийшло
        //Писати метод sort або використати готовий?
        Set<Student> studentSet1 = new TreeSet<>(Student.getCourseComparator());
        studentSet1.addAll(studentList);
        System.out.println(studentSet1);
        Set<Student> studentSet2 = new TreeSet<>(Student.getNameComparator());
        studentSet2.addAll(studentList);
        System.out.println(studentSet2);
    }
}






