import java.util.*;
import java.util.stream.Collector;

public class Student {
    private String name;
    private int course;
    private static CourseComparator courseComparator = new CourseComparator();
    private static NameComparator nameComparator = new NameComparator();

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static CourseComparator getCourseComparator() {
        return courseComparator;
    }

    public static NameComparator getNameComparator() {
        return nameComparator;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
    static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2) {
            return st1.name.compareTo(st2.name);
        }
    }
    static class CourseComparator implements  Comparator<Student>{

        @Override
        public int compare(Student st1, Student st2) {
            return st1.course - st2.course;
        }
    }

    public static void printStudents(List<Student> list, int x) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (Objects.equals(student.course, x)) {
                System.out.println(student);
            }
        }
    }
}
