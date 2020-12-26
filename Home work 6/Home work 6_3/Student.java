import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    static public void printStudent(List<Student> students, Integer course){
        for(ListIterator<Student> iterator = students.listIterator(); iterator.hasNext();){
            Student student = iterator.next();
            if(student.course.equals(course)){
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }

        //by course
    }

    static class CourseComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse()-o2.getCourse();
        }
    }

    private static NameComparator nameComparator = new NameComparator();
    private static CourseComparator courseComparator = new CourseComparator();

    public static NameComparator getNameComparator() {
        return nameComparator;
    }

    public static CourseComparator getCourseComparator() {
        return courseComparator;
    }

}
