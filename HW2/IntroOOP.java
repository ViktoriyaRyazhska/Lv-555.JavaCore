
public class IntroOOP {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setFirstname("Oleg");
		p1.setLastName("Baton");
		p1.setBirthYear(1990);
		p1.ChangeName("Vanya","Melnyk");
		System.out.println(p1.getFirstname()+ " " + p1.getLastName() + " " + p1.getAge());
		
		Person p2 = new Person();
		p2.setFirstname("Olena");
		p2.setLastName("Bilan");
		p2.setBirthYear(2000);
		System.out.println(p2.getFirstname() + " " + p2.getLastName());
		p2.ChangeName("Oleksii","Sypa");
		System.out.println(p2.getFirstname() + " " + p2.getLastName()+ " " + p2.getAge());
		
		Person p3 = new Person();
		Person p4 = new Person("Roman", "Kastran");
		Person p5 = new Person("Vasyl", "Pupkin");
	}

}
