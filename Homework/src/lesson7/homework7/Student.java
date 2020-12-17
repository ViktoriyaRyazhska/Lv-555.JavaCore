package lesson7.homework7;

import java.util.Comparator;

public class Student {
    private final String name;
    private String lastName;
    private Integer course;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public Integer getCourse() {
        return course;
    }

    public Student(String name, String lastName, Integer course) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    public static final NameComparator nameComparator = new NameComparator();
    public static final CourseComparator courseComparator = new CourseComparator();

    static class NameComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2) {

            return (s1.getLastName() + s1.getName()).compareTo(s2.getLastName() + s2.getName());
        }
    }

    static class CourseComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2) {
            return s1.getCourse() - s2.getCourse();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }
}
