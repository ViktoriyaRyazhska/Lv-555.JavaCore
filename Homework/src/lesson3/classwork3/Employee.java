package lesson3.classwork3;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

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
        totalSum -= this.getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum -= this.getSalary();
        this.hours = hours;
        totalSum += this.getSalary();
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(){}

    public double getSalary(){ return this.rate * this.hours;}

    public int changeRate(int rate){
        totalSum -= this.getSalary();
        this.rate = rate;
        totalSum += this.getSalary();
        return rate;
    }

    public double getBonuses(){
        totalSum += getSalary() * 0.1;
        return this.getSalary() * 0.1;
    }

    public static double getTotalSum(){
        return totalSum;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
