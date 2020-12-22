import java.util.*;

public class Collections {

	private static final int Set = 0;

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		HashMap<String, String> personMap = new HashMap<String, String>();
//		Set1
		set1.add(1);
		set1.add(5);
		set1.add(7);
		set1.add(6);
		set1.add(7);
// 		Set2		
		set2.add(2);
		set2.add(10);
		set2.add(3);
		set2.add(7);
//		Personmap
//		personMap.put("Oliinyk", "Anrii");
//		personMap.put("Kastran", "Bohdan");
//		personMap.put("Melnyk", "Bohdan");
//		personMap.put("Yatsiv", "Yaroslav");
//		personMap.put("Lekh", "Igor");
//		personMap.put("Mazurok", "Andriana");
//		personMap.put("Khar", "Iryna");
//		personMap.put("Furda", "Orest");
//		personMap.put("Bilan", "Rostyslav");
//		personMap.put("Ivchyk", "Vadym");
		
//		Students
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Vasyl", 3));
		student.add(new Student("Dmytro", 1));
		student.add(new Student("Yuri", 5));
		student.add(new Student("Mykola", 4));
		student.add(new Student("Ivan", 2));
		
		
		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		    System.out.println(student);
		    

		    
		Set<Student> set01 = new TreeSet<Student>(Student.getNameComparator());
		set01.addAll(student);
		System.out.println(set01);
		
		Set<Student> set02 = new TreeSet<Student>(Student.getCourseComparator());
		set02.addAll(student);
		System.out.println(set02);
		


	}
//  Union	
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		set1.addAll(set2);
		return set1;
	}
//	Intersect	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
		set1.retainAll(set2);
		return set1;
	}
}
