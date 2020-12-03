import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
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
    public void changeName(String newFirstName, String newLastName){

            this.firstName = newFirstName;

            this.lastName = newLastName;

    }
    public int getAge() {
        return LocalDate.now().getYear() - this.birthYear;
    }
    public Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter  last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter   birth year: ");
        this.birthYear = sc.nextInt();
    }
    public void output (){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "firstName: " + firstName  +
                ", lastName: " + lastName  +
                ", birthYear: " + birthYear +
                ", age: " + getAge() +
                '}';
    }
}
