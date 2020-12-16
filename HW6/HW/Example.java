import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class Example {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set1.add(new Random().nextInt(100));
		}
		System.out.println(set1);
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set2.add(new Random().nextInt(100));
		}
		System.out.println(set2);
		Set<Integer> set3 = union(set1,set2);
		System.out.println(set3);
		Set<Integer> set4 = intersect(set1,set2);
		System.out.println(set4);
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Pupkin", "Vasya");
		personMap.put("Pupkina", "Masha");
		personMap.put("Pupkina", "Dasha");
		personMap.put("Golubev", "Kiril");
		personMap.put("Prihodkin", "Orest");
		personMap.put("Pupkin1", "Vasya1");
		personMap.put("Pupkin2", "Vasya2");
		personMap.put("Pupkin3", "Vasya3");
		personMap.put("Pupkin4", "Vasya4");
		personMap.put("Pupkin5", "Vasya5");
		System.out.println(personMap);
		List<String> rem = new ArrayList();
		Set<String> set5 = new HashSet<String>();
		for (Entry<String, String> entry : personMap.entrySet()) {
			set5.add(entry.getValue());
			if (entry.getValue().equals("Orest")) {
				rem.add(entry.getKey());
			}
		}
		for (Iterator iterator = rem.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			personMap.remove(string);
		}
		if (personMap.size()>set5.size()) {
			System.out.println("We have the same name");
		}else {
			System.out.println("We havn't the same name");
		}
		System.out.println(personMap);
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Vasya",1));
		students.add(new Student("Petya",3));
		students.add(new Student("Grisha",1));
		students.add(new Student("Masha",2));
		students.add(new Student("Dasha",3));
		students.sort(new CourseComparator());
		System.out.println(students);
		
	}
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> set3 = new HashSet<Integer>();
		set3.addAll(set1);
		set3.addAll(set2);
		return set3;
	}
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> set3 = new HashSet<Integer>();
		set3.addAll(set1);
		set3.retainAll(set2);
		return set3;
	}
	static class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
	static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
}