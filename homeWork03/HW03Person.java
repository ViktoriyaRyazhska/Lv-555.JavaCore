package firstPac;

import java.util.Scanner;

public class HW03Person {
	
	//Variables
	private String firstName;
	private String lastName;
	private int birthYear;
	
	static HW03Person[] pers = new HW03Person[6];
	
	
	//Getters and Setters
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public int getBirthYear() {return birthYear;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public void setBirthYear(int birthYear) {this.birthYear = birthYear;}
	
	//Constructors
	public HW03Person() {}
	public HW03Person(String firstName, String lastName) {}
	
	//GETAGE
			int getAge(int birthYear) {
				int age = 2020 - birthYear;
				return age;
			}
			
	//INPUT
			void input(int x){
				Scanner p = new Scanner(System.in);
				System.out.println(x + ". input Name");
				pers[x].firstName = p.nextLine();
				System.out.println(x + ". input Last Name");
				pers[x].lastName = p.nextLine();
				System.out.println(x + ". input Birthday Year");
				pers[x].birthYear = p.nextInt();
			}
			
	//OUTPUT
			void output(int x) {
				System.out.println(x + ": " + pers[x].firstName + " " + pers[x].lastName + "; Age: " + getAge(pers[x].birthYear));
			}
			
	//CHANGENAME	(?????????????)	
			void changeName(String fn, String ln) {
				firstName = fn;
				lastName = ln;
			}

			public static void main(String[] args) {
				//call input
				int x=1;
				while (x<=5) {
				pers[x] = new HW03Person();
				pers[x].input(x);
				x++;
			}
				//call output
				x=1;
				while (x<=5) {
				pers[x].output(x);
				x++;
			}

				System.out.println("FINAL!");
		
	}

}
