import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int age = 0;
    Scanner sc = new Scanner(System.in);
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
    public void changeName(String newFirstName, String newLastName){

            this.firstName = newFirstName;

            this.lastName = newLastName;

    }
    public int getAge(int birthYear) {
        this.birthYear = birthYear;
        age = 2020 - this.birthYear;
        return age;
    }
    public Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void input(){
        System.out.println("Enter  first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter  last name: ");
        this.lastName = sc.nextLine();
    }
    public void output (){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "firstName: " + firstName  +
                ", lastName: " + lastName  +
                ", birthYear: " + birthYear +
                ", age: " + age +
                '}';
    }
}
