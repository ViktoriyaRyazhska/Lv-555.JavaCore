import java.time.LocalDate;

public class Smain {
    public static void main(String[] args) {
        Person pers = new Person();
        Person pers1 = new Person("Tom","Sawyer");
        Person pers2 = new Person("Chuck","Norris");
        System.out.println(pers.getAge());
        pers.input("Blue","Berry",1979);
        System.out.println(pers.getAge());
        pers.output();
        pers.changeName("Bl","Ber");
        pers.setBirthYear(1991);
        System.out.println(pers.getAge());
        pers.output();
        System.out.println(pers.getAge());
    }
}
class Person{
    private String firstName;
    private String lastName;
    private int birthYear;
    private final static int CURRENT_YEAR = LocalDate.now().getYear();



    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.birthYear = 1990;

    }
    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
        public void changeName(String fn,String ln){
            this.firstName = fn;
            this.lastName = ln;
        }
    public void output(){
        System.out.println("Persons name: " + firstName + "\n" + "Person's last name: " + lastName + "\n" +
        "Person's birth year: " + birthYear + "\nAge: " + getAge());
    }
    public int getAge(){
        return CURRENT_YEAR - birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void  setLastName(String lastName){
        this.lastName = lastName;
    }
}