package lesson3.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {}

    public int getAge(){

//        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;

        return LocalDate.now().getYear() - birthYear;
    }

    public void input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first name [now: " + (null == firstName || firstName.isEmpty() ? "not set" : firstName) + "]:> ");
        try {
            firstName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Enter last name [now: " + (null == lastName || lastName.isEmpty() ? "not set" : lastName) + "]:> ");
        try {
            lastName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(("Enter year of birth [now: " + (0 == birthYear ? "not set" : birthYear) + "]:> "));
        try {
            birthYear = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
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



