package lesson3.homework3;

import java.util.Calendar;

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

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {}

    public int getAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.birthYear;
    }

    public void input(){
        System.out.println("Enter  first name: >");
        System.out.println("Enter  last name: >");
        System.out.println("Enter  year of birth: >");
    }

    public void changeName(String newName, String newSurname){
        if(newName != null && !newName.isEmpty()) {
            setFirstName(newName);
        }
        if(newSurname != null && !newSurname.isEmpty()) {
            setLastName(newSurname);
        }
    }

    public void output(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
