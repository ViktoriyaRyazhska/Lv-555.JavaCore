import java.util.Comparator;

public class Student {
	private String name;
	private Integer course;
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
	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	public static CourseComparator CourseComparator = new CourseComparator();
	public static NameComparator NameComparator = new NameComparator();
	
	
	static class CourseComparator implements Comparator<Student> {
		  public int compare(Student s1, Student s2) {
		    return ((Student)s1).getCourse() - ((Student)s2).getCourse();
		  }

	}
	
	static class NameComparator implements Comparator<Student> {
		  public int compare(Student s1, Student s2) {
		    return ((Student)s1).getName().compareTo(((Student)s2).getName());
		  }

		}
   
	 
	
    
    public static Comparator getNameComparator( ) {
        return NameComparator;
    }
    public static Comparator getCourseComparator( ) {
        return CourseComparator;
    }
    




}
