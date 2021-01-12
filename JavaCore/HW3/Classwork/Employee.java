import java.util.Scanner;

public class Employee {
    private String name = "Andrew";
    private int rate;
    private int hours;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee(){
    }
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getSalary() {
        return hours * this.rate;
    }
    public int changeRate(){
        System.out.print("Write new rate for " + name + ":");
        Scanner sc = new Scanner(System.in);
        this.rate = sc.nextInt();
        return rate;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
    public double getTotalSum() {
        return getSalary() + getBonuses();
    }

    @Override
    public String toString() {
        return "Employee " + name + " has salary " + getSalary() + "."
                + " Bonuses: " + getBonuses()
                + " Hours: " + hours
                + " Rate: " + rate
                + " Total: " + getTotalSum();
    }
}

