import java.util.Scanner;

public class Dog {
	private String name, s11, s22;
	private int age;
	private Breed breed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog() {}
	


	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}


	public void input(Scanner sc) {
		System.out.println("input name");
		name = sc.nextLine();
		this.name = name;
		System.out.println("input age");
		age = sc.nextInt();
		this.age = age;
		
	}

}
