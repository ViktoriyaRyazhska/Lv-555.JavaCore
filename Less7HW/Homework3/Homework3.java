import java.lang.reflect.Array;
import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Tom", 5));
        studentList.add(new Student("Huck", 2));
        studentList.add(new Student("Sawyer", 5));
        studentList.add(new Student("Finn", 2));
        studentList.add(new Student("Mark", 1));
        studentList.add(new Student("Twain", 3));
        studentList.add(new Student("Checo", 1));
        studentList.add(new Student("Perez", 3));


        Collections.sort(studentList,Student.getCourseComparator());
        System.out.println(studentList);
        Collections.sort(studentList,Student.getNameComparator());
        System.out.println(studentList);
        Student.printStudents(studentList,2);



            }
}

