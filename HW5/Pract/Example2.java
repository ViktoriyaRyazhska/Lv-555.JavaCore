public class Example2 {
	public static void main(String[] args) {
		Animal[] arr = {new Cat(),
				new Cat(),
				new Cat(),
				new Dog(),
				new Dog()};
		for (Animal animal : arr) {
			animal.feed();
			animal.voice();
		}
		Person[] arr2 = {new Teacher(),
				new Student(),
				new Student(),
				new Student(),
				new Student(),
				new Cleaner(),};
		for (Person person : arr2) {
			person.print();
			if (!(person instanceof Student))
				((Staff)person).salary();
		}
	}
}