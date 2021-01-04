package firstPac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class HW07_3Collections {

	public static void main(String[] args) {
		List<Student07> studentList = new ArrayList<>();
        studentList.add(new Student07("Alex", 5));
        studentList.add(new Student07("Mike", 4));
        studentList.add(new Student07("Steve", 4));
        studentList.add(new Student07("Naomy", 1));
        studentList.add(new Student07("Andrew", 3));
        
        Set<Student07> studentSetByName = new TreeSet<>(Student07.nameComparator);
        studentSetByName.addAll(studentList);
        System.out.println(studentSetByName);
        Set<Student07> studentSetByCourse = new TreeSet<>(Student07.courseComparator);
        studentSetByCourse.addAll(studentList);
        System.out.println(studentSetByCourse);
	}

}



class Student07{
	public String name;
	public Integer course;

    public Student07(String name, int course){
        this.name = name;
        this.course = course;
    }
    //printStudents method
    static public void printStudents(List<Student07> studentList, Integer course){
        for(ListIterator<Student07> iterator = studentList.listIterator(); iterator.hasNext();){
            Student07 student = iterator.next();
            if(student.course.equals(course)){
                System.out.println(student);
            }
        }
    }

    //compare students by name
    static class NameComparator implements Comparator<Student07> {
        @Override
        public int compare(Student07 stud1, Student07 stud2) {
            return stud1.name.compareTo(stud2.name);
        }
    }
    //compare students by course
    static class CourseComparator implements Comparator<Student07>{

        @Override
        public int compare(Student07 stud1, Student07 stud2) {
            return stud1.course-stud2.course;
        }
    }
    
    public static NameComparator nameComparator = new NameComparator();
    public static CourseComparator courseComparator = new CourseComparator();

    @Override
    public String toString() {
        return name + " " + course + " course";
    }

}