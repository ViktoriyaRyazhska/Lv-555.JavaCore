import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student{
    private String name;
    private Integer course;
    //getters
    public String getName() {
        return name;
    }
    public Integer getCourse() {
        return course;
    }
    //constructor
    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }
    //print method
    static public void printStudent(List<Student> studentList, Integer course){
        for(ListIterator<Student> iterator = studentList.listIterator(); iterator.hasNext();){
            Student student = iterator.next();
            if(student.course.equals(course)){
                System.out.println(student);
            }
        }
    }
    //by name
    static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }

        //by course
    }static class CourseComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse()-o2.getCourse();
        }
    }
    private static NameComparator nameComparator = new NameComparator();
    private static CourseComparator courseComparator = new CourseComparator();
    //nameComp getter
    public static NameComparator getNameComparator() {
        return nameComparator;
    }
    //courseComp getter
    public static CourseComparator getCourseComparator() {
        return courseComparator;
    }

    @Override
    public String toString() {
        return getName() + " " + getCourse();
    }

}
