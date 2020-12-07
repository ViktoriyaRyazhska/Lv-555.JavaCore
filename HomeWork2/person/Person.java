package person;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private int BirthDate;
    private String FName;
    private String LName;
    public Person(int age, String FName, String LName) {
        this.BirthDate = this.BirthDate;
        this.FName = this.FName;
        this.LName = this.LName;
    }
    public int getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(int birthDate) {
        this.BirthDate = birthDate;
    }
    public String getFName() {
        return FName;
    }
    public void setFName(String FName) {
        this.FName = FName;
    }
    public String getLName() {
        return LName;
    }
    public void setLName(String LName) {
        this.LName = LName;
    }

    public Person (String name, String lastName){
        this.FName = name;
        this.LName = lastName;
    }

    public Person (){}

    public int getAge (){
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int year = cal.get(Calendar.YEAR);
        return year - getBirthDate();
    }
    public void input (String name, String lastName, int dateBirth) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        this.FName = name;
        System.out.println("Enter your last name: ");
        lastName = sc.nextLine();
        this.LName = lastName;
        System.out.println("Enter your date of birth: ");
        dateBirth = sc.nextInt();
        this.BirthDate = dateBirth;
    }
    public void output (){
        System.out.println("Name: " + getFName() + ", last name: "
                + getLName() + ", date of birth: " + getBirthDate());
    }
    public void changeName (String CFName, String CLName){
        this.FName = CFName;
        this.LName = CLName;
    }

    //@Override
    public String toString() {
        return "Person{\n age is: " +
                BirthDate +
                ", first name is: " + FName + '\'' +
                ", last name is " + LName + '\'' +
                '}';
    }
}
