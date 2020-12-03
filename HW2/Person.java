import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String firstName, lastName;
	private int birthYear;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person() {
	}
	public int getAge() {
		int age = LocalDate.now().getYear() - birthYear;
		return age;
	}
	public static Person input(Scanner sc){
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter FamalyName:");
		String famalyName = sc.next();
		return new Person(name, famalyName);
	}
	public void output(){
		System.out.println("Name = " + firstName + "; LastName = " + lastName + "; Age = " + this.getAge());
	}
	public void changeName(String fn, String ln){
		this.firstName = (fn != null) ? fn : this.firstName;
		this.lastName = (ln != null) ? fn : this.lastName;
	}
}