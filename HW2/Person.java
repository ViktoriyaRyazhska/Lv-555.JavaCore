
public class Person {
	private String Firstname, lastName;
	private int BirthYear;
	private static int year = 2020;
	//Getters, Setters
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}
	//Constructors
	public Person(String firstname, String lastName) {
		Firstname = firstname;
		this.lastName = lastName;
	}
	public Person() {}
	//Methods;
	public int getAge() {
		return year - this.BirthYear;
	}
	public String ChangeName(String fn,String ln) {
		this.Firstname = fn;
		this.lastName = ln;
		return (fn + ln);
	}

	

}
