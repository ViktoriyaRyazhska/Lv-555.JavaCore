import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person("Vasya","Pupkin");
		p1.setBirthYear(1988);
		p1.changeName("sanya", "Rodshild");
		Person p2 = new Person("Kasya","Pupkin");
		p2.setBirthYear(1990);
		p2.changeName("Vasya","");
		Person p3 = new Person("Rasya","Pupkin");
		p3.setBirthYear(1996);
		p3.changeName("","Loghkin");
		Person p4 = new Person("Nasya","Pupkin");
		p4.setBirthYear(1993);
		p4.output();
		Person p5 = new Person();
		p5.setFirstName("Rahim");
		p5.setLastName("Zimba");
		p5.setBirthYear(2000);
		Person.input(sc);
		sc.close();
	}
}